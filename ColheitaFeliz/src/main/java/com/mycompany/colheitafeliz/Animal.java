package com.mycompany.colheitafeliz;

public class Animal {
    protected String Nome;
    protected int Idade;
    protected int ProducaoDiaria;
    protected int ConsumoDeRacao;
    protected boolean Alimentado;
    
    public Animal (String Nome, int ProducaoDiaria, int ConsumoDeRacao){
        this.Nome = Nome;
        this.Idade = 0;
        this.ProducaoDiaria = ProducaoDiaria;
        this.ConsumoDeRacao = ConsumoDeRacao;
        this.Alimentado = false;
    }
    
    public void Alimentar(){
        System.out.println("O" + Nome + "foi alimentado com " + ConsumoDeRacao + "de racao");
    }
    public int ColetarProducao(){
        if(Alimentado){
            System.out.println("Foi coletado" + ProducaoDiaria + "do" + Nome);
            Alimentado = false;
            return ProducaoDiaria;
        }
        System.out.println("O" + Nome + "não foi alimentado, por isso não produziu");
        return 0;
    }
    
    public String getNome() {
        return Nome;
    }

    public int getConsumoDeRacao() {
        return ConsumoDeRacao;
    }

    public int getProducaoDiaria() {
        return ProducaoDiaria;
    }

    public boolean isAlimentado() {
        return Alimentado;
    }
}
