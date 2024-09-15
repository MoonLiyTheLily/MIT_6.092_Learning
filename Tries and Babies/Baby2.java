public class Baby2 {
    int servings;
    void feed(int servings){
        this.servings = this.servings + this.servings;
        System.out.println(this.servings);
        System.out.println("");
    }
    void poop(){
        System.out.println("All better");
        servings = 0;
        System.out.println(servings);
        System.out.println("");
    }
}
