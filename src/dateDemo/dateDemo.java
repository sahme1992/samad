package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString());

	}

}
