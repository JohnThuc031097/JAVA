package com.thuc.salesdetails.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.thuc.salesdetails.models.*;
import java.util.EnumMap;
import java.util.EnumSet;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class SalesDetails {
        
    private static int doneSERV = 0;
    private static int errorSERV = 0;
    private static int beginSERV = 1;
    private static int endSERV = 1;
    
    public static void main(String[] args) {
        String path = "D:\\THUC\\IT\\WinDSS\\";
        String codeRun = "java -Xmx1g -jar " + path + "tps-to-csv.jar";
        String dateRun = "31122019";
        String dataPath = "Data\\" +dateRun+ "\\SERV";
        
        /*
        for (int i = beginSERV; i <= endSERV; i++) {
            runCMDDecode(i, path, codeRun, dataPath);
        }
        */       
        getRecordsData(path+dataPath+"1","\\INVTSERV.TPS.csv");
    }
    
    private static void runCMDDecode(int index, String path, String codeRun, String dataPath){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ProcessBuilder builder = new ProcessBuilder(
                        "cmd.exe",
                        "/c",
                        codeRun + 
                        " -s " + path + dataPath + index + " " + 
                        "-t " + path + dataPath + index + " " + 
                        " -raw -verbose");
                    builder.redirectErrorStream(true);
                    Process p = builder.start();
                    
                    BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String line;
                    while (true) {
                        line = r.readLine();
                        if (line == null) { break; }
                        //System.out.println(line);
                    }
                    
                    doneSERV++;
                    System.out.println("decode SERV["+index+"] Done !");
                } catch (Exception e) {
                    System.out.println("Error:"+e.getMessage());
                    doneSERV--;
                    System.out.println("decode SERV["+index+"] Error !");
                }finally{
                    if((doneSERV + errorSERV) == ((endSERV - beginSERV)+1)){
                        System.out.println(" ====> Done SERV:" +doneSERV);
                        System.out.println(" ====> Error SERV:" +errorSERV);
                    }
                }
            }
        }).start();
    }
    
    private static void getRecordsData(String path,String nameFile){
        String csvFile = path + nameFile;
        try (Reader reader = new FileReader(csvFile);
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);){
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            
            String till = "";
            int mn1 = 0;
            int mn2 = 0;
            int mn3 = 0;
            for (CSVRecord csvRecord : csvRecords) {
                if(till.isEmpty())
                    till = csvRecord.get(EnumHeader.INVTSERV.TILL.getCode());
                if(!till.equals(csvRecord.get(EnumHeader.INVTSERV.TILL.getCode()))){
                   till = csvRecord.get(EnumHeader.INVTSERV.TILL.getCode()); 
                }else{
                    
                }
            }
        }catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
    }
}
