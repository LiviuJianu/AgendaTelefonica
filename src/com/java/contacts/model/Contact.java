package com.java.contacts.model;

public class Contact {

    private String id;
    private String firstName;
    private String lastName;
    private String cnp;
    private Phone phoneNumber;

    public Contact(String contactFirstName, String contactLastName, String contactCNP, Phone contactPhone) {
        this.id = id;
        firstName = contactFirstName;
        lastName = contactLastName;
        cnp = contactCNP;
        phoneNumber = contactPhone;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public Phone getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != null ? !id.equals(contact.id) : contact.id != null) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (cnp != null ? !cnp.equals(contact.cnp) : contact.cnp != null) return false;
        return phoneNumber != null ? phoneNumber.equals(contact.phoneNumber) : contact.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (cnp != null ? cnp.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", cnp=" + getCnp()
                + ", phoneNumber=" + getPhoneNumber() + "]\n";
    }

}