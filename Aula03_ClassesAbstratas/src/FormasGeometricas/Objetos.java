package FormasGeometricas;
public abstract class Objetos extends Figura {
	double area, altura, largura, comprimento, raio;
	//Construtor para a Esfera
	public Objetos(String tipo,double raio){
		super(tipo);
		this.raio = raio;
	}
	
	//Construtor para o Cilindro
	public Objetos(String tipo,double raio, double altura){
		super(tipo);
		this.raio = raio;
		this.altura = altura;
	} 
	
	//Construtor para Piramide e Cubo
	public Objetos(String tipo, double altura, double largura, double comprimento){
		super(tipo);
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	@Override
	public double area(){
		return this.area;
	}
	
	public abstract double volume();
}//end abstract class Objetos