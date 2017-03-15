package FormasGeometricas;
public class Triangulo extends Poligono{
	
	public Triangulo(String tipo, double base, double altura){
		super(tipo,base,altura);
	}
	
	@Override
	public double area(){
		return (base*altura)/2;
	}
	
	@Override
	public double perimetro(){
		return base + altura + (Math.pow(Math.pow(base, 2) + Math.pow(altura, 2),0.5));
	}

}//end class