package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> nameToHeight = new HashMap<>();
		nameToHeight.put("Lucia", 52);
		nameToHeight.put("Ethan", 74);
		nameToHeight.put("Anderson", 75);
		nameToHeight.put("Ina", 67);
		
		System.out.println("Enter a name");
		String something = in.next();

		
		while (!(something.equals("quit"))) {
			int height = nameToHeight.getOrDefault(something, -1);
			
			if (height == -1){
				System.out.println("Please enter a valid name.");
			}
			else {
				System.out.println(nameToHeight.get(something));
			}
			System.out.println("Enter a name");
			something = in.next();
		}
	}
}
