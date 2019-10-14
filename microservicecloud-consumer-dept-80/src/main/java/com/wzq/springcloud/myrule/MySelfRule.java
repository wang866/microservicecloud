package com.wzq.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ect
 * @DATE 2019-10-12
 * @descripttion:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // return new RandomRule();
        return new MyRandomRule(); // 返回自定义负载规则
    }
}
