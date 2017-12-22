package Database;

import Model.Doctor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbCredit {
    private Statement aStatement;
    public void addCredit(Doctor aDoctor){
        DbConnection adConnection = DbConnection.getDbConnection();
        try {
            aStatement = adConnection.getStatement();
            String strSQl = 
   "Insert into Medical(name,id,Sick,Room,Special) values('"+
               aDoctor.getName()+"','"+
               aDoctor.getId()+"',"+
               aDoctor.getSick()+"',"+
               aDoctor.getRoom()+"',"+     
                aDoctor.getSpecial();
            aStatement.executeUpdate(strSQl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
     public List<Doctor> getCredit(){
        List<Doctor> credit= new ArrayList<>();
        DbConnection adConnection = DbConnection.getDbConnection();
        String sql = "Select * from students";
        try {
            aStatement = adConnection.getStatement();
            ResultSet rs = aStatement.executeQuery(sql);
            while(rs.next()){
                Doctor aDoctor = new Doctor();
                aDoctor.setName(rs.getString("name"));
                aDoctor.setId(rs.getString("id"));
                aDoctor.setSick(rs.getString("Sick"));
                aDoctor.setRoom(rs.getString("Room"));
                aDoctor.setSpecial(rs.getString("Special"));
                credit.add(aDoctor);                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DbCredit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return credit;
    }
 }