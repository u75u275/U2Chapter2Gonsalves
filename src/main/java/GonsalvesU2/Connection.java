package GonsalvesU2;

/**
 * Created by u2 on 04.05.2017.
 */
interface Connection {
    public int countTable = 0;
    public int countView = 0;
    String hostDriver ="";
    // просто печатаем к какой БД подключились
    void printBDConnection();
    //считаем на основании полей countTable + countView (см.ниже)
    int countAllObject();
}
