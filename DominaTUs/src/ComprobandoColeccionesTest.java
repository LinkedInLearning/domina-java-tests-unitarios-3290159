import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class ComprobandoColeccionesTest {

	@Test
	void testIguales() {
		List<String> l1 = Arrays.asList("a", "e", "i", "o", "u");
		List<String> l2 = Arrays.asList("a", "e", "i", "o", "u");
		List<String> l3 = Arrays.asList("a", "e", "i", "o", "z");
		
		assertEquals(l1, l2); // ok
		assertNotSame(l1, l2); // ok
		assertNotEquals(l1, l3); // ok

		assertIterableEquals(l1, l2); // ok
		assertIterableEquals(l1, l3); // ko: 
		// iterable contents differ at index [4], expected: <u> but was: <z>
	}
	
	@Test
	void testParecidas() {
		List<String> l1 = Arrays.asList("a", "e", "i", "o", "u");
		List<String> l2 = Arrays.asList("u", "o", "i", "e", "a");
		List<String> l3 = Arrays.asList("a", "e", "i", "o", "o", "u", "u");
		
		// mismo tamaño
		assertEquals(l1.size(), l2.size()); // ok
		// mismos elementos
		assertTrue(l1.containsAll(l2) && l2.containsAll(l1)); // ok
		assertTrue(l1.containsAll(l3) && l3.containsAll(l1)); // ok
		// distinto tamaño
		assertNotEquals(l1.size(), l3.size()); // ok
		// iguales? no
		assertIterableEquals(l1, l2); // ko:
		// iterable contents differ at index [0], expected: <a> but was: <u>
	}
	
	@Test
	void testArraysMal() {
		char[] letras1 = "buenos días".toCharArray();
		char[] letras2 = "buenos días".toCharArray();
		
		assertEquals(letras1, letras2); // ko: 
		// expected: [C@7193666c<[b, u, e, n, o, s,  , d, í, a, s]> but was: [C@20deea7f<[b, u, e, n, o, s,  , d, í, a, s]>
	}
	
	@Test
	void testArraysBien() {
		char[] letras1 = "buenos días".toCharArray();
		char[] letras2 = "buenos días".toCharArray();
		char[] letras3 = "buenos dias".toCharArray();

		assertArrayEquals(letras1, letras2); // ok
		assertArrayEquals(letras1, letras3); // ko:
		// array contents differ at index [8], expected: <í> but was: <i>
	}
}
