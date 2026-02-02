package service;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public List<Pessoa> listarPessoas() {
        return new ArrayList<>(pessoas);
    }

    public List<Pessoa> listarMaioresDeIdade() {
        List<Pessoa> resultado = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p.isMaiorDeIdade()) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
