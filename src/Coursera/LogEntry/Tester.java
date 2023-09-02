/*package Coursera.LogEntry;

import edu.duke.*;
import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }

    public void testLogAnalyzer() {
        LogAnalyzer obiect = new LogAnalyzer();
        obiect.readFile("short-test_log");
        obiect.printAll();
    }

    public void testUniqueIPs(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("short-test_log");
        la.readFile("short-test_log");
        System.out.println("There are " + la.countUniqueIPs()+ " different IPs");
    }
}
*/