package com.mycompany.colheitafeliz;

public class Vaca extends Animal{
    
    public Vaca(){
        super("Nome", 5, 2);
    }
    
    @Override
    public int ColetarProducao() {
        if (Alimentado) {
            System.out.println("Vaca bem alimentada! Bônus de produção.");
            int bonus = 2;
            Alimentado = false;
            return ProducaoDiaria + bonus;
        } 
        System.out.println("A vaca não foi alimentada e não produziu.");
        return 0;        
    }
    
}
