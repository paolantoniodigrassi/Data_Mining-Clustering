package data;
public abstract class Attribute {
	private String name; //nome simbolico dell'attributo
	private int index; //identificativo numerico dell'attributo
	

	Attribute(String name, int index){
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	public String toString() {
		return name;
	}

}
