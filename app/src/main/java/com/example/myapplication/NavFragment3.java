package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class NavFragment3 extends Fragment {

    public NavFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nav3, container, false);

        TextView textViewName = view.findViewById(R.id.textView4);
        TextView textViewDescription = view.findViewById(R.id.textView5);
        ImageView imageView = view.findViewById(R.id.imageView2);
        Spinner spinner = view.findViewById(R.id.spinner);

        textViewName.setText(R.string.broccoli);
        textViewDescription.setText(R.string.broccoli_description);
        imageView.setImageResource(R.drawable.product2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Устанавливаем адаптер для Spinner
        spinner.setAdapter(adapter);
        return view;
    }
}