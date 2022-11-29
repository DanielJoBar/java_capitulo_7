import java.util.Scanner;

public class Ejercicio14 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String color[]={"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        System.out.println("Introduzca 10 palabras(los colores iran despues ordenados):");
        String Introducido[] = new String[9];
        String x[] = new String[9];
        int cont =0;
        for(int i = 0 ; i<9;i++){
            Introducido[i] = System.console().readLine();
        }
        // Muestra el array original.
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐────────┐");
        for (int i = 0; i < 9; i++) {
        System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤────────┤");
        for (String p : Introducido) {
        System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘────────┘");
        for(int i = 0 ; i<9;i++){
            for(int j = 0 ; j<9;j++){
                if(Introducido[i].equals(color[j])){
                    x[cont]=Introducido[i];
                    cont++;
                }
            }   
        }
        boolean colore =true;
        for (int i = 0;i<9;i++){
            colore=false;
            for(int j = 0 ; j<9;j++){
                if(Introducido[i].equals(color[j])){
                    colore=true;
                    j=9;
                }
            } 
            if(!colore){
                x[cont]=Introducido[i];
                cont++;
            }
        }
        // Muestra el array final.
        System.out.println("\n\nArray final:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐────────┐");
        for (int i = 0; i < 9; i++) {
        System.out.printf("│   %d    ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤────────┤");
        for (int i = 0; i < 9; i++) {
        System.out.printf("│%-8s", x[i]);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘────────┘");
        sc.close();
    } 
}
