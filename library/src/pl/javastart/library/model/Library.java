package pl.javastart.library.model;

import pl.javastart.library.exception.PublicationAlreadyExistsException;
import pl.javastart.library.exception.UserAlreadyExistsException;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable
{
    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public void addPublication(Publication publication)
    {
        if(publications.containsKey(publication.getTitle()))
            throw new PublicationAlreadyExistsException("Publikacja ze wskazanym tytułem już istnieje " + publication.getTitle());
        publications.put(publication.getTitle(), publication);
    }

    public void addUser(LibraryUser user){
        if(users.containsKey(user.getPesel()))
            throw new UserAlreadyExistsException("Użytkownik ze wskazanym peselm już istnieje " + user.getPesel());
        users.put(user.getPesel(), user);
    }

    public boolean removePublication(Publication publication){
        if(publications.containsValue(publication)){
            publications.remove(publication.getTitle());
            return true;
        } else {
            return false;
        }
    }
}
