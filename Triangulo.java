public class Triangulo extends Poligono{
	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase()*getAltura()/2;
	}	
}