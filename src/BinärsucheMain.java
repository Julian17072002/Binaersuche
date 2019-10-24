
public class BinärsucheMain {	//Sequenziell
	
		static public int zahlensuche(int zahl, int[] zahlen)	{
			double i = 0.5;
			int z = zahlen[(int)(zahlen.length * i)];
			double f;
			while(z != zahl)	{
				if(z > zahl)	{
					f = -1;
				} else	{
					f = 1;
				}
				i += (i/2) * f;
				z = zahlen[(int)(zahlen.length * i)];
			}
			return (int)(zahlen.length * i);
		}
		
		public static void main(String[] args) {
			int[] zahlen = new int[100];
			for(int i = 0; i < 100; i++)	{
				zahlen[i] = i+1;
			}
			System.out.println(zahlensuche(55, zahlen));	
		}
}

