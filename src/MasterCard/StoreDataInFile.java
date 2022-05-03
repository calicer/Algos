package MasterCard;

import java.io.FileWriter;
import java.io.IOException;

public class StoreDataInFile implements StoreData{

    @Override
    public void storeData(Data data) {
        try {
            FileWriter writer = new FileWriter("filename.txt");
            writer.write(data.getData());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
