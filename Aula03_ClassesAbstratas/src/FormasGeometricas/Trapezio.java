package FormasGeometricas;
public class Trapezio extends Poligono{
	
	public Trapezio(String tipo, double baseMenor, double base, double altura){
		super(tipo, baseMenor, base, altura);
	}

	@Override
	public double area(){
		return ((base+baseMenor)*altura)/2;
	}
	
	@Override
	public double perimetro(){
		return (base + baseMenor+ 2) * (Math.sqrt((altura*altura)+(baseMenor - base )*(baseMenor-base))/4);
	}
}//end class Trapezio