package com.cts.vms.model;

public class User {
       private String empid;
       private String firstname;
       private String lastname;
       private int age;
       private String gender;
       private String contact;
       private String email;
       private String password;
       private String branch;
       public String getEmpid() {
              return empid;
       }
       public void setEmpid(String empid) {
              this.empid = empid;
       }
       public String getFirstname() {
              return firstname;
       }
       public void setFirstname(String firstname) {
              this.firstname = firstname;
       }
       public String getLastname() {
              return lastname;
       }
       public void setLastname(String lastname) {
              this.lastname = lastname;
       }
       public int getAge() {
              return age;
       }
       public void setAge(int age) {
              this.age = age;
       }
       public String getGender() {
              return gender;
       }
       public void setGender(String gender) {
              this.gender = gender;
       }
       public String getContact() {
              return contact;
       }
       public void setContact(String contact) {
              this.contact = contact;
       }
       public String getEmail() {
              return email;
       }
       public void setEmail(String email) {
              this.email = email;
       }
       public String getPassword() {
              return password;
       }
       public void setPassword(String password) {
              this.password = password;
       }
       public String getBranch() {
              return branch;
       }
       public void setBranch(String branch) {
              this.branch = branch;
       }
       public User(String empid, String firstname, String lastname, int age, String gender, String contact, String email,
                     String password, String branch) {
              super();
              this.empid = empid;
              this.firstname = firstname;
              this.lastname = lastname;
              this.age = age;
              this.gender = gender;
              this.contact = contact;
              this.email = email;
              this.password = password;
              this.branch = branch;
       }
       public User() {
              super();
       }
       @Override
       public String toString() {
              return "User [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
                           + ", gender=" + gender + ", contact=" + contact + ", email=" + email + ", password=" + password
                           + ", branch=" + branch + "]";
       }
       
       
       

}
