package service;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    // Lista que guarda várias pessoas
    private List<Pessoa> pessoas;

    // Construtor: cria a lista vazia
    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    // Adiciona uma pessoa na lista
    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    // Lista todas as pessoas
    public void listarPessoas() {
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("-----------");
        }
    }

    // Lista somente as pessoas maiores de idade
    public void listarMaioresDeIdade() {
        for (Pessoa p : pessoas) {
            if (p.isMaiorDeIdade()) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("-----------");
            }
        }
    }
}
