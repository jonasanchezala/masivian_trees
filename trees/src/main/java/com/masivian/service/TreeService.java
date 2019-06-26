package com.masivian.service;

import com.masivian.model.Node;
import com.masivian.model.Tree;
import org.springframework.stereotype.Service;

@Service
public class TreeService {

    public Tree createTree(int[] nodesValues) {
        Tree tree = new Tree();
        for (int i = 0; i < nodesValues.length; i++) {
            tree.add(nodesValues[i]);
        }
        return tree;
    }

    public Integer getlowestCommonAncestor(int[] nodesValues, int nodeValue1, int nodeValue2) {
        Tree tree = createTree(nodesValues);
        Integer lcaValue = lowestCommonAncestor(tree.getRoot(), nodeValue1, nodeValue2).value;
        return lcaValue;
    }

    private static Node lowestCommonAncestor(Node root, int a, int b) {
        Node temp = root;

        if(temp.value > a && temp.value < b){
            return temp;
        }else if(temp.value > a && temp.value > b){
            return lowestCommonAncestor(root.left, a, b);
        }else if(temp.value < a && temp.value < b){
            return lowestCommonAncestor(root.right, a, b);
        }

        return root;
    }
}

