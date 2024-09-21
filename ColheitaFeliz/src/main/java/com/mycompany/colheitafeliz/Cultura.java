package com.mycompany.colheitafeliz;

public class Cultura {
    protected String Nome;
    protected int TempoDeCrescimento;
    protected int DiasDeCrescimento;
    protected int ValorDeVenda;
    
    public Cultura(String nome, int TempoDeCrescimento, int ValorDeVenda){
        this.Nome = nome;
        this.TempoDeCrescimento = TempoDeCrescimento;
        this.DiasDeCrescimento = 0;
        this.ValorDeVenda = ValorDeVenda;
        }
    
  public void Plantar(){
      System.out.println("Iniciou o processo de plantação do: " + Nome);
  }
  public void Crescer(){
      if(DiasDeCrescimento < TempoDeCrescimento){
          DiasDeCrescimento++;
          System.out.println("O" + Nome + "cresceu" + DiasDeCrescimento + "dias");
      }
      System.out.println("O" + Nome + "esta pronto para colher");
  }
    
   public int Colher(){
       return ValorDeVenda;
   }
}
