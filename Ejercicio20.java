import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el número total de nombres de reyes:");
            int numRey = sc.nextInt();
            
            String[] reyes = new String[numRey];
            System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
            for( int i = 0 ; i < numRey ; i++){
                reyes[i] = System.console().readLine();
            }
            System.out.println("Los reyes introducidos son:");
            for ( int i = 0 ; i < numRey ; i++){
                int contRepetidos =1;
                for ( int j = 0 ; j < i ; j++){
                    if(reyes[i].equals(reyes[j])){
                        contRepetidos++;
                    }
                }
                System.out.println(reyes[i]+" "+contRepetidos+"º");
            }

        sc.close();
    }
}
