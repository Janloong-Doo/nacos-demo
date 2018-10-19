/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 : Copyright (c) 2018  All Rights Reserved.                                   :
 : ProjectName: nacos-demo                                                    :
 : FileName: DiscoveryController.java                                         :
 : Author: janloongdoo@gmail.com                                              :
 : Date: 18-10-19 下午3:54                                                      :
 : LastModify: 18-10-19 下午3:49                                                :
 :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

package com.janloong.nacosspringbootdiscovery.controller;


import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href ="mailto: janloongdoo@gmail.com">Janloong</a>
 * @date 2018-10-19 15:44
 */
@RestController
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;


    /**
     * @author <a href ="mailto: janloongdoo@gmail.com">Janloong</a>
     * @date 2018/10/19 15:47
     **/
    @RequestMapping("/service")
    public List<Instance> service(String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
