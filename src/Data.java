import java.util.*;

public class Data {
	private Object data[][]; //una matrice nXm di tipo Object dove ogni riga modella una transizione
	private int numberOfExamples; //cardinalità dell'insieme di transazioni (numero di righe in data)
	private Attribute attributeSet[]; //un vettore degli attributi di ciascuna tupla (schema della tabella di dati)
	
	Data(){
		//inizializzazione matrice data con transizioni di esempio
		data = new Object[14][5];
		
		data[0][0] = new String ("sunny");
		data[1][0] =new String ("sunny");
		data[2][0] =new String ("overcast");
		data[3][0] =new String ("rain");
		data[4][0] =new String ("rain");
		data[5][0] =new String ("rain");
		data[6][0] =new String ("overcast");
		data[7][0] =new String ("sunny");
		data[8][0] = new String("sunny");
		data[9][0] =new String ("rain");
		data[10][0] =new String ("sunny");
		data[11][0] =new String ("overcast");
		data[12][0] =new String ("overcast");
		data[13][0] =new String ("rain");
 
		data[0][1] =new String ("hot");
		data[1][1] =new String ("hot");
		data[2][1] = new String ("hot");
		data[3][1] = new String("mild");
		data[4][1] = new String("cool");
		data[5][1] = new String("cool");
		data[6][1] = new String("cool");
		data[7][1] = new String("mild");
		data[8][1] = new String("cool");
		data[9][1] = new String("mild");
		data[10][1] = new String("mild");
		data[11][1] = new String("mild");
		data[12][1] = new String ("hot");
		data[13][1] = new String("mild");

		data[0][2] = new String ("high");
		data[1][2] = new String ("high");
		data[2][2] = new String ("high");
		data[3][2] = new String ("high");
		data[4][2] = new String ("normal");
		data[5][2] = new String ("normal");
		data[6][2] = new String ("normal");
		data[7][2] = new String ("high");
		data[8][2] = new String ("normal");
		data[9][2] = new String ("normal");
		data[10][2] = new String ("normal");
		data[11][2] = new String ("high");
		data[12][2] = new String ("normal");
		data[13][2] = new String ("high");

		data[0][3] = new String ("weak");
		data[1][3] = new String ("strong");
		data[2][3] = new String ("weak");
		data[3][3] = new String ("weak");
		data[4][3] = new String ("weak");
		data[5][3] = new String ("strong");
		data[6][3] = new String ("strong");
	    data[7][3] = new String ("weak");
	    data[8][3] = new String ("weak");
	    data[9][3] = new String ("weak");
        data[10][3] = new String ("strong");
        data[11][3] = new String ("strong");
        data[12][3] = new String ("weak");
        data[13][3] = new String ("strong");

        data[0][4] = new String ("no");
        data[1][4] = new String ("no");
        data[2][4] = new String ("yes");
        data[3][4] = new String ("yes");
        data[4][4] = new String ("yes");
        data[5][4] = new String ("no");
        data[6][4] = new String ("yes");
        data[7][4] = new String ("no");
        data[8][4] = new String ("yes");
        data[9][4] = new String ("yes");
        data[10][4] = new String ("yes");
        data[11][4] = new String ("yes");
        data[12][4] = new String ("yes");
        data[13][4] = new String ("no");

		
		/*data[0][0]=new String ("sunny");
		data[1][0]=new String ("sunny");
		data[2][0]=new String ("sunny");
		data[3][0]=new String ("rain");
		data[4][0]=new String ("rain");
		data[5][0]=new String ("rain");
		data[6][0]=new String ("rain");
		data[7][0]=new String ("rain");
		data[8][0]=new String ("rain");
		data[9][0]=new String ("rain");
		data[10][0]=new String ("overcast");
		data[11][0]=new String ("overcast");
		data[12][0]=new String ("overcast");
		data[13][0]=new String ("overcast");
		 
		data[0][1]=new String ("hot");
		data[1][1]=new String ("hot");
		data[2][1]=new String ("hot");
		data[3][1]=new String ("mild");
		data[4][1]=new String ("mild");
		data[5][1]=new String ("mild");
		data[6][1]=new String ("mild");
		data[7][1]=new String ("mild");
		data[8][1]=new String ("mild");
		data[9][1]=new String ("mild");
		data[10][1]=new String ("cold");
		data[11][1]=new String ("cold");
		data[12][1]=new String ("cold");
		data[13][1]=new String ("cold");
			
		data[0][2]=new String ("high");
		data[1][2]=new String ("high");
		data[2][2]=new String ("high");
		data[3][2]=new String ("normal");
		data[4][2]=new String ("normal");
		data[5][2]=new String ("normal");
		data[6][2]=new String ("normal");
		data[7][2]=new String ("normal");
		data[8][2]=new String ("normal");
		data[9][2]=new String ("normal");
		data[10][2]=new String ("high");
		data[11][2]=new String ("high");
		data[12][2]=new String ("high");
		data[13][2]=new String ("high");
			
		data[0][3]=new String ("weak");
		data[1][3]=new String ("weak");
		data[2][3]=new String ("weak");
		data[3][3]=new String ("strong");
		data[4][3]=new String ("strong");
		data[5][3]=new String ("strong");
		data[6][3]=new String ("strong");
		data[7][3]=new String ("strong");
		data[8][3]=new String ("strong");
		data[9][3]=new String ("strong");
		data[10][3]=new String ("strong");
		data[11][3]=new String ("strong");
		data[12][3]=new String ("strong");
		data[13][3]=new String ("strong");
			
		data[0][4]=new String ("no");
		data[1][4]=new String ("no");
		data[2][4]=new String ("no");
		data[3][4]=new String ("yes");
		data[4][4]=new String ("yes");
		data[5][4]=new String ("yes");
		data[6][4]=new String ("yes");
		data[7][4]=new String ("yes");
		data[8][4]=new String ("yes");
		data[9][4]=new String ("yes");
		data[10][4]=new String ("yes");
		data[11][4]=new String ("yes");
		data[12][4]=new String ("yes");
		data[13][4]=new String ("yes");*/
        
		//inizializzazione attributeSet creando cinque oggetti di tipo DiscreteAttribute
		attributeSet = new Attribute[5];
		
		String outlookValues[] = new String[3];
		outlookValues[0] = "Sunny";
		outlookValues[1] = "Rain";
		outlookValues[2] = "Overcast";
		attributeSet[0]= new DiscreteAttribute("Outlook", 0, outlookValues);
		
		String temperatureValues[] = new String[3];
		temperatureValues[0] = "Hot";
		temperatureValues[1] = "Mild";
		temperatureValues[2] = "Cold";
		attributeSet[1]= new DiscreteAttribute("Temperature", 1, temperatureValues);
		
		String humidityValues[] = new String[2];
		humidityValues[0] = "Normal";
		humidityValues[1] = "High";
		attributeSet[2]= new DiscreteAttribute("Humidity", 2, humidityValues);
		
		String windValues[] = new String[2];
		windValues[0] = "Weak";
		windValues[1] = "Strong";
		attributeSet[3]= new DiscreteAttribute("Wind", 3, windValues);
		
		String playTennisValues[] = new String[2];
		playTennisValues[0] = "Yes";
		playTennisValues[1] = "No";
		attributeSet[4]= new DiscreteAttribute("PlayTennis", 4, playTennisValues);
		
		//inizializzazione di numberOfExamples
		numberOfExamples = 14;	
	}
	
