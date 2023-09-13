import entities.Agenda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("----------------  AGENDA DE CONTATOS ----------------  ");

        while(true){
            System.out.println("\n[0] - SAIR\n[1] - ADICIONAR\n[2] - REMOVER\n[3] - VISUALIZAR\n[4] - PESQUISAR POR NOME\n[5] - PESQUISAR POR CPF OU CNPJ");
            System.out.print("Digite sua opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            if(opcao == 1){
                System.out.print("\n[1] - ADICIONAR PESSOA FISICA\n[2] - ADICIONAR PESSOA JURIDICA\nSua opção: ");
                int pessoa = teclado.nextInt();
                teclado.nextLine();
                System.out.println();
                if(pessoa == 1){
                    System.out.print("Digite o nome do contato: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite o CPF do contato: ");
                    String cpf = teclado.nextLine();
                    System.out.print("Digite o endereço do contato: ");
                    String endereco = teclado.nextLine();
                    System.out.print("Digite a data de nascimento do contato(xx/yy/xyxy): ");
                    String data = teclado.nextLine();
                    System.out.print("Digite o email do contato: ");
                    String email = teclado.nextLine();
                    System.out.print("Digite o estado civil do contato: ");
                    String estadoCivil = teclado.nextLine();
                    agenda.adicionarPFisica(nome, cpf, endereco, data, email, estadoCivil);
                }
                else if(pessoa==2){
                    System.out.print("Digite o nome da empresa: ");
                    String nome = teclado.nextLine();
                    System.out.print("Digite o endereço da empresa: ");
                    String endereco = teclado.nextLine();
                    System.out.print("Digite o email da empresa: ");
                    String email = teclado.nextLine();
                    System.out.print("Digite o CNPJ da empresa: ");
                    String cnpj = teclado.nextLine();
                    System.out.print("Digite o número da inscrição estadual da empresa: ");
                    long inscricao = teclado.nextLong();
                    teclado.nextLine();
                    System.out.print("Digite a razão social da empresa: ");
                    String razaoSocial = teclado.nextLine();
                    agenda.adicionarPJuridica(nome, endereco, email, cnpj, inscricao, razaoSocial);
                }
                else{
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.");
                }
            }

            else if(opcao == 2){
                System.out.print("Digite o nome do contato que você deseja remover: ");
                String n = teclado.nextLine();
                agenda.removerPessoa(n);
            }

            else if(opcao == 3) {
                agenda.visualizarAgenda();
            }

            else if(opcao == 4){
                System.out.print("Digite o nome do contato: ");
                String nome = teclado.nextLine();
                agenda.pesquisarPorNome(nome);
            }

            else if(opcao == 5){
                System.out.print("Digite o CPF ou CNPJ: ");
                String cpf = teclado.nextLine();
                System.out.println();
                agenda.pesquisarCPFouCNPJ(cpf);

            }

            else if(opcao == 0){
                System.out.println("AGENDA FECHADA!");
                break;
            }

            else{
                System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.");
            }
        }
        teclado.close();
    }
}