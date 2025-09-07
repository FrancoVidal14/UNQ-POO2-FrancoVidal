package tp2;
import java.util.ArrayList;
import java.util.Date;

class Empresa {
    private String nombre;
    private String cuit;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Empresa(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public float totalSueldosNetos() {
        float total = 0;
        for (Empleado e : empleados) {
            total += e.sueldoNeto();
        }
        return total;
    }

    public float totalSueldosBrutos() {
        float total = 0;
        for (Empleado e : empleados) {
            total += e.sueldoBruto();
        }
        return total;
    }

    public float totalRetenciones() {
        float total = 0;
        for (Empleado e : empleados) {
            total += e.retenciones();
        }
        return total;
    }

    public void liquidarSueldos(Date fecha) {
        for (Empleado e : empleados) {
            ReciboHaberes recibo = new ReciboHaberes(
                e.getNombre(),
                e.getDireccion(),
                fecha,
                e.sueldoBruto(),
                e.sueldoNeto()
            );
        }
    }
}
