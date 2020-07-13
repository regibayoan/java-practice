import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* /Users/RegiBayoan/eclipse-workspace/MySweetProgram
*/
public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner in = new Scanner(new File("/Users/RegiBayoan/eclipse-workspace/MySweetProgram/src/students.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
	}
		for(int i = 0; i < students.size(); i++) {
			System.out.println("Student " + i + ": " + students.get(i));
		}
		in.close();

}
}
