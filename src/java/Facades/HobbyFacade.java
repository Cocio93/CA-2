package Facades;

import Interfaces.HobbyInterface;
import Models.Hobby;
import Models.Person;
import java.util.ArrayList;

public class HobbyFacade implements HobbyInterface {

    @Override
    public void addHobbyTo(Person person, Hobby hobby) {
        //INSERT INTO Hobbys (null, person.getID(), name, description)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Hobby> getHobbies() {
        //SELECT * FROM Hobbys
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hobby getHobbiesFrom(Person person) {
        //SELECT * FROM Hobbys WHERE p_id=person.getID()
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteHobbyFrom(Person person, Hobby hobby) {
        //DELETE FROM Hobbys WHERE p_id=person.getID() AND name=hobby.getName()
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateHobbyOn(Person person, Hobby hobby) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
