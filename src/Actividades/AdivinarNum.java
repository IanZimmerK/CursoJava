import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        //variables a utilizar
        Scanner scanner = new Scanner(System.in);
        int num, intentos = 0;
        int numeroaleatorio;
        //genero el numero aleatorio entre 1-100
        numeroaleatorio = (int) (Math.random() * 100 + 1);
        do {
            System.out.println("Digite un numero: ");
            num = scanner.nextInt();
            if (numeroaleatorio > num) {
                System.out.println("El numero es mayor, intente nuevamente.. ");
                intentos++;
                System.out.println("Numero de intentos: "+intentos);
            }
            else {
                System.out.println("El numero es menor, intente nuevamente..");
                intentos++;
                System.out.println("Numero de intentos: "+intentos);
            }
        }while (num!=numeroaleatorio);
        System.out.println("Correcto!!, has acertado el numero en "+intentos+ " intentos");
    }
}
