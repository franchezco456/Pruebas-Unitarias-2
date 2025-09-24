package org.example;

public class Calculadora {

    public Integer Suma (Integer a, Integer b) {
        return a + b;
    }

    public Integer Resta (Integer a, Integer b){
        return a - b;
    }

    public  Integer Multiplicacion (Integer a, Integer b){
        return a * b;
    }

    public  Integer Division (Integer a, Integer b){
        if(b==0){
            return 0;
        }
        return a / b;
    }
}
