import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreparandoTerrenoTest {

	private static List<Integer> listaBase;
	private static Scanner s;
	private static int contador;
	private List<Integer> lista;

	@BeforeAll
	static void antesDeNada() throws FileNotFoundException {
		listaBase = new ArrayList<>();
		s = new Scanner(new File("entrada.txt"));
		while (s.hasNext()) {
			listaBase.add(Integer.parseInt(s.nextLine()));
			contador++;
		}
		System.out.println("listaBase: " + listaBase);
	}

	@BeforeEach
	void antesDeCada() {
		lista = new ArrayList<>();
		for (Integer num : listaBase) {
			lista.add(num * 2);
		}
		System.out.println("lista before: " + lista);
	}

	@Test
	void test1() {
		System.out.println("test1: " + lista);
		assertEquals(contador, lista.size());
		lista.remove(0);
		assertEquals(contador-1, lista.size());
		System.out.println("test1: " + lista);
	}

	@Test
	void test2() {
		System.out.println("test2: " + lista);
		assertEquals(contador, lista.size());
		lista.add(0);
		assertEquals(contador+1, lista.size());
		System.out.println("test2: " + lista);
	}

	@AfterEach
	void despuesDeCada() {
		lista.clear();
		System.out.println("lista after: " + lista);
	}

	@AfterAll
	static void despuesDeTodo() {
		if (s != null) {
			s.close();
			System.out.println("cerrando");
		}
	}
}
