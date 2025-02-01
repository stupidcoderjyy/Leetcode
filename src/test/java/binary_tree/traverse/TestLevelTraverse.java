package binary_tree.traverse;

import binary_tree.TreeNode;
import binary_tree.traverse.level.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLevelTraverse {

    @Test
    public void testL102() {
        assertL102("[[3],[9,20],[15,7]]", 3,9,20,null,null,15,7);
        assertL102("[[1]]", 1);
        assertL102("[]");
    }

    private void assertL102(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L102().levelOrder(root).toString().replace(" ", ""));
    }

    @Test
    public void testL107() {
        assertL107("[[3],[9,20],[15,7]]", 3,9,20,null,null,15,7);
        assertL107("[[1]]", 1);
        assertL107("[]");
    }

    private void assertL107(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L107().levelOrderBottom(root).toString().replace(" ", ""));
    }

    @Test
    public void testL199() {
        assertL199("[1,3,4]", 1,2,3,null,5,null,4);
        assertL199("[1,3,4,5]", 1,2,3,4,null,null,null,5);
    }

    private void assertL199(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L199().rightSideView(root).toString().replace(" ", ""));
    }

    @Test
    public void testL637() {
        assertL637("[3.0,14.5,11.0]", 3,9,20,null,null,15,7);
        assertL637("[3.0,14.5,11.0]", 3,9,20,15,7);
    }

    private void assertL637(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L637().averageOfLevels(root).toString().replace(" ", ""));
    }
}
