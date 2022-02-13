import java.text.NumberFormat;

public class TestNumberFormate {

	public static void main(String[] args) {
		double d=5678.5678;
		System.out.println("doubled is : "+d);
		NumberFormat nfm=null;
		nfm=NumberFormat.getInstance();
		System.out.println("Formatted as number : "+nfm.format(d));
		nfm.setMaximumIntegerDigits(2);
		nfm.setMaximumFractionDigits(2);
		System.out.println("Formatted as number with max 2 digit for int/frac : "+nfm.format(d));
		nfm=NumberFormat.getCurrencyInstance();
		System.out.println("Formatted as currency : "+nfm.format(d));
	}

}
