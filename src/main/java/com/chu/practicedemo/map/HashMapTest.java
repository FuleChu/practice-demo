package com.chu.practicedemo.map;

import org.apache.tomcat.util.modeler.FeatureInfo;

import javax.management.monitor.Monitor;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:
 * @author: chufule
 * @time: 2021/4/8 10:13
 */
public class HashMapTest {
    public static void main(String[] args) {
//        ReentrantLock reentrantLock = new ReentrantLock(true);
//        reentrantLock.tryLock();
//        ListNode listNode = new ListNode(1);
//        ListNode listNode1 = new ListNode(3);
//        ListNode listNode2 = new ListNode(2);
//        listNode1.next = listNode2;
//        listNode.next = listNode1;
//
//        HashMapTest hashMapTest = new HashMapTest();
//        int[] ints = hashMapTest.reversePrint(listNode);
//        System.out.println(ints);
//
//        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
        Queue<Integer> priorityQueue = new PriorityQueue<>((a, b)->b.compareTo(a));
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(1);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        ConcurrentHashMap k = new ConcurrentHashMap();

    }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack();
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] arrys = new int[stack.size()];
        for(int i = 0; i<stack.size();i++) {
            arrys[i] = stack.pop().val;
        }
        return arrys;
    }
}
