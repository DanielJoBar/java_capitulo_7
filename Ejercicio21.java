public class Ejercicio21 {
    public static void main(String[] args){
        System.out.println("Array original :");
        int[] array = new int[15];
        for (int i = 0 ; i < 15; i++){
            int aleatorio = (int)(Math.random()*501);
            array[i] = aleatorio;
            System.out.print (array[i]+"  ");
        }
        System.out.println();
        System.out.println("Array cincuerizado :");
        for(int i = 0 ; i < 15 ; i++){
            if(array[i]%5==0){
                System.out.print (array[i]+"  ");
            }
            else{
                while(array[i]%5!=0){
                    array[i]++;
                }
                System.out.print (array[i]+"  ");
            }
        }
    }
}
