public class Main {
    public static void main(String[] args) {
        /** Создайте класс Student для
         представления информации о
         студентах и класс
         StudentManager, который
         будет управлять массивом
         объектов Student. Реализуйте
         методы в StudentManager для
         добавления, поиска по ID,
         обновления и удаления
         данных о студентах.
         Методы примерно такие же
         как в предыдущем задании.**/



        Student student = new Student(1L,"Yryskldi",18);
        Student student1 = new Student(2L,"Talant",18);
        Student student2 = new Student(3L,"Joomart",18);

        Student [] students = {student,student1,student2};
        StudentManager studentManager = new StudentManager(1L);
        studentManager.setStudents(students);
        studentManager.getStudent(2L).getInfo();
    }
}