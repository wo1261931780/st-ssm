package wo1261931780.stssm.junw.bbb018spring20230106.domain;

/**
 * @author junw
 */
public class Demo0106DomainBook001 {
	private String bookName;
	private int bookPrice;

	public Demo0106DomainBook001(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public Demo0106DomainBook001() {
	}

	@Override
	public String toString() {
		return "Demo0106DomainBook001{" +
				       "bookName='" + bookName + '\'' +
				       ", bookPrice=" + bookPrice +
				       '}';
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
}
