package com.example.zipper.mod;

import com.example.zipper.R;
import com.example.zipper.animations.FlipMod;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import se.snylt.zipper.viewbinder.Zipper;

public class ModsFragment extends Fragment {

    private ViewModelMod red = new ViewModelMod(new TextColor(Color.RED));

    private ViewModelMod blue = new ViewModelMod(new TextColor(Color.BLUE));

    private ViewModelMod fadeIn = new ViewModelMod(new TextColor(Color.MAGENTA), new FlipMod());

    private ViewModel model = new ViewModel();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mods_fragment, container, false);

        view.findViewById(R.id.mods_fragment_red_mod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.text = "RED";
                bind(red);
            }
        });

        view.findViewById(R.id.mods_fragment_blue_mod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.text = "BLUE";
                bind(blue);
            }
        });

        view.findViewById(R.id.mods_fragment_fade_in_mod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.text = "MAGENTA";
                bind(fadeIn);
            }
        });
        return view;
    }

    private void bind(Object mod) {
        Zipper.bind(model, getView(), mod);
    }
}