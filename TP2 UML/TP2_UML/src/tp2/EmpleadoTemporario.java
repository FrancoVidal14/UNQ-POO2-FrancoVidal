package tp2;

import java.util.Date;

class EmpleadoTemporario extends Empleado {
    private Date finDesignacion;
    private int horasExtras;

    public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, float sueldoBasico,
                      Date finDesignacion, int horasExtras) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.finDesignacion = finDesignacion;
        this.horasExtras = horasExtras;
    }

    public float sueldoBruto() {
        return getSueldoBasico();
    }

    public float retenciones() {
        return 0;
    }
}