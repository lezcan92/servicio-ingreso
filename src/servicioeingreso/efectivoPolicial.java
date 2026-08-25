package servicioeingreso;


public class efectivoPolicial {

	private String nombre;
	private int legajo;
	private Jerarquia jerarquia;
	
public efectivoPolicial(String nombre, int legajo, Jerarquia jerarquia) {
	
	
	this.jerarquia=jerarquia;
	this.legajo=legajo;
	this.nombre=nombre;
	
}
	public String getNombre() { 
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public int getLegajo() {
    	return legajo;
    }
    public Jerarquia getJerarquia() {
    	return jerarquia;
    }
    }




