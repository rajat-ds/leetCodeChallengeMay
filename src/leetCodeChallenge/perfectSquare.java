package leetCodeChallenge;

public class perfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPerfectSquare(16));

	}
	//here we are using the binary search approach
	public static boolean isPerfectSquare (int num ) {
		long left = 1;
		long right = num;
		while(left<=right) {
			
			long mid = (left+right)/2;
			if(mid*mid==num) {
				return true;
			}
			
			if(mid*mid>num) {
				right = mid -1;
			}else {
				left = mid+1;
			}
			
			
		}
		
		
		return false;
		
	}

}
