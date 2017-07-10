/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.dubbo.common.logger.log4j2;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.support.FailsafeLogger;

/**
 * Log4j2Logger
 * Description:
 *
 * @auther <a href="mailto:kitdnie@gmail.com">JobSHen</a>
 * @date 2017/7/10 9:59
 * @sinece 1.0.0
 */
public class Log4j2Logger implements Logger {

    private static Marker MARKER = MarkerManager.getMarker("dubbo");
//    private static final String FQCN = FailsafeLogger.class.getName();
    private final org.apache.logging.log4j.Logger logger;

    public Log4j2Logger(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    public void trace(String msg) {
        logger.trace(MARKER, msg);
    }

    public void trace(Throwable e) {
        logger.trace(MARKER, "", e);
    }

    public void trace(String msg, Throwable e) {
        logger.trace(MARKER, msg, e);
    }

    public void debug(String msg) {
        logger.debug(MARKER, msg);
    }

    public void debug(Throwable e) {
        logger.debug(MARKER, "", e);
    }

    public void debug(String msg, Throwable e) {
        logger.debug(MARKER, msg, e);
    }

    public void info(String msg) {
        logger.info(MARKER, msg);
    }

    public void info(Throwable e) {
        logger.info(MARKER, "", e);
    }

    public void info(String msg, Throwable e) {
        logger.info(MARKER, msg, e);
    }

    public void warn(String msg) {
        logger.warn(MARKER, msg);
    }

    public void warn(Throwable e) {
        logger.warn(MARKER, "", e);
    }

    public void warn(String msg, Throwable e) {
        logger.warn(MARKER, msg, e);
    }

    public void error(String msg) {
        logger.error(MARKER, msg);
    }

    public void error(Throwable e) {
        logger.error(MARKER, "", e);
    }

    public void error(String msg, Throwable e) {
        logger.error(MARKER, msg, e);
    }

    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }
}
