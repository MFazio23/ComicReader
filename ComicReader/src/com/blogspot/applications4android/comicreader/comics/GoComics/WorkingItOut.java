package com.blogspot.applications4android.comicreader.comics.GoComics;

import java.util.Calendar;
import com.blogspot.applications4android.comicreader.comictypes.DailyGoComicsCom;

public class WorkingItOut extends DailyGoComicsCom {
	public WorkingItOut() {
		super();
		mComicName = "workingitout";
		mFirstCal = Calendar.getInstance();
		mFirstCal.set(2005, 0, 2);
	}
}
