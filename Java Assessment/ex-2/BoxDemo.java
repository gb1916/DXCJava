class Rectangle
{
   double length; 
   double width; 
   public void setRectangle(double length, double width)
   {
      this.length = length;
      this.width  = width;
   }
 
  
   public double getArea()
   {
      return length * width;
   }
}
class Box extends Rectangle
{
   private double height;  
   public void setBox(double length, double width, double height)
   {
       
      setRectangle(length,width); 
      this.height = height;
   }
 
  
   public double getVolume()
   {
      return getArea() * height;
   }
}
public class BoxDemo
{
   public static void main(String[] args)
   {
      Box room = new Box();

      room.setBox(15, 12, 6);
      
     
      System.out.println("Volume of Rectangle is " + room.getVolume());
   }
}