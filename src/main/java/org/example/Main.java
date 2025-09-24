package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculadora c = new Calculadora();
        Integer a = 12;
        Integer b = 4;
        IO.println(c.Suma(a,b));
        IO.println(c.Resta(a,b));
        IO.println(c.Multiplicacion(a,b));
        IO.println(c.Division(a,b));
    }
}
