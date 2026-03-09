enum Level{
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
   public static void main(String[] args) {
    //1. Acessing & ordinal()
    // Level myvar=Level.MEDIUM;
    // System.out.println(myvar+":"+myvar.ordinal());

    //To access al variables at a time
    // Level l[]=Level.values();
    // for(Level s : l){
    //     System.out.println(s+":"+s.ordinal());
    // }

    //3. Enum with if
    // Level ans=Level.HIGH;

    // if(ans==Level.LOW){
    //     System.out.println("It is less");
    // }
    // else if(ans==Level.MEDIUM){
    //     System.out.println("It is okish");
    // }
    // else if(ans==Level.HIGH){
    //     System.out.println("It is enough");
    // }
    // else{
    //     System.out.println("End");
    // }

    //4. Enum with Switch
    Level s=Level.MEDIUM;

    switch (s) {
        case LOW:
            System.out.println("It is not enough");
            break;
        case MEDIUM:
            System.out.println("It is some what OK");
            break;
        case HIGH:
            System.out.println("It is enough");
            break;
        default:
            System.out.println("DOne");
            break;
    }
   }    
}
