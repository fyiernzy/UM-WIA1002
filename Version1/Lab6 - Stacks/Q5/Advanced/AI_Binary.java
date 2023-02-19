package Lab6.Q5.Advanced;

public class AI_Binary extends AI {
	AI_Binary(boolean isStepwise, boolean isComment){
		super(isStepwise, isComment);
	}
	
	@Override
	public void hanoi() {
		int totalMoves = (int) Math.pow(2, numOfDisc) - 1;
		int src, dst;

		for (int i = 1; i <= totalMoves; i++) {
			src = (i - (i & -i)) % 3; //  (i & i - 1) % 3
			dst = (i + (i & -i)) % 3; //  ((i | i - 1) + 1) % 3
			makeStep(src, dst);
		}
	}
}
