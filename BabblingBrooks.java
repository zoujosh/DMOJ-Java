import java.io.*;
import java.lang.Math;
import java.util.ArrayList;

public class BabblingBrooks {
	public static void main (String[] args) throws IOException
	{
		DataInputStream input = new DataInputStream (System.in);
		
		int command, chosenStream, percentLeft, total, hold1 = 0, hold2 = 0;
		ArrayList<Integer> streams = new ArrayList<Integer>();
		//Get total streams
		total = Integer.parseInt(input.readLine());		
		
		//Add total stream values to array list
		for (int x = 0; x < total; x++)
		{
			streams.add(Integer.parseInt(input.readLine()));
		}
		
		//Get the first command of 99 88 or 77.
		command = Integer.parseInt(input.readLine());
		
		while (command != 77)
		{
			if (command == 99)
			{
				chosenStream = Integer.parseInt(input.readLine());
				percentLeft = Integer.parseInt(input.readLine());
				hold1 = hold1 + streams.get(chosenStream - 1);
				streams.set(chosenStream - 1, Math.round((hold1*(percentLeft/100.0f))));
				streams.add(chosenStream, hold1 - Math.round((hold1*(percentLeft/100.0f))));
				hold1 = 0;
			}
			if (command == 88)
			{
				chosenStream = Integer.parseInt(input.readLine());
				hold1 = hold1 + streams.get(chosenStream - 1);
				hold2 = hold2 + streams.get(chosenStream);
				streams.set(chosenStream - 1, hold1 + hold2);
				streams.remove(chosenStream);
				hold1 = 0;
				hold2 = 0;
			}
			command = Integer.parseInt(input.readLine());
		}
		
		for (int y = 0; y < streams.size(); y++)
		{
			System.out.print(streams.get(y) + " ");
		}
	}
}
