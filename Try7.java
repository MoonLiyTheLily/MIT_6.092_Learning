public class Try7 {
    public static void main(String[] args) {
        int[] values = new int[5];
        values[0] = 12;
        values[4] = 12;
        values[5] = 12;//这个数组其实只有01234这五个元素。这个可以编译，但是会跳运行时的错误。
    }
}
