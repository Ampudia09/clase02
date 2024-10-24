import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Angel");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');
        System.out.println();
        System.out.printf("aqui va una cadena: %s%n", "angel");
        System.out.printf("aqui va un entero: %d%n", 7);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "juan angel", 17);


        var entrada = new Scanner(System.in);

        System.out.print("por favor ingrse un numero entero: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }

}