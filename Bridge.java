import java.io.*;
import java.util.*;
public class Bridge
{
    public static void main (String[] args) throws IOException
    {
        DataInputStream input = new DataInputStream (System.in);
        int totalWeight, totalCars, total = 0, y = 0;

        totalWeight = Integer.parseInt (input.readLine ());
        totalCars = Integer.parseInt (input.readLine ());

        int[] list = new int [totalCars];

        for (int x = 0 ; x < totalCars ; x++)
        {
            list [x] = Integer.parseInt (input.readLine ());
        }
        
        for (int x = 0 ; x <= 3; x++)
        {
            total = total + list[x];
            if (total <= totalWeight)
            {
                y++;
            }
            else
            {
                break;
            }
        }
        
        if(total > totalWeight)
        {
            System.out.println(y);
        }
        else
        {
            total = 0;
            for (int x = 1; x <= (totalCars - 4); x++)
            {
                total = total + list[x] + list[x + 1] + list[x + 2] + list [x + 3];
                if (total <= totalWeight)
                {   
                    y++;
                    total = 0;
                }
                else
                {
                    break;
                }                
            }
            System.out.println(y);
        }
    } 
}
