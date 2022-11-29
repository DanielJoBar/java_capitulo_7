import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        int minimo = 600;
        int maximo =-1;
        for(int i =0;i<100;i++){
            x[i]=(int)(Math.random()*501);
            if(x[i]>maximo)
                maximo=x[i];
            if(x[i]<minimo)
                minimo=x[i];
            System.out.printf("\t%d",x[i]);
        }
        System.out.print("\n¿Qué quiere destacar? (1 . mínimo, 2 . máximo):");
        boolean maximoOp =false;
        String opcion = System.console().readLine();
        switch(opcion){
            case "1":case "minimo":case "mínimo":
            break;
            case "2":case "maximo":case "máximo":
            maximoOp=true;
            break;
            default:
        }
        if(maximoOp){
            for(int i = 0; i<100; i++){
                if(x[i]!=maximo){
                    System.out.print("\t"+x[i]);
                }
                else{
                    System.out.print("\t**"+x[i]+"**");
                }
            }
        }
        else{
            for(int i = 0; i<100; i++){
                if(x[i]!=minimo){
                    System.out.print("\t"+x[i]);
                }
                else{
                    System.out.print("\t**"+x[i]+"**");
                }
            }
        }
        sc.close();
    }
}
