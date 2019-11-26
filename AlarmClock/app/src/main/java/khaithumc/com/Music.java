package khaithumc.com;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class Music extends Service {
    MediaPlayer mediaPlayer;
    boolean bool;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("Music", "Xin chao");
        String nhanKey = intent.getExtras().getString("extra");
        Log.e("Nhan key",nhanKey);
        if(nhanKey.equals("on")) {
            bool = true;
        } else if(nhanKey.equals("off")) {
            bool = false;
        }
        if(bool) {
            mediaPlayer = MediaPlayer.create(this,R.raw.letitgo);
            mediaPlayer.start();
            bool = false;
        } else if (!bool){
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
        return START_NOT_STICKY;
    }
}
