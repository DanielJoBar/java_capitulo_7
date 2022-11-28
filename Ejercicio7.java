import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x[]=new int[99];
        String verde = "\033[32m";
        String blanco = "\033[37m";
        for(int i =0 ; i<99;i++){
            int aleatorio =(int)(Math.random()*21);
            x[i]=aleatorio;
        }
        for(int i =0 ; i<99;i++){
            System.out.printf("\t%d",x[i]);
        }
        System.out.println("\nDe los que ha visto,¿ qué numero quiere que destaque?");
        int valor1 =sc.nextInt();
        System.out.println("Introduzca  otro valor: ");
        int valor2 = sc.nextInt();
        for(int i=0;i<99;i++){
            if(x[i]==valor1||x[i]==valor2){
                System.out.printf(verde+"\t\""+x[i]+"\"");
            }
            else
                System.out.printf(blanco+"\t%d",x[i]);
        }
        sc.close();
    }
}
