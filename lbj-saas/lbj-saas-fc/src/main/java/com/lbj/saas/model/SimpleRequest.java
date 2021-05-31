package com.lbj.saas.model;

/**
 * @Description TODO
 * @Date 2021/5/31 14:25
 * @File SimpleRequest
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class SimpleRequest {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SimpleRequest() {}
    public SimpleRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

