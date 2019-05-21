package com.xierenshuren.demokkm.shre;

public class Kus {
     private int id;
     private String  name;

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
