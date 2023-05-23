package data;
import utility.ArraySet;

public class DiscreteAttribute extends Attribute{
	private String values[]; //array di oggetti String, uno per ciascun valore del dominio discreto. I valori del dominio sono memorizzati in values seguendo un ordine lessigografico
	
	DiscreteAttribute(String name, int index, String values[]){
		super(name, index);
		this.values = values;
	}
	
	int getNumberOfDistinctValues() {
		return values.length;
	}
	
	String getValue(int i) {
		return values[i];
	}
	
	int frequency(Data data, ArraySet idList, String v) {
		int freq = 0;
		int f[] = idList.toArray();
		for (int i = 0; i < f.length; i++)
			if(data.getAttributeValue(f[i], this.getIndex()).equals(v))
				freq++;
		return freq;
	}
}
