/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class AdminOrganisation extends Organisation {
    
     public AdminOrganisation() {
        super(Type.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
