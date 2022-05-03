package MasterCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//This class is responsible fot loading data from database by executing queries in plane JDBC
public class LoadDataFromDatabase extends LoadData{

    @Override
    Data loadData() throws Exception {
        Data data = new Data();
        Data operatedData = null;
        try {
            Connection con = CreateConnection.connectDB();
            String sql = "select query";
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String str = rs.getString("");
                data.setData(str);
                operatedData = operation(data);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return operatedData;
    }
}
