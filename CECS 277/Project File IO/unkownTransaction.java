import java.util.InputMismatchException;


public class unkownTransaction extends InputMismatchException {
		public unkownTransaction() {
			System.out.println("Category is invalid, please try again");
		}
		
		public String toString() {
			return "unkown transaction";
		}
}
