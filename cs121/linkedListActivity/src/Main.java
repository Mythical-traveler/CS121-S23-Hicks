public class Main {
    public static void main(String[] args) {
        Student s1=new Student("James","Michael",34834939,"CS","Junior");
        s1.addCourse();
        Student s2=new Student("Isaac","Asimov",1753720,"Writing","Senior");
        Student s3=new Student("George","Orwell",1984,"Cooking","Sophomore");
        s1.addCourse();
        s2.addCourse();
        s3.addCourse();
        s1.displayStudentCourses();
        s1.getStudentInfo();
        s1.removeCourse();
        s1.displayStudentCourses();
        s2.getStudentInfo();
        s3.getStudentInfo();
        s2.removeCourse();
        s3.removeCourse();
        s2.displayStudentCourses();
        s3.displayStudentCourses();



    }
}