import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca hasta 15 números separados por enter:");
        int array[] =new int[15];
        for(int i =0;i<15;i++){
            if(i<14)
            array[i+1]= sc.nextInt();
            else
            array[0]=sc.nextInt();
        }
        for(int i=0;i<15;i++)
        System.out.printf("|    %01d      |\n",array[i]);

        sc.close();
    }
}
