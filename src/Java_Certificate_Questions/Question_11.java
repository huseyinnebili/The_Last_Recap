package Java_Certificate_Questions;

public class Question_11 {

	public static void main(String[] args) {

		String[] strs = { "A", "B" };

		int idx = 0;

		for (String s : strs) {

			strs[idx].concat("element" + idx);

			idx++;
		}

		for (idx = 0; idx < strs.length; idx++) {

			System.out.print(strs[idx]);
		}

		System.out.println();

		String[] str = { "B", "J", "K" };

		int idy = 0;

		for (String s : str) {

			System.out.println(s.concat(" Champion!" + idy));

			idy++;
		}

		for (idy = 0; idy < str.length; idy++) {

			System.out.print(str[idy]);
		}

	}

}
