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
    public ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    public ArrayList<Module> modules = new ArrayList<Module>();

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

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }
    
    public void addModules(Module module)
    {
    	modules.add(module);
    }
    
    public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

    @Override
    public String toString() {
        return "Student{" + "name=" + name + "/n username=" + username + "/n courses=" + courses + "/n modules=" + modules + '}';
    }
        
    
}