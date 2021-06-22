package org.ksy2575.practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sooyong sooyong = new Sooyong();
		Sangho sangho = new Sangho();
		Kyungseo kyungseo = new Kyungseo();
		Jaehyuk jaehyuk = new Jaehyuk();
		
		sooyong.eatFood();
		sooyong.subscribe(sangho);
		sooyong.subscribe(kyungseo);
		sooyong.subscribe(jaehyuk);
		sooyong.runAway();
		sooyong.unsubscribe(sangho);
		sooyong.growUp();
		
	}

}