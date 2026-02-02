package org.example;
import service.CadastroPessoas;
import model.Endereco;
import model.Pessoa;

public class Main {
    static void main() {
        // endereço

        Endereco endereco1 = new Endereco("Rua das Flores", 123, "São Paulo");
        Endereco endereco2 = new Endereco("Av. Central", 456, "Campinas");
        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.adicionarPessoa(new Pessoa("Ana", 20, 1.65,endereco1));
        cadastro.adicionarPessoa(new Pessoa("João", 16, 1.70, endereco2));

        cadastro.listarPessoas();
        cadastro.listarMaioresDeIdade();




        // verificando se é maior de idade
        /*



        // criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana", 20, 1.65, endereco1);
        Pessoa pessoa2 = new Pessoa("Guilherme", 21, 1.95, endereco2);

        // exibindo os dados da pessoa 1
        IO.println("Dados Pessoa 1");
        IO.println("Nome: " + pessoa1.getNome());
        IO.println("Idade: " + pessoa1.getIdade());
        IO.println("Altura: " + pessoa1.getAltura());
        IO.println("Cidade: " + pessoa1.getEndereco().getCidade());
        IO.println("Rua: " + pessoa1.getEndereco().getRua());
        IO.println("Número: " + pessoa1.getEndereco().getNumero());
        IO.println("");
        //pessoa 2
        IO.println("Dados Pessoa 2:");
        IO.println("Nome: " + pessoa2.getNome());
        IO.println("Idade: " + pessoa2.getIdade());
        IO.println("Altura: " + pessoa2.getAltura());
        IO.println("Cidade: " + pessoa2.getEndereco().getCidade());
        IO.println("Rua: " + pessoa2.getEndereco().getRua());
        IO.println("Número: " + pessoa2.getEndereco().getNumero());

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
        System.out.println("-----------");
*/


    }
}
