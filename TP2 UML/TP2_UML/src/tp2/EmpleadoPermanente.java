package tp2;

import java.util.Date;

class EmpleadoPermanente extends Empleado {
    private int cantidadHijos;
    private int antiguedad;

    public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, float sueldoBasico,
                      int cantidadHijos, int antiguedad) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }

    public float sueldoBruto() {
        return getSueldoBasico();
    }

    public float retenciones() {
        return 0;
    }
}