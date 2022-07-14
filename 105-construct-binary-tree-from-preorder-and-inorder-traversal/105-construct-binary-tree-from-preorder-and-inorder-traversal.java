class Solution {
             int p=0;//preorder array pointer

      public TreeNode buildTree(int[] preorder, int[] inorder) {
            return helper( 0, inorder.length-1, preorder, inorder);

}

public TreeNode helper(int startInorder,int endInorder,int []preorder,int[]inorder){
    if(startInorder > endInorder)return null;
    int curr=find(preorder[p], inorder, startInorder,endInorder);
    TreeNode node = new TreeNode(preorder[p]);
    p++;
    node.left = helper( startInorder, curr-1, preorder, inorder);//build left sub tree
    node.right = helper( curr+1, endInorder, preorder, inorder);//build right sub tree
    return node;
}

 public int find(int val, int[] inorder,int start, int end){
    while(start < end && inorder[start] != val && inorder[end] != val) {
        start++;
        end--;
    }
    return inorder[start] == val ? start : end;
}
}