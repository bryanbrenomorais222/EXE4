package Aulaencap;


public class Aula09 {

    
    public static void main(String[] args) {
        VidroEletrico m1 = new VidroEletrico();
        m1.SubirVidro();
        m1.SubirVidro();
        m1.SubirVidro();
       System.out.println("Posição: " + m1.getPosicao());
       
       m1.setPosicao(12);
       System.out.println("Posição: " + m1.getPosicao());
        
       m1.setVelocita(259);
       System.out.println(m1.getVelocita());
       
    }
    
}
