package com.example.javaSpringLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean("servicoImpl")
    public ServicoI serviceImpl() {
        return new ServiceImpl();
    }

    @Bean("servicoConf")
    public ServicoI serviceConf() {
        return new ServicoConflito();
    }

}
