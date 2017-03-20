package exercise;

/**
 * Created by hgang on 2017/3/20.
 */
public class DeleteNode {
	public static class Node<Item> {
		Item item;
		Node next;
	}

	public static Node deleteNode(Node head, Node toDelete){
		Node delete;
		if (head==null || head.next==null) return head;
		else if(toDelete.next==null) {
			delete = toDelete;
			Node current = head;
			while(current.next!=toDelete) {
				current = current.next;
			}
			current.next = null;
		}
		else {
			delete = toDelete;
			toDelete.item = toDelete.next.item;
			toDelete.next = toDelete.next.next;
		}
		return delete;
	}

	public static void main(String[] args) {
		Node<Integer> tail = new Node<>();
		tail.item = 1; tail.next = null;
		Node<Integer> c = new Node<>();
		c.item = 2; c.next = tail;
		Node<Integer> b = new Node<>();
		b.item = 3; b.next = c;
		Node<Integer> a = new Node<>();
		a.item = 4; a.next = b;
		deleteNode(a,tail);
		while(a!=null) {
			System.out.println(a.item);
			a=a.next;
		}

	}



}