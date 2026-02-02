package org.example;

import poo.Pessoa;

public class Main {
    static void main() {

        // criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana", 20, 1.65);
        Pessoa pessoa2 = new Pessoa("Guilherme", 21, 1.95);

        // exibindo os dados da pessoa
        IO.println("Nome: " + pessoa1.getNome());
        IO.println("Idade: " + pessoa1.getIdade());
        IO.println("Altura: " + pessoa1.getAltura());

        // verificando se é maior de idade
        if (pessoa1.isMaiorDeIdade()) {
            IO.println("A pessoa é maior de idade.");
        } else {
            IO.println("A pessoa é menor de idade.");
        }

        //testando
        IO.println("");
        pessoa1.setAltura(10);

        IO.println("Altura " + pessoa1.getAltura());
        pessoa1.setIdade(190);
        IO.println("Idade: " + pessoa1.getIdade());


    }
}
