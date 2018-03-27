/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.mg.conf.base.annotation;

/**
 * 配置项的注解
 *
 * @author maobufan
 * @created 2018/3/24
 */
public @interface MgConfItem {

    String name() default "";

}