import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryManagementTest {

    @Test
    public void testNoZeros() {
        int[] inventory = {3, 2, 1};
        int[] expected = {3, 2, 1};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testSingleZero() {
        int[] inventory = {4, 0, 5};
        int[] expected = {4, 0, 0};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testMultipleZeros() {
        int[] inventory = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testZeroAtStart() {
        int[] inventory = {0, 2, 3};
        int[] expected = {0, 0, 2};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testZeroAtEnd() {
        int[] inventory = {1, 2, 3, 0};
        int[] expected = {1, 2, 3, 0};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testEmptyArray() {
        int[] inventory = {};
        int[] expected = {};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testSingleElementNonZero() {
        int[] inventory = {1};
        int[] expected = {1};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testSingleElementZero() {
        int[] inventory = {0};
        int[] expected = {0};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }

    @Test
    public void testAllZeros() {
        int[] inventory = {0, 0, 0};
        int[] expected = {0, 0, 0};
        InventoryManagement.duplicateZeros(inventory);
        assertArrayEquals(expected, inventory);
    }
}
