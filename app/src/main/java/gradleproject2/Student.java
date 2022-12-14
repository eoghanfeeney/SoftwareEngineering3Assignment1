/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject2;

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
    public ArrayList<String> courses = new ArrayList<String>();
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

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
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

    @Override
    public String toString() {
        return "\n\n Student: \n" + " name = " + name + "\n username = " + getUsername() + "\n courses = " + courses + "\n modules = " + modules;
    }

    
        
    
}