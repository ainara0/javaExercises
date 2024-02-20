import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(keyboard.nextLine());
        if (matematicas.Varios.esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(keyboard.nextLine());
        System.out.println(n + " tiene " + matematicas.Varios.digitos(n) + " dígitos.");
        double r, h;
        System.out.println("Cálculo del volumen de un cilindro");
        System.out.print("Introduzca el radio en metros: ");
        r = Double.parseDouble(keyboard.nextLine());
        System.out.print("Introduzca la altura en metros: ");
        h = Double.parseDouble(keyboard.nextLine());
        System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilindro(r, h) + " m3");
        keyboard.close();
    }
}