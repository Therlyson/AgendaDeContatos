package entities;

public class PessoaFisica {
    private String nome;
    private String CPF;
    private String endereco;
    private String dataNascimento;
    private String email;
    private String estadoCivil;

    public PessoaFisica(String nome, String CPF, String endereco, String dataNascimento, String email, String estadoCivil){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getCPF(){
        return CPF;
    }
}
