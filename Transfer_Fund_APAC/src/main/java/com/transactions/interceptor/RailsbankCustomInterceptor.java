package com.transactions.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

import com.wavemaker.runtime.rest.processor.request.AbstractHttpRequestProcessor;
import com.wavemaker.runtime.rest.processor.request.HttpRequestProcessorContext;

/**
 * Created by saraswathir on 30/06/21
 */
public class RailsbankCustomInterceptor extends AbstractHttpRequestProcessor {

    private static final Logger logger = LoggerFactory.getLogger(RailsbankCustomInterceptor.class);

    @Value("${apikey}")
    private String apiKey;

    @Override
    protected void doProcess(HttpRequestProcessorContext httpRequestProcessorContext) {
        HttpHeaders headers = httpRequestProcessorContext.getHttpRequestDetails().getHeaders();
        logger.info(headers.toString());
        headers.set(HttpHeaders.AUTHORIZATION, apiKey);
        logger.info("-----Interceptor headers: " + headers.toString());
    }
}
