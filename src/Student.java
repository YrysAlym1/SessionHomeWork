public class Student {
    private long id;
    private String name;
    private int age;

    public Student(){}
    public Student(long id,String name, int age ){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getInfo(){
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Age: " + getAge());
    }


}
