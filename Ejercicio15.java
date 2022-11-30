import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*5);
        int x[]=new int[11];
        for(int i= 0;i<=11;i++){
            if(i==0)
            System.out.print("Mesa nº");
            else{
                System.out.printf("\t%d",i);
            }
        }
        System.out.println();
        for(int i= 0;i<11;i++){
            if(i==0)
            System.out.print("Ocupación");
            else{
                x[i]=aleatorio;
                System.out.printf("\t%d",x[i]);
            }
            aleatorio = (int)(Math.random()*5);
        }
        System.out.println();
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa):");
        int mesa = 2;
        while(mesa>=0){
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa):");
            mesa = sc.nextInt();
            boolean libre =false;
            boolean compartido=false;
            int aux=0;
            int aux2=0;
            if(mesa>=0){
                for(int i =0;i<11;i++){
                    if(x[i]==mesa){
                        libre=true;
                        aux=x[i];
                        break;
                    }
                    else if(x[i]<mesa){
                    compartido=true;
                    aux2=x[i];
                    }
                }
                if(libre){
                    System.out.println("Por favor, siéntense en la mesa número "+aux);
                }
                else if(compartido){
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+aux2);
                }
                else{
                    System.out.println("Lo siento, en estos momentos no queda sitio. ");
                }
            }
        }
        System.out.print("Gracias. Hasta pronto.");
        sc.close();
    }
}
