package kr.ac.korea.test.datastructure.tree.bst;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import kr.ac.korea.datastructure.tree.bst.BinarySearchTree;
import kr.ac.korea.datastructure.tree.bst.Node;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTreeTest {
	private static BinarySearchTree bst;
	
	@BeforeClass
	public static void setUp(){
		bst = new BinarySearchTree();
	}
	
	@Test
	public void addTest() {
				
		Node root = bst.add(3);
		bst.add(2);
		bst.add(4);
		bst.add(6);
		
		assertEquals(3, root.key);
		assertEquals(4, root.right.key);
		assertEquals(2, root.left.key);
		
	}

	@Test
	public void searchTest(){
		assertEquals(3, bst.search(3));
		assertEquals(2, bst.search(2));
		assertEquals(4, bst.search(4));
		assertEquals(6, bst.search(6));
		assertEquals(0, bst.search(7));
	}
}
