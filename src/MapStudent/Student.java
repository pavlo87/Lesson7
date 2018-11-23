package MapStudent;

public class Student implements Comparable<Student>  {
    private String name;
    private int age;

    public Student(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo (Student o) {
        int i = this.getAge() - o.getAge();
        return i;

    }
    public String toString(){
        return "Name: "+name +" "+"Age: "+age;
    }
}
