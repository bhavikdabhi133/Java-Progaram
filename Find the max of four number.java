public class NewClass1 {
  public static void main (String[] args) {
    
    // find the max of four Number
    int a = 12;
    int b = 13;
    int c = 14;
    int d = 15;
    
    // conditional statement if ans IllegalStateException
    if(a>b && a>c && a>d){
      System.out.println("A is largest");
    }else if(b>c && b>d){
      System.out.println("B is largest");
    }else if(c>d){
      System.out.println("C is largest");
    }else{
      System.out.println("D is largest");
  }
  }

}
