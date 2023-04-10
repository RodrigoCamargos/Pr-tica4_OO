import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Funcoes f = new Funcoes();
        Menu m = new Menu();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Fabricante \n 1- Fabricante A \n 2- Fabricante B");
        int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Fabricante A foi selecionado");
                f.FabricanteA();

            } else if (opcao == 2) {
                System.out.println("Fabricante B foi selecionado");
                f.FabricanteB();
            }

            else
                System.out.println("Opção invalida");
    }
    }
