import java.util.*;



class test1{
    public static void main(String[] args){
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(12,20);
        Rectangle r3= new Rectangle(9,7);
        r1.getArea();
        System.out.println(r1);
    }
    
    static class Rectangle{
        int length;
        int breadth;
        int peri;
        int area;
        
        Rectangle(){
            length=10;
            breadth=15;
        }
        
        Rectangle(int l, int b){
            length=l;
            breadth=b;
            
        }
        
        int getArea(){
            area=length*breadth;
            System.out.println(area);
            return area;
        }
        
        int getPerimeter(){
            peri=2*(length+breadth);
            System.out.println(peri);
            return peri;
        }
        
        @Override
        public String toString(){
            return "the length is "+length+"the breadth is "+breadth;
        } 
    }
}
