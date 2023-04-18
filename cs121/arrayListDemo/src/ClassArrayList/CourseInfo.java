package ClassArrayList;
import java.util.*;

public class CourseInfo {
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<String> cn = new ArrayList<>(); //cn= course name
    ArrayList<Double> gpa = new ArrayList<>();
    //lg=letter grade;
    ArrayList<Character> lg = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);
    }

    public void removeScore(int score) {
        scores.remove(score);
    }

    public int getScores(int index) {
        return scores.get(index);
    }

    public int getSize() {
        return scores.size();
    }

    public void addGpa(Double gp) {
        gpa.add(gp);
    }

    public void removeGpa(Double gp) {
        gpa.remove(gp);
    }

    public void addCourse(String course) {
        cn.add(course);
    }

    public void remCourse(String courses) {
        cn.remove(courses);
    }

    public void addLetter(Character letter) {
        lg.add(letter);
    }

    public void remLetter(Character lets) {
        lg.remove(lets);
    }


    public ArrayList<Integer> getScore() {
        return scores;
    }

    public ArrayList<String> getCn() {
        return cn;
    }

    public ArrayList<Double> getGpa() {
        return gpa;
    }

    public ArrayList<Character> GetLetter() {
        return lg;
    }


    public void setScore(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public void setGpa(ArrayList<Double> gpa) {
        this.gpa = gpa;
    }

    public void setName(ArrayList<String> cn) {
        this.cn = cn;
    }

    public void setLetter(ArrayList<Character> lg) {
        this.lg = lg;
    }
    public void display(){
        System.out.printf("%-7s %-10s %7s  %10s%n","Course Name:", "GPA:","Score: ", "Letter Grade: ");
        for(int i=0; i<cn.size(); i++ ){
            System.out.printf(" %-7s %-10.2f %10d  %10c%n",cn.get(i),gpa.get(i),scores.get(i) ,lg.get(i));
        }
    }
}











    



