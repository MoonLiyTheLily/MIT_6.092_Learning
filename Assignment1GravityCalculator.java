class Assignment1GravityCalculator{
    public static void main(String[] arguments){
        double x;
        double t=10.0;
        double v0=0.0;
        double a=9.81;
        double x0=0.0;
        x=0.5*a*t*t+x0+v0*t;
        System.out.println("ObjectPosition="+x+",Time="+t+",OriginPosition="+x0+",Velocity0="+v0);
    }
}