import java.util.Scanner;

class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No matching pair found.");
        }

        sc.close();
    }
}