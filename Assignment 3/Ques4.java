import java.util.Arrays;

class Question4 {
    public static void main(String[] args) {  
        int[] array = {23,6,47,35,2,14};
        Arrays.sort(array);
        System.out.println("Second Largest Element is: " + array[array.length-2]);
    }
}