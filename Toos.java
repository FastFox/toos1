import java.util.*;

class Toos {
	public static void main(String[] args) {
		Census c = new Census();
	        System.out.println("Hello World!");
	        ArrayList<Voter> voters = new ArrayList();
	        voters.add(new Voter());
		boolean v = c.voting(voters);
		System.out.println("Vote: " + v);	
				

	        /* Voter v1 = new Voter();

	        // v1.vote = false;
	        if(v1.vote() == false) {
	        	System.out.println("False");
	        } else {
	        	System.out.println("True");
	        }
		System.out.println("Voters: " + voters);
		*/
	}
}
