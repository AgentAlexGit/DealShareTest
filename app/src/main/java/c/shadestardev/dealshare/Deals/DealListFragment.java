package c.shadestardev.dealshare.Deals;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import c.shadestardev.dealshare.R;

/**
 * Created by Alex on 12/26/2017.
 */

public class DealListFragment extends Fragment
{

    public final static String ITEMS_COUNT_KEY = "DealsListFragment$ItemsCount";

    public static DealListFragment createInstance(int itemsCount)
    {
        DealListFragment dealListFragment = new DealListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ITEMS_COUNT_KEY,itemsCount);
        dealListFragment.setArguments(bundle);
        return dealListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.deals_list_fragment,container,false);
        setupRecyclerView(recyclerView);
        return recyclerView;
    }

    private void setupRecyclerView(RecyclerView recyclerView)
    {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(createItemList());
        recyclerView.setAdapter(recyclerAdapter);
    }

    private List<DealInfo> createItemList()
    {
        List<DealInfo> itemList = new ArrayList<>();

        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));
        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));
        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));
        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));
        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));
        itemList.add(new DealInfo("50% off Yachts",10,"Joes Schmoes Yachts and Boats"));

        return itemList;
    }
}
