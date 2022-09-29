package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class sumOfnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float> list = new ArrayList<>();
        list.add((float) 5.1);
        list.add((float) 6.2);
        list.add((float) 7.5);
        list.add((float) 10.7);
        list.add((float) 9.8);
        
        
        float sum=0;
     for(float i:list)
    	 sum+=i;
     System.out.println("Sum="+sum);

}
}