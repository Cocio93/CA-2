package Interfaces;

import Models.Person;
import java.util.ArrayList;

public interface PersonInterface {
    public void addPerson(Person person);
    public Person getPerson(String phone);
    public ArrayList<Person> getPersons();
    public ArrayList<Person> getPersonsByZip(ArrayList<String> names);
    public ArrayList<Person> getPersonsWithHobby(ArrayList<String> hobby);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
    
}
