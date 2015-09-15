package ASTParse;

import org.eclipse.jdt.core.dom.CompilationUnit;

public class DemoVisitorTest {

	public DemoVisitorTest(String path) {
		CompilationUnit result = JdtAstUtil.getCompilationUnit(path);

		DemoVisitor visitor = new DemoVisitor();
		result.accept(visitor);
	}
}