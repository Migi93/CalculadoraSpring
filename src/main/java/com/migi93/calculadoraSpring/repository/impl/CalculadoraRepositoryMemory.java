package com.migi93.calculadoraSpring.repository.impl;

import com.migi93.calculadoraSpring.repository.CalculadoraRepository;


public class CalculadoraRepositoryMemory implements CalculadoraRepository {


    @Override
    public float suma(float numOne, float numTwo) {
        return numOne + numTwo;
    }

    @Override
    public float resta(float numOne, float numTwo) {
        return numOne - numTwo;
    }

    @Override
    public float multiplicacion(float numOne, float numTwo) {
        return numOne * numTwo;
    }

    @Override
    public float division(float numOne, float numTwo) {
        if (numTwo == 0) {
            throw new ArithmeticException("No se puede dividir entre cero. ");
        } else
            return numOne / numTwo;
    }
}
