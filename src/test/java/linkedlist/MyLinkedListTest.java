package linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
	MyLinkedList list;

	@Before
	public void setUp() throws Exception {
		list = new MyLinkedList();
	}

	@Test
	public void addTest() {
		list.add(1);
		list.add(4);
		list.add(5);
		assertEquals(1, list.get(0));
		assertEquals(4, list.get(1));
		assertEquals(5, list.get(2));
	}

	@Test
	public void deleteDuplicationTest() {
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.deleteDuplication();
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
		assertEquals(5, list.get(3));
	}

	@Test
	public void getFromBackAtTest() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		assertEquals(4, list.getFromBackAt(1));
		assertEquals(1, list.getFromBackAt(4));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getFromBackAtExceptionTest() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.getFromBackAt(5);
	}
}
