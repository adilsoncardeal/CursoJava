import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        int impares;

        X = teclado.nextInt();

        for (int contador = 1; contador <= X; contador = contador+2){
            System.out.println(contador);
        }

    }


}
