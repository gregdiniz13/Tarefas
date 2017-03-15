package FormasGeometricas;
import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo("C�rculo", 5.00));
		figuras.add(new Esfera("Esfera", 5.00));
		figuras.add(new Cilindro("Cilindro", 5.00, 7.00));
		figuras.add(new Triangulo("Tri�ngulo", 4, 9));
		figuras.add(new Piramide("Piramide",4,9,9));
		figuras.add(new Quadrado("Quadrado", 4));
		figuras.add(new Cubo("Cubo",4,4,4));
		figuras.add(new Retangulo("Ret�ngulo", 4, 9));
		figuras.add(new Trapezio("Trap�zio",4,9,7));
		figuras.add(new Losango("Losango", 5, 7));
		
		for (Figura fig : figuras) {
			System.out.println(fig.getTipo());
			System.out.println("�rea: "+ fig.area());
			if (fig instanceof Diagonal) {
				System.out.println("Diagonal: "+((Diagonal) fig).diagonal());
			}
			System.out.println("Per�metro: "+ fig.perimetro());
			if (fig instanceof Volume) {
				System.out.println("Volume: "+((Volume) fig).volume());
			}
		}// end for
	}// end main
}// end class Geometria