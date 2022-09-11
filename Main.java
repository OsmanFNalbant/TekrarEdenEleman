public class Main {
    public static void main(String[] args) {
       int array[] = {1,1,3,6,5,7,9,11,35,56,545,56,7};
       for(int i=0; i<13; i++){
           for(int j=i+1; j<13; j++ )
           {
               if(array[i]==array[j])
               {
                   System.out.println("Tekrar eden eleman:"+ array[i]);
               }
           }
       }
    }
}