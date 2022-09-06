import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.rb_transactions_only_prefab.fundcardoraccount.FundCardOrAccount;
import com.transferfunds.test.core.BaseTest;
import com.wavemaker.runtime.rest.model.HttpRequestData;
import com.wavemaker.runtime.rest.model.HttpResponseDetails;
import com.wavemaker.runtime.rest.service.RestRuntimeService;

import static com.wavemaker.runtime.security.SecurityConstants.APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

/**
 * Created by saraswathir on 14/09/21
 */
public class TransferFundsTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(TransferFundsTest.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private String authToken = "";

    @Rule
    public TestName name = new TestName();

    @Autowired
    private FundCardOrAccount transferFunds;

    @Autowired
    private RestRuntimeService restRuntimeService;

    @Before
    public void getAuthToken() {
        //Get AuthToken for APIVendor(W).
        if (name.getMethodName().contains("APIVendorW")) {

            String serviceId = "wvrTransfer";
            String operationId = "wvrTransfer_loginWithPassword";

            HttpRequestData httpRequestData = new HttpRequestData();

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("api-key", "vrdO4T5327wBeqOUIIABDQ==");
            httpHeaders.add(CONTENT_TYPE, APPLICATION_JSON);
            httpRequestData.setHttpHeaders(httpHeaders);

            Map<String, Object> formData = new LinkedHashMap<>();
            formData.put("email", "peter.mark@wm.com");
            formData.put("password", new LinkedHashMap<String, String>() {{
                put("value", "Wavemaker@123");
            }});

            try {
                String body = objectMapper.writeValueAsString(formData);
                logger.info("Request body during login: " + body);
                httpRequestData.setRequestBody(new ByteArrayInputStream(body.getBytes(Charset.defaultCharset())));

                HttpResponseDetails httpResponseDetails = restRuntimeService.executeRestCall(serviceId, operationId, httpRequestData, new MockHttpServletRequest());
                logger.info("--Status code: " + httpResponseDetails.getStatusCode());

                String jsonString = IOUtils.toString(httpResponseDetails.getBody(), Charset.defaultCharset());

                if (httpResponseDetails.getStatusCode() == HttpStatus.OK.value() || httpResponseDetails.getStatusCode() == HttpStatus.NO_CONTENT.value()) {
                    authToken = JsonPath.parse(jsonString).read("$.token");
                } else {
                    throw new BadCredentialsException("Exception occurred while serving request. Failed with status code:" + httpResponseDetails.getStatusCode() + " " + "with  User not found");
                }
            } catch (Exception e) {
                throw new BadCredentialsException("User not found: " + e);
            }
        }
    }

    /***
     * Verify list of account transactions info from the javaservice method for APIVendor(W)
     */
    @Test
    public void verifyAPIVendorWAccountTransactions() {
        try {
            MockHttpServletRequest request = new MockHttpServletRequest();
            request.addHeader("api-key", "vrdO4T5327wBeqOUIIABDQ==");
            request.addHeader("Authorization", authToken);
            Map<String, Object> formData = new LinkedHashMap<String, Object>() {{
                put("amount", "1");
                put("beneficiary_id", "106891100272197640");
                put("currency", "EUR");
                put("ledger_id", "106891096457478156");
                put("payment_credit_date", "2021-09-14");
                put("payment_type", "payment-type-EU-SEPA-Step2");
                put("transaction_meta", new LinkedHashMap<String, String>() {{
                    put("Notes", "Payments");
                    put("assetType", "payment-type-UK-FasterPayments");
                }});
            }};
            Object transferInfo = transferFunds.fundManagedCards("APIVendor(W)", authToken, formData, request);
            System.out.println("Accounts List--" + transferInfo);
            Assert.assertTrue("Found managed accounts list as Empty for APIVendor(W)", !transferInfo.toString().isEmpty());
            String transactionState = JsonPath.parse(transferInfo).read("$.state");
            Assert.assertEquals("Expected: COMPLETED but found: " + transactionState + " for APIVendor(W)", "COMPLETED", transactionState);
        } catch (IOException e) {
            Assert.fail("Exception occurred: " + e);
        }
    }

    /***
     * Verify list of account transactions info from the javaservice method for APIVendor(R)
     */
    @Test
    public void verifyAPIVendorRAccountTransactions() {
        try {
            MockHttpServletRequest request = new MockHttpServletRequest();
            Map<String, Object> formData = new LinkedHashMap<String, Object>() {{
                put("amount", "1");
                put("beneficiary_id", "60fe6e5b-4820-4c54-a0b5-9fe45da15092");
                put("enduserid", "60dafb2a-59e0-48bb-8651-fa35ec841416");
                put("ledger_id", "60fe6dd8-e7eb-4c63-bfdf-30836d2fa5cc");
                put("payment_credit_date", "2021-09-14");
                put("payment_type", "payment-type-UK-FasterPayments");
                put("transaction_meta", new LinkedHashMap<String, String>() {{
                    put("Notes", "Payments");
                    put("assetType", "payment-type-UK-FasterPayments");
                }});
            }};
            Object transferInfo = transferFunds.fundManagedCards("APIVendor(R)", authToken, formData, request);
            System.out.println("Accounts List--" + transferInfo);
            Assert.assertTrue("Found managed accounts list as Empty for APIVendor(R)", !transferInfo.toString().isEmpty());
            String transactionId = JsonPath.parse(transferInfo).read("$.transaction_id");
            Assert.assertNotNull("Expected: transaction_id value not null but found : " + transactionId + " for APIVendor(R)", transactionId);
        } catch (IOException e) {
            Assert.fail("Exception occurred: " + e);
        }
    }


    /***
     * Verify list of account transactions info from the javaservice method for APIVendor(B)
     */
    @Test
    public void verifyAPIVendorBManagedCardDetails() {
        try {
            MockHttpServletRequest request = new MockHttpServletRequest();
            Map<String, Object> formData = new LinkedHashMap<String, Object>() {{
                put("amount", "1");
                put("beneficiary_id", "");
                put("currency", "EUR");
                put("ledger_id", "");
                put("payment_credit_date", "2021-09-14");
                put("transaction_meta", new LinkedHashMap<String, String>() {{
                    put("Notes", "Payments");
                }});
            }};
            Object transferInfo = transferFunds.fundManagedCards("APIVendor(W)", authToken, formData, request);
            System.out.println("Accounts List--" + transferInfo);
            Assert.assertTrue("Found managed accounts list as Empty for APIVendor(B)", !transferInfo.toString().isEmpty());
            String cardDetail = JsonPath.parse(transferInfo).read("$.recipient");
            Assert.assertEquals("Expected: GATEWAY but found: " + cardDetail + " for APIVendor(B)", "GATEWAY", cardDetail);
        } catch (IOException e) {
            Assert.fail("Exception occurred: " + e);
        }
    }

}
