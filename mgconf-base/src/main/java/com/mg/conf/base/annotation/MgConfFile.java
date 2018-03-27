/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.mg.conf.base.annotation;

/**
 * mgconf配置文件的注解
 *
 * @author maobufan
 * @created 2018/3/24
 */
public @interface MgConfFile {

    String name() default "";
}
