import java.util.*;
class sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int v[]=new int[a];
int s[]=new int[a];
for(int i=0;i<a;i++)
{
v[i]=sc.nextInt();
s[i]=v[i];
}
Arrays.sort(s);
if(Arrays.equals(v,s))
{
System.out.println("sorted");
}
else
{
System.out.println("not sorted");
}
}
}
