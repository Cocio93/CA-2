package Interfaces;

import Models.Company;
import java.util.ArrayList;

public interface CompanyInterface {
    public void AddCompany(Company company);
    public Company getCompany(String cvr);
    public Company getCompanyByPhone(String phone);
    public ArrayList<Company> getCompanies();
    public ArrayList<Company> getCompaniesByValue(int value);
    public void updateCompany(Company company);
    public void deleteCompany(Company company);
    
}
