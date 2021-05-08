//************************************************************************************************************
//SortedList.java					Author: Jake Byford								Spring 2021
//
//CS 505852                        	Prog Data Struct & Algo							ID: 31556607
//
//************************************************************************************************************
	public class SortedList<E extends Comparable<? super E>> extends AbstractList<E> {

	// Method to insert the node in the list.

		private void insert(Node<E> previous, Node<E> current,Node<E> node) {
	
		// check if the correct place to insert the value
	
		// in the list.
	
		if (current == null || node.data.compareTo(current.data) < 0) {
	
			if (previous == null) {
	
					node.next = head;
	
					head = node;
	
			}
	
			else {
	
				node.next = previous.next;
	
				previous.next = node;
	
			}
	
		}
	
		// if the correct place is not found then search
	
		// for the next place with recursion.
	
		else
	
			insert(current, current.next, node);
	
		}
	
		// Method to insert the value in the list/.
	
		@Override
	
		public void insert(E value) {
	
		// crate a temporary node.
	
		Node<E> temp = new Node<E>(value);
	
		insert(null, head, temp);
	
		}
	
		// method to remove the node from the list.
	
		private void remove(Node<E> previous,
	
		Node<E> current, E value) {
	
		// check if the current node is not or not.
	
			if(current == null)
	
				return;
	
			if(current.data.compareTo(value) == 0) {
	
		// check if the previous node is null
	
		// the remove the head node
	
				if(previous == null)
	
					head = current.next;
	
				else
	
					previous.next = current.next;
	
			}
	
			else if(current.data.compareTo(value) > 0)
	
				return;
	
			else
	
				remove(current, current.next, value);
	
			}
	
		// method to remove the value from the list.
	
		@Override
	
			public void remove(E value) {
	
				remove(null, head, value);
	
			}
	
		@Override
	
			public E retrieve(int index) {
	
		// create a node and assign it as head node.
	
			Node<E> current = head;
	
			for(int position = 0; current != null && position < index; position++) {
				current = current.next;
			}
	
			if(current == null)
	
				return null;
	
			else
	
				return current.data;
	
			}
	
			// 	method to search an element i the list.
	
			private boolean search(Node<E> node, E value) {
	
		// check if the node is having the same
	
		// value or not.
	
				if(node == null)
	
					return false;
	
		// compare the value.
	
				if(node.data.equals(value))
	
					return true;
	
				else
	
					return search(node.next, value);
	
			}
	
		// method to search the value in the list.
	
		@Override
	
			public boolean search(E value) {
			
			return search(head, value);
	
			}
	
		@Override
	
		public java.util.Iterator<E> iterator() {
	
			return new Iterator();
	
			}
	
		// inner iterator class to iterarte the list.
	
		class Iterator implements java.util.Iterator<E>	{
	
			Node<E> current = head;
	
		// method to check if te lict has any element.
	
		@Override
	
		public boolean hasNext() {
	
			return current != null;
	
		}
	
		// method to find the next value of teh list.
	
		@Override
	
		public E next()	{
	
			E value = current.data;
	
			current = current.next;
	
			return value;
	
		}
	
		}

	}
