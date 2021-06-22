package org.ksy2575.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sooyong implements Coach{
	private List<Crew> crews = new ArrayList<Crew>();
	
	public void eatFood() {
		System.out.println("¹ä¸Ô±â");
		notifyCrew("¹ä¸Ô±â");
	}
	
	public void runAway() {
		System.out.println("µµ¸Á°¡±â");
		notifyCrew("µµ¸Á°¡±â");
	}
	
	public void growUp() {
		System.out.println("¼ºÀåÇÏ±â");
		notifyCrew("¼ºÀåÇÏ±â");
	}

	@Override
	public void subscribe(Crew crew) {
		// TODO Auto-generated method stub
		crews.add(crew);
		
	}

	@Override
	public void unsubscribe(Crew crew) {
		// TODO Auto-generated method stub
		crews.remove(crew);
	}

	@Override
	public void notifyCrew(String msg) {
		// TODO Auto-generated method stub
		crews.forEach(crew -> crew.update(msg));
	}

}