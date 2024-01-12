package com.example.smartesttablayout;

public class UPi_idList_Model {
    String name;
    String upi_id;
    private  String id;

    public UPi_idList_Model() {
    }


    public UPi_idList_Model(String name, String upi_id) {
        this.name = name;
        this.upi_id =upi_id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpi_id() {
        return upi_id;
    }

    public void setUpi_id(String upi_id) {
        this.upi_id = upi_id;
    }
}
