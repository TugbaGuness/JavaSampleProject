package day_replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class C02_List{
	
	public static void main(String[] args) {
		/*Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 * 
		 * 
		 */
		
		
		String []names = {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		List<String>newNames= Arrays.asList(names);
		newNames.set(2, "Furkan");
		newNames.set(7, "Kemal");
		System.out.println(newNames);
		
		
		System.out.print("[");
		for (int i = 0; i < newNames.size()-1; i++) {
			System.out.print(newNames.get(i)+"," );
			
		}
		System.out.print(newNames.get(newNames.size()-1)+ "]");
		
		
		
		
		
			 
		}
		}
		




