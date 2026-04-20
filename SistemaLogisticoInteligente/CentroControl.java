import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Vehiculo> flota = new ArrayList<>();

    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
    }

    public void monitorearFlota() {
        for (Vehiculo v : flota) {
            v.patronMovimiento();
        }
    }
}