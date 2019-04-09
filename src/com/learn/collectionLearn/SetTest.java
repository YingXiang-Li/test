package com.learn.collectionLearn;

import java.util.HashSet;
import java.util.Set;

/**
 * Set HashSet 存的内容，没有顺序，不可重复
 * 
 * @author Admin
 *
 */
public class SetTest {

	public static void main(String[] args) {
		String[] myStr = { "i", "came", "i", "saw", "i", "left" };
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		for (String a : myStr) {
			if (!uniques.add(a)) {
				dups.add(a);
			}
		}
		System.out.println("包含重复的单词：" + uniques);
		uniques.removeAll(dups);
		System.out.println("不重复的单词：" + uniques);
		System.out.println("重复的单词：" + dups);

		Set<String> symmetricDiff = new HashSet<String>(uniques);
		symmetricDiff.addAll(dups);
		System.out.println("symmetricDiff：" + symmetricDiff);

		String[] strArr = { "left", "right" };
		Set<String> s2 = new HashSet<String>();
		for (String a : strArr) {
			s2.add(a);
		}
		System.out.println("s2: " + s2);

		Set<String> tmp = new HashSet<String>(uniques);
		System.out.println("tmp: " + tmp);

		uniques.retainAll(s2);
		symmetricDiff.removeAll(tmp);
		System.out.println("symmetricDiff: " + symmetricDiff);
		System.out.println("uniques: " + uniques);
		
		System.out.println("------------------------------");

		Set s3 = new HashSet();
		Set s4 = new HashSet();
		s3.add("a");
		s3.add("b");
		s3.add("c");
		s4.add("a");
		s4.add("b");
		s4.add("d");
		Set sn = new HashSet(s3);
		sn.retainAll(s4);
		System.out.println(sn);
		Set sa = new HashSet(s3);
		sa.addAll(s4);
		System.out.println(sa);
	}
}
