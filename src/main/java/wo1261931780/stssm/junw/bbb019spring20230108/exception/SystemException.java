package wo1261931780.stssm.junw.bbb019spring20230108.exception;

/**
 * @author junw
 */
public class SystemException extends RuntimeException {
	private Integer exceptionCode;

	public SystemException() {
	}

	public SystemException(String message, Integer exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
	}

	public SystemException(String message, Throwable cause, Integer exceptionCode) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
}
