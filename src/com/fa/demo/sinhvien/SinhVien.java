package com.fa.demo.sinhvien;

public class SinhVien {
	String ten;
	int tuoi;
	String diachi;
	static int demSL = 0;
	
	final float PI = 3.14f;

	public SinhVien() {
		demSL++;
	}

	public SinhVien(String ten) {
		this.ten = ten;
		// default
		this.tuoi = 18;
		this.diachi = "DN";
		demSL++;
	}

	public SinhVien(String ten, int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		demSL++;
	}

	public SinhVien(String tenTuTham, int tuoiTuTham, String diachiTuTham) {
		this.ten = tenTuTham;
		this.tuoi = tuoiTuTham;
		this.diachi = diachiTuTham;
		demSL++;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public boolean checkSVQuaTuoiVaODN() {
		return checkQuaTuoi(tuoi) && checkQueDN(diachi);
	}

	boolean checkQuaTuoi(int tuoi) {
		return tuoi > 30;
	}

	private boolean checkQueDN(String diaChi) {
		return diaChi.contains("DN");
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", tuoi=" + tuoi + ", diachi=" + diachi + "]";
	}

}
