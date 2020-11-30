package com.george.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yang Hao
 * @description Ribbon自定义IRule规则
 * 要跳出跟@SpringBootApplication不再一个包或者子包下面，因为重新外层建包
 * @date 2020-09-16 14:24
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        //随机的规则
        return new RandomRule();
    }
}
