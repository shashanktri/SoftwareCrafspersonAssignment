package sumCalculate;
public class TwoSumCalulator {
	
	public int sumTwoCalulate(String stringNumber) {
		if(stringNumber.length()==0) {
			return 0;
		}
		int sum=0;
		String[] tokens = stringNumber.split("[, ]");

        for (int i = 0; i < tokens.length; i++) {
        	 int number= Integer.parseInt(tokens[i]);
        	 if(number<0) {
        		 
        	 }
        	 sum += number;
        }
        return sum;
	}

}
