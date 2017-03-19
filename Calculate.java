public class Calculate{
	public static void addInt(String[] args){
		// Addition for integers
		// System.out.println("Calculate...");
		int frst = Integer.valueOf(args[1]);
		int scnd = Integer.valueOf(args[2]);
		int summ = frst + scnd;
		System.out.println("Summ is: " + summ);
	}

	public static void addDouble(String[] args){
		double frstA = Double.valueOf(args[1]);
		double scndA = Double.valueOf(args[2]);
		double summA = frstA + scndA;
		System.out.println("Summ is: " + summA);
	}

	public static void divInt(String[] args){
		// Addition for integers
		// System.out.println("Calculate...");
		int frst = Integer.valueOf(args[1]);
		int scnd = Integer.valueOf(args[2]);
		int summ = frst / scnd;
		System.out.println("Result is: " + summ);
	}

	public static void divDouble(String[] args){
		double frstA = Double.valueOf(args[1]);
		double scndA = Double.valueOf(args[2]);
		double summA = frstA / scndA;
		System.out.println("Result is: " + summA);
	}


	public static void main(String[] args){
		int addIntf = 0;
		int addDoublef = 1;
		int divIntf = 2;
		int divDoublef = 3;

		if (args[0] == 0) addInt();
		if (args[0] == 1) addDouble();
		if (args[0] == 2) divInt();
		else divDouble();
	}
}