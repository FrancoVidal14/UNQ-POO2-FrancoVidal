package tp2;

import java.util.ArrayList;
import java.util.Date;

class ReciboHaberes {
    private String nombreEmpleado;
    private String direccion;
    private Date fechaEmision;
    private float sueldoBruto;
    private float sueldoNeto;
    private ArrayList<Concepto> items = new ArrayList<>();

    public ReciboHaberes(String nombreEmpleado, String direccion, Date fechaEmision, float sueldoBruto, float sueldoNeto) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.fechaEmision = fechaEmision;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }

    public void agregarItem(Concepto item) {
        items.add(item);
    }
}