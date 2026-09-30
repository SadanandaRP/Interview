
import java.io.*;
import java.lang.*;
import java.util.*;

class Sada
{
    public static void main(String[] args)
    {
        
        String str = "Sadananda";
        Map<Character, Integer> map1 = new HashMap<>();

        for(Character c : str.toCharArray())
        {
            map1.put(c, map1.getOrDefault(c,0) + 1);
        }

            System.out.println(map1);


    }
}


