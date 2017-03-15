package FormasGeometricas;
public class Cubo extends Objetos implements Volume  {

	public Cubo (String tipo, double altura, double largura, double comprimento){
		super(tipo, altura, largura, comprimento);
	}
	
	@Override
	public double area(){
		return 6*Math.pow(largura, 2);
	}
	
	@Override
	public double perimetro(){
		  return 4*largura;
	}
	
	@Override
	public double volume(){
		return comprimento*largura*altura;
	}
}//end Class Cubo