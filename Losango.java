public class Losango extends Poligono{
	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase()*getAltura()/2;
	}
}