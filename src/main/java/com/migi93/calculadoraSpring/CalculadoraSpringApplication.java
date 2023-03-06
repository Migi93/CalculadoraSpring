package com.migi93.calculadoraSpring;

import com.migi93.calculadoraSpring.infra.Console.ConsoleRader;
import com.migi93.calculadoraSpring.repository.impl.CalculadoraRepositoryMemory;
import com.migi93.calculadoraSpring.service.impl.CalculadoraServiceImpl;
import org.springframework.boot.SpringApplication;


public class CalculadoraSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraSpringApplication.class, args);
        ConsoleRader consoleRader = new ConsoleRader(new CalculadoraServiceImpl(new CalculadoraRepositoryMemory()));
        consoleRader.init();
    }

}
