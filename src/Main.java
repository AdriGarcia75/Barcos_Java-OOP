public class Main {
    public static void main(String[] args) {

        Crucero cruceroPrueba = new Crucero(20);
        Portaaviones portaavionesPrueba = new Portaaviones(10, 200);
        Pesquero pesqueroPrueba = new Pesquero(12, 400, 8);

        cruceroPrueba.mensajeSocorro("Mensaje de prueba 1");
        portaavionesPrueba.mensajeSocorro("Mensaje de prueba 2");
        pesqueroPrueba.mensajeSocorro("Mensaje de prueba 3");

    }
}