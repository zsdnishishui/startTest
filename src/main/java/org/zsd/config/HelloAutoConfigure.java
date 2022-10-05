package org.zsd.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsd.service.ServiceHello;

@Configuration
@EnableConfigurationProperties( RpcProperties.class )
public class HelloAutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    public ServiceHello serviceHello(){
        return new ServiceHello();
    }
}
