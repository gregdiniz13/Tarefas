package FormasGeometricas;
public abstract class Figura {
	private String tipo;
	
	public Figura(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public abstract double perimetro();

	public abstract double area();
}//end class Figura