import model.Endereco;
import model.FaixaEtaria;
import model.Pessoa;
import exception.DadosInvalidosException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    // ===== Helpers (redução de duplicação) =====

    private Endereco enderecoPadrao() {
        return new Endereco("Rua Teste", 1, "Cidade Teste");
    }

    // ===== isMaiorDeIdade =====

    @Test
    void deveRetornarTrueQuandoIdadeForMaiorOuIgualA18() {
        Pessoa pessoa = new Pessoa("Ana", 18, 1.65, enderecoPadrao());

        assertTrue(pessoa.isMaiorDeIdade());
    }

    @Test
    void deveRetornarFalseQuandoIdadeForMenorQue18() {
        Pessoa pessoa = new Pessoa("João", 17, 1.70, enderecoPadrao());

        assertFalse(pessoa.isMaiorDeIdade());
    }

    // ===== getFaixaEtaria =====

    @Test
    void deveRetornarMENORQuandoIdadeForMenorQue18() {
        Pessoa pessoa = new Pessoa("Lucas", 10, 1.40, enderecoPadrao());

        assertEquals(FaixaEtaria.MENOR, pessoa.getFaixaEtaria());
    }

    @Test
    void deveRetornarADULTOQuandoIdadeEntre18E64() {
        Pessoa pessoa = new Pessoa("Maria", 30, 1.60, enderecoPadrao());

        assertEquals(FaixaEtaria.ADULTO, pessoa.getFaixaEtaria());
    }

    @Test
    void deveRetornarIDOSOQuandoIdadeFor65OuMais() {
        Pessoa pessoa = new Pessoa("Carlos", 70, 1.70, enderecoPadrao());

        assertEquals(FaixaEtaria.IDOSO, pessoa.getFaixaEtaria());
    }

    // ===== Validação de idade inválida =====

    @Test
    void deveLancarExcecaoComMensagemCorretaQuandoIdadeForNegativa() {
        DadosInvalidosException ex = assertThrows(
                DadosInvalidosException.class,
                () -> new Pessoa("Erro", -1, 1.70, enderecoPadrao())
        );

        assertEquals("Idade inválida", ex.getMessage());
    }
}
