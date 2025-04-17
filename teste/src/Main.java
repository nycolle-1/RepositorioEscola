import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Scanner ler3 = new Scanner(System.in);


    // criando os variaveis
        ArrayList<String> nomeAlunos =new ArrayList<String>();

        ArrayList<Integer> nota1 =new ArrayList<Integer>();
        ArrayList<Integer> nota2 =new ArrayList<Integer>();
        ArrayList<Integer> nota3 =new ArrayList<Integer>();
        ArrayList<Integer> nota4 =new ArrayList<Integer>();
        ArrayList<Integer> nota5 =new ArrayList<Integer>();
        ArrayList<Integer> mediaAluno =new ArrayList<Integer>();

        ArrayList<Integer> presensa =new ArrayList<Integer>();
       int mediaGeral;

        int somaNota1 = 0;
        int somaNota2 = 0;
        int somaNota3 = 0;
        int somaNota4 = 0;
        int somaNota5 = 0;

//--------------------------------------------------------------------------------------------

    //loop para escolher o cadastro ou ver
        int i =0;
        do {
            System.out.println("Aperte 1 para cadastra alunos e notas\n" +
                    "2 para ver resultados" +
                    "\n3 para media das turma em cada diciplina " +
                    "\n4 para ver alunos acima da media da turma" +
                    "\n5 para ver alunos a baixo da media da turma" +
                    " \n6 para ver alunos a baixo da presensa 75%");
                int menu= ler.nextInt();

            switch (menu) {
                case 1: //Cadastro alunos e notas
                    int cadastroIndice=0;
                   do {
                       System.out.println("nome aluno");
                            String nome = ler.nextLine();
                       System.out.println("materia 1");
                            int materia1 = ler2.nextInt();
                       System.out.println("materia 2");
                            int materia2 = ler2.nextInt();
                       System.out.println("materia 3");
                             int materia3 = ler3.nextInt();
                       System.out.println("materia 4");
                             int materia4 = ler.nextInt();
                       System.out.println("materia 5");
                            int materia5 = ler2.nextInt();
                       System.out.println("presensa em persentual");
                             int precensa = ler2.nextInt();

                     //adiciona os valores das variaveis no array
                           nomeAlunos.add(nome);
                           nota1.add(materia1);
                           nota2.add(materia2);
                           nota3.add(materia3);
                           nota4.add(materia4);
                           nota5.add(materia5);
                           presensa.add(precensa);

                       // sai do loop de castratro
                         System.out.println("deseja continuar?\n1- não e 0-sim ");
                        cadastroIndice= ler.nextInt();
                   }while(cadastroIndice==0);
                  break;
//-----------------------------------------------------------------------
                case 2:// ver alunos e notas
                    for (int indiceLista = 0; indiceLista < nomeAlunos.size() ;indiceLista++){
                    //calculo media notas
                        int media = (nota1.get(indiceLista)+nota2.get(indiceLista)+nota3.get(indiceLista)+nota4.get(indiceLista)+nota5.get(indiceLista))/5;
                        mediaAluno.add(media);

                    //mostra
                        System.out.println("nome aluno: "+ nomeAlunos.get(indiceLista));
                        System.out.println("media aluno:"+ media);
                        System.out.println("precensa:"+ presensa.get(indiceLista)+"%");

                    }

                    break;
//-----------------------------------------------------------------------
                case 3:
                //calula media
                    for (int indiceLista = 0; indiceLista < nomeAlunos.size() ;indiceLista++){

                        somaNota1 = somaNota1 +nota1.get(indiceLista);
                        somaNota2 = somaNota2 +nota2.get(indiceLista);
                        somaNota3 = somaNota3 +nota3.get(indiceLista);
                        somaNota4 = somaNota4 +nota4.get(indiceLista);
                        somaNota5 = somaNota5 +nota5.get(indiceLista);
                    }
                    int mediaMateria1 = somaNota1/nota1.size();
                    int mediaMateria2 = somaNota2/nota2.size();
                    int mediaMateria3 = somaNota3/nota3.size();
                    int mediaMateria4 = somaNota4/nota4.size();
                    int mediaMateria5 = somaNota5/nota5.size();

                    mediaGeral = (mediaMateria1+mediaMateria2+mediaMateria3+mediaMateria4+mediaMateria5)
                            /(nota1.size()+nota2.size()+nota3.size()+nota4.size()+nota5.size());

                //mostra media
                    System.out.println("\n-------------------\nMedia");
                    System.out.println("materia 1"+ mediaMateria1);
                    System.out.println("materia 2"+ mediaMateria2);
                    System.out.println("materia 3"+ mediaMateria3);
                    System.out.println("materia 4"+ mediaMateria4);
                    System.out.println("materia 5"+ mediaMateria5);

                    break;
//-----------------------------------------------------------------------
                case 4:
                    for (int indiceLista = 0; indiceLista < nomeAlunos.size() ;indiceLista++){
                        System.out.println("alunos acima da medias");

                        while(mediaGeral < mediaAluno.get(indiceLista)) {
                            System.out.println(nomeAlunos.get(indiceLista));
                        }
                    }

                    break;
//-----------------------------------------------------------------------

                case 5:
                    for (int indiceLista = 0; indiceLista < nomeAlunos.size() ;indiceLista++){
                        System.out.println("alunos abaixo da medias");

                        while(mediaGeral > mediaAluno.get(indiceLista)) {
                            System.out.println(nomeAlunos.get(indiceLista));
                        }
                    }

                    break;
//-----------------------------------------------------------------------
                case 6:
                    for (int indiceLista = 0; indiceLista < nomeAlunos.size() ;indiceLista++){
                        System.out.println("alunos abaixo de 75% de presensa");
                        while(75 > presensa.get(indiceLista)) {
                            System.out.println(nomeAlunos.get(indiceLista));
                        }
                    }
                    break;
//-----------------------------------------------------------------------
                default:
                    System.out.println("Resultado invalido");
            }

            System.out.println("Deseja continuar?");
                i=ler.nextInt();
        } while (i==0);
        System.out.println("programa fechado");
    }
}