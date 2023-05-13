package problema2;
class Profesores {
    private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, double sueldobasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldobasico = sueldobasico;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldobasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public void CalcularSueldoTotal() {
        this.sueldototal = this.sueldobasico * 120;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldobasico() {
        return sueldobasico;
    }

    public double getSueldototal() {
        return sueldototal;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldobasico=" + sueldobasico + ", sueldototal=" + sueldototal + ", cedula=" + cedula + '}';
    }
    
}

public class Problema2 {

    public static void main(String[] args) {
        Profesores profesor1 = new Profesores("Esteban","Gonzales",700,"1104670128");
        profesor1.CalcularSueldoTotal();
        System.out.println(profesor1);
    }
    
}
