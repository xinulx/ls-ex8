/*
 * HibernateHandler.java         2016年3月2日 <br/>
 *
 * Copyright (c) 1994-1999 AnHui LonSun, Inc. <br/>
 * All rights reserved.	<br/>
 *
 * This software is the confidential and proprietary information of AnHui	<br/>
 * LonSun, Inc. ("Confidential Information").  You shall not	<br/>
 * disclose such Confidential Information and shall use it only in	<br/>
 * accordance with the terms of the license agreement you entered into	<br/>
 * with Sun. <br/>
 */

package cn.lonsun.util;

/**
 * hibernate <br/>
 *
 * @date 2016年3月2日 <br/>
 * @author fangtinghua <br/>
 * @version v1.0 <br/>
 */
public interface HibernateHandler<T> {

    /**
     * 执行方法
     *
     * @author fangtinghua
     * @throws Throwable
     */
    T execute() throws Throwable;

    /**
     * 完成方法
     *
     * @author fangtinghua
     * @param result
     * @param exception
     * @return
     */
    T complete(T result, Throwable exception);
}