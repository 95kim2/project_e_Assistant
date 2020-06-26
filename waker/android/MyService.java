package com.example.waker;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.app.slice.Slice;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MyService extends Service {
    public static int var = 0;
    private MediaPlayer mp1;
    private static final String TAG = "MyService";
    public Context cotx;
    NotificationManager Notifi_M;
    Notification Notifi;

    public MyService(Context context) {
        cotx = context;
    }
    public MyService(){}

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");
        mp1 = MediaPlayer.create(this, R.raw.ddok);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");

        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Notifi_M = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Log.d(TAG, "onStartCommand()");
        if(intent!=null){
            String command = intent.getStringExtra("command");
            if(command!=null){
// 문자열비교
                if(command.equals("start")){
                    PrintThread thread = new PrintThread();
                    thread.start();
                }
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    // 내부 클래스
    class PrintThread extends Thread{
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void run(){
            for(int i = 1;;){
                Log.d(TAG, "#" + i + " 서비스에서 반복됨");
                String u = "http://54.196.42.10:8000/sleep/isSleep/waker";
                String body = null;
                URL url = null;
                try {
                    url = new URL(u);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                // HTTP Connection 구하기
                HttpURLConnection conn = null;
                try {
                    conn = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // 요청 방식 설정 ( GET or POST or .. 별도로 설정하지않으면 GET 방식 )
                try {
                    conn.setRequestMethod("GET");
                } catch (ProtocolException e) {
                    e.printStackTrace();
                }
/*
        // 연결 타임아웃 설정
        conn.setConnectTimeout(3000); // 3초
        // 읽기 타임아웃 설정
        conn.setReadTimeout(3000); // 3초
*/


                // 응답 내용(BODY) 구하기
                try (InputStream in = conn.getInputStream();
                     ByteArrayOutputStream out = new ByteArrayOutputStream()) {

                    byte[] buf = new byte[1024 * 8];
                    int length = 0;
                    while ((length = in.read(buf)) != -1) {
                        out.write(buf, 0, length);
                    }
                    body = new String(out.toByteArray(), "UTF-8");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // 접속 해제
                conn.disconnect();

                if (body.equals("sleep")) {

                    Log.d(TAG, "#" + "shet");

                    mp1.start();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mp1.setLooping(false);

                }

                Log.d(TAG, "#" + body);

                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
// TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}