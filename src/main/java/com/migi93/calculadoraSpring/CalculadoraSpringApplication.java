package com.migi93.calculadoraSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraSpringApplication.class, args);
        //ConsoleRader consoleRader = new ConsoleRader(new CalculadoraServiceImpl(new CalculadoraRepositoryMemory()));
        //consoleRader.init();
    }

}
