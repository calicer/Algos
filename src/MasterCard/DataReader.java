package MasterCard;

public class DataReader {

    private static DataProcessor dataProcessor;

    public static void main(String[] args) {
        //Abstract Design pattern used to dynamically choose the method of file loading and storing
        LoadData dataType = dataProcessor.process("file");
        StoreData storeData = dataProcessor.store("file");
        try {
            Data data = dataType.loadData();
            storeData.storeData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
