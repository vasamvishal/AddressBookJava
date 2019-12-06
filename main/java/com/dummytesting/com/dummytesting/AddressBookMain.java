package com.dummytesting.com.dummytesting;

import com.dummytesting.com.AddressBook;
import com.dummytesting.com.AdressBookException;
import com.dummytesting.com.AdressBookPojo;

import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) throws AdressBookException, IOException {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice: \n1.Create a NewFile\n2.See Existing File\n3.Quit");
            System.out.println("Enter the values");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter file Name: ");
                    String path = sc.next();
                    addressBook.openNewFileOfAdressBook(path);
                    break;
                case 2:
                    addressBook.existingFilesOfJson();
                    System.out.println("Enter file Name: ");
                    String fileName = sc.next();
                    String pathfile="/home/user/Documents/jsonFiles/";
                    String pathName=pathfile+fileName+".json";
                    System.out.println(pathName);
                    AddressBook addressBook1 = new AddressBook(fileName);
                    addressBook1.readFromJson(pathName);
                    String status = "true";

                    while (status.equals("true")) {
                        System.out.println("Enter your choice:\n1.ADD Person Details\n2.Edit Person Details\n3.Delete Person Detail\n4.Display Entity\n5.Sort By Name\n6.Sort By Zip\n7.save\n8.Go back to previous menu");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                String SrNo=sc.next();
                                String firstName=sc.next();
                                String lastName=sc.next();
                                String address=sc.next();
                                String city=sc.next();
                                String zip=sc.next();
                                String phonenumber=sc.next();
                                addressBook1.addToAddressBook(SrNo,firstName,lastName,address,city,zip,phonenumber);
                                break;
                            case 2:

                                AdressBookPojo[] adressBookPojos = addressBook1.readFromJson(pathName);
                                addressBook1.printFromJson(adressBookPojos);
                                System.out.println("Enter the Serial number:");
                                String srNo = sc.next();
                                System.out.println("Enter which field to update:");
                                String oldValue = sc.next();
                                System.out.println("Enter value u want to update:");
                                String newValue = sc.next();
                                addressBook1.editInformation(srNo, oldValue, newValue);
                                break;
                            case 3:
                                AdressBookPojo[] adressBookPojos1 = addressBook1.readFromJson(pathName);
                              addressBook1.printFromJson(adressBookPojos1);
                                System.out.println("Enter Serial number to delete:");
                                String srNotoDelete = sc.next();
                                addressBook.deleteInformation(srNotoDelete);
                                break;
                            case 4:
                                AdressBookPojo[] adressBookPojos2 = addressBook1.readFromJson(pathName);
                                addressBook1.printFromJson(adressBookPojos2);
                                break;
                            case 5:
                                addressBook1.sortInformationByLastName();
                                break;
                            case 6:
                                addressBook1.sortInformationByZipCode();
                                break;
                            case 7:
                                addressBook1.writeToJson(pathName);
                                break;
                            case 8:
                                status = "false";
                                break;
                            default:
                                System.out.println("Wrong entries Please enter valid input");
                                break;
                        }
                    }
                case 3:
                    flag=false;
                    break;
            }
        }
    }
}
