package FormasGeometricas;
public class Losango extends Poligono{
	public Losango(String tipo, double base, double altura){
		super(tipo, base, altura);
	}
	
	@Override
	public double area(){
		return (base*altura)/2;
	}
	
	@Override
	public double perimetro(){
		double hipotenusa=Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura/2, 2));	
		return hipotenusa*4;
	}
}//end class Losango