package tool.compiler.java.visit;

/**
 * C.f <: D{X}
 */
class ReadStaticField extends AbstractReadField {
	
	// C.f
//	??? c;			// C
//	??? f;			// f
//	??? d;			// D
	SetVariable x;	// X
}