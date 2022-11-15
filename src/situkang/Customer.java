/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;
/**
 *
 * @author user
 */
public class Customer {
    private int id;
    private String name;
    private int phone_number;
    private String address;
    private String sex;
    private int age;
    private Worker[] order = new Worker[25];
    private int numberOfOrder = 0;
    private double bill = 0;
    

    public Customer(int id, String name, int phone_number, String address, String sex, int age) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

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

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public Worker[] getOrder() {
        return order;
    }

    public double getBill() {
        return bill;
    }
    
    public void booking(Worker worker) {
        this.order[this.numberOfOrder] = worker;
        this.numberOfOrder++;
    }
    
    public void searching() {
        
    }
    
    public void setBill() {
        double b = 0;
        for (int i = 0; i < this.numberOfOrder; i++) {
            Worker w = this.order[i];
            for (int j = 0; j < w.getNumberOfWork(); j++) {
                if (w.getWork_list()[j].getId() == id) {
                    b += w.getWork_list()[j].getFees();
                }
            }
        }
        
        this.bill = b;
    }
}
