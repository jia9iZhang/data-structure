package org.ds.linkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 类<code>Doc</code>用于：单链表测试代码
 *
 * @author jiaqi.zhang
 * @version 1.0
 * @date 2023-09-05
 */
public class LinkedListTest {
    @Test
    public void testCreateLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});

        Assert.assertNotNull(linkedList);
    }


    @Test
    public void testGetSize() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(linkedList.getSize(), 5);
    }


    @Test
    public void testGetNodeList() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});

        int i = 1;
        for (Integer integer : linkedList.getNodeList()) {
            Assert.assertEquals(integer.intValue(), i++, "元素对比失败");
        }
    }


    @Test
    public void testAddLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});
        linkedList.addLast(6);

        Assert.assertEquals(linkedList.getLast(), 6, "追加尾部元素失败");
    }


    @Test
    public void testRemoveLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});
        linkedList.removeLast();

        Assert.assertEquals(linkedList.getLast(), 4, "移除尾部元素失败");
    }


    @Test
    public void testGetHead() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(linkedList.getHead(), 1, "获取头元素错误");
    }


    @Test
    public void testGetLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        Assert.assertEquals(linkedList.getLast(), 6, "获取尾部元素错误");
    }


    @Test
    public void testUpdateNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});
        linkedList.updateNode(2, 6);

        for (Integer integer : linkedList.getNodeList()) {
            System.out.println(integer);
        }
    }

    @Test
    public void testInsertNewNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});
        linkedList.insertNewNode(2,6);

        for (Integer integer : linkedList.getNodeList()) {
            System.out.println(integer);
        }
        System.out.println("链表长度为："+linkedList.getSize());
    }
}