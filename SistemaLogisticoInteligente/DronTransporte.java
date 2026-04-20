public class DronTransporte extends Vehiculo implements IConectable {

    public DronTransporte(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El dron vuela en el aire");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("Dron sincronizando GPS");
    }
}