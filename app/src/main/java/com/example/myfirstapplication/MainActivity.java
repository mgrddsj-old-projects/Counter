package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberCounted = (TextView)findViewById(R.id.numCount);
        numCount = 0;
        numberCounted.setText(numCount + "");
    }

    public void plusOne(View v)
    {
        TextView numberCounted = (TextView)findViewById(R.id.numCount);
        numCount++;
        numberCounted.setText(numCount + "");
        changeImg();
    }

    public void minusOne(View v)
    {
        TextView numberCounted = (TextView)findViewById(R.id.numCount);
        numCount--;
        numberCounted.setText(numCount + "");
        changeImg();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.reset, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        TextView numberCounted = (TextView)findViewById(R.id.numCount);

        if (id == R.id.action_reset)
        {
            numCount = 0;
            numberCounted.setText(numCount + "");
            changeImg();
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeImg()
    {
        ImageView meme = (ImageView)findViewById(R.id.meme);

        if (numCount < 5)
        {
            meme.setImageResource(R.drawable.pic_sad_frog);
        }
        else if (numCount < 10)
        {
            meme.setImageResource(R.drawable.pic_sad_frog_1);
        }
        else if (numCount < 15)
        {
            meme.setImageResource(R.drawable.pic_sad_frog_2);
        }
        else
        {
            meme.setImageResource(R.drawable.pic_sad_frog_3);
        }
    }
}
