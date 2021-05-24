package org.sid.GestionProduitBackEnd.exception;


public class  SpringMarketException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpringMarketException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringMarketException(String exMessage) {
        super(exMessage);
    }
}