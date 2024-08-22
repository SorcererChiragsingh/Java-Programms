//Reading From Keyboard
//
import java.lang.*;
import java.util.*;
import java.util.Scanner;

class KeybRead
{
    public static void main(String[] args)
    {
        Scanner S= new Scanner (System.in);
        String name;
        System.out.println ("May I know Your Name");
        name = S.nextLine();
        System.out.println ("Welcome Mr/Mrs " + name);
        } 
}