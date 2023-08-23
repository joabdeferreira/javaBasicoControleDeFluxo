package contador;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3706261212623639013L;
	
	public ParametrosInvalidosException() {
		super("O segundo parametro deve ser maior que o primeiro");
	}
	

}
