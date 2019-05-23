package qlcafe.Test;

import java.sql.ResultSet;
import qlcafe.db.dbqlCafe;
import java.sql.SQLException;

public class QLCafe {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://PC-PC\\SQLEXPRESS:1433;databaseName=qlqcafe";       
        dbqlCafe sqlCafe = new dbqlCafe(url, "johnthuc1997", "johnthuc0310");
        
        if(sqlCafe.dbConnect()){           
            //Test_ViewAll(sqlCafe);
            //Test_Insert(sqlCafe, "005");
            //Test_Update(sqlCafe, "005");
            //Test_Delete(sqlCafe, "005");
            
            sqlCafe.dbDisconnect();
        }
    }
    
    private static void Test_ViewAll(dbqlCafe sqlCafe){
            // View all info table NhanVien
            String strSQL = "Select * From NhanVien";
            ResultSet resultData = sqlCafe.dbQuery(strSQL, "TenNV");            
            if(resultData != null){
                try {
                    // view all info table
                    while(resultData.next()){
                        System.out.println("\n========== " +resultData.getInt(1)+ " =================\n");
                        System.out.println("\t" + resultData.getString(2));
                        System.out.println("\t" + resultData.getString(3));                    
                        System.out.println("\t" + resultData.getString(4));                      
                        System.out.println("\t" + resultData.getString(5));
                    }                   
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }       
    }
    
    private static void Test_Insert(dbqlCafe sqlCafe, String MaNV){
            // Insert info table NhanVien
            int resultRow = sqlCafe.dbQueryInsert("NhanVien", new Object[]{ "'"+MaNV+"'", "N'Văn Hậu'", "N'Nam'", "'1992-05-10'", "N'Hóc Môn'"});
            if(resultRow != 0){
                System.out.println("Insert success !");
            }       
    }
 
    private static void Test_Update(dbqlCafe sqlCafe, String MaNV){
            // Update info table NhanVien
            int resultRow = sqlCafe.dbQueryUpdate("NhanVien", new Object[]{ "TenNV=N'Văn Hậu'", "GioiTinh=N'Nữ'", "NgaySinh='1990-05-10'", "DiaChi=N'TP.HCM'"}, "MaNV='"+MaNV+"'");
            if(resultRow != 0){
                System.out.println("Update success !");
            }       
    }
    
    private static void Test_Delete(dbqlCafe sqlCafe, String MaNV){
            // Delete info table NhanVien
            int resultRow = sqlCafe.dbQueryDelete("NhanVien", "MaNV='" +MaNV+ "'");
            if(resultRow != 0){
                System.out.println("Delete success !");
            }          
    }
}
