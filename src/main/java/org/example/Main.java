package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculadora c = new Calculadora();
        Integer a = 12;
        Integer b = 4;
        System.out.println(c.Suma(a,b));
        System.out.println(c.Resta(a,b));
        System.out.println(c.Multiplicacion(a,b));
        System.out.println(c.Division(a,b));
    }
}
