package com.xierenshuren.demokkm.shre;

public class Kus {
     private int id;
     private String  name;
     private Integer id_id;
     public Integer getId_id() {
          return id_id;
     }
     public void setId_id(Integer id_id) {
          this.id_id = id_id;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     private double price;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
     public Kus(){}
     public Kus(int id, String name) {
          this.id = id;
          this.name = name;
     }
}
