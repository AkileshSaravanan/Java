import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate
{
    public static void main(String args[])
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = "30/08/2023";
        Date date = null;
        try {
            date = sdf.parse(strDate);
            System.out.println(strDate + "\t"+ date);
        } catch (ParseException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}