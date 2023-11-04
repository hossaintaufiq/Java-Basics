
package inheritence;
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    
    public Rectangle(double width,double height, String color, boolean filled){
        this.height=height;
        this.width=width;
        super(color);
        super(filled);
    }
     public double getPerimeter(){
         return 2*(width+height);
     }
     public double getDiameter(){
         
     }
    
}
