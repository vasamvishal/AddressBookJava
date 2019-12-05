package com.dummytesting;

import com.dummytesting.com.AddressBook;
import org.junit.Test;

import java.io.IOException;

public class AddressBookTest {
    @Test
    public void AdressBookCreate() throws IOException {
        AddressBook addressBook = new AddressBook();
        addressBook.createNewAdressBook("7","Vishal", "Vasam", "Sai sadguru chs", "Mumbai", "400045", "9090909090");
    }
    @Test
    public void AdressBookEdit() throws IOException {
        AddressBook addressBook = new AddressBook();
        addressBook.editInformation("3","400045","400067");
    }
    @Test
    public void AdressBookDelete() throws IOException {
        AddressBook addressBook = new AddressBook();
        addressBook.deleteInformation("2");
    }
}

