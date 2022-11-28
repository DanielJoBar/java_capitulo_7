import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x[] = new int[20];
        int y[] = new int[20];
        int contArray=0;
        System.out.print("Introduzca 20 números:\n");
        for (int i = 0 ; i<20; i++){
            x[i] =sc.nextInt();
            if(x[i]%2==0){
                y[contArray]=x[i];
                contArray++;
            }
        }
        for (int i = 0 ; i<20; i++){
            if(x[i]%2!=0){
                y[contArray]=x[i];
                contArray++;
            }
        }
        for(int i  = 0; i<20; i++){
        System.out.printf("\t %d",y[i]);
    }
        sc.close();
    }
    
}
