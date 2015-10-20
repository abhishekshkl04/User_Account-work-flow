/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author Abhishek
 */
public class Business {
    
    
    private static Business business;
    private OrganisationDirectory organisationDirectory;
    // to check only 1 business object is created // singleton
    public static Business create() {
        
        if
                (business == null) {
            business = new Business();
        }
        return business;
    }
    
    private Business() {
        this.organisationDirectory = new OrganisationDirectory();
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }
    
    
    
}
