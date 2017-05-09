package GonsalvesU2;

import javax.enterprise.inject.Produces;

/**
 * Created by u2 on 04.05.2017.
 */
@qMySQL
public class ConToMySQL implements Connection {

    @Produces @qMySQL @qcountTable
    private int countTable = 2000;

    @Produces @qMySQL @qcountView
    private int countView = 4000;

    @Produces @qMySQL
    private String hostDriver = "jdbc:MySQL";


    public void printBDConnection() {
        System.out.println("printBDConnection - connecting to " + "jdbc:MySQL");
    };

    @Produces @qMySQL @qCountAllObject
    public int countAllObject() {
        return (countTable + countView);};


}
