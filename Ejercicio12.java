import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x[] = new int[10];
        int y[] = new int[10];
        System.out.print("Introduzca 10 números:\n");
        for (int i = 0 ; i<10; i++){
            x[i] =sc.nextInt();
        }
        System.out.print("Los numeros que desea desplazar(del Indice):\nInicial:");
        int num1 =sc.nextInt();
        System.out.print("\nFinal:");
        int num2 =sc.nextInt();
        while (num1>num2||num1>9||num2>9||num2==num1){
            System.out.print("Usted ha introducido el numero 1 para que sea mayor que el 2 ó se pasó del limite(tampoco pueden ser iguales)");
            System.out.print("Los numeros que desea desplazar(del Indice):\nInicial:");
             num1 =sc.nextInt();
            System.out.print("\nFinal:");
            num2 =sc.nextInt();
        }
        //Hasta aqui la introduccion de valores
        System.out.printf("\nÍndice\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t",0,1,2,3,4,5,6,7,8,9,"\n");
        for(int i  = 0; i<10; i++){
            if(i==0)
                System.out.printf("\nValor\t");
            System.out.printf("|%d|\t",x[i]);
        }
        System.out.printf("\n\t\t\t\tArray Inicial","\n");
        //hasta aqui para mostrar la tabla inicial
        for (int i = 0;i<10;i++){
            if(i==num1){
                if(num1>0)
                    y[num1]= x[num1-1];
                else    
                    y[num1]= x[9];
             }
             else if(i<num2){
                if(i<num1&&i>=1){
                    y[i]=x[i-1];
                }
                else if(i==0){
                    y[0]=x[9];
                }
                else {
                    y[i]=x[i];
                }
             }
             else{
                if(i==num2){
                    y[i]=num1;
                }
                else{
                    y[i]=x[i-1];
                }
             }
        }
        System.out.printf("\nÍndice\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t",0,1,2,3,4,5,6,7,8,9,"\n");
        for(int i  = 0; i<10; i++){
            if(i==0)
            System.out.printf("\nValor\t");
        System.out.printf("|%d|\t",y[i]);
    }
    System.out.printf("\n\t\t\t\tArray Final","\n");
        sc.close();
    }
    
}
