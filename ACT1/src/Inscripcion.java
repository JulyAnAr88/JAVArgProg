package ACT1;


public class Inscripcion {
	
	public boolean aprobada(Materia m, Alumnx a) {
		int correlativas= m.getCorrelativas().size();
		int ap = 0;
		for (Materia correlativa : m.getCorrelativas()) {
			for (Materia aprobada : a.getAprobadas()) {
				if(correlativa.getId() == aprobada.getId()) {
					ap++;
					break;
				}
			}			
		}
		
		return ap==correlativas;		
	};
}
