package gugudan;

import junit.framework.TestCase;
import java.util.ArrayList;

public class GugudanTest extends TestCase {
	public void testCreate() {
		GugudanInput gugudanInput = new GugudanInput();
		int[] list = gugudanInput.input();
				
		InputValue inputValue = new InputValue(list[0], list[1]);
//		assertEquals(3, inputValue.getFirst());
//		assertEquals(5, inputValue.getSecond());
//		
		GugudanOutput.print(Gugudan.calculate(inputValue.getFirst(), inputValue.getSecond()));
		
		
	}
}
