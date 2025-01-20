package array;

import array.spiral_order.L54;
import array.spiral_order.L59;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestSpiralOrder {

    @Test
    public void testL59() {
        for (int i = 1; i < 6; i++) {
            new L59().generateMatrix(i);
        }
    }

    @Test
    public void testL54() {
        Assertions.assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7),
                new L54().spiralOrder(new int[][]{{1, 2, 3, 4}, {5,6,7,8}, {9,10,11,12}}));
    }
}
