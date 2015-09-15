import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class RetirementCalc {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompts User to input Years to work
		System.out.println("Years to Work: ");
		double yrs = input.nextDouble();

		// Prompts user to input Annual Return that is less than 20%
		double anr;
		do {
			System.out.println("Annual Return (between 0 - 0.2): ");
			anr = input.nextDouble();
		} while (anr < 0 || anr > .20);

		// Prompts the user to input Years Retired
		System.out.println("Years Retired: ");
		double yrsr = input.nextDouble();

		// Prompts the user to entire a retirement annual retire that is less
		// than 3%
		double ranr;
		do {
			System.out.println("Annual Return (between 0 - .03): ");
			ranr = input.nextDouble();
		} while (ranr < 0 || ranr > .03);

		// Prompts the user to enter Income required
		System.out.println("Required Income: ");
		double inc = input.nextDouble();

		// Prompts the user to enter a Monthly SSI
		System.out.println("Monthly SSI: ");
		double mssi = input.nextDouble();

		// Calculating PV
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;

		double PV;
		r = (ranr / 12);
		n = yrsr * 12;
		y = inc - mssi;
		f = 0;
		t = false;

		// Displays PV calculation
		PV = mypv(r, n, y, f, t);
		System.out.printf("What you need saved $ %.2f ", PV);

		// Calculating PV
		double PMT;

		r = (anr / 12);
		n = yrs * 12;
		p = 0;
		f = PV;
		t = false;

		// Displays PMT Calculation
		PMT = mypmt(r, n, p, f, t);
		System.out.printf("Save Each Month $ %.2f", PMT);
	}

	public static double mypv(double r, double n, double y, double f, boolean t) {
		return FinanceLib.pv(r, n, y, f, t);
	}

	public static double mypmt(double r, double n, double p, double f, boolean t) {
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
