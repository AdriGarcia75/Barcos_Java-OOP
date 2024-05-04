public class Portaaviones implements Barcos{

    private int numero_aviones;
    private int numero_marinos;

    public Portaaviones(int numero_aviones, int numero_marinos){
        this.numero_aviones = numero_aviones;
        this.numero_marinos = numero_marinos;
        System.out.println("Se ha creado un Portaaviones con la siguientes caracteristicas: " + numero_aviones + " aviones y " + numero_marinos + " marinos de capacidad.");
    }

    public void alarma(){
        System.out.println("La alarma ha sido emitida por un Portaaviones");
    }

    public void mensajeSocorro(String mensajeDeSocorro){
        alarma();
        System.out.println(mensajeDeSocorro);
    }

    public int getNumero_aviones() {
        return numero_aviones;
    }

    public void setNumero_aviones(int numero_aviones) {
        this.numero_aviones = numero_aviones;
    }

    public int getNumero_marinos() {
        return numero_marinos;
    }

    public void setNumero_marinos(int numero_marinos) {
        this.numero_marinos = numero_marinos;
    }
}
