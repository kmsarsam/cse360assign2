package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void test() {
		AddingMachine am = new AddingMachine();
		assertNotNull(am);
		
	}
	
	@Test
	public void test2() {
		AddingMachine am = new AddingMachine();
		am.add(4);
		am.subtract(2);
		am.add(5);
		String str1 = "0 + 4 – 2 + 5";
		System.out.println(str1);
		String str2 =  am.toString();
		assertEquals(str1, str2);
	}
	
	@Test 
	public void test3() {
		AddingMachine am = new AddingMachine();
		am.add(4);
		am.subtract(2);
		am.add(5);
		assertEquals(am.getTotal(), 7);
	}

}
