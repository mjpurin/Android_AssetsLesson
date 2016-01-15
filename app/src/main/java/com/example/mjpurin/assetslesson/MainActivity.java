package com.example.mjpurin.assetslesson;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AssetManager am=getAssets();
        StringBuilder sb=new StringBuilder();
        try {
            InputStream is=am.open("Hello.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            while(br.ready()){
                sb.append(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("TEXT",sb.toString());
    }


}
