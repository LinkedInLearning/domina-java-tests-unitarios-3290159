import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ComprobandoExcepciones {
	@Test
	void test1() {
		try {
			int[] nums = new int[] {1, 2};
			int num = nums[10];
			fail("Se espera una excepción");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertTrue(e.getMessage().contains("10")); // ok
		} catch (Throwable t) {
			fail(t);
		}
	}
	
	@Test
	void test2() {
		int[] nums = new int[] {1, 2};
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> { 
			int num = nums[10];
		}); // ok
	}
	
	@Test
	void test3() {
		int[] nums = new int[] {1, 2};
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> { 
			int num = nums[1];
		}); // ko:
		// Expected java.lang.ArrayIndexOutOfBoundsException to be thrown, but nothing was thrown.
	}
	
	@Test
	void test4() {
		int[] nums = new int[] {1, 2};
		assertThrows(NullPointerException.class, () -> { 
			int num = nums[10];
		}); // ko:
		// Unexpected exception type thrown ==> expected: <java.lang.NullPointerException> 
		// but was: <java.lang.ArrayIndexOutOfBoundsException>
	}

	@Test
	void test5() {
		int[] nums = new int[] {1, 2};
		assertThrows(Exception.class, () -> { 
			int num = nums[10];
		}); // ok
	}
}
