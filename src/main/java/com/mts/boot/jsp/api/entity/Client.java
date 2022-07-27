package com.mts.boot.jsp.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "inn")
    public int inn;

    @Column(name = "kpp")
    public int kpp;

    @Column(name = "ogrn")
    public int ogrn;

    @Column(name = "opf")
    public String opf;

    @Column(name = "name")
    public String name;

    @Column(name = "money")
    public Double money;

    @Column(name = "date_pay")
    public String date_pay;

    public Client() {
    }

    public Client(int id, int inn, int kpp, int ogrn, String opf, String name, Double money, String date_pay) {
        this.id = id;
        this.inn = inn;
        this.kpp = kpp;
        this.ogrn = ogrn;
        this.opf = opf;
        this.name = name;
        this.money = money;
        this.date_pay = date_pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getKpp() {
        return kpp;
    }

    public void setKpp(int kpp) {
        this.kpp = kpp;
    }

    public int getOgrn() {
        return ogrn;
    }

    public void setOgrn(int ogrn) {
        this.ogrn = ogrn;
    }

    public String getOpf() {
        return opf;
    }

    public void setOpf(String opf) {
        this.opf = opf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDate_pay() {
        return date_pay;
    }

    public void setDate_pay(String date_pay) {
        this.date_pay = date_pay;
    }
}
