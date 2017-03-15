package FormasGeometricas;
public class Cilindro extends Objetos implements Volume {
	public Cilindro(String tipo, double raio, double altura){
		super(tipo, raio, altura);
	}
	
	@Override
	public double area(){
		return 2*Math.PI*raio*(raio+altura);
	}
	
	@Override
	public double perimetro(){
		  return Math.PI*(2*raio);
	}
	
	@Override
	public double volume(){
		return Math.PI*Math.pow(raio, 3)*altura;
	}
}//end Class Cilindro