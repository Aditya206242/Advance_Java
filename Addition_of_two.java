/**
 * InnerAddition_of_two
 */

 
 // explampe of no return type funtion 
class Addition{
   int a= 5;
   int b = 6;
   int c ;
   
   void add(){
      c = a+b;
      System.out.println("Addtion:  "+c);
      
   }

    
}

/**
 
 */

 // example of return type funtion 
class Subtract{
   int a = 5;
   int b = 2;
   int c ;
   int sub(){
      c = a-b ;
      return c;




   }

   
}

// example of argument with return type
class Multiply{
   int Mult(int a,int b){
      int c= a*b;
      return c;
   }
}
// example of argument with no return type
class Plus{
   void plus(int a ,int b,int c){
      int d = a+b+c;
      System.out.println("plus is "+d);
   }

}
public class Addition_of_two {
     /**
      * InnerAddition_of_two
      */
     public static void main(String[] args){
        Addition a = new Addition();
        a.add();

        Subtract s=new Subtract();
        int subts = s.sub();
        System.out.println("subtraction : "+subts);

        Multiply m= new Multiply();
        int multi = m.Mult(5,5);
        System.out.println("multiply: "+multi);
        
        Plus p = new Plus();
        p.plus(5,5,10);

     }
    
}
