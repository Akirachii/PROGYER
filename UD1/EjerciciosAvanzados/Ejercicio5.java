//Pau Gra <3
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cupo;
        int huevos;
        int minutos;

        System.out.println("Dime cuantos huevos caben en una olla ");
        cupo = sc.nextInt();

        System.out.println("Cuantos huevos quieres cocer? ");
        huevos = sc.nextInt();

        int ollas=(huevos/cupo);
        System.out.println("Los minutos que tardare en cocinar los huevos son ; "+ (ollas*10));
    }
}
