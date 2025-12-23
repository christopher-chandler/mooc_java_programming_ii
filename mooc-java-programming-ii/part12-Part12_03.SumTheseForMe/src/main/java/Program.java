import java.util.Arrays;

public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){

        if (fromWhere < 0){
            fromWhere = 0;
        }

        if (toWhere > array.length){
            toWhere = array[array.length-1];
        }
        int[] subArray  = Arrays.copyOfRange(array, fromWhere,toWhere);


        int arraySum = 0;

        for (int i = 0; i < subArray.length; i++) {

            int arrayElement = subArray[i];


            if (arrayElement > smallest && arrayElement < largest){

                arraySum+=arrayElement;
            }

        }

        return arraySum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};


        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));




    }

}
