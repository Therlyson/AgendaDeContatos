package entities;

public class PessoaJuridica {
    private String nome;
    private String endereco;
    private String email;
    private String CNPJ;
    private long inscricao;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String CNPJ, long inscricao,String razaoSocial){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.CNPJ = CNPJ;
        this.inscricao = inscricao;
        this.razaoSocial = razaoSocial;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getCNPJ(){
        return CNPJ;
    }
}
