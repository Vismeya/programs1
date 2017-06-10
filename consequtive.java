import java.util.ArrayList;
import java.util.*;
class consequtive
{
public static void main(String args[])
{
ArrayList<Character> a1=new ArrayList<Character>();
ArrayList<Character> ar1=new ArrayList<Character>();
System.out.print("Enter the number");
Scanner ss=new Scanner(System.in);
int number=ss.nextInt();
String s=String.valueOf(number);
int length=s.length();
if(length%2==0)
{
for(int i=0;i<length;i++)
{
a1.add(s.charAt(i));
}
String[] res=new String[length] ;
int[] res1=new int[length];
for(int i=0;i<length;i++)
{
a1.remove(i);
ar1.addAll(a1);
//System.out.println(ar1);
res[i]=String.join(" ",ar1);
}
int longest=0;
for(int k=0;k<res.length;k++)
{
res1[k]=Integer.parseInt(res[k]);
}
for(int i=0;i<res.length;i++)
{
if(res1[i]>res1[i+1]){
longest=res1[i];
}
}
System.out.print(longest);
}
else
{
System.out.print("Invalid number");
}
}
}



