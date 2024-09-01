public class Assignment2FooCooperation {
    public static void finalPayment(double basePay , int workHours){
        double finalPay=-1;
        if (basePay<8){
            System.err.println("basePay<8.Error.");
            return;
        }
        if (workHours>40 && workHours<=60){
            finalPay=basePay*40+1.5*basePay*(workHours-40);
        }else if(workHours==40){
            finalPay=basePay*40;
        }else if(workHours<40 && workHours>=0){
            finalPay=basePay*workHours;
        }else{
            System.err.println("workHours="+workHours+".Not Legal");
            return;
        }
        System.out.println("finalPay="+finalPay);
        System.out.println("workHours"+workHours);
    }
    public static void main(String[] arguments){
        finalPayment(7.5, 40);
        finalPayment(8, 45);
        finalPayment(8, 61);
    }
}
