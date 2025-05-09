package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;


   private List<Contact> myContacts = new ArrayList<>();

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }


    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
                return false;
            }else{
                myContacts.add(contact);
                return true;
            }
        }


        public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){
                myContacts.remove(oldContact);
                myContacts.add(newContact);
                return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
                myContacts.remove(contact);
                return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                return i;
            }
        }
        return -1;
    }
    public int findContact(String contact) {
        if (contact == null || contact.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < myContacts.size(); i++) {
            Contact currentContact = myContacts.get(i);

            if (currentContact.getName().equals(contact) || currentContact.getPhoneNumber().equals(contact)) {
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String contact){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContact(){
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println(myContacts.get(i).getName());
        }
    }



}
