package ACT1;

import java.util.List;

public class Materia {
	
	private String nombre;
	private String id;
	private float nota;		
	private List<Materia> correlativas;
	
	public Materia(String nombre, String id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public Materia() {
		super();
	};
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativa(Materia correlativa) {
		this.correlativas.add(correlativa);
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	
	
}
