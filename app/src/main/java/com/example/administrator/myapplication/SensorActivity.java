package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2019/11/20.
 */



public class SensorActivity extends MainActivity {
    private TextView t9,t11;
    private  String Token;
    private  JSONObject jsonObject;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acc);
        t9=findViewById(R.id.textView12);
        t11=findViewById(R.id.textView11);
        Intent intent = getIntent();
     Token  = intent.getStringExtra("token");
t9.setText(Token);
    }
    Handler handler=new Handler() {

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    t11.setText(msg.obj.toString());
            }
        }
    };
    public  void click9 (View v) {
        Thread t = new Thread(runnable);
        t.start();



    }
    public  void click10 (View v) {
        Thread t1 = new Thread(runnable1);
        t1.start();



    }
    public  void click12 (View v) {
        Thread t2 = new Thread(runnable2);
        t2.start();



    }
    public  void click13 (View v) {
        Thread t3 = new Thread(runnable3);
        t3.start();



    }
    public  void click14 (View v) {
        Thread t4 = new Thread(runnable4);
        t4.start();



    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("http://api.nlecloud.com/Cmds?deviceId=60370&apiTag=tuvsxosumhzv&AccessToken="+Token);
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                connection.setRequestMethod("POST");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("Content-Type","application/json");
                connection.setRequestProperty("Connection","Keep-Alive");
                connection.setRequestProperty("Charset","UTF-8");
               // connection.setRequestProperty("AccessToken",Token);
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write("0".getBytes());
                outputStream.flush();
                outputStream.close();
                Message msg=new Message();
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK)
                {
                    InputStream in=connection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line;
                    while((line=reader.readLine())!=null) {
                        jsonObject=new JSONObject(line);
                    }
                    msg.what=1;
                    msg.obj=jsonObject;
                    handler.sendMessage(msg);
                } else {
                    msg.what=2;
                    handler.sendMessage(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnable1=new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("http://api.nlecloud.com/Cmds?deviceId=60370&apiTag=tuvsxosumhzv&AccessToken="+Token);
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                connection.setRequestMethod("POST");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("Content-Type","application/json");
                connection.setRequestProperty("Connection","Keep-Alive");
                connection.setRequestProperty("Charset","UTF-8");
                // connection.setRequestProperty("AccessToken",Token);
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write("1".getBytes());
                outputStream.flush();
                outputStream.close();
                Message msg=new Message();
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK)
                {
                    InputStream in=connection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line;
                    while((line=reader.readLine())!=null) {
                        jsonObject=new JSONObject(line);
                    }
                    msg.what=1;
                    msg.obj=jsonObject;
                    handler.sendMessage(msg);
                } else {
                    msg.what=2;
                    handler.sendMessage(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnable2=new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("http://api.nlecloud.com/Cmds?deviceId=60370&apiTag=wurnjwbmtlrr&AccessToken="+Token);
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                connection.setRequestMethod("POST");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("Content-Type","application/json");
                connection.setRequestProperty("Connection","Keep-Alive");
                connection.setRequestProperty("Charset","UTF-8");
                // connection.setRequestProperty("AccessToken",Token);
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write("0".getBytes());
                outputStream.flush();
                outputStream.close();
                Message msg=new Message();
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK)
                {
                    InputStream in=connection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line;
                    while((line=reader.readLine())!=null) {
                        jsonObject=new JSONObject(line);
                    }
                    msg.what=1;
                    msg.obj=jsonObject;
                    handler.sendMessage(msg);
                } else {
                    msg.what=2;
                    handler.sendMessage(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    Runnable runnable3=new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("http://api.nlecloud.com/Cmds?deviceId=60370&apiTag=wurnjwbmtlrr&AccessToken="+Token);
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                connection.setRequestMethod("POST");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("Content-Type","application/json");
                connection.setRequestProperty("Connection","Keep-Alive");
                connection.setRequestProperty("Charset","UTF-8");
                // connection.setRequestProperty("AccessToken",Token);
                OutputStream outputStream = connection.getOutputStream();
                outputStream.write("1".getBytes());
                outputStream.flush();
                outputStream.close();
                Message msg=new Message();
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK)
                {
                    InputStream in=connection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String line;
                    while((line=reader.readLine())!=null) {
                        jsonObject=new JSONObject(line);
                    }
                    msg.what=1;
                    msg.obj=jsonObject;
                    handler.sendMessage(msg);
                } else {
                    msg.what=2;
                    handler.sendMessage(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnable4=new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL( "http://api.nlecloud.com/Devices/60370?AccessToken="+Token);
                HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("Content-Type","application/json");
                connection.setRequestProperty("Connection","Keep-Alive");
                connection.setRequestProperty("Charset","UTF-8");

                Message msg=new Message();
                if(connection.getResponseCode()==HttpURLConnection.HTTP_OK)
                {
                    InputStream in=connection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String result = reader.readLine();
                  Gson gson1 = new Gson();
                    Sensorbean sensorbean = gson1.fromJson(result,Sensorbean.class);
                   sensorbean.getResultObj().getTag();
                    String line;
                    while((line=reader.readLine())!=null) {

                        jsonObject=new JSONObject(line);
                    }
                    msg.what=1;
//                 msg.obj=jsonObject;
               msg.obj=sensorbean.getResultObj().getTag();
                    handler1.sendMessage(msg);
                } else {
                    msg.what=2;
                    handler1.sendMessage(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    Handler handler1 = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            switch(msg.what){
                case 1:
                    t11.setText(msg.obj.toString());
                    Log.d("wuqi",msg.obj.toString());
                    break;

            }
        }

    };





}
