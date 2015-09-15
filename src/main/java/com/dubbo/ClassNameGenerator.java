/**
 * File Created at 2012-02-02
 * $Id$
 *
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.dubbo;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author <a href="mailto:gang.lvg@alibaba-inc.com">kimi</a>
 */
@SPI
public interface ClassNameGenerator {

    public String generateArgsClassName(String serviceName, String methodName);

    public String generateResultClassName(String serviceName, String methodName);

}
