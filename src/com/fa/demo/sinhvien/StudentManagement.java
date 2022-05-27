package com.fa.demo.sinhvien;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sv1 = si;
		SinhVien sv1 = new SinhVien("Nguyen Van A");
		sv1.demSL = 20;
		
		System.out.println(sv1);
		sv1.setTen("nguyen Van B");
		System.out.println(sv1);
		SinhVien sv2 = new SinhVien("SV2", 10, "DN2");
		SinhVien sv3 = new SinhVien("SV3", 20, "DN3");
		System.out.println(sv2);
		System.out.println(sv3);

//		System.out.println(sv1.getTen());
//		System.out.println(sv1.getTuoi());
//		System.out.println(sv1.getDiachi());
//		System.out.println(sv2.getTen());
//		System.out.println(sv3.getTen());
//		System.out.println(sv3.getTuoi());
//		System.out.println(sv3.getDiachi());
		SinhVien sv4 = new SinhVien();

		// các thuộc tính của đôi tượng đựa lấy thông qua xử lý khác
		String ten = "";
		int tuoi = 20;
		String diachi = "VN";
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap ten cho sv");
//		ten = scanner.nextLine();

		// Gan giá trị cho SV4
		sv4.setTen("SV4");
		sv4.setTuoi(tuoi);
		sv4.setDiachi(diachi);

		sv4.checkQuaTuoi(0);

		System.out.println(sv4);

		System.out.println(SinhVien.demSL);
		System.out.println(sv1.demSL);
		System.out.println(sv2.demSL);
		System.out.println(sv3.demSL);

	}

}
