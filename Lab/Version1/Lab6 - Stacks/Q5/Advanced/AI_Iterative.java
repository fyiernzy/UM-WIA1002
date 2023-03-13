package Lab6.Q5.Advanced;

import java.util.Stack;

public class AI_Iterative extends AI {
	AI_Iterative(boolean isStepwise, boolean isComment){
		super(isStepwise, isComment);
	}
	
	@Override
	public void hanoi() {		
		int totalMoves = (int) Math.pow(2, numOfDisc) - 1;
		int[][] odd = {{1, 2}, {0, 2}, {0, 1}};
		int[][] even = {{1, 2}, {0, 1}, {0, 2}};
		int[][] moves = (numOfDisc % 2 == 1 ? odd : even);

		for (int i = 1; i <= totalMoves; i++) {
			int move = i % 3;
			int src = moves[move][0], dst = moves[move][1];
			makeStep(src, dst);
		}
	}

	@Override
	public int makeMove(Stack<Integer> src, Stack<Integer> dst) {
		if (isValidMove(src, dst))
			return super.makeMove(src, dst);
		else
			return super.makeMove(dst, src);
	}
	
	public static void main(String[] args) {
		
	}
}
