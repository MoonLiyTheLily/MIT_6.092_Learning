public class Assignment3Marathon {
    public static int[] bestFinder(int[] Grades){
        int[] returnObj = new int[2];
        int nowBestGradeNo=0;
        int nowBestGrade=Grades[0];
        int nowGrade=Grades[0];
        for (int i = 0 ; i < Grades.length ; i++){
            
            nowGrade = Grades[i];
            if (nowGrade < nowBestGrade){
                nowBestGrade = nowGrade;
                nowBestGradeNo = i;
            }else{
                continue;
            }

        }
        returnObj[0] = nowBestGrade;
        returnObj[1] = nowBestGradeNo;
        return returnObj;
        }
    public static void main(String[] args) {
        int[] bestInfo = new int[2];
        int[] secondBestInfo = new int[2];
        int[] Grades = {202020 , 303030 , 404040 , 191982 , 191982 , 103000};
        bestInfo = bestFinder(Grades);
        Grades[ bestInfo[1] ] = Integer.MAX_VALUE;
        secondBestInfo = bestFinder(Grades);
        System.out.println("The bestplayer is No." + bestInfo[1] + "time used:" + bestInfo[0]);
        System.out.println("The second bestplayer is No." + secondBestInfo[1] + "time used:" + secondBestInfo[0]);
    }
}
//一点检讨。写得有点乱。