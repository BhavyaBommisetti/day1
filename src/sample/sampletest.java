package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sample.sample;

class sampletest {

	@Test
	void test() {
		sample s=new sample();
		int output=s.add(4,6);
		assertEquals(10,output);
	}

}
