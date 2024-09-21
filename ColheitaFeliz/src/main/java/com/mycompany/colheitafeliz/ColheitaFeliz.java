
package com.mycompany.colheitafeliz;

public class ColheitaFeliz {

    public static void main(String[] args) {
        Fazenda fazenda = new Fazenda();
        
        Milho milho = new Milho();
        Batata batata = new Batata();
        Tomate tomate = new Tomate();
        
        for(int i = 0; i < 6; i++){
            milho.Crescer();
            batata.Crescer();
            tomate.Crescer();
        }
    }
}
