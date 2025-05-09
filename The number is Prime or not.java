public class NewClass1 {
  public static void main (String[] args){
    
    // check if the number is prime or not
    int num = 99 ; // 2..12 // 2..98
    
    int flag = 123;
    
    for(int i=2;i<=num;i++){
      
      if(num%i==0){
        flag = 666;
        break;
      }      
      
    }
    if(flag==123){
      System.out.println("Prime number");
    }else{
      System.out.println("Not Primne");
     }
   }
 }
