package Lab8.Q5.Advanced;

public class AI_Recursion extends AI {
	AI_Recursion(boolean isStepwise, boolean isComment){
		super(isStepwise, isComment);
	}
	
	@Override
	public void hanoi() {
		hanoi(numOfDisc, 0, 2, 1);
	}
	
	public void hanoi(int disc, int src, int dst, int mid) {
		if(disc > 0) {
			hanoi(disc - 1, src, mid, dst);
			makeStep(src, dst);
			hanoi(disc - 1, mid, dst, src);
		}
	}
}
