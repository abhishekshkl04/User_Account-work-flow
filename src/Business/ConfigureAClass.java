/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


//import Business.Employee.Employee;
import Business.Organisation.AdminOrganisation;
import Business.Organisation.Organisation;
import Business.Organisation.PersonOrganisation;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Abhishek
 */
public class ConfigureAClass {
    
   
    
    public static Business configure() {
        
         Business business = Business.create();
        
        AdminOrganisation adminOrganization = new AdminOrganisation();
        business.getOrganisationDirectory().getOrganizationList().add(adminOrganization);
        PersonOrganisation personOrg=new PersonOrganisation();
        business.getOrganisationDirectory().getOrganizationList().add(personOrg);
        Person person = new Person();
        person.setName("Raunak Agarwal");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setPerson(person);
        
        adminOrganization.getPersonDirectory().getPersonList().add(person);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
         System.out.println("IN config"+account.getUsername());
        return business;
    }
    
    
    
}
