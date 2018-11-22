package exerciseOneArrays;

public class ExerciseOneArrays {

	public static void main(String[] args) {
		int numarray[] = {10,1,2,3,4,5,6,7,8,9};
		System.out.println(conditionaltwo(numarray[0],numarray[3]));
	}
	public static int conditionaltwo(int c, int d){
		if(c==0 && d!=0) {
		return(d);
			}
		else if(c!=0 && d==0) {
			return(c);
			}
		else {
			return(c+d);
			}
	}
}
