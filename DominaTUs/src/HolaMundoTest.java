import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class HolaMundoTest {
	@Test
	public void testOut() {
		PrintStream originalOut = System.out; // salida original
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); // nueva salida
		System.setOut(new PrintStream(bos)); // reemplazo de salida

		HolaMundo.main(null);
		String salida = bos.toString(); // recuperación del contenido
		assertEquals("Hola mundo\n", salida);
		
		System.setOut(originalOut); // restauración de la consola
	}

	@Test
	public void testErr() {
		PrintStream originalErr = System.err; // salida original
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); // nueva salida
		System.setErr(new PrintStream(bos)); // reemplazo de salida

		HolaMundo.main(null);
		String salida = bos.toString(); // recuperación del contenido
		assertEquals("Y adiós", salida.trim());
		
		System.setErr(originalErr); // restauración de la consola
	}

	@Test
	public void testOutErr() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		PrintStream originalErr = System.err;
		ByteArrayOutputStream bosErr = new ByteArrayOutputStream();
		System.setErr(new PrintStream(bosErr));

		HolaMundo.main(null);
		String salida = bos.toString();
		assertEquals("Hola mundo\n", salida);

		String salidaErr = bosErr.toString();
		assertEquals("Y adiós", salidaErr.trim());
		
		System.setErr(originalErr);
		System.setOut(originalOut);
	}

}