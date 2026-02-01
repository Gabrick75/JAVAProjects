package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IO.println("Bem-vindo à tabuada!");

        for (int i = 1; i <= 10; i++) {
            IO.println("Tabuada do " + i);

            for (int j = 1; j <= 10; j++) {
                IO.println(i + " x " + j + " = " + (i * j));
            }

            IO.println();
        }


        IO.println("Números pares:");
        for (int i = 2; i <= 100; i += 2) {
            IO.println(i);
        }
    }
}