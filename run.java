package test;
abstract class Shape
{
    protected String name;
    public Shape(String name)
    {
        this.name=name;
        System.out.print("mingcheng:"+name);
    }
    abstract public double getArea();
    abstract public double getLength();

}
class Circle extends Shape
{
    private final double PI=3.14;
    private double radius;
    public Circle(String name,double radius)
    {
        super(name);
        this.radius=radius;
    }


    public double getArea()
    {
        return radius*radius*PI;
    }
    public double getLength()
    {
        return 2*radius*PI;
    }
}
class Rectangle extends Shape
{
    private double weight;
    private double height;
    public Rectangle(String name,double weight,double height)
    {
        super(name);
        this.weight=weight;
        this.height=height;
    }
    public double getArea()
    {
        return weight*height;
    }
    public double getLength()
    {
        return 2*(weight+height);
    }
}
 class run {

   public static void main (String[] args)
   {
       Shape rect=new Rectangle("zhangfangxing",6.5,10.3);
       System.out.print(" ;mianjiwei"+rect.getArea());
       System.out.println(" ;zhouchangwei"+rect.getLength());
       Shape c=new Circle("yuan",10.2);
       System.out.print(" ;mianjiwei"+c.getArea());
       System.out.println(" ;zhouchangwei"+c.getLength());
   }
}

