import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //입력받기
        String[][] strArr = new String[20][3];
        //학점
        double totalGrade = 0.0;
        double grade = 0.0;
        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                strArr[i][j] = scan.next();
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i][2].equals("P")) {
                cnt++;
                if(strArr[i][2].equals("A+")) {
                    grade += Double.parseDouble(strArr[i][1]) * 4.5;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("A0")) {
                    grade += Double.parseDouble(strArr[i][1]) *4.0;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("B+")) {
                    grade += Double.parseDouble(strArr[i][1]) *3.5;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("B0")) {
                    grade += Double.parseDouble(strArr[i][1]) *3.0;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("C+")) {
                    grade += Double.parseDouble(strArr[i][1]) *2.5;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("C0")) {
                    grade += Double.parseDouble(strArr[i][1]) *2.0;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("D+")) {
                    grade += Double.parseDouble(strArr[i][1]) *1.5;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else if (strArr[i][2].equals("D0")) {
                    grade += Double.parseDouble(strArr[i][1]) *1.0;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                } else {
                    grade += 0.0;
                    totalGrade+=Double.parseDouble(strArr[i][1]);
                }
                //        d += Double.parseDouble(strArr[i][1]);
            }



        }

        System.out.printf("%.6f", grade / totalGrade);
    }
}