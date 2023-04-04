import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;
        Scanner ler = new Scanner(System.in);
        DistribuicaoAlimento da = new DistribuicaoAlimento();
        projeto p = new projeto() {
            @Override
            public void validaProjeto() {

            }

            @Override
            public void imprimeProjeto() {

            }
        };
        TrabalhoVoluntario tv = new TrabalhoVoluntario();

        System.out.println("Selecione a opção desejada no menu: \n 1- Cadastrar Projeto Distribuir Alimentos \n2- Cadastrar Projeto Trabalho Voluntário \n 3- Sair");

        opcao = ler.nextInt();


        while (opcao == 3) {
                break;

        }
        if (opcao == 1){

            da.imprimeProjeto();
            da.validaProjeto();

        } else if (opcao == 2) {

            tv.validaProjeto();
            tv.imprimeProjeto();

        }


    }
}