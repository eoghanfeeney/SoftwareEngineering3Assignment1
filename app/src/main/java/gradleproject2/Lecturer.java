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

public class Lecturer {

    public String name;
    public int age;
    public String DoB;
    public String username;
    public int id;
    public ArrayList<Module> modulesTeaching = new ArrayList<Module>();

    public Lecturer(String name, int age, int id)
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


	public void setDoB(String doB) {
		DoB = doB;
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


	public ArrayList<Module> getModulesTeaching() {
		return modulesTeaching;
	}


	public void setModulesTeaching(ArrayList<Module> modulesTeaching) {
		this.modulesTeaching = modulesTeaching;
	}

	public void addModules(Module module)
    {
    	modulesTeaching.add(module);
    }
	
	

}
