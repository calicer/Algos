package MasterCard;

import java.util.Locale;

public abstract class LoadData {

    //abstract method for loading the data to be implemented by the classes extending LoadData
    abstract Data loadData() throws Exception;

    //common method operation to call operation after data loading happens either from file or db
    public Data operation(Data data){
        String str = data.getData();
        str = str.toUpperCase(Locale.ROOT);
        data.setData(str);
        return data;
    }
}
