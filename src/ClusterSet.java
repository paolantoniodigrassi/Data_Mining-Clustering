
public class ClusterSet {
	private Cluster C[];
	private int i = 0; //posizione valida per la memorizzazione di un nuovo cluster in C

	ClusterSet(int k){
		C = new Cluster[k];
	}

	void add(Cluster c) {
		C[i] = c;
		i++;
	}
	
	Cluster get(int i) {
		return C[i];
	}
	
	void initializeCentroids(Data data) {
		int centroidIndexes[]=data.sampling(C.length);
		for(int i = 0; i < centroidIndexes.length; i++){
			Tuple centroidI=data.getItemSet(centroidIndexes[i]);
			add(new Cluster(centroidI));
		}
	}
	
	Cluster nearestCluster(Tuple tuple) {
		Cluster nearestC = C[0];
		double minD = tuple.getDistance(C[0].getCentroid());
		double temp;
		
		for(i = 1; i < C.length; i++) {
			temp = tuple.getDistance(C[i].getCentroid());
			if(temp < minD) {
				minD = temp;
				nearestC = C[i];
			}
		}
		return nearestC;
	}
	
	Cluster currentCluster(int id) {
		for (int i = 0; i < C.length; i++) {
			if(C[i].contain(id))
				return C[i];
		}
		return null;
	}
	
	void updateCentroids(Data data) {
		for (int i = 0; i < C.length; i++) {
			C[i].computeCentroid(data);
		}
	}
	
	public String toString() {
		String str ="";
		for(i = 0; i < C.length; i++) {
			str += i+ ": " + C[i] + "\n";	
			}
		return str;
	}
	
	public String toString(Data data) {
		String str = "";
		for(int i = 0; i < C.length; i++){
			if (C[i]!=null)
				str += i + ": " + C[i].toString(data) + "\n";
		}
		return str;
	}
	
	
}
