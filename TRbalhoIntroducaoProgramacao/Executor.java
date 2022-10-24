package TRbalhoIntroducaoProgramacao;

import java.util.Scanner;

public class Executor {

        public static void main(String[] args) {
            int opc = 0;
            Scanner sc = new Scanner(System.in);
            Vetor vetor = new Vetor();

            while (opc != 4) {
                System.out.println("1 - Inserir um Nome");
                System.out.println("2 - Buscar um Nome");
                System.out.println("3 - Excluir um Nome");
                System.out.println("4 - Fechar programa");
                opc = sc.nextInt();

                switch (opc){
                    case 1:
                        vetor.Add();
                        break;
                    case 2:
                        vetor.Busca();
                        break;
                    case 3:
                        vetor.Remove();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Escolha somente entre 1 a 4");
                }
            }
        }
    }
