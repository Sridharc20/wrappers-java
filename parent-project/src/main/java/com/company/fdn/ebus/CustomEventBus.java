package com.company.fdn.ebus;

public class CustomEventBus {

    public CustomEventBus() {
        System.out.println("Custom Event Bus Intialized..");
    }
    public void publishEvent(Object object){
        System.out.println("Event published successfully.."+object.toString());
    }
}
