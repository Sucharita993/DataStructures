public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = { 0, 1, 5, 6, 23, 45, 67 };

        int target = 23;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (nums[mid] < target)
                start = mid + 1;        //return binarySearch(nums,target, mid+1, end);

            else
                end = mid - 1;          //return binarySearch(nums,target, start, mid-1);
        }



    }
}
