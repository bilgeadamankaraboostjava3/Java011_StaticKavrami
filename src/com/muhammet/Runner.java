package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		
		Musteri mst = new Musteri(); // 0X23EFCA3 // Adresleme ve nesne olu�turma
		
		mst.ad = "Ahmet";
		mst.ulkekodu = "+90";// ulkekodu-> +90
		Musteri mst2 = new Musteri();// 0X45AEEFC3
		mst2.ad = "Duran";
		mst2.ulkekodu= "+01";// ulkekodu-> +01
		Musteri.ulkekodu = "+110";
		mst.ulkekodu = "009";
		System.out.println("M��teri-1.....: "+ mst.ad);
		System.out.println("M��teri-2.....: "+ mst2.ad);
		System.out.println("-----------------------------");
		System.out.println("M��teri-1 �lkeKodu.....: "+mst.ulkekodu);//
		System.out.println("M��teri-2 �lkeKodu.....: "+mst2.ulkekodu);// 
	}

}
