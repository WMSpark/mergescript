package com.transactions.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

import com.wavemaker.runtime.rest.processor.request.AbstractHttpRequestProcessor;
import com.wavemaker.runtime.rest.processor.request.HttpRequestProcessorContext;

/**
 * Created by saraswathir on 05/08/21
 */
public class BankableCustomInterceptor extends AbstractHttpRequestProcessor {

    private static final Logger logger = LoggerFactory.getLogger(BankableCustomInterceptor.class);

    @Value("${apikey}")
    private String apiKey;

    @Override
    protected void doProcess(HttpRequestProcessorContext httpRequestProcessorContext) {
        HttpHeaders headers = httpRequestProcessorContext.getHttpRequestDetails().getHeaders();
        headers.set("Signature", apiKey);
        logger.info("-----Interceptor headers: " + headers.toString());
    }
}

