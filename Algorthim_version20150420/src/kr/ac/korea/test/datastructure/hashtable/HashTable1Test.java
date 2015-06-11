package kr.ac.korea.test.datastructure.hashtable;

import static org.junit.Assert.*;

import java.util.HashMap;

import kr.ac.korea.datastructure.hashtable.HashTableCreator;
import kr.ac.korea.datastructure.hashtable.Student;
import kr.ac.korea.datastructure.hashtable.Student.Builder;

import org.junit.Test;

public class HashTable1Test {

	@Test
	public void test() {
		Builder builder1 = new Student.Builder();
		builder1.withId(1)
			.withName("황정식")
			.withGrade(1);
		
		Student student1 = builder1.build();
		
		builder1.withId(2)
			.withName("곰돌이")
			.withGrade(3);
		
		Student student2 = builder1.build();
		
		Student[] students = {student1, student2};
		
		HashTableCreator hc = new HashTableCreator();
		HashMap<Integer, Student> map = hc.buildMap(students);
		
		assertEquals(1, map.get(1).getId());
		assertEquals("곰돌이", map.get(2).getName());
	}

}
