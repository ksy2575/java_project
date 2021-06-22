package org.ksy2575.practice;

public interface Coach {
	void subscribe(Crew crew);
	void unsubscribe(Crew crew);
	void notifyCrew(String msg);
}
