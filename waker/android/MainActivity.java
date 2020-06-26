package com.example.waker;

    //
    import android.content.ComponentName;
    import android.content.Context;
    import android.content.ServiceConnection;
    import android.media.MediaPlayer;
    import android.os.IBinder;
    import android.util.Log;
    import android.widget.TextView;
    import android.widget.Toast;
    //
    import androidx.appcompat.app.AppCompatActivity;

    import android.media.AudioManager;
    import android.media.SoundPool;
    import android.os.Bundle;
    import android.net.Uri;
    import android.content.Intent;
    import android.view.View;
    import android.widget.Button;


public class MainActivity extends AppCompatActivity {
   /* private MyService mService;
    private boolean isBind;
    ServiceConnection sconn = new ServiceConnection() {
        @Override //서비스가 실행될 때 호출
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.MyBinder myBinder = (MyService.MyBinder) service;
            mService = myBinder.getService();

            isBind = true;
            Log.e("LOG", "onServiceConnected()");
        }

        @Override //서비스가 종료될 때 호출
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
            isBind = false;
            Log.e("LOG", "onServiceDisconnected()");
        }
    };
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//Myser new My
    // new My
//Myservice.class.fun/()
    public void onButton1Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MyService.class);
        intent.putExtra("command", "start");
        startService(intent);
        Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://54.196.42.10:8000/map"));
        startActivity(a);
        if(MyService.var == 0){
            final SoundPool sp = new SoundPool(1, AudioManager.STREAM_MUSIC,0);

            final int soundID = sp.load(this,R.raw.ddok,1);
            sp.play(soundID, 1,1,0 ,0,0);
        }
    }
}
