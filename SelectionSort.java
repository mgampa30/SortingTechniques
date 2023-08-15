class SelectionSort {
    public static void main(String[] args) {
       int[] nums = {4,5,1,2,3};
       selectionSort(nums);
        for (int num : nums) {
           System.out.print(num + " ");
       }
    }
    public static void selectionSort(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int pivot =start;
        while(start<end){
            for(int i = start;i<nums.length;i++){
                if(nums[pivot] > nums[i]){
                    pivot = i;
                }
            }
            int temp = nums[start];
            nums[start] = nums[pivot];
            nums[pivot] = temp;
            start++;
        }
    }
}
