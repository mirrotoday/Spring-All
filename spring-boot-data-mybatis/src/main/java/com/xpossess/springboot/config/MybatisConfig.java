package com.xpossess.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author Freestyle
 * 用配置文件开启 驼峰命名法 ConfigurationCustomizer (相同的模式)
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer(){

            @Override
            public void customize(Configuration configuration) {
                //开启驼峰命名法映射规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
