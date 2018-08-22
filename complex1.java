class Complex
{
int real,img;
Complex()
{}
Complex(int r,int i)
{
real=r;
img=i;
}
Complex NoComplex(Complex c1)
{
Complex c=new Complex();
c.real=c1.real;
c.img=c1.img;
return c;
}
}
class Display
{
public static void main(String args[])
{
Complex c1=new Complex(4,8);
Complex C3=new Complex();
C3=C3.NoComplex(c1);
System.out.println("complex:" + C3.real +"+i" + C3.img);
}
}
