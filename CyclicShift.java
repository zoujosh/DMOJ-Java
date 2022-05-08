import java.io.*;
import java.util.*;
public class CyclicShift
{
    public static void main (String[] args) throws IOException
    {
        DataInputStream input = new DataInputStream (System.in);

        char hold;
        String code = input.readLine ();
        String shift = input.readLine ();

        char[] characters = new char [shift.length ()];

        for (int x = 0 ; x < shift.length () ; x++)
        {
            characters [x] = shift.charAt (x);
        }

        String[] array = new String [shift.length ()];

        array [0] = shift;

        for (int x = 1 ; x < shift.length () ; x++)
        {
            for (int y = 0 ; y < characters.length - 1 ; y++)
            {
                hold = characters [y];
                characters [y] = characters [y + 1];
                characters [y + 1] = hold;
            }
            array [x] = new String (characters);
        }

        for (int x = 0 ; x <= (code.length () - shift.length ()) ; x++)
        {
            for (int y = 0 ; y < array.length ; y++)
            {
                if (code.substring (x, x + shift.length ()).equals (array[y]))
                {
                    System.out.println("yes");
                    System.exit(0);
                }
            }
        }       
        System.out.println("no");
    } 
} 
