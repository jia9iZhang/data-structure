package org.ds.linkedlist;

import org.testng.Assert;

import java.util.ArrayList;


/**
 * @Description 单链表
 * @Author jiaqi.zhang
 * @Date 2023/9/4-18:00
 */
public class LinkedList {
    private Node dummyHead = new Node(-1);//虚拟头结点
    private int size;

    /**
     * 创建单链表
     */
    public void createLinkedList(int[] arr) {
        Assert.assertNotNull(arr, "数组不能为空");
        //指针指向虚拟头结点
        Node idx = dummyHead;

        //一步一步向后走创建链表
        for (int i = 0; i < arr.length; i++) {
            //创建新节点
            Node node = new Node(arr[i]);
            //将虚拟头结点指向新节点
            idx.next = node;
            //移动指针
            idx = idx.next;
            size++;
        }
    }

    //获取链表长度
    public int getSize() {
        return size;
    }

    /**
     * 返回位置x之前的元素
     *
     * @return
     */
    public ArrayList<Integer> getNodeList(int length) {
        ArrayList<Integer> nodeList = new ArrayList<>();
        Node idx = dummyHead;
        for (int i = 0; i < length; i++) {
            idx = idx.next;
            nodeList.add(idx.data);
        }
        return nodeList;
    }

    /**
     * 遍历单链表
     *
     * @return
     */
    public ArrayList<Integer> getNodeList() {
        ArrayList<Integer> nodeList = new ArrayList<>();
        Node idx = dummyHead;
        while (idx.next != null) {
            idx = idx.next;
            nodeList.add(idx.data);
        }
        return nodeList;
    }

    /**
     * 尾部追加
     *
     * @param targetNum
     */
    public void addLast(int targetNum) {
        Node idx = dummyHead;
        //先走到尾部
        while (idx.next != null) {
            idx = idx.next;
        }
        //初始化节点
        Node node = new Node(targetNum);
        //追加节点
        idx.next = node;
        size++;
        //node.next = null;
    }

    /**
     * 尾部移除
     */
    public void removeLast() {
        //先找到尾部节点
        Node idx = dummyHead;
        while (idx.next != null) {
            if (idx.next.next != null) {
                idx = idx.next;
            } else {
                idx.next = null;
                size--;
            }
        }
    }

    /**
     * 获取头部元素
     */
    public int getHead() {
        Node idx = dummyHead;
        return idx.next.data;
    }

    /**
     * 获取尾部元素
     *
     * @return
     */
    public int getLast() {
        Node idx = dummyHead;
        while (idx.next != null) {
            idx = idx.next;
        }
        return idx.data;
    }

    /**
     * 更新某个位置节点的值
     */
    public void updateNode(int position, int target) {
        Node idx = dummyHead;
        int i = 0;
        while (idx.next != null && i < position) {
            idx = idx.next;
            i++;
        }
        if (idx != null) {
            idx.data = target;
        }
    }

    /**
     * 插入新节点
     */
    public void insertNewNode(int position, int target) {

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
