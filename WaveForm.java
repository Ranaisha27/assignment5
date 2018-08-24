import java.util.Scanner;
class Wave
{
public void swap(int arr[],int a,int b)
{
int temp = arr[a];
arr[a] = arr[b];
arr[b] = temp;
}
}
class WaveForm
{
public static void main(String args[])
{
Wave obj= new Wave();
int arr[] =new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter Array:");
for (int i=0; i<10; i++)
arr[i]=sc.nextInt();
for (int i=0; i<10; i+=2)
obj.swap(arr,i,i+1);
for (int i:arr)
System.out.print(i + " ");
}
}