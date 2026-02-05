package model;
import exception.DadosInvalidosException;

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {

        if (rua == null || rua.isBlank()) {
            throw new DadosInvalidosException("Rua inválida");
        }

        if (numero <= 0) {
            throw new DadosInvalidosException("Número deve ser maior que zero");
        }

        if (cidade == null || cidade.isBlank()) {
            throw new DadosInvalidosException("Cidade inválida");
        }

        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }
}
