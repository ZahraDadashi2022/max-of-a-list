import java.util.stream.IntStream;

public class MaxOfList {
    public static void main(String[] args) {
        int[] myArray = {16, 17, 6, 2, 5, 3};
        int arraySize = myArray.length;
        for (int i = 0; i < arraySize - 1; i++) {
            int maxNumber = IntStream.range(1, arraySize)
                    .skip(i)
                    .map(j -> myArray[j])
                    .max()
                    .getAsInt();
            myArray[i] = maxNumber;
        }
        for (int k: myArray){
            System.out.print( k +" ");
        }
    }

}
