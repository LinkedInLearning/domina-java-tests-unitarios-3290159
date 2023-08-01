import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ConParametrosTest {

	@ParameterizedTest
	@CsvSource({ "0, 0", "1, 1", "2, 4", "3, 9", "4, 16", "5, 25" })
	void test1(int num, int esperado) {
		assertEquals(esperado, num * num);
	}

	@ParameterizedTest(name = "{index}: test2({0}*{0} = {1})")
	@CsvSource({ "0, 0", "1, 1", "2, 2", "3, 9", "4, 16", "5, 35" })
	void test2(int num, int esperado) {
		assertEquals(esperado, num * num);
	}

	@ParameterizedTest(name = "{index}: test3({0}*{0} = {1})")
	@CsvFileSource(resources = "bateriaTest.csv")
	void test3(int num, int esperado) {
		assertEquals(esperado, num * num);
	}

	@ParameterizedTest(name = "{index}: test4({0}*{0} = {1})")
	@CsvFileSource(resources = "bateriaTestMal.csv")
	void test4(int num, int esperado) {
		assertEquals(esperado, num * num);
	}
	
	@ParameterizedTest(name = "{index}: test5({0})")
	@ValueSource(ints = { 2, 4, 6, 8 })
	void test5(int num) {
		assertTrue(num % 2 == 0);
	}
	
	@ParameterizedTest(name = "{index}: test6({0})")
	@EnumSource
	void test6(Month mes) {
		assertNotNull(mes);
	}
	
	static Stream<Persona> personaProvider() {
		return Stream.of(
				new Persona("Pepe", "Pérez"), 
				new Persona("Lola", "López"), 
				new Persona("Manuel", "Gómez"));
	}

	@ParameterizedTest(name = "{index}: test7({0})")
	@MethodSource("personaProvider")
	void test7(Persona p) {
		assertEquals(4, p.getNombre().length());
	}
}
