//If you have an array [1, 2, 3, 4, 5] and k = 2, the result should be [4, 5, 1, 2, 3].
public void rotate(int[] nums, int k) {
    int n = nums.length;
    int[] result = new int[n]; // Create a temporary "landing pad"
    
    // Step 1: Handle k if it's larger than the array
    k = k % n;

    // Step 2: Place each number in its new home
    for (int i = 0; i < n; i++) {
        int newPosition = (i + k) % n;
        result[newPosition] = nums[i];
    }

    // Step 3: Copy the result back to the original nums array
    for (int i = 0; i < n; i++) {
        nums[i] = result[i];
    }
}
