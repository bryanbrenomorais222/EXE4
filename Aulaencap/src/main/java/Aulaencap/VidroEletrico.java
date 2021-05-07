/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulaencap;

/**
 *
 * @author Bryan
 */
class VidroEletrico {
   private int posicao; 
   private boolean aberto;
   private boolean ligado;
   private int velocita;
   private boolean cambio;
   
   public int getVelocita(){
       return this.velocita;
   }
   
   public void setVelocita(int velocita){
       if(velocita >0 && velocita <240){
           this.velocita = velocita;
       
       } else{
           System.out.println("A velocidade máxima 240...");
       }   
   }
   
   public int getPosicao(){
       return this.posicao;
   }
   
   public void setPosicao(int posicao){
        if(posicao >=0 && posicao <=10){
            this.posicao = posicao;
        }else{
            System.out.println("A posição deve ser entre 0 & 10 ");
        }
   }
   
   public boolean getLigado(){
       return this.ligado;
   }
   
   public boolean getCambio(){
       return this.cambio;
   }
   
   public void Marcha(){
      if(ligado == true && velocita > 0){
          System.out.println("Shift Marcha");
      }
  }        
          
   public void Aceleraracao(){
    if(ligado == true && velocita <240){
        System.out.println("Iniciando Aceleração...");
        velocita += 10;
    }
  }
   
   public void Ligar(){
       if(ligado == false){
           System.out.println("Ligando o Carro");
           ligado = true;
       }
   }
   
   public void Iniciar(){
        ligado = false;
   }
   
   public void SubirVidro(){
       if(this.posicao >=10){
           System.out.println("O vidro está completamente Fechado");
       }else{
           this.posicao +=2;
           
           if(this.posicao ==10){
               this.aberto = false;
           }
       }
   }
   
   public void BaixarVidro(){
       if(this.posicao <=0){
           System.out.println("O vidro está completamente Aberto");
       }else{
           this.posicao -=2;
           this.aberto = true;
       }
   }
   
   public void Status(){
       System.out.println("Aberto?" + this.aberto);
       System.out.println("Posição:" + this.posicao);
   }
}
