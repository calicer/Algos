package MasterCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreDataInDataBase implements StoreData{

    @Override
    public void storeData(Data data)  {
        Connection conn = CreateConnection.connectDB();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO TABLE_NAME VALUES (?,?)");
            ps.setInt(1,101);
            if (data != null){
                int length = data.getData().length();
                ps.setObject(2,data,length);
            } else{
                conn.close();
                throw new RuntimeException("Data is null ");
            }
            int i=ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
