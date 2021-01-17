package repaso;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class repass {

    static final int DIAS_SEMANA = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int numero = 1;
        float nota = 7.8f;
        double notaMax = 10.0;

        char letra = 'a';
        String saludo = "Hola";
        boolean encontrado = false;

        //Condicionales
        if (nota >= 0 && nota <= 10) {
            System.out.println("Válida");
        }

        if (nota >= 5 && nota <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }

        if (numero <= 3) {
            System.out.println("<=3");
        } else if (numero <= 5) {
            System.out.println("<=5");
        } else if (numero == 6) {
            System.out.println("== 6");
        } else {
            System.out.println("Es mayor a 6");
        }

        //En el caso de que todas las condiciones tengan el operador ==  
        //es mejor utilizar un swith, porque va directamente al caso que se cumple
        numero = 4;
        if (numero == 1) {
            System.out.println("Es 1");
        } else if (numero == 2) {
            System.out.println("Es 2");
        } else if (numero == 3) {
            System.out.println("Es 3");
        } else if (numero == 4) {
            System.out.println("Es 4");
        } else {
            System.out.println("Otro número");
        }

        System.out.println("Introduce a, b o c");

        switch (numero) {
            case 1: //numero ==1 ?
                System.out.println("Es 1");
                break;
            case 2: // numero ==2?
                System.out.println("Es 2");
                break;
            case 3: // numero ==3?
                System.out.println("Es 3");
            case 4:
                System.out.println("Es 4");
                break;
            default:
                System.out.println("Otro número");
        }

        int i = 0;
        int total = 0;
        int miNota;
        while (i < 10) {
            System.out.println("Introduce una nota: " + i);
            miNota = sc.nextInt();
            if (miNota >= 0 && miNota <= 10) {
                total = total + miNota;
                i++;
            }

        }
    }
}