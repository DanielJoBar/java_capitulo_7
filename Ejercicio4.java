public class Ejercicio4{
    public static void main(String[] args){
        int[] n = new int[20];
        int[] c2 = new int[20];
        int[] c3 = new int[20];
        int aleatorio =0;
        System.out.println("numero[x]\t numero\t su cuadrado\tsu cubo");
        for(int i=0;i<20;i++){
            aleatorio=(int)(Math.random()*101);
            n[i]=aleatorio;
            c2[i]=n[i]*n[i];
            c3[i]=n[i]*n[i]*n[i];
            System.out.println("numero["+i+"]"+"\t["+n[i]+"]"+"\t["+c2[i]+"]"+"\t["+c3[i]+"]");
        }
        
         
    }
}