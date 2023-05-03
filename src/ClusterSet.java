
public class ClusterSet {
	private Cluster C[];
	private int i = 0; //posizione valida per la memorizzazione di un nuovo cluster in C

	ClusterSet(int k){
		this.C = new Cluster[k];
	}

	void add(Cluster c) {
		this.C[i] = c;
		i++;
	}
	
	Cluster get(int i) {
		return C[i];
	}
	
	void initializeCentroids(Data data) {
		int centroidIndexes[]=data.sampling(C.length);
		for(int i=0;i<centroidIndexes.length;i++)
		{
			Tuple centroidI=data.getItemSet(centroidIndexes[i]);
			add(new Cluster(centroidI));
		}
	}
	
	Cluster nearestCluster(Tuple tuple) {
		//da fare
	}
	
	Cluster currentCluster(int id) {
		//da fare
	}
	
	void updateCentroids(Data data) {
		//da fare
	}
	
	public String toString() {
		//da fare
	}
	
	public String toString(Data data) {
		String str="";
		for(int i=0;i<C.length;i++){
			if (C[i]!=null){
				str+=i+":"+C[i].toString(data)+"\n";
			}
		}
		return str;
	}
	
	
}
