import java.util.List;
import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente CC1 = new CuentaCorriente("Ian", 9000);
        CuentaCorriente CC2 = new CuentaCorriente("Jorge", 8500);

        Double importe = pedirImporteUsuario();
        CuentaCorriente.Transferencias(CC1, CC2, importe);

        System.out.println("Datos de la CC1");
        List<String>datosCuenta;
        datosCuenta =CC1.getDatosCuenta();
        System.out.println("Titular: "+datosCuenta.get(0));
        System.out.println("Numero de cuenta: " +datosCuenta.get(1));
        System.out.println("Saldo: " +datosCuenta.get(2));

        System.out.println("Datos de la CC2");
        datosCuenta=CC2.getDatosCuenta();
        System.out.println("Titular: "+datosCuenta.get(0));
        System.out.println("Numero de cuenta: " +datosCuenta.get(1));
        System.out.println("Saldo: " +datosCuenta.get(2));

    }

    private static Double pedirImporteUsuario() {
        Scanner scanner = new Scanner(System.in);
        Double importe = 0.0;
        System.out.print("Introduzca el importe a transferir entre cuentas: ");
        while (!scanner.hasNextDouble())
        {
            System.out.println("NO HA INTRODUCIDO UN IMPORTE CORRECTO" + "VUELVA A INTENTARLO (SOLO NUMEROS Y DECIMALES POR FAVOR)");
            scanner.nextLine();
        }
        importe = scanner.nextDouble();
        scanner.close();
        return importe;
    }

}
