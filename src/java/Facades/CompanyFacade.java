package Facades;

import Interfaces.CompanyInterface;
import Models.Company;
import java.util.ArrayList;

public class CompanyFacade implements CompanyInterface {

    @Override
    public void AddCompany(Company company) {
        //INSERT INTO Companies (null, name, description, cvr, numEmpl, marketValue)
        //INSERT INTO InfoEntities (null, email, ownerID)
        //INSERT INTO Phones (null, number, description, entityID)
        //INSERT INTO Addresses (null, street, add_info, entityID)
        //INSERT INTO CityInfo (addressID, zipCode, city)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Company> getCompanies() {
        //SELECT * FROM Companies
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Company> getCompaniesByValue(int value) {
        //SELECT * FROM Companies WHERE marketValue>=value
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company getCompany(String cvr) {
        //SELECT * FROM Companies WHERE cvr=cvr
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCompany(Company company) {
        //DELETE FROM Companies WHERE cvr=company.getCvr()
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company getCompanyByPhone(String phone) {
        //SELECT e_id FROM Phones WHERE number=phone
        //SELECT pc_id FROM InfoEntities WHERE id=e_id
        //SELECT * Companies WHERE id=pc_id
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
