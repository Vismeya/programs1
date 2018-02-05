import java.io.*;
class find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char c=sc.next();
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println("it is an alphabet");
        }
        else
        {
            System.out.println("it is not an alphabet");
        }
    }
}
