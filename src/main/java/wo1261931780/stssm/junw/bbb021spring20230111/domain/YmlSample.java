package wo1261931780.stssm.junw.bbb021spring20230111.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author junw
 */
@Component
@ConfigurationProperties(prefix = "name.data")
public class YmlSample {
	private String name1;
	private String name2;
	private String[] subject;

	@Override
	public String toString() {
		return "YmlSample{" +
				       "name1='" + name1 + '\'' +
				       ", name2='" + name2 + '\'' +
				       ", subject=" + Arrays.toString(subject) +
				       '}';
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}
}
