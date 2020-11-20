package com.lbj.b2.tree;

/**
 * @Classname TreeNode
 * @Description 树节点
 * @Date 2020/7/27 15:38
 * @Created by libaojie
 */
public class TreeNode<T> {

    public T value;
    public TreeNode<T> left = null;
    public TreeNode<T> right = null;

    public TreeNode(T value){
        this.value = value;
    }

}
