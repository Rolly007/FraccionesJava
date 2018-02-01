package com.company;

public class Main {

    public static void main(String[] args) {
        Fraccion a = new Fraccion(1,2);
        Fraccion b = new Fraccion(3,4);

        //Fraccion resultado=a.Sumar(b);
        //Fraccion resultado=a.Restar(b);
        Fraccion resultado=a.Multiplicar(b);
        resultado.mostrar();
    }
}
