   
package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class GaryMarkstein extends DailyGoComicsCom {
	public GaryMarkstein() {
		super();
		mComicName = "garymarkstein";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2008, 6, 31);
	}
}
