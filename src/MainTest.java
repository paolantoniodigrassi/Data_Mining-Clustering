import data.Data;
import data.OutOfRangeSampleSize;
import mining.KMeansMiner;
import keyboardinput.Keyboard;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KMeansMiner kmeans;
		int numIter;
		Data data =new Data();
		System.out.println(data);
		boolean repeatExecution = true;
		char c;
		do{
			System.out.print("Inserire il numero di k cluster da scoprire: ");
			int k = Keyboard.readInt();
			try {
				kmeans = new KMeansMiner(k);
				numIter = kmeans.kmeans(data);
			} catch (OutOfRangeSampleSize e) {
				System.out.println(e.getMessage());
				continue;
			}
			System.out.println("Numero di Iterazione:" + numIter);
			System.out.println(kmeans.getC().toString(data));

			do{
			System.out.println("Vuoi ripetere l'esecuzione?(y/n)");
			c = Character.toLowerCase(Keyboard.readChar());
			} while (c != 'y' && c != 'n');
			if(c == 'n')
				repeatExecution = false;

		} while (repeatExecution);
		
	}

}
