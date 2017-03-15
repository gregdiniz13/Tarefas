package FormasGeometricas;
public class Esfera extends Objetos implements Volume {
	public Esfera(String tipo, double raio){
		super(tipo, raio);
	}
	
	@Override
	public double area(){
		return 4*Math.PI*(Math.pow(raio, 2));
	}
	
	@Override
	public double perimetro(){
		  return Math.PI*(2*raio);
	}
	
	@Override
	public double volume(){
		return (4/3)*Math.PI*(Math.pow(raio, 3));
	}
}//end class Esfera