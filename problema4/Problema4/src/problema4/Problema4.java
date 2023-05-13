package problema4;

class Cheques {
    private String nombrecliente;
    private String nombrebanco;
    private double valorcheque;
    private double comision;

    public Cheques(String nombrecliente, String nombrebanco, double valorcheque) {
        this.nombrecliente = nombrecliente;
        this.nombrebanco = nombrebanco;
        this.valorcheque = valorcheque;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }

    public void CalcularComision() {
        this.comision = this.valorcheque * 0.003;
    }

    @Override
    public String toString() {
        return "Cheques{" + "nombrecliente=" + nombrecliente + ", nombrebanco=" + nombrebanco + ", valorcheque=" + valorcheque + ", comision=" + comision + '}';
    }
    
}

public class Problema4 {

    public static void main(String[] args) {
        Cheques cheque1 = new Cheques("Pablo","Banco de Loja",10000);
        cheque1.CalcularComision();
        System.out.println(cheque1);
    }
    
}
