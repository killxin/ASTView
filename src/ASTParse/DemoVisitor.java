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

	/*
	 * private int No;
	 * 
	 * public DemoVisitor() { No = 0; }
	 * 
	 * @Override public boolean visit(FieldDeclaration node) { for (Object obj :
	 * node.fragments()) { VariableDeclarationFragment v =
	 * (VariableDeclarationFragment) obj; System.out.println("No." + No +
	 * " Field:\t" + v.getName()); No++; }
	 * 
	 * return true; }
	 * 
	 * @Override public boolean visit(MethodDeclaration node) {
	 * System.out.println("No." + No + " Method:\t" + node.getName()); No++;
	 * return true; }
	 * 
	 * @Override public boolean visit(TypeDeclaration node) {
	 * System.out.println("No." + No + " Class:\t" + node.getName()); No++;
	 * return true; }
	 */
}