package First.Spring.controller;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter

@Entity
public class Users {
    String fName;
    String lName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Users (){

    }


//    public String getFname() {
//        return fName;
//    }
//
//    public String getLname() {
//        return lName;
//    }
//
//    public void setFname(String fname) {
//        this.fName = fname;
//    }
//
//    public void setLname(String lname) {
//        this.lName = lname;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public long getId() {
//        return id;
//    }

    public Users(String fname,String Lname,long id){
        this.fName = fname;
        this.lName = Lname;
        this.id = id;

    }
}
