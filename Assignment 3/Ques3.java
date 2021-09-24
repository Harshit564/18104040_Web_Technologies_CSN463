class Question3{
    public static void main(String[] args) {  
        int[] array = {23,6,47,35,2,14};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Average is: " + (sum/array.length));
    }
}