import java.util.Stack;
class TreeNode {
int val; 
TreeNode left; 
TreeNode right; 
TreeNode(int x) {
val =x;
}
}
public class Solution {
public static int KthSmallest(TreeNode root, int k) {
if (root == null) return 0;
TreeNode current = root;
Stack<TreeNode> stack = new Stack<>();
int count = 0;
while (current != null || !stack.isEmpty()) {
while (current != null) {
stack.push(current);
current = current.left;
}
current = stack.pop();
count++;
if (count == k) return current.val;
current = current.right;
}
return -1;
}
public static void main(String[] args) {
TreeNode root = new TreeNode(3);
root.left = new TreeNode(1);
root.right = new TreeNode(4);
root.left.right = new TreeNode(2);
System.out.println(KthSmallest(root, 1)); // Output: 1
System.out.println(KthSmallest(root, 2)); // Output: 2
System.out.println(KthSmallest(root, 3)); // Output: 3
}
}
