package Statsss;
import java.util.Scanner;
class Statsss
{
	void freqDist()
	{
		//Data Entries

		Scanner s=new Scanner(System.in);
		int data[]=new int[500];
		System.out.print("Enter a limit for your data (up to 500):");
		int lim=s.nextInt();
		for(int i=0;i<lim;i++)
		{
			System.out.print("Enter data entry #"+(i+1)+": ");
			data[i]=s.nextInt();
		}

		//Range & Max & Min

		int max=data[0];
		for(int i=0;i<lim;i++)
		{
			if(data[i]>max)
			{
				max=data[i];
			}
		}
		int min=data[0];
		for(int i=0;i<lim;i++)
		{
			if(data[i]<min)
			{
				min=data[i];
			}
		}
		int range=max-min;
		System.out.println("Max: "+max+"\nMin: "+min+"\nRange is: "+range);
		double LogN=Math.log10(lim);

		//Number of Classes

		double numCld=ceil(1+3.3*LogN);
		System.out.print("Number of Classes are: "+numCld);

		//Intervals
		double inter=ceil(range/numCld);
		System.out.print("Intervals are: "+inter);

		//Frequency Distribution

		System.out.println("Frequency Distribution, no tally marks:");
		int ll=min,ul;
		for(int i=0;i<=numCld;i++)
		{	
			int c=0;
			System.out.print(ll+"-");
			ul=ll+inter-1;
			System.out.println(ul);
			for(int j=0;j<=lim;j++)	
			{
				
				for(int k=ll;k<=ul;k++)
				{
					if(data[j]==k)
						c=c+1;
				}
			}
			System.out.println("Freq: "+c+"\n");
			ll=ul+1;
		}	
	}
}