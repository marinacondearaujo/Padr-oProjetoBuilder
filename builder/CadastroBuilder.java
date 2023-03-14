package padroescriacao_exercicios.builder;

import padroescriacao_exercicios.builder.Cadastro;
import padroescriacao_exercicios.builder.CadastroBuilder;

import java.util.Date;

public class CadastroBuilder {
    private Cadastro cadastro;

    public CadastroBuilder() {
        cadastro = new Cadastro();
    }

    public Cadastro build() {
        if (cadastro.getCpf() == 0) {
            throw new IllegalArgumentException("Cpf inválido");
        }
        if (cadastro.getNome().equals("")) {
            throw new IllegalArgumentException("Cadastro inválido");
        }
        return cadastro;
    }

    public CadastroBuilder setCpf(int cpf) {
        cadastro.setCpf(cpf);
        return this;
    }

    public CadastroBuilder setNome(String nome) {
        cadastro.setNome(nome);
        return this;
    }

    public CadastroBuilder setDataNascimento(Date dataNascimento) {
        cadastro.setDataNascimento(dataNascimento);
        return this;
    }

    public CadastroBuilder setRg(String rg) {
        cadastro.setRg(rg);
        return this;
    }


    public CadastroBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        cadastro.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public CadastroBuilder setEnderecoNumero(int enderecoNumero) {
        cadastro.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public CadastroBuilder setEnderecoComplemento(String enderecoComplemento) {
        cadastro.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public CadastroBuilder setEnderecoBairro(String enderecoBairro) {
        cadastro.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public CadastroBuilder setEnderecoCidade(String enderecoCidade) {
        cadastro.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public CadastroBuilder setEnderecoUF(String enderecoUF) {
        cadastro.setEnderecoUF(enderecoUF);
        return this;
    }

    public CadastroBuilder setCep(String cep) {
        cadastro.setCep(cep);
        return this;
    }

    public CadastroBuilder setEmail(String email) {
        cadastro.setEmail(email);
        return this;
    }

    public CadastroBuilder setCelular(String celular) {
        cadastro.setCelular(celular);
        return this;
    }

}
