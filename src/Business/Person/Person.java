/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Abhishek
 */
public class Person {
    
    
   private String name;
    private int id;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
