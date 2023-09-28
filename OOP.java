import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/**
 * OOP
 */
/**
 * OOP
 */
public class OOP {

public static void main(String[] args) {
    Employee Tom = new Employee();
    Tom.setName("Tom");
    Tom.setAge(24);
    Tom.setPosition("UX/UI");
    Tom.setEmpID("0001");
    Project webA = new Project("WebA","Develloping a web application");
    Tom.addProject(webA);
    Tom.showDetails();
    
}  
}    

  

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}
interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}
class Employee implements Person ,Job {
    private String Name;
    private int Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> Myproject;

public void showDetails(){
    System.out.println("Name : " + Name);
    System.out.println("Age : " + this.Age);
    System.out.println("Position : " + this.Position);
    System.out.println("EmpID : " + EmpID);
    
    for (Project project : Myproject) {project.getProject();
        
    }
}

Employee(){
    this.Myproject = new ArrayList<Project>();
    
}
public void addProject(Project project) {
    this.Myproject.add(project);
}


    
public String getName() {
    return Name;
    }
    
public void setName(String name) {
    this.Name = name;
    }
    
public int getAge() {
    return Age;
}

public void setAge(int age) {
    this.Age = age;
}

public String getPosition() {
    return Position;
}

public void setPosition(String position) {
    this.Position = position;
}

public String getEmpID(){
    return EmpID;
}

public void setEmpID(String empID) {
    this.EmpID = empID;
}

}


class Project  {
    private String projectName;
    private String Description;

    Project(String projectName ,
    String Description){
        this.projectName= projectName;this.Description=Description;
    }
    public void getProject(){
System.out.println(this.projectName+this.Description);
    }
}

