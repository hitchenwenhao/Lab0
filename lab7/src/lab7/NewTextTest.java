package lab7;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class NewTextTest {
		public static NewText test=new NewText();

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			graph.creat();
			
		}

		@Test
		public void testGenerateNewText() {
			
			String s2=test.generateNewText("we return them like to a armchairs");
			assertEquals("we return to them like cats to a favorite armchairs",s2);
			
			s2=test.generateNewText("good days away inside our hearts");
			assertEquals("good old days tucked away inside our hearts",s2);
			
			s2=test.generateNewText("we");
			assertEquals("we",s2);
			
		}

	}
