package universidad;

import java.util.Arrays;

/**
 * Contiene alumnos del curso
 * @author marcos
 *
 */
public class Aula {

	// elementos del aula
	private Alumno[] alumnos;
	private String curso;
	private String planta;
	private String edificio;
	private int numeroAlumnos;
	
	
	public Aula() {
		
		alumnos = new Alumno[5];
		numeroAlumnos = 0;
	}
	
	
	/**
	 * Permite añadir un alumno al aula
	 * @param alumno
	 */
	public void addAlumno(Alumno alumno) {
		
		// si no está lleno, añade uno mas
		if(numeroAlumnos<alumnos.length) {
			
			alumnos[numeroAlumnos] = alumno;
			numeroAlumnos++;
		}
	}


	/*
	 * SETTERS, GETTERS Y STRING
	 * 
	 */
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}


	@Override
	public String toString() {
		return "Aula [alumnos=" 
				+ Arrays.toString(alumnos) 
				+ ", curso=" + curso 
				+ ", planta=" + planta 
				+ ", edificio="	+ edificio 
				+ ", numeroAlumnos=" + numeroAlumnos 
				+ "]";
	}




	
	
	
	
}
