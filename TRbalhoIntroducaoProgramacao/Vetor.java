package TRbalhoIntroducaoProgramacao;

import java.util.Scanner;

public class Vetor {

        private int Tamanho = 3;
        private int Add;
        private int Busca;
        private int Pos = 0;
        private String Nome;
        private int Remove;
        private String [] vetor;
        private int vetor2[] = new int[3];


        public Vetor() {
            this.Tamanho = Tamanho;
            this.vetor = new String[Tamanho];

        }
    private int valida() {
        for(int i = 0; i < this.Tamanho;i++) {
            if(this.vetor2[i] == -1) {
                return i;
            }
        }
        return 0;
    }

    public void Add() {
        int valor = 0;
        int i = valida();
        if (i == -1) {
            System.out.println("vetor ja esta cheio");
        } else {
            this.vetor2[i] = valor ;
                        String add;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Adicione um Nome");
                        add = sc.next();
                        vetor[Pos] = add;
                        System.out.println("Nome: " + vetor[Pos] + " adicionado na posicao " + Pos);
                        this.Pos = this.Pos + 1;

                    }
                }

    public void Remove() {
        int posicao = 0;
        int temp;
        int i = 0;
        for (i = posicao; i < this.Tamanho-1; i++) {
            temp = Integer.parseInt(this.vetor[Pos]);
            this.vetor [Pos] = String.valueOf(this.vetor2[Pos + 1]);
            this.vetor2 [Pos + 1] = temp;
        }
        this.vetor[this.Tamanho-1]= String.valueOf(-1);
    }

            public void Busca(){
                int pos;
                Scanner sc = new Scanner(System.in);
                System.out.println("Escreva a posicao que deseja buscar: ");
                pos = sc.nextInt();
                System.out.println(vetor[pos]);
            }
        }