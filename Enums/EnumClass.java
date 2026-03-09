enum Laptop{
    MACBOOK(1500),LEGION(1300),TUF(1250),ANIMAL(1800);
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    
   public int getter(){
     return price;
   }

}
public class EnumClass {
    public static void main(String[] args) {
        for(Laptop lap: Laptop.values()){
            System.out.println(lap+":"+lap.getter());
        }
    }
}
