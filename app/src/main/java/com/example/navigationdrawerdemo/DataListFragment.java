package com.example.navigationdrawerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class DataListFragment extends ListFragment {
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] values = {
            "Entrée Alpha", "Entrée Bêta", "Entrée Gamma", 
            "Entrée Delta", "Entrée Epsilon", "Entrée Zeta", 
            "Entrée Eta", "Entrée Theta", "Entrée Iota", "Entrée Kappa"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                values
        );
        setListAdapter(adapter);
    }
}