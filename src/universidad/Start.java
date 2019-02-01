package universidad;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Lucía");
		alumno1.setApellidos("López Tamargo");
		alumno1.setTelefono("65432");
		
		
		/*
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Pedro");
		alumno2.setApellidos("García López");
		alumno2.setTelefono("65432");
		
		System.out.println(alumno1);
		System.out.println(alumno2);
		*/
		
		Aula aula = new Aula();
		aula.setCurso("1DAW");
		aula.setEdificio("Principal");
		aula.setPlanta("2");
		aula.addAlumno(alumno1);
		
		/*
		aula.addAlumno(alumno2);
		aula.addAlumno(alumno1);
		aula.addAlumno(alumno2);
		System.out.println(aula);
		
		alumno1.setNombre("MANUELA");
		System.out.println(aula);
		
		*/
		
		Asignatura lengua = new Asignatura();
		lengua.setNombre("Lengua");
		lengua.setNotaPrimera(8);
		lengua.setNotaSegunda(6);
		lengua.setNotaFinal(9);
		//System.out.println(lengua);
		
		Asignatura mates = new Asignatura();
		mates.setNombre("Matematicas");
		mates.setNotaPrimera(10);
		mates.setNotaSegunda(7);
		mates.setNotaFinal(8);
		//System.out.println(mates);

		Asignatura ingles = new Asignatura();
		ingles.setNombre("Ingles");
		ingles.setNotaPrimera(4);
		ingles.setNotaSegunda(2);
		ingles.setNotaFinal(7);
		//System.out.println(ingles);

		Asignatura ccss = new Asignatura();
		ccss.setNombre("Ciencias Sociales");
		ccss.setNotaPrimera(3);
		ccss.setNotaSegunda(10);
		ccss.setNotaFinal(9);
		//System.out.println(ccss);
		
		
		alumno1.addCalificaciones(lengua,mates,ingles,ccss);
		System.out.println(alumno1);
		System.out.println(alumno1.getNotaMedia());
	}

}
