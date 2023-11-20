 public class Search_in_a_binary_search_tree {
     int val;
     Search_in_a_binary_search_tree left;
     Search_in_a_binary_search_tree right;
     Search_in_a_binary_search_tree() {}
     Search_in_a_binary_search_tree(int val) { this.val = val; }
     Search_in_a_binary_search_tree(int val, Search_in_a_binary_search_tree left, Search_in_a_binary_search_tree right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    public Search_in_a_binary_search_tree searchBST(Search_in_a_binary_search_tree root, int val) {
        Search_in_a_binary_search_tree nodd=null;
        while(true){
            if(root==null){
                break;
            }
            else if(root.val==val){
                nodd=root;
                break;
            }
            else if(val>root.val){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return nodd;
    }
    public static void preorderTraversal(Search_in_a_binary_search_tree root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            
            preorderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        Search_in_a_binary_search_tree root = new Search_in_a_binary_search_tree(4);
        root.left = new Search_in_a_binary_search_tree(2);
        root.right = new Search_in_a_binary_search_tree(7);
        root.left.left = new Search_in_a_binary_search_tree(1);
        root.left.right = new Search_in_a_binary_search_tree(3);
        int val=2;

        

        Search_in_a_binary_search_tree obj=new Search_in_a_binary_search_tree();
        preorderTraversal(root);
        Search_in_a_binary_search_tree newnode = obj.searchBST(root,val);
        System.out.println();
        preorderTraversal(newnode);

        
    }
}