package com.migi93.calculadoraSpring.models;

public class Calculadora {
    private int numeroOne;
    private int numeroTwo;

    public Calculadora() {
    }

    public Calculadora(int numeroOne, int numeroTwo) {
        this.numeroOne = numeroOne;
        this.numeroTwo = numeroTwo;
    }

    public int getNumeroOne() {
        return numeroOne;
    }

    public void setNumeroOne(int numeroOne) {
        this.numeroOne = numeroOne;
    }

    public int getNumeroTwo() {
        return numeroTwo;
    }

    public void setNumeroTwo(int numeroTwo) {
        this.numeroTwo = numeroTwo;
    }
}
