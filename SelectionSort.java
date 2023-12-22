class SelectionSort {
    public static void main(String[] args) {
       int[] nums = {4,5,1,2,3};
       selectionSort(nums);
        for (int num : nums) {
           System.out.print(num + " ");
       }
    }
    public static void selectionSort(int[] nums){
       int n = nums.length; 
       for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}

