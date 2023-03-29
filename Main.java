class Main {
  public static void main(String[] args) {
    
    String znak="*";

    for(int i=0; i<10; i++){
      if(i==0 || i==9){
        for(int a=0; a<10; a++){
          System.out.print(" " + znak) ;}
         System.out.println("");
        }
      else{
      for(int a=0; a<10; a++){
        if(a==i){
          System.out.print(" " + znak);}
        else if(a==0 || a==9){
           System.out.print(" " + znak);
        }
        else{
           System.out.print("  ");
        }
        }
       System.out.println("");
      }
      
      }
      
      
     
    }
    
  
  }
