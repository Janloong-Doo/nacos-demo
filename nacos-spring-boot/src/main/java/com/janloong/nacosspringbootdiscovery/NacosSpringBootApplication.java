package com.janloong.nacosspringbootdiscovery;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "doo", autoRefreshed = true)
public class NacosSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringBootApplication.class, args);
    }


}
