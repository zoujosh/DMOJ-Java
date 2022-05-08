import java.io.*;
import java.util.*;
public class MouseMove
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        String b1 = br.readLine ();
        int[] bounds = new int [2];
        String[] b2 = b1.split (" ");

        for (int x = 0 ; x <= 1 ; x++)
        {
            bounds [x] = Integer.parseInt (b2 [x]);
        }

        int[] motions = new int [2];
        String m1 = br.readLine ();
        String[] m2 = m1.split (" ");

        while (Integer.parseInt (m2 [0]) != 0 || Integer.parseInt (m2 [1]) != 0)
        {
            for (int x = 0 ; x <= 1 ; x++)
            {
                motions [x] = motions [x] + Integer.parseInt (m2 [x]);
            }
            if (motions[0] < 0)
            {
                motions[0] = 0;
            }
            if (motions[1] < 0)
            {
                motions[1] = 0;
            }
            if (motions[0] > bounds[0])
            {
                motions[0] = bounds[0];
            }
            if (motions[1] > bounds[1])
            {
                motions[1] = bounds[1];
            }
            System.out.println(motions[0] + " " + motions[1]);
            m1 = br.readLine ();
            m2 = m1.split (" ");
        }
    } 
}
