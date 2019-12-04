import java.util.ArrayList;

public class AcervoDeEstudos {
	private int id;
	private String tema;
    private Materia materia;
    //fazer arrayList atributo e metodos
    
    public AcervoDeEstudos() {
    }
    
    public AcervoDeEstudos(Materia nomeMateria) {
    	this.materia = nomeMateria;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}
