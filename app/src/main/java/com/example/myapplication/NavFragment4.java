package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class NavFragment4 extends Fragment {

    public NavFragment4() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nav4, container, false);

        TextView textViewName = view.findViewById(R.id.textView6);
        TextView textViewDescription = view.findViewById(R.id.textView7);
        ImageView imageView = view.findViewById(R.id.imageView4);

        textViewName.setText(R.string.milk);
        textViewDescription.setText(R.string.milk_description);
        imageView.setImageResource(R.drawable.product3);
        return view;
    }
}