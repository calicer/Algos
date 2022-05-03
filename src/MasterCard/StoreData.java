package MasterCard;

import java.sql.SQLException;

//Interface with abstract method for loose coupling on basis on request by user i.e : file/database
public interface StoreData {
    abstract void storeData(Data data) throws SQLException;
}
