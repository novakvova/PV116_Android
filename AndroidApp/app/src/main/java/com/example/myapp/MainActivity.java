package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivAvatar = findViewById(R.id.imageView);
//        String url = "https://i.pinimg.com/564x/a8/4b/94/a84b94d816597cea9c83cb64d9d7e0e7.jpg";
//        String url = "http://10.0.2.2:5094/images/1.jpg";
        String url = "https://pv116.itstep.click/images/1.jpg";
        Glide.with(this)
                .load(url)
                .apply(new RequestOptions().override(400))
                .into(ivAvatar);
    }
}