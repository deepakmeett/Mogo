package com.meet.mogo;

import com.google.firebase.firestore.PropertyName;

public class Model_Create_forth {

    private String name,price,deadline,details,deadlineend,itemid,delete;


    public Model_Create_forth(String name, String price, String deadline, String details, String deadlineend, String itemid, String delete) {
        this.name = name;
        this.price = price;
        this.deadline = deadline;
        this.details = details;
        this.deadlineend = deadlineend;

        this.itemid=itemid;
        this.delete=delete;
    }
    public void changetext(String text){
        this.name=text;
    }

    public Model_Create_forth() {

    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeadlineend() {
        return deadlineend;
    }

    public void setDeadlineend(String deadlineend) {
        this.deadlineend = deadlineend;
    }

}
