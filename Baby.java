public class Baby {
    String name;
    boolean isMale;
    int poopCounter;
    
    void sayHi(){
        System.out.println("Hi,I'm" + name);
    }
    
    void poop(){
        System.out.println("Poop!!!!");
        poopCounter++;
    }
    
    
    
    
    
    Baby(String myname , boolean maleBaby){
        name = myname;
        isMale = maleBaby;
    }
}
