package javaprograms;
import java.util.Arrays;
import java.util.Collections;

public class reversearray {

	public static void main(String[] args) {
		Integer[] no= {1,5,4,2,3};
		System.out.println(Arrays.toString(no));
		Collections.reverseOrder();
		Arrays.sort(no,Collections.reverseOrder());
		System.out.println(Arrays.toString(no ));
	}

}

