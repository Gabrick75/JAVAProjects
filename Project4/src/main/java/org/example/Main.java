package org.example;

import poo.Intro;

public class Main {
    static void main() {

        boolean executar = true;

        while (executar) {
            executar = Intro.options();
        }

        IO.println("Programa encerrado");
    }
}
