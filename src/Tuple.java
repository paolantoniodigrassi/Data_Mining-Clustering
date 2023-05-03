
public class Tuple {
	private Item tuple[];
	
	Tuple(int size){
		this.tuple = new Item[size];
	}
	
	int getLenght() {
		return tuple.length;
	}
	
	Item get(int i) {
		return tuple[i];
	}
	
	void add(Item c, int i) {
		tuple[i] = c;
	}
	
	double getDistance(Tuple obj) {
		//da fare
	}
	
	double avgDistance(Data data, int clusteredData[]) {
		double p=0.0,sumD=0.0;
		for(int i=0;i<clusteredData.length;i++){
			double d= getDistance(data.getItemSet(clusteredData[i]));
			sumD+=d;
		}
		p=sumD/clusteredData.length;
		return p;
	}
}
