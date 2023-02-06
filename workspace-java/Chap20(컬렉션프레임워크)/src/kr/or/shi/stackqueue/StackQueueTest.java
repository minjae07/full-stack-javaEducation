package kr.or.shi.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		//queue 인터페이스를 구현한 Linkedlist 클래스 생성
		Queue<String> queue = new LinkedList<>();
		
		//후입선출(Last In First Out) --> ex)복사기 용지
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//선입선출(First In First Out) --> ex)파이프, 수도꼭지
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		System.out.println("=스택=");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("=큐=");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
}
