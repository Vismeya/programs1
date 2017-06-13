import java.io.*;
class array
{
public static void main(String args[])
{
int x=0;
int v[]=new int[args.length/2];
int w[]=new int[args.length/2];
int sum=0,sum1=0;
for(int i=0;i<args.length/2;i++)
{
v[i]=Integer.valueOf(args[x]);
sum=sum+v[i];
x++;
}
for(int j=0;j<args.length;j++)
{
sum1=sum1+w[j];
x++;
}
if(sum==sum1)
{
for(int k=0;k<args.length;k++)
{
System.out.println(v[k]+" ");
}
System.out.println("\n");
for(int b=0;b<args.length/2;b++)
{
System.out.println(w[b]+" ");
}
}
else
{
System.out.println("not possible");
}
}
}
