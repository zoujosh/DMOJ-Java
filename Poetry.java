import java.io.*;
public class Poetry
{
    public static void main (String[] args) throws IOException
    {
        DataInputStream input = new DataInputStream (System.in);
        String[] last = new String [4];
        String line;
        int poems;

        poems = Integer.parseInt (input.readLine ());

        for (int w = 1; w <= poems; w++)
        {
            for (int x = 0 ; x <= 3 ; x++)
            {
                line = input.readLine ();
                for (int y = line.length () - 1 ; y >= 0 ; y--)
                {
                    if (line.charAt (y) == 'a' || line.charAt (y) == 'e' || line.charAt (y) == 'i' || line.charAt (y) == 'o' || line.charAt (y) == 'u' || line.charAt (y) == 'A' || line.charAt (y) == 'E' || line.charAt (y) == 'I' || line.charAt (y) == 'O' || line.charAt (y) == 'U')
                    {
                        last [x] = line.substring (y, line.length ());
                        break;
                    }
                    if (line.charAt (y) == ' ')
                    {
                        last [x] = line.substring (y + 1, line.length ());
                        break;
                    }
                    if (y == 0)
                    {
                        last[x] = line;
                        break;
                    }
                }
            }
            for (int u = 0 ; u <= 3; u++)
            {
                last[u] = last[u].toLowerCase();
            }
            if (last [0].equals (last [2]) && last [1].equals (last [3]) && !last[0].equals(last[1]) && !last[0].equals(last[3]) && !last[2].equals(last[3]) && !last[2].equals(last[1]))
            {
                System.out.println ("cross");
            }
            else if (last [0].equals (last [1]) && last [2].equals (last [3]) && !last[0].equals(last[2]) && !last[0].equals(last[3]) && !last[1].equals(last[3]) && !last[1].equals(last[2]))
            {
                System.out.println ("even");
            }
            else if (last [0].equals (last [1]) && last [0].equals (last [2]) && last [0].equals (last [3]) && last [1].equals (last [2]) && last [1].equals (last [3]) && last [2].equals (last [3]))
            {
                System.out.println ("perfect");
            }
            else if (last [0].equals (last [3]) && last [1].equals (last [2]) && !last [0].equals (last [1]) && !last [3].equals (last [2]))
            {
                System.out.println ("shell");
            }
            else
            {
                System.out.println ("free");
            }
        }
    } 
}
