package tp2;

import java.util.Date;


abstract class Empleado {
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private Date fechaNacimiento;
    private float sueldoBasico;

    public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, float sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getEstadoCivil() { return estadoCivil; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public float getSueldoBasico() { return sueldoBasico; }

    public int calcularEdad() {
        Date hoy = new Date();
        int edad = hoy.getYear() - fechaNacimiento.getYear();
        return edad;
    }

    public abstract float sueldoBruto();
    public abstract float retenciones();

    public float sueldoNeto() {
        return sueldoBruto() - retenciones();
    }
}