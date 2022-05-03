package MasterCard;

public class DataProcessor {

    //returns LoadData of type according to the type of retrieval requested by the user
    public static LoadData process(String type){
        if (type.equalsIgnoreCase("File")){
            return new LoadDataFromFile();
        } else if (type.equalsIgnoreCase("Database")){
            return new LoadDataFromDatabase();
        }
        return null;
    }

    //returns StoreData of type according to the type of storage requested by the user
    public static StoreData store(String type){
        if (type.equalsIgnoreCase("File")){
            return new StoreDataInFile();
        } else if (type.equalsIgnoreCase("Database")){
            return new StoreDataInDataBase();
        }
        return null;
    }
}
