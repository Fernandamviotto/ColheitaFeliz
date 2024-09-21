package com.mycompany.colheitafeliz;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Cultura> culturas;
    private List<Animal> animais;
    private int AguaDisponivel;
    private int FertilizantesDisponiveis;
    private int RacaoDisponivel;
    private int Moedas;
    
    public Fazenda(){
        culturas = new ArrayList<>();
        animais = new ArrayList<>();
        AguaDisponivel = 500;
        FertilizantesDisponiveis = 300;
        RacaoDisponivel = 1000;
        Moedas = 1500;
    }
    
    public void PlantarCultura(Cultura cultura){
        culturas.add(cultura);
    }
    
    public void ColherCultura(Cultura cultura){
    
    }
    
    public void AdicionalAnimal(Animal animal){
        animais.add(animal);
    }
    
    public void AlimentarAnimal(Animal animal){
        if(RacaoDisponivel >= animal.ConsumoDeRacao){
            RacaoDisponivel -= animal.ConsumoDeRacao;
            animal.Alimentar();
            System.out.println("Animal alimentado");
        }
    }
}
