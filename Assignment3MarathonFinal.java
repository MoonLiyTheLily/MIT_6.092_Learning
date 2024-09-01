public class Assignment3MarathonFinal {
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
    
    
    
    public static int[] anyRanker(int[] originalGrades){
        
        
        int[] opGrades = new int[ originalGrades.length ];
        int[] rankedGrades = new int[ originalGrades.length ];
        int[] recvObj = new int[2];
        
        
        for(int i = 0 ; i < originalGrades.length ; i++){
            opGrades[ i ] = originalGrades[ i ];
        }//把原来的数组复制到操作数组
        
        
        for(int i = 0 ; i < originalGrades.length ; i++){
            recvObj = bestFinder(opGrades);
            rankedGrades[i] = recvObj[0];
            opGrades[ recvObj[1] ] = Integer.MAX_VALUE;
        }


        return rankedGrades;
    }
    
    
    
    public static void main(String[] args) {
        int[] Grades = { 19900 , 19900 , 152191 , 441111 , 163191 , 441111 , 9 , 261 , 1511};
        int[] rankedGrades = new int[ Grades.length ];
        rankedGrades = anyRanker(Grades);
        for (int i = 0 ; i < Grades.length ; i++){
            int j = i + 1;
            System.out.println("Grades No." + j + " is " + Grades[ i ]);
        }
        for (int i = 0 ; i < Grades.length ; i++){
            int j = i + 1;
            System.out.println("rankedGrades No." + j + " is " + rankedGrades[ i ]);
        }
    }
}
