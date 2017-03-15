package FormasGeometricas;
public class Circulo extends Figura {
  public double raio;
  
  public Circulo(String tipo, double raio){
	  super(tipo);
	  this.raio = raio;
  }
  
  //Set's
  public void setRaio(double raio){
	  this.raio = raio;
  }
  //Get's
  public double getRaio(){
	  return this.raio;
  }
  
  @Override
  public double area(){
	  return Math.pow(this.raio, 2) * Math.PI;
  }
  
  @Override
  public double perimetro(){
	  return Math.PI*(2*raio);
  }
}//end class Circulo