package com.dealshare.dealshare.Deal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dealshare.dealshare.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 1/2/2018.
 */

public class DealListFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.deal_list_recycler_view_fragment,container,false);
        setupRecyclerView(recyclerView);
        return recyclerView;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DealInfoBriefAdapter dealInfoAdapter = new DealInfoBriefAdapter(createItemList());
        recyclerView.setAdapter(dealInfoAdapter);
    }

    private List<DealInfo> createItemList() {
        List<DealInfo> list = new ArrayList();
        list.add(new DealInfo("Test","Buy one test then it works",10,20));
        list.add(new DealInfo("Test2","Buy one test then it works",10,20));
        list.add(new DealInfo("Test3","Buy one test then it works",10,20));
        list.add(new DealInfo("Test4","Buy one test then it works",10,20));
        return list;
    }
}
