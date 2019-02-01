package universidad;

/**
 * Bean de las asignaturas
 * @author marcos
 *
 */
public class Asignatura {

	// elementos que caracterizan a las asignaturas
	private String nombre;
	private int notaPrimera;
	private int notaSegunda;
	private int notaFinal;

	
	// devulve la nota media de esta asignatura
	public float getNotaMedia() {

		return (float)(notaPrimera+notaSegunda+notaFinal)/3;
	}
	
	
	/*
	 * SETTERS Y GETTERS Y STRING DE LA ASIGNATURA
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNotaPrimera() {
		return notaPrimera;
	}
	public void setNotaPrimera(int notaPrimera) {
		this.notaPrimera = notaPrimera;
	}
	public int getNotaSegunda() {
		return notaSegunda;
	}
	public void setNotaSegunda(int notaSegunda) {
		this.notaSegunda = notaSegunda;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre 
				+ ", 1ª=" + notaPrimera 
				+ ", 2ª=" + notaSegunda
				+ ", FN=" + notaFinal 
				+ "]";
	}
	
	
	
	
	
}
