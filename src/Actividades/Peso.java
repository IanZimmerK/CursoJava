import javax.swing.*;

public class Peso {
    public static void main(String[] args) {
        //Variables
        int pesoideal, altura;
        String sexo, result = "El peso ideal para usted es: ";

        //Ingresar datos
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura: "));
        sexo = JOptionPane.showInputDialog("Especifique su sexo (M/F) ");
        System.out.println("La altura ingresada es: "+altura);
        System.out.println("Sexo: " +sexo);

        //Hacemos comparaciones de Strings
        if (sexo.equalsIgnoreCase("F"))
        {
            pesoideal = altura - 120;
            result = result + pesoideal;
            System.out.println("El peso ideal es: "+pesoideal+"kg");
        }
        else if (sexo.equalsIgnoreCase("M"))
        {
            pesoideal =  altura - 110;
            result = result + pesoideal;
            System.out.println("El peso ideal es: "+pesoideal+"kg");
        }
        else
        {
            result = "El sexo es incorrecto";
        }
        System.out.println(result+"kg");
    }
}
