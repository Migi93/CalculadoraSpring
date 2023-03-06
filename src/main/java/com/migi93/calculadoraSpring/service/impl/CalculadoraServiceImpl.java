package com.migi93.calculadoraSpring.service.impl;

import com.migi93.calculadoraSpring.repository.CalculadoraRepository;
import com.migi93.calculadoraSpring.service.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    CalculadoraRepository calculadoraRepository;

    public CalculadoraServiceImpl(CalculadoraRepository calculadoraRepository) {
        this.calculadoraRepository = calculadoraRepository;
    }

    @Override
    public float suma(float numOne, float numTwo) {
        return calculadoraRepository.suma(numOne, numTwo);
    }

    @Override
    public float resta(float numOne, float numTwo) {
        return calculadoraRepository.resta(numOne, numTwo);
    }

    @Override
    public float multiplicacion(float numOne, float numTwo) {
        return calculadoraRepository.multiplicacion(numOne, numTwo);
    }

    @Override
    public float division(float numOne, float numTwo) {
        return calculadoraRepository.division(numOne, numTwo);
    }
}
