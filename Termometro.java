package poo;

public class Termometro {
    public double temperatura;
    
    public Termometro(){
        this.temperatura = 20;
    }
    public void subir(double grados){
        temperatura = temperatura + grados;
    }
    public void bajar(double grados){
        temperatura = temperatura - grados;
    }
    public String estado(){
        return "temperatura" + temperatura + "c";
    }

public static void main(String[] args) {
    Termometro t = new Termometro();
    System.out.println(t.estado()); 
    
    }
}
