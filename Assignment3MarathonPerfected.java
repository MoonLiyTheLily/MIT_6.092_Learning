public class Assignment3MarathonPerfected {
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
        //这个是发现可以用Integer的max值替换找到的best值之后，意识这样就可以实现查找任意排名的方法了，故加个马后炮方法。
        public static int[] anyFinder(int[] Grades , int requiredNo){
            int[] returnObj = new int[2];
            int[] nowReturnObj = new int[2];
            if (requiredNo > Grades.length){
                returnObj[0] = -1;
                returnObj[1] = -1;
                return returnObj;
            }else if(requiredNo == 1 ){
                nowReturnObj = bestFinder(Grades);
            }
            
            else{
                for (int i = 1 ; i < requiredNo ; i++){
                    nowReturnObj = bestFinder(Grades);
                    Grades[ nowReturnObj[1] ] = Integer.MAX_VALUE;
                }
                nowReturnObj = bestFinder(Grades);
            }
            returnObj = nowReturnObj;
            return returnObj;
        }
        public static void main(String[] args) {
            int[] Grades = {202020 , 303030 , 404040 , 191982 , 191982 , 103000};
            int[] rankedGrades = new int[Grades.length];
            for (int i = 1 ; i <= Grades.length ; i++){
                rankedGrades[i-1] = anyFinder(Grades, i)[0]; 
                for(int j = 0 ; j < rankedGrades.length ; j++){
                    System.out.println("Ranked" + j + ":"+ rankedGrades[j]);
                    System.out.println("Original" + j + ":" + Grades[j]);
                }
            }
            for (int i = 0 ; i< rankedGrades.length ; i++){
                int j =i+1;
                System.out.println("Grade No " + j + " is " + rankedGrades[i]);
            }
        }
    }
    //又花去一个晚上想为什么这个会跑出三个无效结果，根本原因是这个anyfinder会把数组元素用Integer.MAX_VALUE覆盖掉
    //我草泥马的，怎么排到no3把两个191982全覆盖掉了，我草泥马
    //No2去一个，no3去两个，no4去三个，6个全是maxvalue，所以4开始就寄了。我已经加了一段输出ranked和original的代码，可以跑跑看。