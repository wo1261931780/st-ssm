package wo1261931780.stssm.junw.bbb019spring20230108.exception;

/**
 * @author junw
 */
public class System2Exception extends RuntimeException {
	private Integer exceptionCode;

	public System2Exception() {
	}

	public System2Exception(String message, Integer exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
	}

	public System2Exception(String message, Throwable cause, Integer exceptionCode) {
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
