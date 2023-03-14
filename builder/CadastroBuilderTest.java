package padroescriacaoteste_exercicios.builder;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.builder.Cadastro;
import padroescriacao_exercicios.builder.CadastroBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class CadastroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCadastroSemCpf() {
        try {
            CadastroBuilder cadastroBuilder = new CadastroBuilder();
            Cadastro cadastro = cadastroBuilder
                    .setNome("Pessoa 1")
                    .setEmail("pessoa1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCadastroSemNome() {
        try {
            CadastroBuilder cadastroBuilder = new CadastroBuilder();
            Cadastro cadastro = cadastroBuilder
                    .setCpf(1)
                    .setEmail("pessoa1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cadastro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCadastroValido() {
        CadastroBuilder cadastroBuilder = new CadastroBuilder();
        Cadastro cadastro = cadastroBuilder
                .setCpf(1)
                .setNome("Pessoa 1")
                .setEmail("pessoa1@email.com")
                .build();

        assertNotNull(cadastro);
    }
}
