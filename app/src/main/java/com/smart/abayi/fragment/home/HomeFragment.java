package com.smart.abayi.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smart.abayi.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private static final int LAYOUT =  R.layout.fragment_home;
    private ArrayList<HomeItem> list;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;



    public static HomeFragment getInstance(){
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT, container, false);

        list = new ArrayList<>();
        list.add(new HomeItem("Image","New1", "13.05.2020",25, "7848454"));
        list.add(new HomeItem("Image","New2", "12.05.2020",22, "7848454"));
        list.add(new HomeItem("Image","New3", "11.05.2020",18, "7848454"));
        list.add(new HomeItem("Image","New4", "10.05.2020",28, "7848454"));
        list.add(new HomeItem("Image","New5", "10.05.2020",11, "7848454"));
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new HomeAdapter(list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
