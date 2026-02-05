package io;

import model.Endereco;
import model.Pessoa;

public class PessoaInput {

    public static Pessoa lerPessoa() {
        try {
            System.out.print("Nome: ");
            String nome = Input.SCANNER.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(Input.SCANNER.nextLine());

            System.out.print("Altura: ");
            double altura = Double.parseDouble(Input.SCANNER.nextLine());

            System.out.print("Rua: ");
            String rua = Input.SCANNER.nextLine();

            System.out.print("Número: ");
            int numero = Integer.parseInt(Input.SCANNER.nextLine());

            System.out.print("Cidade: ");
            String cidade = Input.SCANNER.nextLine();

            Endereco endereco = new Endereco(rua, numero, cidade);
            return new Pessoa(nome, idade, altura, endereco);

        } catch (RuntimeException e) {
            throw e; //vai para o main
        }
    }
}
