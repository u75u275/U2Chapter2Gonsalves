package GonsalvesU2;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import java.util.List;

public class MetaDataBD {

    @Inject @qOracle
    private Connection connection;

    @Inject @qOracle @qcountTable
    private int countTable;

    @Inject @qOracle @qcountView
    private int countView;

    @Inject @qOracle
    private String hostDriver;

    @Inject @qOracle @qCountAllObject
    private int countAllObject;

    public void printDataDB(){
        connection.printBDConnection();
    }
    @Interceptors(DataInterceptor.class)
    public void printDataAll(){
        System.out.println("---------------------------------------------");
        System.out.println("connection = " + connection);
        System.out.println("countAllObject = " + countAllObject);
        System.out.println("countTable = " + countTable);
        System.out.println("countView = " + countView);
        System.out.println("hostDriver = " + hostDriver);
        System.out.println("---------------------------------------------");
    }

    @Inject @producedList
    private List<String> listBD;

    public void printListBD(){
        System.out.println("DB List: ");
        for (String hlp : listBD) { System.out.println(hlp);}
    };
}
