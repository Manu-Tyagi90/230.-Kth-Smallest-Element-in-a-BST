class TreeNode {
int val;
TreeNode lt,rt;
TreeNode(int x, TreeNode y, TreeNode z) {
val =x;
lt = y;
rt = z;
}
}

public class Solution {
public static int KtSmallest(TreeNode root, int k){
if (root == null ) return 0;
Stack<TreeNode> stack= new Stack<>();
TreeNode node = root;
int count =0;
while(node!=null || !stack.isEmpty()) {
while(node !=null) {
stack.push(node);
node =node.lt;
}
node = stack.pop();
count++;
if(count == k) return node.val;
node =node.rt;
}
return -1;
}
}
