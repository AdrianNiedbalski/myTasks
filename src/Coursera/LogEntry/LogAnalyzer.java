package Coursera.LogEntry;

import java.util.*;
import edu.duke.*;

public class LogAnalyzer {
    private ArrayList<LogEntry> records;
    int index;

    public LogAnalyzer(){
        records = new ArrayList<LogEntry>();
    }

    public void readFile(String filename){
        FileResource fr = new FileResource(filename);
        for(String s : fr.lines()){
            LogEntry entry = WebLogParser.parseEntry(s);
            records.add(entry);
        }
    }

    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }

    public int countUniqueIPs(){
        ArrayList<String> uniqueIps = new ArrayList<String>();
        for(LogEntry le : records){
            String ipAddr = le.getIpAddress();
            if(!uniqueIps.contains(ipAddr)){
                uniqueIps.add(ipAddr);
            }
        }
        return uniqueIps.size();
    }
}

