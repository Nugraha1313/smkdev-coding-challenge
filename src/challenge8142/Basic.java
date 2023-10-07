package challenge8142;

import java.util.ArrayList;
import java.util.Arrays;

/** @author Nugraha1313 Oct 6, 2023 11:10:48 AM **/

public class Basic {

	public static void checkCats(int[] catsTuti, int[] catsNining) {
		
//		copy array tuti
		int[] copyCatsTuti = Arrays.copyOfRange(catsTuti, 1, 3);
		
//		array yang berisi data baru tuti dan nining
		ArrayList<Integer> allCats = new ArrayList<Integer>();
//		add tuti data
		for (int i = 0; i < copyCatsTuti.length; i++)
			allCats.add(copyCatsTuti[i]);
//		add nining data
		for (int i = 0; i < catsNining.length; i++)
			allCats.add(catsNining[i]);
		
//		System.out.println(allCats);
//		print in console
		for (int i = 0; i < allCats.size(); i++) {
			if(allCats.get(i) >= 3) {
				System.out.println("Kucing Nomor " + (i+1) + " adalah Kucing Dewasa, dan "
						+ "berusia " + allCats.get(i) + " tahun");
			} else if(allCats.get(i) >= 0) {
				System.out.println("Kucing Nomor " + (i+1) + " masih anak-anak");
			}
		}
		
	}

	public static void main(String[] args) {
//		inisialisasi data uji
		int[] dataTuti1 = {3, 5, 2, 12, 7};
		int[] dataTuti2 = {9, 16, 6, 8, 3};
		int[] dataNining1 = {4, 1, 15, 8, 3};
		int[] dataNining2 = {10, 5, 6, 1, 4};

//		call method
		System.out.println("=======DATA 1======");
		checkCats(dataTuti1, dataNining1);
		System.out.println("=======DATA 2======");
		checkCats(dataTuti2, dataNining2);
		
	}

}