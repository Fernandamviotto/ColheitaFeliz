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
        System.out.println("Cultura plantada: " + cultura.getNome());
    }
    
    public void ColherCultura(Cultura cultura){
        if (cultura.getDiasDeCrescimento() >= cultura.getTempoDeCrescimento()){
            Moedas += cultura.Colher();
            culturas.remove(cultura);
            System.out.println("Cultura colhida: " + cultura.getNome() + ". Moedas ganhas: " + cultura.getValorDeVenda());
        }
            System.out.println("A cultura ainda não está pronta para colher");
    }
    
    public void AdicionalAnimal(Animal animal){
        animais.add(animal);
    }
    
    public void AlimentarAnimal(Animal animal){
        if(RacaoDisponivel >= animal.ConsumoDeRacao){
            RacaoDisponivel -= animal.ConsumoDeRacao;
            animal.Alimentar();
            System.out.println("Animal alimentado" + animal.getNome());
        }
            System.out.println("Ração insuficiente para alimentar o animal");
    }
    
    public void ColetarProducao(Animal animal){
        if(animal.isAlimentado()){
            Moedas += animal.ColetarProducao();
            System.out.println("Producao coletada de " + animal.getNome() + ". Moedas ganhas" + animal.getProducaoDiaria());
        }
            System.out.println("Animal não foi alimentado, pois não tem produção");
    }
    
    public int getMoedas(){
        return Moedas;
    }
}
