import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int array2[] = new int[10];
        int array3[] = new int[10];
        int contmenor =0;
        int contmayor  =0;
        int aleatorio = (int)(Math.random()*200+1);
        System.out.println("Array Original: ");
        System.out.printf("\nÍndice\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t",0,1,2,3,4,5,6,7,8,9);
        System.out.println();
        for(int i = 0; i<10 ; i++){
            array[i]=aleatorio;
            if(i==0)
            System.out.printf("\nValor");
            System.out.print("\t"+array[i]);
            aleatorio = (int)(Math.random()*200+1);
        }
        for(int i = 0; i<10 ; i++){
            if(array[i]<=100){
                array2[contmenor]=array[i];
                contmenor++;
            }
            else if(array[i]>100){
                array3[contmayor]=array[i];
                contmayor++;
            }
        }
        int cont =0;
        int cont2=0;
        for (int i = 0 ; i<10;i++){
            if(i%2==0&&array2[cont]!=0){
            array[i]=array2[cont];
            cont++;
            }
            else if(i%2!=0&&array3[cont2]!=0){
            array[i]=array3[cont2];
            cont2++;
            }
            else{
                if(array3[cont2]!=0){
                    array[i]=array3[cont2];
                    cont2++;
                }
                else{
                    array[i]=array2[cont];
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println("Array resultado: ");
        System.out.printf("\nÍndice\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t",0,1,2,3,4,5,6,7,8,9);
        for(int i = 0; i<10 ; i++){
            if(i==0)
            System.out.printf("\nValor");
            System.out.print("\t"+array[i]);
        }
        sc.close();
    }
}
