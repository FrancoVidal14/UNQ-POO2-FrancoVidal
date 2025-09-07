package tp2;

import java.util.Date;

class Contratado extends Empleado {
    private String numeroContrato;
    private String medioPago;

    public Contratado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, float sueldoBasico,
                      String numeroContrato, String medioPago) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.numeroContrato = numeroContrato;
        this.medioPago = medioPago;
    }

    public float sueldoBruto() {
        return getSueldoBasico();
    }

    public float retenciones() {
        return 50;
    }
}