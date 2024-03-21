
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        byte numero = 0 ;
        byte numero2;
        /*System.out.println("Ingresar un numero: ");
        numero = in.nextByte();
        System.out.println("Ingresar otro numero: ");
        numero2 = in.nextByte();

        numero += numero2;*/

        System.out.println("La suma de los numero ingresados es  " + numero);

        for (int i = 0; i <= 10; i++)
        {
            System.out.println("i = " + i);
        }

        System.out.println("Ingresar la base del rectangulo: ");
        numero = in.nextByte();
        System.out.println("Ingresar la altuea del rectangulo: ");
        numero2 = in.nextByte();

        int numero3 = area(numero,numero2);

        System.out.println("El area el rectangulo es: " + numero3 );

        System.out.println("Ingresar un numero: ");
        numero = in.nextByte();

        boolean resultado = esPar(numero);

        if(resultado)
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }

        numero3 = pedirNum();
        numero3 = factorial(numero3);
        System.out.printf("El factorial del numero es: " + numero3 );

        fibonacci();
    }
//////FUNCIONES

    public static int pedirNum()
    {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Ingresar un numero: ");
         numero = in.nextInt();
        return numero;
    }
    public static int area(byte numero, byte numero2)
    {
        return numero*numero2;
    }

    public static boolean esPar(byte numero)
    {
        return numero % 2 == 0;//evalua si la condicion es verdadera retorna true o no false
    }

    public static int factorial(int numero)
    {
        int resultado=numero;
        for (int i=numero-1; i>0 ;i--)
        {
            resultado*=i;
        }
        return resultado;
    }

    public static void fibonacci()
    {
        int contador = 0, resultado = 0, contador2 = 1;
        for(int i=1 ; i<=9 ; i++)
        {
            resultado = contador +contador2;
            contador = contador2;
            contador2 = resultado;
        }
        System.out.printf("enesimo " +contador);
    }
}