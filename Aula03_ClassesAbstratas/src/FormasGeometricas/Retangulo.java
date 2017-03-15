package FormasGeometricas;
public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(String tipo, double base, double altura){
		super(tipo,base,altura);
	}
	
	@Override
	public double area(){
		return base*altura;
	}
	
	@Override
	public double diagonal(){
		return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
	}
	
	@Override
	public double perimetro(){
		return (base*2)+(altura*2);
	}
}//end class Retangulo