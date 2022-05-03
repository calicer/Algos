package MasterCard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//This class is responsible fot loading data from file
public class LoadDataFromFile extends LoadData{
    
    //can be read fom property file
    private String location;
    
    @Override
    public Data loadData() throws IOException {
        File file = new File(location);
        String sbToString;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            StringBuilder str = new StringBuilder();
            String newLine = br.readLine();

            while (newLine != null){
                str.append(newLine);
                str.append(System.lineSeparator());
                newLine = br.readLine();
            }
            sbToString = str.toString();
        }
        Data data = new Data(sbToString);
        Data operatedData = operation(data);
        return operatedData;
    }

}
