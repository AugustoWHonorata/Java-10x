package desafio2;

import java.util.Scanner;

public class ArraysConditionalSwitchLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de Ninjas a ser cadastrado: ");
        int quantidadeDeNinjas = scanner.nextInt();
        String[] ninjas = new String[quantidadeDeNinjas];
        System.out.println("------------------------------------------------");

        while (true){
            System.out.println("\n================== Menu Ninja ==================\n");
            System.out.println("1 - Cadastrar ninjas");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Encerrar ninjas\n");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n-------------------------------------------------");

            switch (option){
                case 1:
                    if (ninjas[quantidadeDeNinjas-1] != null){
                        System.out.println("\nDigite a quantidade de Ninjas a ser cadastrado: ");
                        quantidadeDeNinjas = scanner.nextInt();
                        scanner.nextLine();
                        ninjas = new String[quantidadeDeNinjas];
                        System.out.println("\n------------------------------------------------");
                    }
                    for (int i = 0; i < quantidadeDeNinjas; i++) {
                        System.out.println("\nDigite o nome do " + (i+1) + "º ninja");
                        ninjas[i] = scanner.nextLine();
                    }
                    System.out.println("\n------------------------------------------------");

                    break;
                case 2:
                    if (ninjas[quantidadeDeNinjas-1] != null){
                        System.out.println("\nNinjas: \n");
                        for (int i = 0; i < quantidadeDeNinjas; i++) {
                            System.out.println((i+1) + " - " + ninjas[i]);
                        }
                        System.out.println("\n------------------------------------------------");

                    } else{
                        System.out.println("\n\nCadastre os ninjas primeiro");
                    }
                    break;
                case 3:
                    return;
            }

        }
    }
}
