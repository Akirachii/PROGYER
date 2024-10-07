import java.util.Scanner;
// Pau Gra <3
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();
        
        int divi = (numero/10);
        int resto = (numero%10);

        //System.out.println(resto);

        if (resto>=5){
            int decima =((divi*10)+10);
            System.out.println("Resultado: " + decima);
        }else{
            int decima =(divi*10);
            System.out.println("Resultado: " + decima);
        }
    }
}3