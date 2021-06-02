import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int t = inp.nextInt();
					  for (int j=0;j<t;j++){
						  int n = inp.nextInt();
						  int [] arr = new int[n];
						  for (int i=0;i<n;i++){
							  arr[i] = inp.nextInt();
						  }
						  long high = Long.MIN_VALUE;
						  long sum = 0;
						  for (int i=0;i<n;i++){
							  sum+=arr[i];
							  high = Math.max(high,sum);
							  if (sum<0){
								  sum = 0;
							  }
						  }
						  System.out.println(high);
					  }
	}
}
