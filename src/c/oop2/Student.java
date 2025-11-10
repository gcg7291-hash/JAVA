package c.oop2;

public class Student {

    // 캡슐화
    private String name;
    private int score;

    private static int totalStudent = 0;
    private static int totalScore = 0;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        totalStudent++;
        totalScore += score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    public static int getTotalStudent() {
        return totalStudent;
    }


    public static double getAveragesScore() {
        return (double) totalScore  / totalStudent;
    }


}
