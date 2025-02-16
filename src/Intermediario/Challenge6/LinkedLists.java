package Intermediario.Challenge6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeDoNinja;
        int idadeDoNinja;
        String vilaDoNinja;

        LinkedList listaDeNinjas = new LinkedList<Ninja>();
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));


        while (true){
            System.out.println("\n================== Menu Ninja ==================\n");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Remover Ninja");
            System.out.println("4 - Encerrar\n");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n-------------------------------------------------");

            switch (option){
                case 1:
                    System.out.println("Insira o nome do ninja:");
                    nomeDoNinja = scanner.nextLine();
                    System.out.println("Insira a Idade do ninja");
                    idadeDoNinja = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira a vila do ninja");
                    vilaDoNinja = scanner.nextLine();
                    Ninja novoNinja = new Ninja(nomeDoNinja,idadeDoNinja,vilaDoNinja);
                    listaDeNinjas.add(novoNinja);
                    break;
                case 2:
                    int index = 1;
                    for (Object ninja : listaDeNinjas){
                        System.out.println(index  + " - " + ninja);
                        index ++;
                    }
                    break;
                case 3:
                    while (true){
                        System.out.println("Digite o número do ninja a ser excluído");
                        try {
                        int ninjaExcluido = scanner.nextInt();
                        scanner.nextLine();
                            if (ninjaExcluido > 0 && ninjaExcluido <= listaDeNinjas.size()) {
                                listaDeNinjas.remove(ninjaExcluido - 1); // Removendo pelo índice (base 0)
                                System.out.println("Opção removida com sucesso.");
                                break;
                            } else {
                                System.out.println("Ops esse Ninja não existe, digite um Ninja válido!");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro! Você deve digitar um número.");
                            scanner.next();  // Descarta a entrada inválida
                        }
                    }
                    break;
                case 4:
                    return;
            }

        }
    }
}
