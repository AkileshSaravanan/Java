//How to SQL Date in java Program
import java.sql.Date;
public class StringToSqlDate
{
    public static void main(String[] args) 
        { 
            String str="2023-08-15";
            Date date=Date.valueOf(str);//converting string into sql date 
            System.out.println(date);
        }
}