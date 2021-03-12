package tree;

/**
 * @Classname BuildTree
 * @Description 创建一棵树
 * @Date 2020/7/27 15:40
 * @Created by libaojie
 */
public class BuildTree {

    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();

        TreeNode root = buildTree.createTree();
        buildTree.printTree(root);

    }

    /**
     * 按照层级遍历 构建以一颗树
     *
     * @return
     */
    public TreeNode createTree() {

        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left =f;
        c.right = g;


        return a;
    }

    /**
     * 输出一棵树
     * @param treeNode
     */
    public void printTree(TreeNode treeNode){

        if (treeNode == null){
            return;
        }

        if (treeNode.left != null){
            System.out.println(treeNode.left.value.toString());
        }

        if (treeNode.right != null){
            System.out.println(treeNode.right.value.toString());
        }


//        System.out.println(treeNode.value.toString());

        printTree(treeNode.left);
        printTree(treeNode.right);

    }

}
