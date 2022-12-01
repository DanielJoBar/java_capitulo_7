import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[12];
        int array2[] = new int[12];
        int aleatorio = (int)(Math.random()*201);
        System.out.println("Array Original: ");
        System.out.printf("\nÍndice\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d",0,1,2,3,4,5,6,7,8,9,10,11);
        System.out.println();
        for(int i = 0; i<12 ; i++){
            array[i]=aleatorio;
            if(i==0)
            System.out.printf("\nValor");
            System.out.print("\t"+array[i]);
            aleatorio = (int)(Math.random()*201);
        }
        System.out.println();
        System.out.println("¿Qué número desea introducir?");
        int numero = sc.nextInt();
        System.out.println("¿En qué posición lo desea introducir?");
        int posición = sc.nextInt();
        for( int i = 0 ; i< 11 ; i++){
            if( i < posición ){
                array2[i]=array[i];
            }
            else if( i == posición ){
                array2[i+1] = array[i];
                array2[i] = numero;
            }
            else{
                array2[i+1] = array[i];
            }

        }
        System.out.println("Array Resultante: ");
        System.out.printf("\nÍndice\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d",0,1,2,3,4,5,6,7,8,9,10,11);
        System.out.println();
        for(int i = 0; i<12 ; i++){
            if(i==0)
            System.out.printf("\nValor");
            System.out.print("\t"+array2[i]);
        }
        sc.close();
    }
}
