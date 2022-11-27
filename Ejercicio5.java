import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 10 numeros por teclado separados por un enter: ");
        int x[]=new int[10];
        int maximo=0;
        int minimo = 1000000000;
        for(int i=0;i<9;i++){
            x[i]=sc.nextInt();
            if(x[i]<minimo){
                minimo=x[i];
            }
            else if(x[i]>maximo){
                maximo = x[i];
            }
        }
        System.out.println();
        for(int j =0;j<9;j++){
            if(x[j]==maximo){
                System.out.print("Maximo "+maximo+" ");
            }
            else if(x[j]==minimo){
                System.out.print("Minimo "+minimo+" ");
            }
            else{
                System.out.print(x[j]+" ");
            }
        }
        sc.close();
    }
}