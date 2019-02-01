package universidad;

import java.util.Arrays;


/**
 * Alumno que contiene calificaciones
 * @author marcos
 *
 */
public class Alumno {

	// atibutos que lo caracterizan
	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura[] calificaciones;
	
	
	/**
	 * Constructor por defecto
	 */
	public Alumno() {
		
		// las calificaciones tienen 4 asignaturas
		calificaciones = new Asignatura[4];
	}
	
	/**
	 * Permite añadir asignaturas a las calificaciones
	 * @param a0 cada una de las asignaturas
	 * @param a1 cada una de las asignaturas
	 * @param a2 cada una de las asignaturas
	 * @param a3 cada una de las asignaturas
	 */
	public void addCalificaciones(	Asignatura a0,
									Asignatura a1,
									Asignatura a2,
									Asignatura a3) {
		calificaciones[0] = a0;
		calificaciones[1] = a1;
		calificaciones[2] = a2;
		calificaciones[3] = a3;
	}
	
	
	/**
	 * calula la nota media de las asignaturas establecidas
	 * @return
	 */
	public float getNotaMedia() {
		
		float notaMedia = 0;
		// recorre el vector de las calificaciones 
		// solicitando una calificación
		for(int i=0;i<calificaciones.length;i++) {
			
			// vamos sumando la nota media 
			notaMedia += calificaciones[i].getNotaMedia();
		}
		// devolvemos la suma de las notas medias dividida entre 4
		return (notaMedia/4.0f);
	}
	
	
	
	/*
	 * SETTERS Y GETTERS Y TOSTRING
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre 
				+ ", apellidos=" + apellidos 
				+ ", telefono=" + telefono 
				+ ", calificaciones=\n"
				+ Arrays.toString(calificaciones) 
				+ "]";
	}
	
	

	
	
	
}
