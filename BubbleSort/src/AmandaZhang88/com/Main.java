package AmandaZhang88.com;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 45, 7, -15, 1, -35, 4, 0, -79};


        System.out.println("Unsorted Array: ");
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }

        int count = 0;
        for (int i = 0; i < intArray.length -1; i++){
            for (int j = 0; j < intArray.length-i-1; j++){
                if (intArray[j] > intArray[j+1]){
                    swap(intArray, j, j + 1);
                    count++;
                   // System.out.println(count);
                    if(count == 0){
                        break;
                    }
                }
            }
        }

        System.out.println("\n" + "Bobble Sort: ");
        for(int i = 0; i < intArray.length; i++) {
            System.out.print( intArray[i] + " ");
        }

        System.out.println("\n Program has to swap " + count + " Times!");
    }
    public static void swap(int[] array,int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];  // sign the array [j] to array[i]
        array[j] = temp;
    }

}
