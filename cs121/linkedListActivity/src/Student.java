import java.util.*;
public class Student {
    Scanner console=new Scanner(System.in);
    String fName,lName,major,cStanding;
    int gpa,id;
    LinkedList<String>courseList=new LinkedList<>();

    public Student(String fName,String lName,int id,String major, String cStanding)
    {
        this.fName=fName;
        this.lName=lName;
        this.id=id;
        this.major=major;
        this.cStanding=cStanding;
    }
    public void addCourse()
    {
        System.out.println("Enter amount of courses to be added: ");
        int count= console.nextInt();
        for (int i=0;i<count;i++){
            System.out.println("Enter Course: ");
            String course= console.nextLine();
            courseList.add(course);
        }


    }
    public void removeCourse(){
        System.out.println("Enter course to be deleted: ");
        String delString= console.nextLine();
        courseList.remove(delString);
    }
    public void displayStudentCourses(){
        System.out.println(courseList);
    }
    public void getStudentInfo(){
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(id);
        System.out.println(major);
        System.out.println(cStanding);
        System.out.println(gpa);
    }
}
