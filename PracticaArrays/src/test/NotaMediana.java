package test;
import util.MisArrays;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaMediana {

	@Test
	void test() {
		int [] numeros=new int[]{2,6,1,8,2,4,6,7,9,3};
		float media=MisArrays.mediananotas(numeros);
	}

}
