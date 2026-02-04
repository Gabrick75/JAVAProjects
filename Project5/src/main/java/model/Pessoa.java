package model;

import exception.DadosInvalidosException;

public class Pessoa {

    private Endereco endereco;
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura, Endereco endereco) {
        this.nome = nome;
        setIdade(idade);
        setAltura(altura);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos - " + endereco.getCidade();
    }


    public boolean isMaiorDeIdade(){
        return idade >= 18;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");

        }
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
