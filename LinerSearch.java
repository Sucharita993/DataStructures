public class LinerSearch {
    
    public static void main(String[] args) {
        
        // int[] nums = { 0, 1, 5, 6, 23, 45, 67 };

        int[] nums = new int[1000000];
        int target = 23;

        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] == target) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}
