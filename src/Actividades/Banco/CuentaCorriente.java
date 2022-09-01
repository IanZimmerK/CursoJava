import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CuentaCorriente {
private String nombreTitular;
private double saldo;
private long numeroCuenta;

public CuentaCorriente (String nombreTitular, double saldo){
this.saldo = saldo;
this.nombreTitular = nombreTitular;
    Random numAleatorioCuenta = new Random();
    this.numeroCuenta = Math.abs(numAleatorioCuenta.nextLong());
}
//setters
    public void setIngreso(double ingreso)
    {
        if (ingreso<=0)
            System.out.println("El ingreso debe ser superior a cero euros");
        else
            saldo = saldo + ingreso;
    }
    public void setReintegro(double reintegro)
    {
    if (reintegro<=0)
        System.out.println("El reintegro debe ser superior a cero euros");
    else
        saldo = saldo - reintegro;
    }

    //getters
    public Double getSaldo()
    {
        return saldo;
    }
    public List<String>getDatosCuenta() {
    List<String> datosCuenta = new ArrayList<>();
    datosCuenta.add(nombreTitular);
    datosCuenta.add(Long.toString(numeroCuenta));
        DecimalFormat saldoRedondeado = new DecimalFormat("###.##");
        datosCuenta.add(saldoRedondeado.format(saldo));
        return datosCuenta;
    }
    //metodos
    public static void Transferencias (CuentaCorriente ccc1, CuentaCorriente ccc2, double importeTransferencia)
    {
        ccc1.saldo = ccc1.saldo - importeTransferencia;
        ccc2.saldo = ccc2.saldo + importeTransferencia;

    }
}
