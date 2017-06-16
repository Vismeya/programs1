import java.util.*;
class exist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
int v=sc.nextInt();
int v1[]=new int[v];
for(int i=0;i<v;i++)
{
v1[i]=sc.nextInt();
}
int n1=sc.nextInt();
for(int i=0;i<v;i++)
{
int s=0;
for(int j=0;j<v;j++)
{
s=s+v1[j];
}
if(s==n1)
{
for(int k=i;k<v;k++)
{
System.out.println(v1[k]+"+");
}
System.out.println("= "+s);
}
}
}
}
