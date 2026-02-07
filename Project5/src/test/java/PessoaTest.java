import model.Endereco;
import model.FaixaEtaria;
import model.Pessoa;
import exception.DadosInvalidosException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    // ===== isMaiorDeIdade =====

    @Test
    void deveRetornarTrueQuandoIdadeForMaiorOuIgualA18() {
        Endereco endereco = new Endereco("Rua A", 10, "SP");
        Pessoa pessoa = new Pessoa("Ana", 18, 1.65, endereco);

        assertTrue(pessoa.isMaiorDeIdade());
    }

    @Test
    void deveRetornarFalseQuandoIdadeForMenorQue18() {
        Endereco endereco = new Endereco("Rua B", 20, "RJ");
        Pessoa pessoa = new Pessoa("João", 17, 1.70, endereco);

        assertFalse(pessoa.isMaiorDeIdade());
    }

    // ===== getFaixaEtaria =====

    @Test
    void deveRetornarMENORQuandoIdadeForMenorQue18() {
        Endereco endereco = new Endereco("Rua C", 30, "BH");
        Pessoa pessoa = new Pessoa("Lucas", 10, 1.40, endereco);

        assertEquals(FaixaEtaria.MENOR, pessoa.getFaixaEtaria());
    }

    @Test
    void deveRetornarADULTOQuandoIdadeEntre18E64() {
        Endereco endereco = new Endereco("Rua D", 40, "SP");
        Pessoa pessoa = new Pessoa("Maria", 30, 1.60, endereco);

        assertEquals(FaixaEtaria.ADULTO, pessoa.getFaixaEtaria());
    }

    @Test
    void deveRetornarIDOSOQuandoIdadeFor65OuMais() {
        Endereco endereco = new Endereco("Rua E", 50, "Curitiba");
        Pessoa pessoa = new Pessoa("Carlos", 70, 1.70, endereco);

        assertEquals(FaixaEtaria.IDOSO, pessoa.getFaixaEtaria());
    }

    // ===== Validação de idade inválida =====

    @Test
    void deveLancarExcecaoQuandoIdadeForNegativa() {
        Endereco endereco = new Endereco("Rua F", 60, "Recife");

        assertThrows(
                DadosInvalidosException.class,
                () -> new Pessoa("Erro", -1, 1.70, endereco)
        );
    }
}