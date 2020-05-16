package com.company.fdn.ndb;

public class CustomNDB {
    public CustomNDB() {
        System.out.println("Custom NOSQL DB Initialized..");
    }

    public void customStoreInsert(Object object){
        System.out.println("Data stored in db successful: " +object.toString());
    }
    public void customStoreDelete(Object object){
        System.out.println("Data Deleted from db successful: " +object.toString());
    }
}
