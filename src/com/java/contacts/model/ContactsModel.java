package com.java.contacts.model;

import com.java.contacts.controller.ContactObserver;

import java.util.ArrayList;
import java.util.List;

public class ContactsModel {

    private List<ContactObserver> contactObservers = new ArrayList<>();
    private List<Contact> contactList;
    private ContactListTableModel contactListTableModel;

    public ContactsModel() {
        contactList = new ArrayList<>();
        init();
    }

    private void init() {
        Phone tel = new MobilePhone("0723456789");
        Contact a1 = new Contact("Ion", "Popescu", "1780909322231", tel);
        Contact a2 = new Contact("Dan", "Antonescu", "1881109322231", tel);
        Contact a3 = new Contact("Mihai", "Moraru", "1940315322231", tel);

        contactList.add(a1);
        contactList.add(a2);
        contactList.add(a3);

        contactListTableModel = new ContactListTableModel(contactList);
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        contactListTableModel.abonatAdded();
        notifyAbonatObservers();
    }

    public List<Contact> getContactList() {
        return contactList;
    }


    public void registerObserver(ContactObserver contactObserver) {
        contactObservers.add(contactObserver);
    }

    public void removeObserver(ContactObserver contactObserver) {
        if (contactObservers.contains(contactObserver)) {
            contactObservers.remove(contactObserver);
        }
    }

    private void notifyAbonatObservers() {
        for (ContactObserver contactObserver : contactObservers) {
            contactObserver.uppdateContact();
        }
    }

    public ContactListTableModel getContactListTableModel() {
        return contactListTableModel;
    }

    public void removeAbonatEntryAt(int selectedContactPosition) {
        contactList.remove(selectedContactPosition);
        contactListTableModel.abonatRemoved();
        notifyAbonatObservers();

    }
}
