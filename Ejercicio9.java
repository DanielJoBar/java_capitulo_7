import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 8 número:");
        int x[]= new int[8];
        for(int i = 0; i < 8; i++){
            x[i]=sc.nextInt();
        }
        for(int i=0 ; i<8;i++){
            if(x[i]%2==0){
                System.out.println("par "+x[i]);
            }
            else{
                System.out.println("impar "+x[i]);
            }
        }
        sc.close();
    }
}
