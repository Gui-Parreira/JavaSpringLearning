package com.example.javaSpringLearning;

import org.springframework.stereotype.Service;

@Service
public class ServicoConflito implements  ServicoI{
    @Override
    public String exibir(String id, String codigo) {
        return String.format("O Id do conflict é: %s %n e o Code: %s", id, codigo);
    }
}
