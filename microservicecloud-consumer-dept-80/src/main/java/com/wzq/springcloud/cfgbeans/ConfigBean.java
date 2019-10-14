package com.wzq.springcloud.cfgbeans;

import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: ect
 * @DATE 2019-10-12
 * @descripttion:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /* *
     * 功能描述: <br>
     * 〈自定义负载均衡算法〉
     * RandomRule 随机算法
     * RoundRobinRule  轮询算法--默认
     *
     * @Param: []
     * @Return: com.netflix.loadbalancer.IRule
     * @Author: ect
     * @Date: 2019-10-12 14:49
     */
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }
}
