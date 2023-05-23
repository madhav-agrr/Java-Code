public class Sort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};

        // Sorting the array in ascending order
        for (int i=0;i<array.length;i++){
            for (int j=0; j<array.length-1;j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
		for (int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
}
}
