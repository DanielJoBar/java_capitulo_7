import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int array2[] = new int[10];
        int aleatorio = (int)(Math.random()*101);
        for(int i = 0; i<10 ; i++){
            array[i]=aleatorio;
            System.out.print(array[i]+"  ");
            aleatorio = (int)(Math.random()*101);
        }
        System.out.println();
        boolean correcto = false;
        int aux=0;
        while(!correcto){
            System.out.print("Introduzca un número de la array: ");
            int numero = sc.nextInt();
            aux=numero;
            for(int i = 0; i<10 ; i++){
                if(array[i]==numero){
                    correcto=true;
                    break;
                }
            }
            if(!correcto){
                System.out.println("Ha introducido un valor fuera de la array ");
            }
        }
        System.out.println();
        while(array2[0]!=aux){
            for(int i =0 ; i< 10 ; i++){
                if(i>0){
                    array2[i]=array[i-1];
                }
                else{
                    array2[0]=array[9];
                }
                }
                for(int j =0 ; j< 10 ; j++){
                array[j]=array2[j];
                }
        }
        for (int i = 0 ; i < 10; i++){
            System.out.print(array2[i]+" ");
        }
    sc.close();
    }
}
