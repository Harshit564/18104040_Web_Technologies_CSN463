class Question8 {
    public static void main(String[] args) { 
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int outputArray[][] = new int[3][3];
        System.out.println("Output for Matrix Multiplication: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                outputArray[i][j] = 0;
                for(int k = 0; k < 3; k++){      
                    outputArray[i][j] += arr1[i][k]*arr2[k][j];      
                }
                System.out.print(outputArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
