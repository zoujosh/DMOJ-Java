import java.io.*;
import java.util.*;
public class FavouriteTimes
{
    public static void main (String[] args) throws IOException
    {
        DataInputStream input = new DataInputStream (System.in);
        int[] array = {1, 2, 0, 0};
        int count = 0, divided;
        int shift = Integer.parseInt (input.readLine ());

        if (shift > 720)
        {
            divided = shift / 720;
            count = divided * 31;
            shift = shift % 720;
            for (int x = 1 ; x <= shift ; x++)
            {
                array [3] = array [3] + 1;
                if (array [3] == 10 && array [2] == 5 && array [1] == 2 && array [0] == 1)
                {
                    array [2] = 0;
                    array [3] = 0;
                    array [1] = 1;
                    array [0] = 0;
                }
                if (array [3] == 10)
                {
                    array [3] = 0;
                    array [2] = array [2] + 1;
                }
                if (array [2] == 6)
                {
                    array [2] = 0;
                    array [1] = array [1] + 1;
                }
                if (array [1] == 10)
                {
                    array [1] = 0;
                    array [0] = 1;
                }
                if (array [0] == 1)
                {
                    if (array [3] - array [2] == array [2] - array [1] && array [2] - array [1] == array [1] - array [0])
                    {
                        count++;
                    }
                }
                if (array [0] == 0)
                {
                    if (array [3] - array [2] == array [2] - array [1])
                    {
                        count++;
                    }
                }
            }
        }
        else
        {
            for (int x = 1 ; x <= shift ; x++)
            {
                array [3] = array [3] + 1;
                if (array [3] == 10 && array [2] == 5 && array [1] == 2 && array [0] == 1)
                {
                    array [2] = 0;
                    array [3] = 0;
                    array [1] = 1;
                    array [0] = 0;
                }
                if (array [3] == 10)
                {
                    array [3] = 0;
                    array [2] = array [2] + 1;
                }
                if (array [2] == 6)
                {
                    array [2] = 0;
                    array [1] = array [1] + 1;
                }
                if (array [1] == 10)
                {
                    array [1] = 0;
                    array [0] = 1;
                }
                if (array [0] == 1)
                {
                    if (array [3] - array [2] == array [2] - array [1] && array [2] - array [1] == array [1] - array [0])
                    {
                        count++;
                    }
                }
                if (array [0] == 0)
                {
                    if (array [3] - array [2] == array [2] - array [1])
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println (count);
    } 
}
