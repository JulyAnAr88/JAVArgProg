package ACT1;

import java.util.List;

public class Alumnx {
	private String nombre;
	private String dni;
	private String generoDNI;
	private String legajo;
	private List<Materia> aprobadas;
	
	public void agregarMateriaAprobada(Materia m) {
		aprobadas.add(m);
	};
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getGeneroDNI() {
		return generoDNI;
	}
	public void setGeneroDNI(String generoDNI) {
		this.generoDNI = generoDNI;
	}

	public List<Materia> getAprobadas() {
		return aprobadas;
	}

	public void setAprobadas(List<Materia> aprobadas) {
		this.aprobadas = aprobadas;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	

}
