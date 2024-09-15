import java.util.Scanner;

public class Shouhuoji {
    private int hang;
    private int lie;
    private int shendu;
    Huowu[][][] huowuList = new Huowu[hang][lie][shendu];

    void insertingCoins(int x, int y) {
        int index = 0;
        int returnCoin;
        if (huowuList[x][y][index] == null) {
            System.err.println("Empty Channel.Quit.");
        } else {
            Huowu a = huowuList[x][y][index];
            int insertedCoinValue = 0;
            Scanner sc1 = new Scanner(System.in);

            for (int i = 0; i >= a.getPrice(); i++) {
                System.out.println("投入硬币（输入整数1、2或5）:");
                insertedCoinValue += sc1.nextInt();

                if (insertedCoinValue >= a.getPrice()) {
                    System.out.println("投币完成。货物已经购买");
                    returnCoin = insertedCoinValue - a.getPrice();
                    System.out.println("找零:" + returnCoin);
                    huowuList[x][y] = null;
                } else {

                }
            }
            sc1.close();
        }
    }

    int buySomething() {
        int x;
        int y;
        int index = 0;

        System.out.println("Buy which? Input x y:");
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();
        y = sc1.nextInt();
        sc1.close();
        System.out.println("Buying:" + x + " " + y + " " + "Which named:" + huowuList[x - 1][y - 1][index].getName());
        insertingCoins(x, y);
        return 0;
    }

    int addItem() {
        int x;
        int y;
        int index = 0;
        Huowu a;
        String huowuName1;
        int huowuPrice1;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Add to What?Input x y.");
        x = sc1.nextInt();
        y = sc1.nextInt();
        System.out.println("Adding to " + x + " " + y);

        for (int i = 0; i < shendu; i++) {
            if (huowuList[x][y][i] == null) {
                index = i;
                break;
            }else if( i == shendu-1 && huowuList[x][y][i]==null ){
                System.err.println("Full x,y!");
                return -1;
            }else{
                continue;
            }
        }

        return 0;
    }

    Shouhuoji(int a, int b, int c) {
        hang = a;
        lie = b;
        shendu = c;
    }
}
