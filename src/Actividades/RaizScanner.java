import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        int num;
        Scanner Imprimir = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar la raiz cuadrada: ");

        num = Imprimir.nextInt();

        double result = Math.sqrt(num);
        System.out.println("El valor de la raiz cuadrada de "+num+ " es:" +result);

    }
}
