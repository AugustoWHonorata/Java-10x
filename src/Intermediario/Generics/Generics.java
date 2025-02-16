package Intermediario.Generics;

public class Generics {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaNinja<EquipamentosNinja> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarEquipamentos(kunai);
        bolsaNinja.adicionarEquipamentos(shuriken);
        bolsaNinja.adicionarEquipamentos(pergaminho);
        System.out.println(bolsaNinja);
        bolsaNinja.mostrarEquipamentos();


        BolsaNinja<Object> bolsaNinja1 = new BolsaNinja<>();
        bolsaNinja1.adicionarEquipamentos(new Kunai("Kunai de fogo"));
        bolsaNinja1.adicionarEquipamentos(new Shuriken(5));
        bolsaNinja1.adicionarEquipamentos(new Pergaminho("Invocacao do Sapo"));
        System.out.println(bolsaNinja1);
        bolsaNinja1.mostrarEquipamentos();
    }
}
