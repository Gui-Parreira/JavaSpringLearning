package com.example.javaSpringLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

   @Autowired
   @Qualifier("servicoImpl")
   private  ServicoI servicoTeste;
   @Autowired
   @Qualifier("servicoConf")
   private ServicoI servicoConf;

    @GetMapping("pessoa/{id}/{codigo}")
    public String test(@PathVariable String id, @PathVariable String codigo) {
        return servicoTeste.exibir(id, codigo);
    }

    @GetMapping("teste/{id}/{codigo}")
    public String testezada(@PathVariable String id, @PathVariable String codigo) {
        return servicoConf.exibir(id, codigo);
    }
}
