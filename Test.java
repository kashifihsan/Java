import java.util.StringTokenizer;


public class Test {

	public static void main(String[] args) {
		
		String example = "Kashif, 1922, true";
		
		StringTokenizer stk = new StringTokenizer(example, ", ");
		
		String string1 = stk.nextToken();
		int birdate = Integer.parseInt(stk.nextToken());
		boolean valid = Boolean.parseBoolean(stk.nextToken());
		
		if (valid){
			System.out.println(string1);
			System.out.println(birdate);
		}
		else
			System.out.println("Invalid String.....");
		

	}

}
