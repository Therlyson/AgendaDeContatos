package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<PessoaFisica> contatosFisicos;
    private List<PessoaJuridica> contatosJuridicos;

    public Agenda() {
        contatosFisicos = new ArrayList<>();
        contatosJuridicos = new ArrayList<>();
    }

    public void adicionarPFisica(String nome, String cpf, String endereco, String data, String email, String estCivil){
        PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf, endereco, data, email, estCivil);
        contatosFisicos.add(pessoaFisica);
        System.out.println("CONTATO ADICIONADO COM SUCESSO!");
    }

    public void adicionarPJuridica(String nome, String cnpj, String endereco, String email, long inscricao, String rz){
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, email, cnpj, inscricao, rz);
        contatosJuridicos.add(pessoaJuridica);
        System.out.println("CONTATO ADICIONADO COM SUCESSO!");
    }

    public void visualizarAgenda(){
        if(contatosFisicos.size() > 0 || contatosJuridicos.size() > 0){ //testando se tem alguém na agenda
            System.out.println("\n------- CONTATOS -------");
            for (int i = 0; i < contatosFisicos.size(); i++) {   //mostrando contatos fisicos
                System.out.println(" - " + contatosFisicos.get(i).getNome());
            }
            for (int i = 0; i < contatosJuridicos.size(); i++) {   //mostrando contatos fisicos
                System.out.println(" - " + contatosJuridicos.get(i).getNome());
            }
        }
        else{
            System.out.println("AGENDA VAZIA!");
        }

    }

    public void removerPessoa(String nome){
        boolean key = false;

        for (int i = 0; i < contatosFisicos.size(); i++) {
            if(nome.equalsIgnoreCase(contatosFisicos.get(i).getNome())){  /*compara o nome digitado com o nome de cada pessoa que está na agenda,
                                                                            ignorando maiúsculas ou minúsculas*/
                contatosFisicos.remove(i);
                System.out.println("\nCONTATO REMOVIDO COM SUCESSO.");
                key = true;
                break;
            }
        }
        for (int i = 0; i < contatosJuridicos.size(); i++) {
            if(nome.equalsIgnoreCase(contatosJuridicos.get(i).getNome())){
                contatosJuridicos.remove(i);
                System.out.println("\nCONTATO REMOVIDO COM SUCESSO.");
                key = true;
                break;
            }
        }
        if(!key){
            System.out.println("ERRO AO REMOVER, ESSA PESSOA NÃO EXISTE EM SUA AGENDA.");
        }
    }

    public void pesquisarPorNome(String nome){
        boolean key = false;
        for(int i = 0; i < contatosFisicos.size(); i++){
            if(nome.equalsIgnoreCase(contatosFisicos.get(i).getNome())){
                System.out.println("\nNome: "+contatosFisicos.get(i).getNome() + "\nEmail: "+ contatosFisicos.get(i).getEmail());
                key = true;
                break;
            }
        }

        for(int i=0; i<contatosJuridicos.size(); i++){
            if (nome.equalsIgnoreCase(contatosJuridicos.get(i).getNome())) {
                System.out.println("\nNome: "+contatosJuridicos.get(i).getNome() + "\nEmail: "+ contatosJuridicos.get(i).getEmail());
                key = true;
                break;
            }
        }

        if(!key){
            System.out.println("DESCULPE, ESSE NOME NÃO CONSTA NA AGENDA.");
        }
    }

    public void pesquisarCPFouCNPJ(String numero){
        boolean key = false;
        for(int i=0; i<contatosFisicos.size(); i++){
            if (numero.equalsIgnoreCase(contatosFisicos.get(i).getCPF())) {
                System.out.println("Nome: "+contatosFisicos.get(i).getNome() + "\nEmail: "+ contatosFisicos.get(i).getEmail());
                key = true;
            }
        }

        for(int i=0; i<contatosJuridicos.size(); i++){
            if (numero.equalsIgnoreCase(contatosJuridicos.get(i).getCNPJ())) {
                System.out.println("Nome: "+contatosJuridicos.get(i).getNome() + "\nEmail: "+ contatosJuridicos.get(i).getEmail());
                key = true;
            }
        }

        if(!key){
            System.out.println("DESCULPE, ESSE CPF OU CNPJ NÃO CONSTA NA AGENDA.");
        }
    }

}
