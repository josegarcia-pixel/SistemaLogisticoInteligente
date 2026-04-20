public class Main {
    public static void main(String[] args) {

        CentroControl centro = new CentroControl();

        Vehiculo v1 = new DronTransporte("D1");
        Vehiculo v2 = new CamionAutonomo("C1");

        centro.registrarUnidad(v1);
        centro.registrarUnidad(v2);

        centro.monitorearFlota();
    }
}