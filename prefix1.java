import java.util.*; 

public class prefix1
{

 public static void main(String args[])

{
 
Scanner sc=new Scanner(System.in);
 
int n=sc.nextInt();

int v;

String s1[]=new String[n];

 for(v=0;v<n;v++)
 
{
 
s1[v]=sc.next();

}

String v1=" ",ch;

 if(s1.length>0) 

v1=s1[0];

 for(int i=1;i<s1.length;i++)

 {

 ch=s1[i];

 for(v=0;v<Math.min(v1.length(),s1[i].length());v++)

 {

 if(v1.charAt(v)!=ch.charAt(v))

 break;

 }

 v1=s1[i].substring(0,v);

 }

 System.out.println("Longest prefix is:"+v1);
 

}
 }
