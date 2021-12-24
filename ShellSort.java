package AmandaZhang88.com;

public class Main {
    public static void main(String[] args) {
       int [] intArray = {1,34,-23,56,78,21,-3};

       for (int gap = intArray.length / 2; gap > 0; gap /=2){

           System.out.println("gap: " + gap);

           for (int i = gap; i < intArray.length; i++){

               int newElement = intArray[i];

               System.out.println ("NewElement : " + newElement);
               int j = i;

               while (j >= gap && intArray [j - gap] > newElement){
                   swap (intArray, j-gap, j );
                   System.out.println();
               }
           }
       }

       for (int i = 0; i <intArray.length; i++){

           System.out.print(intArray[i] + ", ");
       }
    }

    public static void swap (int[]intArray, int i, int j){
        if (i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;


    }
}
