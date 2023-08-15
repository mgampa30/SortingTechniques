class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
    public static void bubbleSort(int[] nums){
        for(int i = 0;i<nums.length;i++){
             for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
            }
        }
    }
}
}
