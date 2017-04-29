# FallingView


FallingView可以实现碎片飘落效果的控件，默认的碎片是雪花图片，可以自定义碎片的图片，支持飘落的速度、碎片大小、碎片密度。Enjoy it  O(∩_∩)O<br><br>


![image](https://github.com/DingMouRen/FallingView/raw/master/imgs/img.gif)     ![image2](https://github.com/DingMouRen/FallingView/raw/master/imgs/img2.gif)<br><br>

## build.gradle中引用
```
	compile 'com.dingmouren.fallingview:fallingview:1.0.1'
```

## 使用


#### xml中使用
```
   <com.dingmouren.fallingview.FallingView
        android:layout_width="match_parent"
        android:layout_height="300dp"
        app:fallingDelay="10"
        app:flakeDensity="100"
        app:flakeScale="3"
        app:flakeSrc="@drawable/img1"
        />
```
#### 代码中使用
```
   mFallingView.setImageResource(R.drawable.img1);//设置碎片的图片,默认的图片是雪花
   mFallingView.setDensity(progress);//设置密度，数值越大，碎片越密集,默认值是80
   mFallingView.setScale(progress);//设置碎片的大小，数值越大，碎片越小，默认值是3
   mFallingView.setDelay(progress);//设置碎片飘落的速度，数值越大，飘落的越慢，默认值是10
```

FallingView可以单个使用，也可以包裹其他控件，比如:
```
   <com.dingmouren.fallingview.FallingView
        android:id="@+id/falling_view"
        android:layout_width="match_parent"
        android:layout_height="300dp"
       >
        <ImageView
            android:id="@+id/img"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:scaleType="centerCrop"
            />
    </com.dingmouren.fallingview.FallingView>
```

欢迎大家提Issues.



