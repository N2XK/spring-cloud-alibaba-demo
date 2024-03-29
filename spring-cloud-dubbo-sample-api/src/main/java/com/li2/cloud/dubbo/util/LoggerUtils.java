package com.li2.cloud.dubbo.util;

import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger Utilities.
 */
public abstract class LoggerUtils {

    private static final Logger logger = LoggerFactory.getLogger(LoggerUtils.class);

    public static void log(String url, Object result) {
        String message = String
                .format("The client[%s] uses '%s' protocol to call %s : %s",
                        RpcContext.getContext().getRemoteHostName(),
                        RpcContext.getContext().getUrl() == null ? "N/A"
                                : RpcContext.getContext().getUrl().getProtocol(),
                        url, result);
        if (logger.isInfoEnabled()) {
            logger.info(message);
        }
    }
}
