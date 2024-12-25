package com.example.basic.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basic.R;

public class HomeFragment extends Fragment {

    private String[] mDatasets;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeData();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.home_recycle_view);

        HomeAdapter adapter = new HomeAdapter(mDatasets);

        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void initializeData() {
        mDatasets = new String[10];
        for (int i = 0; i < 10; i++) {
            mDatasets[i] = "Hello: " + i;
        }
    }
}
