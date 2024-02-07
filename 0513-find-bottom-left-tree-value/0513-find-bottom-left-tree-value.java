/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
         List<Integer> ans =new ArrayList<>();

        if(root==null){
            return 0;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=q.poll();
                if(i==levelsize-1){
                    ans.add(curr.val);
                }
  if(curr.right!=null){
                    q.add(curr.right);
                }
                if(curr.left!=null){
                    q.add(curr.left);

                }
              



            }
            
        }
       
        return ans.get(ans.size()-1);
       
    }
}
