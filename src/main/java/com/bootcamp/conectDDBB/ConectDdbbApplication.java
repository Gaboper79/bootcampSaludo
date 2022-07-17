package com.bootcamp.conectDDBB;

import com.bootcamp.conectDDBB.model.Saludo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConectDdbbApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConectDdbbApplication.class, args);
    Saludo saludo = new Saludo();
    saludo.imprimirSaludo();
  }
}
