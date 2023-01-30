

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float nota = 0.0F;
        Scanner teclado = new Scanner(System.in);
        new aluno();
        sala novaSala = new sala();

        int opc;
        do {
            System.out.println("----------------------");
            System.out.println("*       MENU        *");
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar aluno");
            System.out.println("3 - Situacoes");
            System.out.println("0 - Sair");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 0:
                    System.out.println("saindo...");
                    break;
                case 1:
                    System.out.println("nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("cpf: ");
                    String cpf = teclado.nextLine();
                    aluno novoAluno = new aluno(nome, cpf);
                    System.out.println("Quantas notas?");
                    int qntnotas = teclado.nextInt();

                    for(int i = 0; i < qntnotas; ++i) {
                        System.out.println("notas " + (i + 1));
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                    }

                    novaSala.insereAluno(novoAluno);
                    break;
                case 2:
                    novaSala.listarAlunos();
                    break;
                case 3:
                    novaSala.listarSituacoes();
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        } while(opc != 0);

    }
}
