public class Baby2 {
    int servings;
    void feed(int servings){
        servings = servings + servings;
        System.out.println(servings);
        System.out.println("");
    }
    void poop(){
        System.out.println("All better");
        servings = 0;
        System.out.println(servings);
        System.out.println("");
    }
}
