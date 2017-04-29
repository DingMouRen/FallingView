package com.dingmouren.smaple_fallingview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.dingmouren.fallingview.FallingView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seek_size,seek_v,seek_density;
    private FallingView mFallingView;
    private ImageView img;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seek_size = (SeekBar) findViewById(R.id.seek_size);
        seek_v = (SeekBar) findViewById(R.id.seek_v);
        seek_density = (SeekBar) findViewById(R.id.seek_density);
        mFallingView = (FallingView) findViewById(R.id.falling_view);
        img = (ImageView) findViewById(R.id.img);
        toolbar = (Toolbar) findViewById(R.id.toobar);
        toolbar.setTitle("FallingView");
        setSupportActionBar(toolbar);
        initListener();
        img.setImageResource(R.drawable.bg1);
    }

    private void initListener() {

        seek_size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mFallingView.setScale(progress);//设置碎片的大小，数值越大，碎片越小，默认值是3
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek_density.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mFallingView.setDensity(progress);//设置密度，数值越大，碎片越密集
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek_v.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mFallingView.setDelay(progress);//设置碎片飘落的速度，数值越大，飘落的越慢，默认值是10
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.img1:
                mFallingView.setImageResource(R.drawable.img1);
                img.setImageResource(R.drawable.bg2);
                break;
            case R.id.img2:
                mFallingView.setImageResource(R.drawable.img2);
                img.setImageResource(R.drawable.bg3);
                break;
            case R.id.img3:
                mFallingView.setImageResource(R.drawable.img3);
                img.setImageResource(0);
                img.setBackgroundColor(Color.parseColor("#ff6f00"));
                break;
            case R.id.img4:
                mFallingView.setImageResource(R.drawable.img4);
                img.setImageResource(R.drawable.bg4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
