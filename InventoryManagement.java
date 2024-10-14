public class InventoryManagement {

    public static void duplicateZeros(int[] inventory) {
        int length = inventory.length;
        int possibleDuplicates = 0;
        int lastIndex = length - 1;

        // count the number of zeros that need to be duplicated
        for (int i = 0; i <= lastIndex - possibleDuplicates; i++) {
            if (inventory[i] == 0) {
                // If it's at the edge where duplicating would go out of bounds, stop
                if (i == lastIndex - possibleDuplicates) {
                    // Special case: handle the last zero
                    inventory[lastIndex] = 0;
                    lastIndex--;
                    break;
                }
                possibleDuplicates++;
            }
        }

        // shift and duplicate from the back
        for (int i = lastIndex - possibleDuplicates; i >= 0; i--) {
            if (inventory[i] == 0) {
                inventory[i + possibleDuplicates] = 0;
                possibleDuplicates--;
                inventory[i + possibleDuplicates] = 0; // Duplicate zero
            } else {
                inventory[i + possibleDuplicates] = inventory[i]; // Shift element
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] inventory1 = {4, 0, 1, 3, 0, 2, 5, 0};
        System.out.println("Before: " + java.util.Arrays.toString(inventory1));
        duplicateZeros(inventory1);
        System.out.println("After:  " + java.util.Arrays.toString(inventory1));

        // Example 2
        int[] inventory2 = {3, 2, 1};
        System.out.println("Before: " + java.util.Arrays.toString(inventory2));
        duplicateZeros(inventory2);
        System.out.println("After:  " + java.util.Arrays.toString(inventory2));
    }

    // Time Complexity Analysis
    //The time complexity of the duplicateZeros function can be analyzed by breaking it down into two major steps:
    //Counting the zeros:
    //In the first example, we iterate over the entire array to count the number of zeros that will be duplicated. This takes linear time, proportional to the length of the array, n.
    //Shifting and duplicating elements:
    //In the second example, we iterate over the array from the back, shifting elements to the right and duplicating zeros. In the worst case, we might need to shift almost every element. This also takes linear time, proportional to the length of the array, n.
    //Thus, both passes take linear time, and the overall time complexity is:
    //O(n)
    //Where n is the length of the array.

    //Space Complexity
    //Since we are modifying the array in place and using only a few extra variables (for counting zeros and tracking indices), the space complexity is:
    //O(1)
    //This means the algorithm uses constant extra space.
    //Summary:
    //Time Complexity: O(n), where n is the length of the array.
    //Space Complexity: O(1), as the modifications are done in place without extra space.
}
