package FormasGeometricas;
public class Piramide extends Objetos implements Volume  {

	public Piramide (String tipo, double altura, double largura, double comprimento){
		super(tipo, altura, largura, comprimento);
	}
	
	@Override
	public double area(){
		return 4*(largura*altura)/2;
	}
	
	@Override
	public double perimetro(){
		  return 4*largura;
	}
	
	@Override
	public double volume(){
		return (comprimento*largura*altura)*1/3;
	}
}//end class Piramide