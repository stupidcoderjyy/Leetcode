import array.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestArray {

    @Test
    public void testL1() {
        Assertions.assertArrayEquals(new int[]{0,1}, new L1().twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void testL4() {
        Assertions.assertEquals(2.0, new L4().findElement(new int[]{0,1,2}, new int[]{3,4,5}, 3));
        Assertions.assertEquals(2.0, new L4().findElement(new int[]{0,2,4}, new int[]{1,3,5}, 3));
        Assertions.assertEquals(5.0, new L4().findElement(new int[]{0,1,2}, new int[]{3,4,5}, 6));
        Assertions.assertEquals(2.0, new L4().findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        Assertions.assertEquals(2.5, new L4().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        Assertions.assertEquals(1.0, new L4().findMedianSortedArrays(new int[]{}, new int[]{1}));
        Assertions.assertEquals(9.0, new L4().findMedianSortedArrays(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10,11,12,13,14,15,16,17}));
    }

    @Test
    public void testL11() {
        Assertions.assertEquals(49, new L11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void testL15() {
        Assertions.assertEquals(List.of(List.of(-1, 2, -1), List.of(0, 1, -1)), new L15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    public void testL16() {
        Assertions.assertEquals(-2805, new L16().threeSumClosest(new int[]{13,252,-87,-431,-148,387,-290,572,-311,
                -721,222,673,538,919,483,-128,-518,7,-36,-840,233,-184,-541,522,-162, 127,-935,-397,761,903,-217,543,906,-503,-826,-342,599,
                -726,960,-235,436,-91,-511,-793,-658,-143,-524,-609,-728,-734,273,-19,-10,630,-294,-453,149,-581,-405,984,154,
                -968,623,-631,384,-825,308,779,-7,617,221,394,151,-282,472,332,-5,-509,611,-116,113,672,-497,-182,307,-592,925,
                766,-62,237,-8,789,318,-314,-792,-632,-781,375,939,-304,-149,544,-742,663,484,802,616,501,-269,-458,-763,-950,
                -390,-816,683,-219,381,478,-129,602,-931,128,502,508,-565,-243,-695,-943,-987,-692,346,-13,-225,-740,-441,-112,
                658,855,-531,542,839,795,-664,404,-844,-164,-709,167,953,-941,-848,211,-75,792,-208,569,-647,-714,-76,-603,-852,
                -665,-897,-627,123,-177,-35,-519,-241,-711,-74,420,-2,-101,715,708,256,-307,466,-602,-636,990,857,70,590,-4,610,
                -151,196,-981,385,-689,-617,827,360,-959,-289,620,933,-522,597,-667,-882,524,181,-854,275,-600,453,-942,134
        }, -2805));
        Assertions.assertEquals(77, new L16().threeSumClosest(new int[]{-84,92,26,19,-7,9,42,-51,8,30,-100,-13,-38}, 78));
        Assertions.assertEquals(15, new L16().threeSumClosest(new int[]{2,3,8,9,10}, 16));
        Assertions.assertEquals(2 , new L16().threeSumClosest(new int[]{1,1,1,0}, -100));
        Assertions.assertEquals(3 , new L16().threeSumClosest(new int[]{0,1,2}, 3));
        Assertions.assertEquals(0 , new L16().threeSumClosest(new int[]{-4,2,2,3,3,3}, 0));
        Assertions.assertEquals(2 , new L16().threeSumClosest(new int[]{-1,2,1,-4}, 1));
        Assertions.assertEquals(0 , new L16().threeSumClosest(new int[]{0,0,0}, 1));
    }

    @Test
    public void testL18() {
        Assertions.assertEquals(List.of(List.of(0,0,0,1000000000)), new L18().fourSum(new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000}, 1000000000));
        Assertions.assertEquals(List.of(List.of(-4,0,1,2),List.of(-1,-1,0,1)), new L18().fourSum(new int[]{-1,0,1,2,-1,-4}, -1));
        Assertions.assertEquals(List.of(), new L18().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
        Assertions.assertEquals(List.of(List.of(0,0,0,0)), new L18().fourSum(new int[]{0,0,0,0}, 0));
        Assertions.assertEquals(List.of(List.of(-2,-1,1,2), List.of(-2,0,0,2), List.of(-1,0,0,1)), new L18().fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
