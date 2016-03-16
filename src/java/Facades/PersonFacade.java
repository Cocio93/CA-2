package Facades;

import Interfaces.PersonInterface;
import Models.Person;
import java.util.ArrayList;

public class PersonFacade implements PersonInterface {

    @Override
    public void addPerson(Person person) {
        //INSERT INTO Persons (null, firstname, lastname)
        //INSERT INTO Hobbys (null, personID, name, description)
        //INSERT INTO InfoEntities (null, email, ownerID)
        //INSERT INTO Phones (null, number, description, entityID)
        //INSERT INTO Addresses (null, street, add_info, entityID)
        //INSERT INTO CityInfo (addressID, zipCode, city)
        
    }

    @Override
    public Person getPerson(String phone) {
        //SLECT e_id FROM Phones Where number=phone
        //SELET pc_id FROM InfoEntites WHERE id=e_id
        //SELET * FROM Persons WHERE id=pc_id
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void deletePerson(Person person) {
        //DELETE FROM Persons WHERE id=person.getid()
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(Person person) {
        //UPDATE Persons 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Person> getPersons() {
        String query = "SELECT * FROM Persons;";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Person> getPersonsByZip(ArrayList<String> zip) {
        //SELECT a_id FROM CityInfo WHERE zipCode=zip
        //SELECT e_id FROM Addresses WHERE id=a_id
        //SELECT pc_id FROM InfoEntities WHERE id=e_id
        //SELECT * FROM Persons WHERE id=pc_id
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Person> getPersonsWithHobby(ArrayList<String> hobby) {
        //SELECT p_id FROM Hobbys WHERE name=hobby.getName();
        //DO FOLLOWING FOR EVERY entry in ResultSet
        //SELECT * FROM Persons WHERE id=p_id 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
