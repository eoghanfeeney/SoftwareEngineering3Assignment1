package gradleproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eoghan
 */
import java.util.ArrayList;

public class Student {

    public String name;
    public int age;
    public String DoB;
    public String username;
    public int id;
    public String course;
    public ArrayList<String> modules = new ArrayList<String>();

	public Student(String name, int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getUsername() {
        return name + age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public void addModules(String module)
    {
    	modules.add(module);
    }
    
    public ArrayList<String> getModules() {
		return modules;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
    
    public static void main(String args[]) {
        // TODO code application logic here
        Student s1 = new Student("pablo", 10, 981);
        s1.addModules("math");
        s1.addModules("English");
        System.out.println(s1.getUsername());
        System.out.println(s1.getModules());
    }
}