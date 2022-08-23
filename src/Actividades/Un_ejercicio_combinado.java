public class Un_ejercicio_combinado {
    public static void main(String[] args) {
        float num1= 6;
        float denom1 = 5;
        float num2 = 2;
        float denom2 = 3;
        float num3 = 7;
        float denom3=2;
        float num4 = 2;
        float denom4 = 30;
        float num5 = 1;
        float denom5= 3;
        float multip = num2/denom2 * num3/denom3;
        float resta = num1/denom1 - multip;
        float suma = resta + num4/denom4;
        float div = num5/denom5 / denom1;
        float resul = suma / div;

        System.out.println(multip);
        System.out.println(resta);
        System.out.println(suma);
        System.out.println(div);
        System.out.println("Resultado de la operacion es "+resul);
    }
}

