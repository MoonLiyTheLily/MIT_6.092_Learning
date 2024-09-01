public class Try8 {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"? //答案，s并不是一个指针，此处s被赋值完就完了，后边再对这个数组改动不会涉及s
    }
}
