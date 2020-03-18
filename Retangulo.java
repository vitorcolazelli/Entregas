public class Retangulo extends Poligono implements Diagonal{
	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}
	
	@Override
	public double diagonal(){
		return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
	}
}