import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int[] x= new int[10];
       System.out.println("Introduzca hasta 10 numeros enteros: ");
       for(int i=0;i<10;i++){
        x[i]=sc.nextInt();
       }
       System.out.println("\nLos números introducidos, al revés, son los siguientes:");
       for(int j=9;j>=0;j--){
        System.out.printf("x[%2d]: %d\n",j,x[j]);
       }
       sc.close();
    }
}