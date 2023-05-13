package problema3;

class Automotor {
    private String cedula;
    private String marca;
    private int anio;
    private double valorauto;
    private double valormatricula;

    public Automotor() {
    }

    public Automotor(String cedula, String marca, int anio, double valorauto) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorauto = valorauto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValorauto(double valorauto) {
        this.valorauto = valorauto;
    }

    public void CalcularValorMatricula() {
        this.valormatricula = (2023 - this.anio) * 0.002;
    }

    public String getCedula() {
        return cedula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getValorauto() {
        return valorauto;
    }

    public double getValormatricula() {
        return valormatricula;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedula=" + cedula + ", marca=" + marca + ", anio=" + anio + ", valorauto=" + valorauto + ", valormatricula=" + valormatricula + '}';
    }
    
}

public class Problema3 {

    public static void main(String[] args) {
        Automotor auto1 = new Automotor("1104879586","Audi",2000,17000);
        auto1.CalcularValorMatricula();
        System.out.println(auto1);
    }
    
}
