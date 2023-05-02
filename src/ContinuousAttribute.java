public class ContinuousAttribute extends Attribute{
	private double max;
	private double min; //rappresentano gli estremi dell'intervallo di valori (dominio) che l'attributo può realmente assumere
	
	ContinuousAttribute(String name, int index, double min, double max){
		super(name, index);
		this.min = min;
		this.max = max;
	}
	
	double getScaledValue(double v) {
		return (v-min)/(max-min);
	}
	
}