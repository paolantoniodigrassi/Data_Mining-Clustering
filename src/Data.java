import java.util.*;

public class Data {
	private Object data[][]; //una matrice nXm di tipo Object dove ogni riga modella una transizione
	private int numberOfExamples; //cardinalità dell'insieme di transazioni (numero di righe in data)
	private Attribute attributeSet[]; //un vettore degli attributi di ciascuna tupla (schema della tabella di dati)
	
	Data(){
		//inizializzazione matrice data con transizioni di esempio
		data = new Object[14][5];
		
		/*data[0][0] = new String ("Sunny");
		data[1][0] =new String ("Sunny");
		data[2][0] =new String ("Overcast");
		data[3][0] =new String ("Rain");
		data[4][0] =new String ("Rain");
		data[5][0] =new String ("Rain");
		data[6][0] =new String ("Overcast");
		data[7][0] =new String ("Sunny");
		data[8][0] = new String("Sunny");
		data[9][0] =new String ("Rain");
		data[10][0] =new String ("Sunny");
		data[11][0] =new String ("Overcast");
		data[12][0] =new String ("Overcast");
		data[13][0] =new String ("Rain");
 
		data[0][1] =new String ("Hot");
		data[1][1] =new String ("Hot");
		data[2][1] = new String ("Hot");
		data[3][1] = new String("Mild");
		data[4][1] = new String("cool");
		data[5][1] = new String("cool");
		data[6][1] = new String("cool");
		data[7][1] = new String("Mild");
		data[8][1] = new String("cool");
		data[9][1] = new String("Mild");
		data[10][1] = new String("Mild");
		data[11][1] = new String("Mild");
		data[12][1] = new String ("Hot");
		data[13][1] = new String("Mild");

		data[0][2] = new String ("High");
		data[1][2] = new String ("High");
		data[2][2] = new String ("High");
		data[3][2] = new String ("High");
		data[4][2] = new String ("Normal");
		data[5][2] = new String ("Normal");
		data[6][2] = new String ("Normal");
		data[7][2] = new String ("High");
		data[8][2] = new String ("Normal");
		data[9][2] = new String ("Normal");
		data[10][2] = new String ("Normal");
		data[11][2] = new String ("High");
		data[12][2] = new String ("Normal");
		data[13][2] = new String ("High");

		data[0][3] = new String ("Weak");
		data[1][3] = new String ("Strong");
		data[2][3] = new String ("Weak");
		data[3][3] = new String ("Weak");
		data[4][3] = new String ("Weak");
		data[5][3] = new String ("Strong");
		data[6][3] = new String ("Strong");
	    data[7][3] = new String ("Weak");
	    data[8][3] = new String ("Weak");
	    data[9][3] = new String ("Weak");
        data[10][3] = new String ("Strong");
        data[11][3] = new String ("Strong");
        data[12][3] = new String ("Weak");
        data[13][3] = new String ("Strong");

        data[0][4] = new String ("No");
        data[1][4] = new String ("No");
        data[2][4] = new String ("Yes");
        data[3][4] = new String ("Yes");
        data[4][4] = new String ("Yes");
        data[5][4] = new String ("No");
        data[6][4] = new String ("Yes");
        data[7][4] = new String ("No");
        data[8][4] = new String ("Yes");
        data[9][4] = new String ("Yes");
        data[10][4] = new String ("Yes");
        data[11][4] = new String ("Yes");
        data[12][4] = new String ("Yes");
        data[13][4] = new String ("No");*/

		
		data[0][0]=new String ("Sunny");
		data[1][0]=new String ("Sunny");
		data[2][0]=new String ("Sunny");
		data[3][0]=new String ("Rain");
		data[4][0]=new String ("Rain");
		data[5][0]=new String ("Rain");
		data[6][0]=new String ("Rain");
		data[7][0]=new String ("Rain");
		data[8][0]=new String ("Rain");
		data[9][0]=new String ("Rain");
		data[10][0]=new String ("Overcast");
		data[11][0]=new String ("Overcast");
		data[12][0]=new String ("Overcast");
		data[13][0]=new String ("Overcast");
		 
		data[0][1]=new String ("Hot");
		data[1][1]=new String ("Hot");
		data[2][1]=new String ("Hot");
		data[3][1]=new String ("Mild");
		data[4][1]=new String ("Mild");
		data[5][1]=new String ("Mild");
		data[6][1]=new String ("Mild");
		data[7][1]=new String ("Mild");
		data[8][1]=new String ("Mild");
		data[9][1]=new String ("Mild");
		data[10][1]=new String ("Cold");
		data[11][1]=new String ("Cold");
		data[12][1]=new String ("Cold");
		data[13][1]=new String ("Cold");
			
		data[0][2]=new String ("High");
		data[1][2]=new String ("High");
		data[2][2]=new String ("High");
		data[3][2]=new String ("Normal");
		data[4][2]=new String ("Normal");
		data[5][2]=new String ("Normal");
		data[6][2]=new String ("Normal");
		data[7][2]=new String ("Normal");
		data[8][2]=new String ("Normal");
		data[9][2]=new String ("Normal");
		data[10][2]=new String ("High");
		data[11][2]=new String ("High");
		data[12][2]=new String ("High");
		data[13][2]=new String ("High");
			
		data[0][3]=new String ("Weak");
		data[1][3]=new String ("Weak");
		data[2][3]=new String ("Weak");
		data[3][3]=new String ("Strong");
		data[4][3]=new String ("Strong");
		data[5][3]=new String ("Strong");
		data[6][3]=new String ("Strong");
		data[7][3]=new String ("Strong");
		data[8][3]=new String ("Strong");
		data[9][3]=new String ("Strong");
		data[10][3]=new String ("Strong");
		data[11][3]=new String ("Strong");
		data[12][3]=new String ("Strong");
		data[13][3]=new String ("Strong");
			
		data[0][4]=new String ("No");
		data[1][4]=new String ("No");
		data[2][4]=new String ("No");
		data[3][4]=new String ("Yes");
		data[4][4]=new String ("Yes");
		data[5][4]=new String ("Yes");
		data[6][4]=new String ("Yes");
		data[7][4]=new String ("Yes");
		data[8][4]=new String ("Yes");
		data[9][4]=new String ("Yes");
		data[10][4]=new String ("Yes");
		data[11][4]=new String ("Yes");
		data[12][4]=new String ("Yes");
		data[13][4]=new String ("Yes");
        
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
		String s = " ";
		for (int i = 0; i < getNumberOfExplanatoryAttributes(); i++)
			s += getAttribute(i) + " ";
		s += "\n";
		for (int i = 0; i < getNumberOfExamples(); i++) {
			s += (i + 1) + ": ";
			for(int j = 0; j < getNumberOfExplanatoryAttributes(); j++)
				s += data[i][j] + ", ";
			s += "\n";
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
		for(int k = 0; k < getNumberOfExplanatoryAttributes(); k++)
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
