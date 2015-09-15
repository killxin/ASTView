package ASTParse;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;

public class DemoVisitor extends ASTVisitor {
	private int No;

	public DemoVisitor() {
		No = 0;
	}

	private void print(String name) {
		for (int i = 0; i < No; i++)
			System.out.print("  ");
		System.out.println(name);
	}

	@Override
	public void preVisit(ASTNode node) {
		String[] name = node.getClass().getName().split("\\.");
		print(name[5]);
		No++;
	}

	@Override
	public void postVisit(ASTNode node) {
		No--;
	}

}