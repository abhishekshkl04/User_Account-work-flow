/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class OrganisationDirectory {
    
    private ArrayList<Organisation> organizationList;

    public OrganisationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organizationList;
    }
    
    public Organisation createOrganization(Organisation.Type type){
        Organisation organization = null;
        if (type.getValue().equals(Organisation.Type.Person.getValue())){
            organization = new PersonOrganisation();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
