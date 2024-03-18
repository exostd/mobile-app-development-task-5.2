package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NavFragment2 extends Fragment {

    public NavFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nav2, container, false);

        TextView textViewName = view.findViewById(R.id.textView2);
        TextView textViewDescription = view.findViewById(R.id.textView3);
        ImageView imageView = view.findViewById(R.id.imageView3);

        textViewName.setText(R.string.apple);
        textViewDescription.setText(R.string.apple_description);
        imageView.setImageResource(R.drawable.product1);
        return view;
    }
}
