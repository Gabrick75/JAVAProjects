package org.example;

import service.CadastroPessoas;
import model.Endereco;
import model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua das Flores", 123, "São Paulo");
        Endereco endereco2 = new Endereco("Av. Central", 456, "Campinas");

        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.adicionarPessoa(new Pessoa("Ana", 20, 1.65, endereco1));
        cadastro.adicionarPessoa(new Pessoa("João", 16, 1.70, endereco2));

        System.out.println("=== Todas as pessoas ===");
        for (Pessoa p : cadastro.listarPessoas()) {
            System.out.println(p);
        }

        System.out.println("\n=== Maiores de idade ===");
        for (Pessoa p : cadastro.listarMaioresDeIdade()) {
            System.out.println(p);
        }

        System.out.println("\n=== Faixa Etária ===");
        for (Pessoa p : cadastro.listarPessoas()) {
            System.out.println(
                    p.getNome() + " - " + p.getFaixaEtaria()
            );
        }

    }
}
