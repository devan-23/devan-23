abstract class Shapes
{
    abstract void NumberofSides();
}
class Rectangle extends Shapes
{
    void NumberofSides()
    {
    System.out.println("The rectangle has 4 sides");
    }
}
class Triangle extends Shapes
{
    void NumberofSides()
    {
    System.out.println("The triangle has 3 sides");
    }
}
class Square extends Shapes
{
    void NumberofSides()
    {
    System.out.println("The square has 4 sides");
    }
}

class Main
    {
        public static void main(String args[])
        {
         Square s=new Square();
         Triangle t=new Triangle();
         Rectangle r=new Rectangle();
         s.NumberofSides();
         t.NumberofSides();
         r.NumberofSides();
        }
    }
