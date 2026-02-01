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
    }
}