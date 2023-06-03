package JavaAssignmentQ4;

public class Question8 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] shuffledArray = shuffle(nums, n);

        System.out.print("Shuffled Array: ");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
