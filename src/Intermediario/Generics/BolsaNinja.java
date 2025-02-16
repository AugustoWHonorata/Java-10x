package Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> equipamentos;

    public BolsaNinja() {
        this.equipamentos = new ArrayList<>();
    }

    //Colocar equipamentos Genericos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }
    public void mostrarEquipamentos(){
        for (T equipamento : equipamentos){
            System.out.println(equipamento);
        }
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }


}
