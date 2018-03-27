/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.mg.conf.base.annotation;

/**
 * map的配置
 *
 * @author maobufan
 * @created 2018/3/24
 */
public @interface MgConfMapItem {

    String name() default "";

    String key() default "";
}