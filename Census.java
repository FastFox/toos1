import java.util.*;

class Census {
	public boolean voting(ArrayList<Voter> voters) {
		int notNullVotes = 0;
		int nullVotes = 0;
		boolean result = true;
		if(voters != null) {
			for(Voter v: voters) {
				if(v != null) {
					if(v.vote() == false) {
						result = false;
					}
					notNullVotes += 1;
				} else {
					nullVotes += 1;
				}
			}
		} else {
			return true;
		}

		if(notNullVotes + nullVotes == voters.size() {
			return result;
		} else {
			return true;
		}
	}
}
