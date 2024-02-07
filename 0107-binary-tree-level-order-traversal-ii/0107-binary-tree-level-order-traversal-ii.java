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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        List<List<Integer>> ans1 =new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=q.poll();
                ds.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
                
            }
            ans.add(ds);
        }
        
        for(int i=ans.size()-1;i>=0;i--){
            ans1.add(ans.get(i));
        }
        return ans1;
        
        
    }
}