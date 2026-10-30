// 26.10.30 금

package ex01;

// import java.util.Scanner;

/*
 * 1번
 *
 * num,name,kor,eng,mat
 * 번호,이름,국어,영어,수학
 *
 * 1,사나,70,80,90
 * 2,모모,0,70,100
 * 3,쯔위,70,90,100
 * 4,정연,80,90,70
 * 5,원영,90,90,89
 * 6,유진,100,100,100
 */

// 입력: 번호, 이름, 국어, 영어, 수학
// num, name, kor, eng, mat

// 출력: 번호, 이름, 국어, 영어, 수학, 총점, 평균, 등급
// num, name, kor, eng, mat, tot, avg, grade

class Score {

    // Field
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    // 출력: 총점, 평균, 등급
    private int tot;
    private double avg;
    private char grade;

    // Constructor
    public Score() {

    }

    public Score(int num, String name, int kor, int eng, int mat) {
        super();
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;

        /*
        this.tot = 0;
        this.avg = 0.0;
        this.grade = 'F';
        */
    }

    // Getter / Setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    // toString
    @Override
    public String toString() {
        return "Score [num=" + num
                + ", name=" + name
                + ", kor=" + kor
                + ", eng=" + eng
                + ", mat=" + mat
                + ", tot=" + tot
                + ", avg=" + avg
                + ", grade=" + grade + "]";
    }

    // Method
    public int calcTot() {
        tot = kor + eng + mat;
        return tot;
    }
    
    public double calcAvg() {
    	avg=(kor+eng+mat)/3.0;
    	return avg;
    }
}


public class TestScore {
    public static void main(String[] args) {

        Score Score1 = new Score(1, "사나", 70, 80, 90);
        System.out.println(Score1.toString());
        int tot =Score1.calcTot();
        String totStr =String.valueOf(tot);
        System.out.println("총점: " + totStr);
        System.out.println("평균: " + Score1.calcAvg());
        System.out.println("학점: " + Score1.calcGrade());

    }
}