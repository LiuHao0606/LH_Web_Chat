package com.lh.webchat.listener;

import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.web.util.Log4jConfigListener;

import javax.servlet.ServletContextEvent;

/**
 * 将JDK自带的jul日志桥接到log4j中,使得启动日志被log4j接管
 * @author :  LH
 * @date   :  2019-11-08
 */
public class LoggerListener extends Log4jConfigListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        installJulToSlf4jBridge();
        super.contextInitialized(event);
    }

    private void installJulToSlf4jBridge(){
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }
}
