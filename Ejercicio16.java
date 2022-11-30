import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int array[]= new int[20];
            for(int i = 0 ; i < 20; i++){
                int aleatorio = (int)(Math.random()*401);
                array[i]=aleatorio;
                System.out.print("  "+array[i]);
            }
            System.out.println();
            System.out.print("¿Qué números quiere resaltar? (1 _ los múltiplos de 5, 2 _ los múltiplos de 7): ");
            int numero = sc.nextInt();
            int multiplo =0;
            switch(numero){
                case 1 :
                    multiplo = 5;
                break;
                case 2:
                    multiplo = 7;
                break;
                default:
                    multiplo = 5;
            }
            for(int i = 0 ; i < 20 ; i++){
                if(array[i]%multiplo==0){
                    System.out.print(" *"+array[i]+"* ");
                }
                else{
                    System.out.print(" "+array[i]);
                }
            }
        sc.close();
    }
}
