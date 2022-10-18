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

public class Module {
    public String moduleName;
    public String moduleId;
    public String moduleLecturer;
    public ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<CourseProgramme> assossiatedCourses = new ArrayList<CourseProgramme>();
	
    public Module(String moduleName, String moduleId) {
	this.moduleName = moduleName;
	this.moduleId = moduleId;
    }

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleLecturer() {
		return moduleLecturer;
	}

	public void setModuleLecturer(String moduleLecturer) {
		this.moduleLecturer = moduleLecturer;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<CourseProgramme> getAssossiatedCourses() {
		return assossiatedCourses;
	}

	public void setAssossiatedCourses(ArrayList<CourseProgramme> assossiatedCourses) {
		this.assossiatedCourses = assossiatedCourses;
	}

    @Override
    public String toString() {
        return "/nModule{" + "moduleName=" + moduleName + "/n moduleId=" + moduleId + "/n students=" + students + '}';
    }

    
        
        


}
