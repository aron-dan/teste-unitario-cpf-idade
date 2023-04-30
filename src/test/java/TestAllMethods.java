import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestAllMethods {
	AgeValidation agevalidation = new AgeValidation();
	CpfValidadtion cpfvalidation = new CpfValidadtion();
	NameValidation namevalidation = new NameValidation();

	@Test
	void testidade() {

		int result = agevalidation.Age();

		Assertions.assertEquals(result, agevalidation.Age());
	}

	@Test
	void testcpf() {

		String result = cpfvalidation.CpfValidadtion();

		Assertions.assertEquals(result, cpfvalidation.CpfValidadtion());
	}

	@Test
	void testname() {
		String result = namevalidation.namevalidation();

		Assertions.assertEquals(result, namevalidation.namevalidation());

	}

}
