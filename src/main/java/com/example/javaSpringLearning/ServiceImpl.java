package com.example.javaSpringLearning;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServicoI {
    @Override
    public  String exibir(String id, String codigo) {
        return String.format("Seu id é: %s %n Seu code é: %s", id, codigo);
    }
}
