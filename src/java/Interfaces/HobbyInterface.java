package Interfaces;

import Models.Hobby;
import Models.Person;
import java.util.ArrayList;

public interface HobbyInterface {
    public void addHobbyTo(Person person, Hobby hobby);
    public ArrayList<Hobby> getHobbies();
    public Hobby getHobbiesFrom(Person person);
    public void deleteHobbyFrom(Person person, Hobby hobby);
    public void updateHobbyOn(Person person, Hobby hobby);
}
