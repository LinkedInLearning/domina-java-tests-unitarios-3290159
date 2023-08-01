
public class Persona implements Comparable<Persona> {
	protected String nombre;
	protected String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	@Override
	public String toString() {
		return nombre + " " +  apellido;
	}

	@Override
	public int compareTo(Persona p) {
		int comparaNombre = this.nombre.compareTo(p.getNombre());
		return comparaNombre == 0 ? this.apellido.compareTo(p.getApellido()) : comparaNombre;
	}

}
