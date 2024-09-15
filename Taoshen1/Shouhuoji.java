import java.util.Scanner;

public class Shouhuoji {
    private int channel;
    private int depth;
    Huowu[][] huowuList = new Huowu[channel][depth];

    void insertingCoins(int x) {
        int returnCoin;
        if (huowuList[x][0] == null) {
            System.err.println("此通道货物为空。不能购买。");
        } else {
            Huowu a = huowuList[x][0];
            int insertedCoinValue = 0;
            int tempInsertedValue = 0;
            Scanner sc1 = new Scanner(System.in);

            for (int i = 0; i >= a.getPrice(); i++) {
                System.out.println("投入硬币（输入整数1、2或5）:");
                tempInsertedValue = sc1.nextInt();
                if (tempInsertedValue != 1 && tempInsertedValue != 2 && tempInsertedValue != 5) {
                    System.err.println("不能投入除了1，2，5以外的其它面值。请重新投币");
                    System.err.println("上次投币币值：" + tempInsertedValue + "，" + "已投入币值：" + insertedCoinValue);
                } else {

                    if (insertedCoinValue >= a.getPrice()) {
                        System.out.println("投币完成。货物已经购买");
                        returnCoin = insertedCoinValue - a.getPrice();
                        System.out.println("找零:" + returnCoin);
                        huowuList[x][0] = null;
                    } else {

                    }
                }
            }
            sc1.close();
        }
    }

    int buySomething() {
        int x;

        System.out.println("需要购买哪个货物？请输入通道编号：");
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();
        sc1.close();
        if (huowuList[x - 1][0] == null) {
            System.err.println("此处没有货物，请选择另外的货物。");
            return -1;
        } else {
            System.out.println("正在购买：" + x + " " + "名字：" + huowuList[x - 1][0].getName());
            insertingCoins(x);
            for(int i = 0 ; i<depth-1 ; i++){
                if(huowuList[x][i+1] != null){
                huowuList[x][i] = huowuList[x][i+1];
                }else{
                    break;
                }
            }
        }
        return 0;
    }

    int addItem() {
        int x;
        int Num;
        int emptyCounter = 0;
        Huowu a;
        String huowuName1;
        int huowuPrice1;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("需要添加什么货物到哪个通道？请按照“货物名称 通道编号 单价 数量输入”");
        huowuName1 = sc1.next();
        x = sc1.nextInt();
        huowuPrice1 = sc1.nextInt();
        Num = sc1.nextInt();
        sc1.close();

        for (int i = 0; i < depth; i++) {
            if (huowuList[x][i] == null) {
                emptyCounter++;
            } else {
                continue;
            }
        }
        if (Num > emptyCounter) {
            System.err.println("当前通道容量不足。");
            return -1;
        } else {
            System.out.println("正在添加到：" + x + "通道");
            a = new Huowu(huowuName1, huowuPrice1);
            for(int i = depth-emptyCounter ; i<depth ;i++){
                huowuList[x][i]=a;
            }
            System.out.println("货物添加完毕");
        }
        return 0;
    }

    Shouhuoji(int a, int b, int c) {
        channel = a;
        depth = b;
    }
}
