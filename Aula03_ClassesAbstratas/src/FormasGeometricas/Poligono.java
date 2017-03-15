package FormasGeometricas;
public abstract class Poligono extends Figura {
	public double area, base, baseMenor, altura;
	
	//Construtor para Losango e retangulo
	public Poligono(String tipo, double base, double altura){
		super(tipo);
		this.base = base;
		this.altura = altura;
	}
	//Construtor para o Trapézio
	public Poligono(String tipo, double baseMenor, double base, double altura){
		super(tipo);
		this.baseMenor = baseMenor;
		this.base = base;
		this.altura = altura;
	}
	//Construtor para Quadrado
	public Poligono(String tipo, double base){
		super(tipo);
		this.base = base;
	}
	
	//set's
	public void setAltura(double altura){
		this.altura = altura;
	}
	public void setBase(double base){
		this.base = base;
	}
	//get's
	public double getAltura(){
		return this.altura;
	}
	public double getBase(){
		return this.base;
	}
	
	@Override
	public double area(){
		return this.area;
	}
}//end class Poligono