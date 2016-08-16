
public class PermutationTest {

	public void permutation(String str){
		permutation("", str);
	}

	private void permutation(String prefix, String str) {
		if(str.length() == 0)System.out.println(prefix);
		else{
			for(int i = 0; i< str.length(); i++){
				permutation(prefix+str.charAt(i), str.substring(0,i) + str.substring(i+1, str.length()));
			}
		}
	}
	
	public static void main(String[] args) {
		PermutationTest test = new PermutationTest();
		test.permutation("abc");
	}
}
