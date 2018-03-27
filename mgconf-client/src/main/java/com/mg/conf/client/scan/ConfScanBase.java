/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.mg.conf.client.scan;

/**
 * 扫描配置接口
 *
 * @author maobufan
 * @created 2018/3/24
 */
public interface ConfScanBase {

    void scan(String ... path);
}