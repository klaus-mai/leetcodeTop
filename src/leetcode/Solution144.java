package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author klaus
 * @date 2020/9/28 16:38
 */
public class Solution144 {
    /**
     *
     *递归版本
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        //if (root==null) return list;
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if (root!=null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}
