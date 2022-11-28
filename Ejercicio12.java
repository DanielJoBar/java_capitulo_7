import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x[] = new int[10];
        int y[] = new int[10];
        int contArray=0;
        System.out.print("Introduzca 10 números:\n");
        for (int i = 0 ; i<10; i++){
            x[i] =sc.nextInt();
        }
        System.out.print("Los numeros que desea desplazar(del Indice):\nInicial:");
        int num1 =sc.nextInt();
        System.out.print("\nFinal:");
        int num2 =sc.nextInt();
        System.out.printf("\nÍndice\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t",0,1,2,3,4,5,6,7,8,9,"\n");
        for(int i  = 0; i<10; i++){
            if(i==num1)
            System.out.printf("\nValor\t|");
            System.out.printf("\t%d\t|",x[i]);
        }
        System.out.printf("\n\t\t\t\t\t\t\t\t\tArray Inicial","\n");
        for (int i = 0 ; i<10; i++){
            primo=true;
            for(int j=1;j <=(int)x[i]/2;j++){
                if(x[i]%j==0&&j>1){
                    primo=false;
                }
            }
            if(primo){
                y[contArray]=x[i];
                contArray++;
            }
        }
        for(int i = 0 ; contArray<10;i++){
            primo=true;
            for(int j=1;j <=(int)x[i]/2;j++){
                if(x[i]%j==0&&j>1){
                    primo=false;
                }
            }
            if(!primo){
                y[contArray]=x[i];
                contArray++;}
        }
        System.out.printf("\nÍndice\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t",0,1,2,3,4,5,6,7,8,9,"\n");
        for(int i  = 0; i<10; i++){
            if(i==0)
            System.out.printf("\nValor\t|");
        System.out.printf("\t%d\t|",y[i]);
    }
    System.out.printf("\n\t\t\t\t\t\t\t\t\tArray Final","\n");
        sc.close();
    }
    
}
