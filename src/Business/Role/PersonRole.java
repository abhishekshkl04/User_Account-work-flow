/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Interface.Person.PersonWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class PersonRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Business business) {
        
        return new PersonWorkAreaJPanel(userProcessContainer,account, organization,business);
    }
    
    
    
}
