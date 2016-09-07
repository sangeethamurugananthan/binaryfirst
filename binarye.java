import java.util.*;
class binarye
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Map<String,Integer> mp=HashMap<String,Integer>();
int n=sc.nextInt();
String arr[]=new String[n];
String y[]=new String[n];
String u[]=new String[n];
int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
String h=Integer.toBinaryString(a[j],2);
String o=h.replaceAll("0","");
y[j]=o;
u[j]=o;
}
Arrays.sort(y);
for(int k=y.length-1;k>=0;k--)
{
for(int v=0;v<u.length;v++)
{
if(y[k]==u[v])
System.out.println(a[v]);
}
}
}
}
