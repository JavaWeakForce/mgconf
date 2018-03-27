/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.mg.conf.client.conf.init;

import com.mg.conf.client.conf.SystemConf;

/**
 * 配置初始化接口
 *
 * @author maobufan
 * @created 2018/3/24
 */
public interface ConfInitBase {

    void init(SystemConf systemConf);
}