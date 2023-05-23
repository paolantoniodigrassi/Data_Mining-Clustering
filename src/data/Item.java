package data;
import utility.ArraySet;

public abstract class Item {
	private Attribute attribute; //attributo coinvolto nell'item
	private Object value; //valore assegnato all'attributo
	
	Item(Attribute attribute, Object value){
		this.attribute = attribute;
		this.value = value;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}
	
	public Object getValue() {
		return value;
	}
	
	public String toString() {
		return (String)value;
	}
	
	abstract double distance (Object a); //implementazione diversa per item discreto e item continuo
	
	public void update(Data data, ArraySet clusteredData) {
		value = data.computePrototype(clusteredData, attribute);
	}
	
	
}
