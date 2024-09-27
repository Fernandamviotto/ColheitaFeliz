
package com.mycompany.colheitafeliz;

public class ColheitaFeliz {

    public static void main(String[] args) {
        Fazenda fazenda = new Fazenda();
        
        Milho milho = new Milho();
        Batata batata = new Batata();
        Tomate tomate = new Tomate();
        fazenda.PlantarCultura(milho);
        fazenda.PlantarCultura(batata);
        fazenda.PlantarCultura(tomate);
        
        for(int i = 0; i < 6; i++){
            milho.Crescer();
            batata.Crescer();
            tomate.Crescer();
        }
        
        fazenda.ColherCultura(milho);
        fazenda.ColherCultura(batata);
        fazenda.ColherCultura(tomate);
        
        Galinha galinha = new Galinha();
        Ovelha ovelha = new Ovelha();
        Vaca vaca = new Vaca();
        fazenda.AlimentarAnimal(galinha);
        fazenda.AlimentarAnimal(ovelha);
        fazenda.AlimentarAnimal(vaca);
        
        fazenda.ColetarProducao(galinha);
        fazenda.ColetarProducao(ovelha);
        fazenda.ColetarProducao(vaca);
        
        System.out.println("Moedas totais" + fazenda.getMoedas());
    }
}
