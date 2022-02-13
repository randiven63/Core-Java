import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import static java.util.Locale.*;
import static java.text.DateFormat.*;
public class TestDifferentLocales {

	public static void main(String[] args) {
		Date now=new Date();
		double d=5678.5678;
		System.out.println("Date is : "+now);
		DateFormat dfm=null;
		NumberFormat nfm=null;
		Locale[] locales= {UK,FRANCE,GERMANY,ITALY,US};
		int[] styles= {SHORT,MEDIUM,LONG,FULL};
		String[] styleDesc= {"SHORT","MEDIUM","LONG","FULL"};
		for(Locale locale:locales)
		{
			System.out.println("Formatted Displays for country : "+locale.getDisplayCountry());
			nfm=NumberFormat.getInstance(locale);
			System.out.println("Formatted Number : "+nfm.format(d));
			nfm=NumberFormat.getCurrencyInstance(locale);
			System.out.println("Formatted Currency : "+nfm.format(d));
			for(int i=0;i<styles.length;i++)
			{
				dfm=DateFormat.getDateInstance(styles[i],locale);
				System.out.println("Style Desc : "+styleDesc[i]+" : Date is : "+dfm.format(now));
				dfm=DateFormat.getTimeInstance(styles[i],locale);
				System.out.println(" Date is : "+dfm.format(now));
		
			}
		}
	}

}
