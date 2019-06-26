package com.masivian.model;

public class GetLCARequest {
    private int[] treeElements;
    private int nodeValue1;
    private int nodeValue2;

    public int[] getTreeElements() {
        return treeElements;
    }

    public void setTreeElements(int[] treeElements) {
        this.treeElements = treeElements;
    }

    public int getNodeValue1() {
        return nodeValue1;
    }

    public void setNodeValue1(int nodeValue1) {
        this.nodeValue1 = nodeValue1;
    }

    public int getNodeValue2() {
        return nodeValue2;
    }

    public void setNodeValue2(int nodeValue2) {
        this.nodeValue2 = nodeValue2;
    }
}
