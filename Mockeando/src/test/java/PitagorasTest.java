import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PitagorasTest {
	private Pitagoras pita;
	private SuperCalculadora sc;

	@BeforeEach
	public void setup() {
		sc = Mockito.mock(SuperCalculadora.class);
		pita = new Pitagoras(sc);
	}

	@Test
	void test1() {
		Mockito.when(sc.raiz(25)).thenReturn(5.0);

		double hipo = pita.hipotenusa(3, 4);
		assertEquals(5, hipo);
	}

	@Test
	void test2() {
		Mockito.when(sc.raiz(25)).thenReturn(5.0);

		double hipo = pita.hipotenusaMal(3, 4);
		assertEquals(5, hipo);
	}

	@Test
	void test3() {
		Mockito.when(sc.raiz(16)).thenReturn(4.0);

		double hipo = pita.hipotenusaMal(3, 4);
		assertEquals(5, hipo);
	}

	@Test
	void test4() {
		double hipo = pita.hipotenusa(3, 4);
		assertEquals(5, hipo);
	}

	@Test
	void test5() {
		Mockito.when(sc.raiz(100)).thenReturn(10.0);

		double hipo = pita.hipotenusa(6, 8);
		assertEquals(10, hipo);
	}

	@Test
	void test6() {
		Mockito.when(sc.raiz(100)).thenReturn(100.0);

		double hipo = pita.hipotenusa(6, 8);
		assertEquals(10, hipo);
	}
}
