import java.util.*;
class fibon
 {
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
 int[] f = new int[v];
 f[0] = 0;
 f[1] = 1;
 for(int i=2; i < v; i++)
{
 f[i] = f[i-1] + f[i-2];
 }
  for(int i=0; i< v; i++)
{
 System.out.print(f[i] + " ");
 }
}
}

         
         
        
