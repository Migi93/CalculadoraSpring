package com.migi93.calculadoraSpring.repository;

public interface CalculadoraRepository {

    float suma(float numOne, float numTwo);

    float resta(float numOne, float numTwo);

    float multiplicacion(float numOne, float numTwo);

    float division(float numOne, float numTwo);
}
