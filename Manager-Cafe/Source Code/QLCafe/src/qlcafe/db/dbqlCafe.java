package qlcafe.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbqlCafe {
    private final String url, user, password;
    private Connection cn = null;
    
    public dbqlCafe(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    public boolean dbConnect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                cn = DriverManager.getConnection(this.url, this.user, this.password);
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean dbDisconnect(){
        try {
            this.cn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ResultSet dbQuery(String strSQL, String nameField){
        try {
            String sql = strSQL;
            if(!nameField.equals("")) sql += " Order By " + nameField;
            return this.cn.createStatement().executeQuery(strSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public int dbQueryInsert(String tbl, Object[] values){
        try {
            int count = values.length;
            String strSQL = "Insert into " + tbl + " values(";
            for (int i = 0; i < count; i++) {
                strSQL += values[i];
                if((i+1) < count) strSQL += ",";
            }
            strSQL += ")";
            return this.cn.createStatement().executeUpdate(strSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
    public int dbQueryUpdate(String tbl, Object[] values, String cdt){
        try {
            int count = values.length;
            String strSQL = "Update " + tbl + " set ";
            for (int i = 0; i < count; i++) {
                strSQL += values[i];
                if((i+1) < count) strSQL += ",";
            }
            strSQL += " Where " + cdt;
            return this.cn.createStatement().executeUpdate(strSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }      
    }
    
    public int dbQueryDelete(String tbl, String cdt){
        try {
            String strSQL = "Delete From " + tbl + " Where " + cdt;
            return this.cn.createStatement().executeUpdate(strSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }      
    }
    
}
