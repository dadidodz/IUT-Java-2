import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPileBornee {
	
	private static final int MAX_SIZE = 10;
	private PileBornee pile;
	
	@Before
	public void setUp() throws Exception {
		pile = new PileBornee(MAX_SIZE);
	}
	
	@After
	public void tearDown() throws Exception {
		pile = null;
	}
	
	@Test
	public void testPileBornee1() {
		assertTrue(pile.isEmpty());
	}
	
	@Test
	public void testPileBornee2() {
		assertEquals(MAX_SIZE, pile.getMaxSize());
	}
	
	@Test
	public void testIsEmpty() throws Exception {
		assertTrue(pile.isEmpty());
		pile.push(5);
		assertFalse(pile.isEmpty());
	}
	
	@Test
	public void testPush() throws Exception {
		PileBornee p1 = new PileBornee(2);
		p1.push(4);
		assertEquals(1, p1.getSize());
		p1.push(5);
		assertEquals(2, p1.getSize());
	}
	
	@Test
	public void testPushFull() throws Exception {
		PileBornee p1 = new PileBornee(2);
		p1.push(4);
		p1.push(5);
		p1.push(4);
	}
	
	@Test
	public void testPushMaxSize() throws Exception {
		pile.push(1);
		assertEquals(MAX_SIZE, pile.getMaxSize());
		pile.push(2);
		assertEquals(MAX_SIZE, pile.getMaxSize());
		pile.push(3);
		assertEquals(MAX_SIZE, pile.getMaxSize());
	}
	
	@Test
	public void testGetMaxSize() {
		assertEquals(MAX_SIZE, pile.getMaxSize());
	}
	
	@Test
	public void testGetSize() throws Exception {
		PileBornee pile = new PileBornee(2);
		assertEquals(0, pile.getSize());
		pile.push(1);
		assertEquals(1, pile.getSize());
		pile.push(1);
	}
	
	@Test
	public void testIsFull1() {
		assertFalse(pile.isFull());
	}
	
	@Test
	public void testIsFull2() throws Exception {
		PileBornee p1 = new PileBornee(2);
		p1.push(1);
		assertFalse(p1.isFull());
		p1.push(2);
		assertTrue(p1.isFull());
	}
	
	@Test
	public void testTop() throws Exception {
		PileBornee p1 = new PileBornee(2);
		p1.push(11);
		assertEquals(11, p1.top());
		p1.push(22);
		assertEquals(22, p1.top());
	}
	
	@Test
	public void testPop() throws Exception {
		PileBornee pile = new PileBornee(2);
		pile.push(4);
		pile.pop();
		assertEquals(0, pile.getSize());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPopException() throws EmptyStackException {
		pile.pop();
		pile.top();
	}
}
