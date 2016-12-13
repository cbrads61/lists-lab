package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		if (index > size-1 || index < 0 || size == 0){
			throw NullPointerException;
			return false;
		}else {
			Node<T> nodeBeforeIndex = head;
			Node<T> nodeAfterIndex;
			for (int i = 0; i < index; i++){
				nodeBeforeIndex = nodeBeforeIndex.getNext();
			}
			size--;
			nodeAfterIndex = nodeBeforeIndex.getNext().getNext();
			nodeBeforeIndex.setNext(nodeAfterIndex);
			return true
		}
	}

	public T get(int index) {
		if (index > size-1 || index < 0 || size == 0){
			throw NullPointerException;
			return null;
		}else {
			for (int i = 0; i < index; i++){
				node = node.getNext();
			}
			return node.getData();
		}
	}

	public void add(T obj) {
		if (size > 0){
			Node<T> last = head;
			Node<T> newLast = last.getNext();
			while (newLast != null){
				last = last.getNext();
				newLast = last.getNext();
			}
			last.setNext(new Node<>(obj));
			size++;
		}
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
		}

		@Override
		public T next() {
			//to-do
		}

		@Override
		public void remove() {
			// to-do

		}

	}
}
