package FormasGeometricas;
public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(String tipo, double base){
		super (tipo, base);
	}

	
	@Override
	public double area(){
		return Math.pow(base,2);
	}
	
	@Override
	public double diagonal(){
		return Math.sqrt(Math.pow(base, 2) + Math.pow(base, 2));
	}
	
	@Override
	public double perimetro(){
		return (base*4);
	}
	
}//end class 