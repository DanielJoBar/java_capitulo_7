import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la temperatura media de cada mes(Sint decimales): ");
        int x[]= new int[12];
        for(int i=0;i<12;i++){
            switch(i){
                case 0:
                System.out.print("En Enero: ");
                x[i]=sc.nextInt();
                break;
                case 1:
                System.out.print("En Febrero: ");
                x[i]=sc.nextInt();
                break;
                case 2:
                System.out.print("En Marzo: ");
                x[i]=sc.nextInt();
                break;
                case 3:
                System.out.print("En Abril: ");
                x[i]=sc.nextInt();
                break;
                case 4:
                System.out.print("En Mayo: ");
                x[i]=sc.nextInt();
                break;
                case 5:
                System.out.print("En Junio: ");
                x[i]=sc.nextInt();
                break;
                case 6:
                System.out.print("En Julio: ");
                x[i]=sc.nextInt();
                break;
                case 7:
                System.out.print("En Agosto: ");
                x[i]=sc.nextInt();
                break;
                case 8:
                System.out.print("En Septiembre: ");
                x[i]=sc.nextInt();
                break;
                case 9:
                System.out.print("En Octubre: ");
                x[i]=sc.nextInt();
                break;
                case 10:
                System.out.print("En Noviembre: ");
                x[i]=sc.nextInt();
                break;
                case 11:
                System.out.print("En Diciembre: ");
                x[i]=sc.nextInt();
                break;
            }
        }
        for(int i=0;i<12;i++){
            switch(i){
                case 0:
                System.out.print("En Enero: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 1:
                System.out.print("En Febrero: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 2:
                System.out.print("En Marzo: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 3:
                System.out.print("En Abril: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 4:
                System.out.print("En Mayo: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 5:
                System.out.print("En Junio: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 6:
                System.out.print("En Julio: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 7:
                System.out.print("En Agosto: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 8:
                System.out.print("En Septiembre: ");
                System.out.printf(" |\t%d\t|\n",x[i]);
                break;
                case 9:
                System.out.print("En Octubre: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 10:
                System.out.print("En Noviembre: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
                case 11:
                System.out.print("En Diciembre: ");
                System.out.printf("\t|\t%d\t|\n",x[i]);
                break;
            }
        }
        sc.close();
    }
}
