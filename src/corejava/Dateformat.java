package corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	
	public static Date convertToDate(String receivedDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(receivedDate);
        return date;
    }
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Dateformat.convertToDate("april-07-2020");
		

	}

}
