
package com.mycompany.colheitafeliz;

public class Milho extends Cultura {
   
    public Milho(){
        super("Milho", 5, 10);
    }
    
    @Override
    public int Colher() {
        if (DiasDeCrescimento == TempoDeCrescimento) {
            // Bônus de colheita sob condições ideais (colher exatamente no tempo certo)
            System.out.println("O" + Nome + "foi colhido em condições ideais! Você recebe um bônus.");
            return ValorDeVenda + 10; // Bônus de 5 moedas
        } if (DiasDeCrescimento >= TempoDeCrescimento) {
            return ValorDeVenda;
        }
            System.out.println(Nome + "ainda não está pronto para colheita.");
            return 0;        
    }
}


