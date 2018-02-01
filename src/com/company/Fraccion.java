package com.company;

public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion (int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fraccion Sumar(Fraccion x){
        int nuevo1=(x.numerador*this.denominador)+(x.denominador*this.numerador);
        int nuevo2=this.denominador*x.denominador;

        Fraccion f=new Fraccion(nuevo1, nuevo2);
        return f;

    }

    public Fraccion Restar(Fraccion x){
        int nuevo1=x.denominador*this.numerador-x.numerador*this.denominador;
        int nuevo2=this.denominador*x.denominador;

        Fraccion f=new Fraccion(nuevo1, nuevo2);
        return f;

    }
    public Fraccion Multiplicar(Fraccion x){
        int nuevo1=this.numerador*x.numerador;
        int nuevo2=this.denominador*x.denominador;
        Fraccion f= new Fraccion(nuevo1,nuevo2);
        return f;
    }
    public void mostrar(){
        System.out.print(numerador+"/"+denominador);
    }
}
