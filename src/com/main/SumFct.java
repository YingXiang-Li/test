package com.main;
import java.math.BigInteger;

public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		BigInteger t = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ONE; i.compareTo(n.add(BigInteger.ONE)) != 1; i = i.add(BigInteger.ONE)) {
			sum = sum.add(n1);
			t = n2.add(n1);
			n1 = n2;
			n2 = t;
		}

		return sum.multiply(BigInteger.valueOf(4));
	}

	public static void main(String[] args) {
		System.out.println(SumFct.perimeter(BigInteger.valueOf(5)));
		System.out.println(SumFct.perimeter(BigInteger.valueOf(7)));
		System.out.println(SumFct.perimeter(BigInteger.valueOf(30)));
	}
}
