import java.util.Arrays;

public class StudentManager{
    private long id;
    private Student [] students;
    private int studentCount;

    public StudentManager(){}
    public StudentManager(long id){
        this.id = id;
        this.students = new Student[100];
        this.studentCount = 0;
    }
    public Student [] getStudents(){
        return students;
    }
    public void setStudents(Student [] students){
        this.students = students;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public void addStudent(Student newStudent){
        students[studentCount ++] = newStudent;
    }
    public Student getStudent(long id){
        for (Student student : students) {
            if(student.getId() != id){
                return student;
            }
        }
        return null;
    }
    public void updateStudent(long id,Student student){
        for (Student student1 : students) {
            if(student1.getId() == id){
                student1 = student;
                System.out.println("Successfully updated!");
            }
        }
    }
    public void deleteStudent(long id){
        for (int i = 0; i < studentCount; i++) {
            if(students[i].getId() == id){
                for (int j = 0; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount --;
                System.out.println("Delete!");
                break;
            }

        }
    }
}
