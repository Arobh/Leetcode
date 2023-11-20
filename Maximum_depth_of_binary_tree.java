public class Maximum_depth_of_binary_tree {
   int val;
     Maximum_depth_of_binary_tree left;
     Maximum_depth_of_binary_tree right;
     Maximum_depth_of_binary_tree() {

     }
     Maximum_depth_of_binary_tree(int val) { 
        this.val = val;
     }
     Maximum_depth_of_binary_tree(int val, Maximum_depth_of_binary_tree left, Maximum_depth_of_binary_tree right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 
    public int maxDepth(Maximum_depth_of_binary_tree root) {
        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        int max;
        if(l>r){
            max=l;
        }
        else{
            max=r;
        }
        return max+1;
    }
    public static void main(String[] args) {
        Maximum_depth_of_binary_tree root = new Maximum_depth_of_binary_tree(3);
        root.left = new Maximum_depth_of_binary_tree(9);
        root.right = new Maximum_depth_of_binary_tree(20);
        root.right.left = new Maximum_depth_of_binary_tree(15);
        root.right.right = new Maximum_depth_of_binary_tree(7);

        Maximum_depth_of_binary_tree solution = new Maximum_depth_of_binary_tree();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }
}