package ex01;


class human
{
    String name;
    int age;
    void eat() {
        System.out.println("ate");
    };
    void sleep() {
        System.out.println("slept");
    };
}

class student extends human
{
    int studentID;
    void GoToSchool(){
        System.out.println("went to school");
    };
}

class worker extends human
{
    int workerID;
    void GoToWork(){
        System.out.println("went to work");
    };
}
public class Inheritance
{
    public static void main(String[] args) {
        // create human object
        human h = new human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        // create student object
        student s = new student();
        s.name="김민성";
        s.age = 16;
        s.studentID = 128;
        s.GoToSchool();

        // create worker object
        worker w = new worker();
        w.name ="김민성";
        w.age = 16;
        w.workerID = 128;
        w.GoToWork();
    }
}
