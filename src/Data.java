public class Data {
	private Object data[][]; //una matrice nXm di tipo Object dove ogni riga modella una transizione
	private int numberOfExamples; //cardinalità dell'insieme di transazioni (numero di righe in data)
	Attribute attributeSet[]; //un vettore degli attributi di ciascuna tupla (schema della tabella di dati)
	
	Data(){
		//inizializzazione matrice data con transizioni di esempio
		data = new Object[14][5];
		
		data[0][0] = "Sunny";
		data[1][0] = "Sunny";
		data[2][0] = "Overcast";
		data[3][0] = "Rain";
		data[4][0] = "Rain";
		data[5][0] = "Rain";
		data[6][0] = "Overcast";
		data[7][0] = "Sunny";
		data[8][0] = "Sunny";
		data[9][0] = "Rain";
		data[10][0] = "Sunny";
		data[11][0] = "Overcast";
		data[12][0] = "Overcast";
		data[13][0] = "Rain";
		
		data[0][1] = "Hot";
		data[1][1] = "Hot";
		data[2][1] = "Hot";
		data[3][1] = "Mild";
		data[4][1] = "Cool";
		data[5][1] = "Cool";
		data[6][1] = "Cool";
		data[7][1] = "Mild";
		data[8][1] = "Cool";
		data[9][1] = "Mild";
		data[10][1] = "Mild";
		data[11][1] = "Mild";
		data[12][1] = "Hot";
		data[13][1] = "Mild";
		
		data[0][2] = "High";
		data[1][2] = "High";
		data[2][2] = "High";
		data[3][2] = "High";
		data[4][2] = "Normal";
		data[5][2] = "Normal";
		data[6][2] = "Normal";
		data[7][2] = "High";
		data[8][2] = "Normal";
		data[9][2] = "Normal";
		data[10][2] = "Normal";
		data[11][2] = "High";
		data[12][2] = "Normal";
		data[13][2] = "High";

		data[0][3] = "Weak";
		data[1][3] = "Strong";
		data[2][3] = "Weak";
		data[3][3] = "Weak";
		data[4][3] = "Weak";
		data[5][3] = "Strong";
		data[6][3] = "Strong";
		data[7][3] = "Weak";
		data[8][3] = "Weak";
		data[9][3] = "Weak";
		data[10][3] = "Strong";
		data[11][3] = "Strong";
		data[12][3] = "Weak";
		data[13][3] = "Strong";
		
		data[0][4] = "No";
		data[1][4] = "No";
		data[2][4] = "Yes";
		data[3][4] = "Yes";
		data[4][4] = "Yes";
		data[5][4] = "No";
		data[6][4] = "Yes";
		data[7][4] = "No";
		data[8][4] = "Yes";
		data[9][4] = "Yes";
		data[10][4] = "Yes";
		data[11][4] = "Yes";
		data[12][4] = "Yes";
		data[13][4] = "No";
		
		//inizializzazione attributeSet creando cinque oggetti di tipo DiscreteAttribute
		attributeSet = new Attribute[5];
		
		String outlookValues[] = new String[3];
		outlookValues[0] = "Sunny";
		outlookValues[1] = "Rain";
		outlookValues[2] = "Overcast";
		attributeSet[0]= new DiscreteAttribute("Outlook", 0, outlookValues);
		
		String temperatureValues[] = new String[3];
		outlookValues[0] = "Hot";
		outlookValues[1] = "Mild";
		outlookValues[2] = "Cold";
		attributeSet[1]= new DiscreteAttribute("Temperature", 1, temperatureValues);
		
		String humidityValues[] = new String[2];
		outlookValues[0] = "Normal";
		outlookValues[1] = "High";
		attributeSet[2]= new DiscreteAttribute("Humidity", 2, humidityValues);
		
		String windValues[] = new String[2];
		outlookValues[0] = "Weak";
		outlookValues[1] = "Strong";
		attributeSet[3]= new DiscreteAttribute("Wind", 3, windValues);
		
		String playTennisValues[] = new String[2];
		outlookValues[0] = "Yes";
		outlookValues[1] = "No";
		attributeSet[4]= new DiscreteAttribute("PlayTennis", 4, playTennisValues);
		
		//inizializzazione di numberOfExamples
		numberOfExamples = 14;	
	}
	
	int getNumberOfExamples() {
		return numberOfExamples;
	}
	
	int getNumberOfAttributes() {
		return attributeSet.length;
	}
	
	Attribute[] getAttributeSchema() {
		return attributeSet;
	}
	
	Object getAttributeValue(int exampleIndex, int attributeIndex) {
		return data[exampleIndex][attributeIndex];
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getNumberOfAttributes(); i++)
			s = s + attributeSet[i].getName() + (i == getNumberOfAttributes() - 1 ? ",\n" : ",");
		for (int i = 0; i < getNumberOfExamples(); i++) {
			s = s + (i + 1) + ":";
			for (int j = 0; j < getNumberOfAttributes(); j++)
				s = s + getAttributeValue(i, j) + (j == getNumberOfAttributes() - 1 ? ",\n" : ",");
		}
		return s;
	}
	
	public static void main(String[] args) {
		Data trySet = new Data();
		System.out.println(trySet);
	}
	
	Tuple getItemSet(int index) {
		Tuple tuple=new Tuple(explanatorySet.length);
		for(int i=0;i<explanatorySet.length;i++)
			tuple.add(new DiscreteItem(explanatorySet[i], 
					(String)data[index][i]),i);
		return tuple;
	}
	
	int[] sampling(int k) {
		int centroidIndexes[]=new int[k];
		//choose k random different centroids in data.
		Random rand=new Random();
		rand.setSeed(System.currentTimeMillis());
		for (int i=0;i<k;i++){
			boolean found=false;
			int c;
			do
			{
				found=false;
				c=rand.nextInt(getNumberOfExamples());
				// verify that centroid[c] is not equal to a centroide
				//already stored in CentroidIndexes
				for(int j=0;j<i;j++)
					if(compare(centroidIndexes[j],c)){
						found=true;
						break;
					}
				}
			while(found);
			centroidIndexes[i]=c;
			}
		return centroidIndexes;
	}
	
	private boolean compare(int i, int j) {
		//da fare
	}
	
	Object computePrototype(ArraySet idList, Attribute attribute) {
		//da fare
	}
	
	String computePrototype(ArraySet idList, DiscreteAttribute attribute) {
		//da fare
	}
}
