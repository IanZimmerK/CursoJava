import javax.swing.*;

public class Peso {
    public static void main(String[] args) {
        //Variables
        float pesoideal, altura;
        String sexo, result = "El peso ideal para usted es: ";

        //Ingresar datos
        altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura: "));
        sexo = JOptionPane.showInputDialog("Especifique su sexo (M/F) ");
        System.out.println("La altura ingresada es: "+altura);
        System.out.println("Sexo: " +sexo);

        //Hacemos comparaciones de Strings
        if (sexo.equalsIgnoreCase("F"))
        {
            pesoideal =  (float)((62.1 * altura)-44.7);
            result = result + pesoideal;
            System.out.println("El peso ideal es: "+pesoideal+"kg");
        }
        else if (sexo.equalsIgnoreCase("M"))
        {
            pesoideal =  (float)((72.7 * altura)-58);
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
