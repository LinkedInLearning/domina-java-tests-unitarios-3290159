import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntroTest {

	@Test
	void test() {
		int res = Intro.suma(1, 2);
		assertEquals(3, res);
	}


	@Test
	void testMal() {
		int res = Intro.suma(2, 2);
		assertEquals(3, res);
	}

	@Test
	void testFatal() {
		int res = Intro.suma(1/0, 2);
		assertEquals(3, res);
	}
}
