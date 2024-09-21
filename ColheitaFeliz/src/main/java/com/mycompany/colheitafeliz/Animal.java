package com.mycompany.colheitafeliz;


public class Animal {
    protected String nome;
    protected int idade;
    protected int ProducaoDiaria;
    protected int ConsumoDeRacao;
    
    public Animal (String Nome, int ProducaoDiaria, int ConsumoDeRacao){
        this.nome = nome;
        this.idade = 0;
        this.ProducaoDiaria = ProducaoDiaria;
        this.ConsumoDeRacao = ConsumoDeRacao;
    }
}
