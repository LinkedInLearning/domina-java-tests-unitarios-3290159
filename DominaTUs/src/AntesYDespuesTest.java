import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AntesYDespuesTest {

	@BeforeAll
	static void antesDeNada() {
		System.out.println("antes de nada");
	}
	
	@BeforeEach
	void antesDeCada() {
		System.out.println("antes de cada");
	}
	
	@Test
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}
	
	@AfterEach
	void despuesDeCada() {
		System.out.println("después de cada");
	}

	@AfterAll
	static void despuesDeTodo() {
		System.out.println("después de todo");
	}

}
