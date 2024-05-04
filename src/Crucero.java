public class Crucero implements Barcos{

    private int eslora;
    private int camas_ocupadas;
    public Crucero(int eslora){
        this.eslora = eslora;
        this.camas_ocupadas = 0;
        System.out.println("Se ha creado un Crucero con la siguientes caracteristicas: " + eslora + " metros de eslora.");
    }
    public void alarma(){
        System.out.println("La alarma ha sido emitida por un Crucero");
    }
    public void mensajeSocorro(String mensajeDeSocorro){
        alarma();
        System.out.println(mensajeDeSocorro);
    }

    /* no es necesario esto, segun el enunciado
    public void crearCama(){
        this.camas_ocupadas += 1;
    } */
}
