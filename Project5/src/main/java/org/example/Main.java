package org.example;

import io.Input;
import service.CadastroPessoas;
import model.Endereco;
import model.Pessoa;
import io.PessoaInput;

public class Main {

     static void main() {

        Endereco endereco1 = new Endereco("Rua das Flores", 123, "São Paulo");
        Endereco endereco2 = new Endereco("Av. Central", 456, "Campinas");

        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.adicionarPessoa(new Pessoa("Ana", 20, 1.65, endereco1));
        cadastro.adicionarPessoa(new Pessoa("João", 16, 1.70, endereco2));




        System.out.println("=== Cadastro de Pessoa ===");

        while (true) {
            try {
                System.out.println("\nDigite os dados da pessoa:");
                Pessoa pessoa = PessoaInput.lerPessoa();
                cadastro.adicionarPessoa(pessoa);
                System.out.println("Pessoa cadastrada com sucesso!");

            } catch (RuntimeException e) {
                System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
            }

            System.out.print("\nDeseja cadastrar outra pessoa? (s/n): ");
            String opcao = Input.SCANNER.nextLine();

            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
        }


        System.out.println("\n=== Pessoas cadastradas no sistema ===");
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
