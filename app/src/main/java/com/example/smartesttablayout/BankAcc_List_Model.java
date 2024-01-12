package com.example.smartesttablayout;

public class BankAcc_List_Model {
    String name;
    String account;
    String id,ifsc,bankname,branch;

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BankAcc_List_Model() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public BankAcc_List_Model(String name, String account) {
        this.name = name;
        this.account=account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
