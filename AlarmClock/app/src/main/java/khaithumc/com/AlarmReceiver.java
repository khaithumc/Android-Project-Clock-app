package khaithumc.com;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Recevier", "Xin chao");
        String str_dung = intent.getExtras().getString("extra");
        Log.e("Truyen key", str_dung);
        Intent myIntent = new Intent(context,Music.class);
        myIntent.putExtra("extra", str_dung);
        context.startService(myIntent);
    }
}
