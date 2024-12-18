public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = { 6, 8, 2, 9, 10, 4 };

        int size = nums.length;

        for (int i = 0; i < size-1; i++) {

            int minVal = nums[i];
            int minIndex = i;

            for (int j = i+1; j < size; j++) {

                if (nums[j] < minVal) {
                    minVal = nums[j];
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = minVal;
            nums[minIndex] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
