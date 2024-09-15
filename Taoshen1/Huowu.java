public class Huowu {
    private String huowuName;
    private int huowuPrice;


    String getName(){
        return this.huowuName;
    }
    int getPrice(){
        return this.huowuPrice;
    }

    Huowu(String name , int price){
        huowuName = name;
        huowuPrice = price;
    }
}
