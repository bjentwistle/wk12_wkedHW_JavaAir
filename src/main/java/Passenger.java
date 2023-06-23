 public class Passenger {
        private final String  name;
        private int bags;

     public Passenger(String initialName, int bags) {
         this.name = initialName;
         this.bags = bags;
     }

     public String getName(){
         return this.name;
     }
}

