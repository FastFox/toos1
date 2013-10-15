import java.util.*;

class Census {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ArrayList<Voter> voters = new ArrayList();
		voters.add(new Voter());
		Voter v1 = new Voter();
		// v1.vote = false;
		if(v1.vote() == false) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		System.out.println("Voters: " + voters);
	}
}
