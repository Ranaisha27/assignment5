class Rect
{
            int l,b;
}
class AreaofRectangle
{
            public static void main (String args[])
            {
                        int a;
                        Rect rect = new Rect();
                        rect.l=20;
                        rect.b=60;
                        a=rect.l*rect.b;
                        System.out.println("Area of Rectangle is : "+a);
            }
}