/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class Worker extends Customer{
    Connection connection;
    private String expertise;
    private double fees;
    private ArrayList<Work> work_list = new ArrayList<>();
    private Customer[] work_order = new Customer[25];
    private int numberOfOrderWorker = 0;
    private int numberOfWork = 0;

    public Worker(int id, String name, String phone_number, String address) {
        super(id, name, phone_number, address);
        this.fees = 0;
        this.expertise = "";
    }

    public Worker(String expertise, double fees, int id, String name, String phone_number, String address) {
        super(id, name, phone_number, address);
        this.expertise = expertise;
        this.fees = fees;
    }
    
    public void startConnection() {
        this.connection = DatabaseConnection.getConnection();
    }

    public ArrayList<Work> getWork_list() {
        return work_list;
    }

    public int getnumberOfOrderWorker() {
        return numberOfOrderWorker;
    }

    public int getNumberOfWork() {
        return numberOfWork;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    
    public void addWorkList(Work w) {
        this.work_list.add(w);
//        int id;
//        double fees;
//        String name;
//        String category;
//        int estimation;
//        String description;
//        String query = "select * from work";
//        try {
//            startConnection();
//            PreparedStatement st = connection.prepareStatement(query);
//            ResultSet rs = st.executeQuery();
//            while(rs.next()){
//                id = rs.getInt(1);
//                fees = rs.getDouble(2);
//                name = rs.getString(3);
//                category = rs.getString(4);
//                estimation = rs.getInt(5);
//                description = rs.getString(6);
//                Work w = new Work(id, fees, name, category, estimation, description);
//                this.work_list.add(w);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
    
    public void accept_book(Customer c) {
        this.work_order[this.numberOfOrderWorker] = c;
        this.numberOfOrderWorker += 1;
    }
    
    public void access_progress() {
        
    }
    
    public void add_bill(int add) {
        this.fees += add;
    }
    
    public double income() {
        double sum = 0;
        
        for (Work i : work_list) {
            sum += i.getFees();
        }
        
        return sum;
    }
    
}
