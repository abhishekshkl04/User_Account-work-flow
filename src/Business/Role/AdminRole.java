/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Interface.Admin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Business business) {
         return new AdminWorkAreaJPanel(userProcessContainer, business, account, organization);
    }
    
}
