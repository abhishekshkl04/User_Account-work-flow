/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AdminRole;
import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PersonOrganisation extends Organisation {
    
     public PersonOrganisation() {
        super(Organisation.Type.Person.getValue());
    }

    @Override
    public ArrayList<Business.Role.Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roles = new ArrayList<>();
        roles.add(new PersonRole());
        return roles;
    }
    
}