	int getNumberOfExamples() {
		return numberOfExamples;
	}
	
	int getNumberOfExplanatoryAttributes() {
		return attributeSet.length;
	}
	
	Attribute[] getAttributeSchema() {
		return attributeSet;
	}
	
	Attribute getAttribute(int index) {
		return attributeSet[index];
	}
	
	Object getAttributeValue(int exampleIndex, int attributeIndex) {
		return data[exampleIndex][attributeIndex];
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getNumberOfExplanatoryAttributes(); i++)
			s = s + attributeSet[i].getName() + (i == getNumberOfExplanatoryAttributes() - 1 ? ",\n" : ",");
		for (int i = 0; i < getNumberOfExamples(); i++) {
			s = s + (i + 1) + ":";
			for (int j = 0; j < getNumberOfExplanatoryAttributes(); j++)
				s = s + getAttributeValue(i, j) + (j == getNumberOfExplanatoryAttributes() - 1 ? ",\n" : ",");
		}
		return s;
	}
	
	public static void main(String[] args) {
		Data trySet = new Data();
		System.out.println(trySet);
	}
	
	Tuple getItemSet(int index) {
		Tuple tuple=new Tuple(attributeSet.length);
		for(int i = 0; i < attributeSet.length; i++)
			tuple.add(new DiscreteItem((DiscreteAttribute)attributeSet[i], (String)data[index][i]),i);
		return tuple;
	}
	
	int[] sampling(int k) {
		int centroidIndexes[] =new int[k]; //choose k random different centroids in data.
		Random rand =new Random();
		rand.setSeed(System.currentTimeMillis());
		for (int i = 0; i < k; i++){
			boolean found = false;
			int c;
			do
			{
				found = false;
				c = rand.nextInt(getNumberOfExamples());
				// verify that centroid[c] is not equal to a centroide already stored in CentroidIndexes
				for(int j = 0; j < i; j++)
					if(compare(centroidIndexes[j],c)){
						found = true;
						break;
					}
				}
			while(found);
			centroidIndexes[i] = c;
			}
		return centroidIndexes;
	}
	
	boolean compare(int i, int j) {
		for(int k = 0; k < attributeSet.length; k++)
			if(!data[i][k].equals(data[j][k]))
				return false;
			return true;
	}
	
	Object computePrototype(ArraySet idList, Attribute attribute) {
		return computePrototype(idList, (DiscreteAttribute)attribute);
	}
	
	String computePrototype(ArraySet idList, DiscreteAttribute attribute) {
		int maxF = attribute.frequency(this, idList, attribute.getValue(0));
		int temp;
		
		String computedPrototype = attribute.getValue(0);
		for(int i = 0; i < attribute.getNumberOfDistinctValues(); i++) {
			temp = attribute.frequency(this, idList, attribute.getValue(i));
			if(temp > maxF) {
				maxF = temp;
				computedPrototype = attribute.getValue(i);
			}
		}
		return computedPrototype;		
	}
}
