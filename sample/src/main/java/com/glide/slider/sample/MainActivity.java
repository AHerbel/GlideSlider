package com.glide.slider.sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.glide.slider.library.SliderTypes.DefaultSliderView;
import com.glide.slider.sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        DefaultSliderView slide1 = new DefaultSliderView(this);
        slide1.image("https://www.bierful.com/blog/wp-content/uploads/2016/11/BarCeresBanner.jpg");

        DefaultSliderView slide2 = new DefaultSliderView(this);
        slide2.image("https://www.bierful.com/blog/wp-content/uploads/2017/04/CervezaAndaluzBanner.jpg");

        DefaultSliderView slide3 = new DefaultSliderView(this);
        slide3.image("https://www.bierful.com/blog/wp-content/uploads/2017/07/Cuadro-pPorta-tapitas.jpg");

        binding.slider.setCustomIndicator(binding.pagerIndicator);
        binding.slider.addSlider(slide1);
        binding.slider.addSlider(slide2);
        binding.slider.addSlider(slide3);
    }
}
