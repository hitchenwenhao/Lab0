package shiyan1;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class shiyan1Test {
	public static shiyan1 test1 = new shiyan1();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test1.creat();
	}
	@Test
	public void testPrintBridgeWords() {
		String s1=test1.printBridgeWords("good","days");
		assertEquals("The bridge words from 'good' to 'days' are:old.",s1);
		
		s1=test1.printBridgeWords("c","e");
		assertEquals("No 'c' and 'e' in the graph!",s1);
		
		s1=test1.printBridgeWords(",","to");
		assertEquals("No ',' in the graph!",s1);
		
		s1=test1.printBridgeWords("we","them");
		assertEquals("No bridge words from 'we' to 'them'!",s1);
		
		s1=test1.printBridgeWords("to","favorite");
		assertEquals("The bridge words from 'to' to 'favorite' are:a.",s1);
		
		s1=test1.printBridgeWords("c","away");
		assertEquals("No 'c' in the graph!",s1);
		
		
		
		
		
		
		
		
		
	}
}
