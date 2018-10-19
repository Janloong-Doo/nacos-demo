/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 : Copyright (c) 2018  All Rights Reserved.                                   :
 : ProjectName: nacos-demo                                                    :
 : FileName: HomeController.java                                              :
 : Author: janloongdoo@gmail.com                                              :
 : Date: 18-10-19 下午3:03                                                      :
 : LastModify: 18-10-19 下午3:03                                                :
 :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

package com.janloong.nacosspringbootdiscovery.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href ="mailto: janloongdoo@gmail.com">Janloong</a>
 * @date 2018-10-19 15:03
 */

@RestController
public class HomeController {

    @Value("${useLocalCache:janloong}")
    private String useLocalCache;

    /**
     * 动态更新配置 需要有setter方法
     *
     * @param useLocalCache
     */
    public void setUseLocalCache(String useLocalCache) {
        this.useLocalCache = useLocalCache;
    }


    /**
     * @author <a href ="mailto: janloongdoo@gmail.com">Janloong</a>
     * @date 2018/10/19 15:05
     **/
    @RequestMapping("/home")
    public String home(String name) {
        return useLocalCache;
    }

}
