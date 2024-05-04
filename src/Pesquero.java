public class Pesquero implements Barcos{

    private int eslora;
    private int potencia;
    private int numero_pescadores;

    public Pesquero(int eslora, int potencia, int numero_pescadores){
        this.eslora = eslora;
        this.potencia = potencia;
        this.numero_pescadores = numero_pescadores;
        System.out.println("Se ha creado un Pesquero con la siguientes caracteristicas: " + eslora + " metros de eslora, " + potencia + " caballos de potencia y caben " + numero_pescadores + " pescadores.");
    }

    public void alarma(){
        System.out.println("La alarma ha sido emitida por un Pesquero");
    }
    public void mensajeSocorro(String mensajeDeSocorro){
        alarma();
        System.out.println(mensajeDeSocorro);
    }

}
