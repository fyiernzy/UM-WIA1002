package Lab8.Q5.Advanced;

public abstract class AI extends TowerOfHanoi {
	protected static final int STEP_DELAY = 1500;
	protected boolean isStepwise;
	protected boolean isComment;
	
	AI(boolean isStepwise, boolean isComment) {
		this.isStepwise = isStepwise;
		this.isComment = isComment;
	}
	
	@Override
	public void play() {
		initialize();
		printTower();
		doStepwise();
		hanoi();
		System.out.println();
	}
	
	protected void callStepDelay() {
		callDelay(STEP_DELAY);
	}
	
	protected void makeStep(int src, int dst) {
		int disc = makeMove(stacks[src], stacks[dst]);
		printTower();
		doComment(disc, src, dst);
		doStepwise();
	}
	
	protected void stepwiseMove() {
		System.out.println("Press any key for next step...");
		sc.nextLine();
	}
	
	protected void doStepwise() {
		if(isStepwise) {
			stepwiseMove();
		} else {
			callStepDelay();
		}
	}
	
	protected void doComment(int disc, int src, int dst) {
		if(isComment) {
			System.out.printf("%s%d : %s --> %s\n", " ".repeat(numOfDisc), disc, RANGE.charAt(src), RANGE.charAt(dst));
		}
	}
	
	abstract void hanoi();
}
