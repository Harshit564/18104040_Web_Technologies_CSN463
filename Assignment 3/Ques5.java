class Question5 {
    public static void main(String[] args) {  
        int[] array = {23,6,47,35,2,14};
        System.out.println("Odd Elements in the array are as follows: ");
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 != 0)
                System.out.println(array[i]);
        }
    }
}
