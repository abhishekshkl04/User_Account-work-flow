/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

//import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PersonDirectory {
    
     private ArrayList<Person> personList;

    public PersonDirectory() {
        personList=new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public Person createEmployee(String name){
        Person person = new Person();
        person.setName(name);
        personList.add(person);
        return person;
    }
    
}
