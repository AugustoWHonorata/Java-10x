package Intermediario.Abstract;

class Uchiha extends Ninja implements SensorNinja {
    @Override
    void realizarJutsu() {
        System.out.println("Uchiha: Amaterasu!");
    }

    @Override
    public void detectarChakra() {
        System.out.println("Uchiha usa o Sharingan para detectar chakra.");
    }
}
