import java.util.ArrayList;
import java.util.List;

public class Geometria {
	public static void main(String[] args) {
		List <Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(2));
		figuras.add(new Triangulo(4, 2));
		figuras.add(new Retangulo(10, 5));
		figuras.add(new Quadrado(5, 5));
		figuras.add(new Losango(2, 4));
		
		for (Figura f: figuras) {
			System.out.println(f.area());
			if(f instanceof Diagonal) {
				System.out.println(((Diagonal)f).diagonal());
			}
		}
	}
}