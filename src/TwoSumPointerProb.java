import java.util.Arrays;

class TwoSumPointerProb {

    static boolean twoSum(int[] arr, int target){

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        // Iterate while left pointer is less than right
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target)
                return true;
            else if (sum < target)

                // Move left pointer to the right
                left++;
            else

                // Move right pointer to the left
                right--;
        }
        // If no pair is found
        return false;
    }

    public static void main(String[] args){
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSum(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}