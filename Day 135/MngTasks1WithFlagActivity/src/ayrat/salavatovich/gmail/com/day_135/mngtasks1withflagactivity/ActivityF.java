package ayrat.salavatovich.gmail.com.day_135.mngtasks1withflagactivity;

import android.content.Intent;
import android.view.View;

public class ActivityF extends MainActivity {

	@Override
	public void onClickStart(View v) {
		startActivity(new Intent(this, ActivityG.class));
	}

}
