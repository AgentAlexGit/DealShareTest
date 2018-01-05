package com.dealshare.dealshare.Deal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dealshare.dealshare.R;

import java.util.List;

/**
 * Created by Alex on 1/2/2018.
 */

public class DealInfoBriefAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<DealInfo> mItemList;

    public DealInfoBriefAdapter(List<DealInfo> itemList)
    {
     mItemList = itemList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.deal_recycler_item_breif,parent,false);
        return new DealInfoBriefViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position)
    {
        DealInfoBriefViewHolder holder = (DealInfoBriefViewHolder)viewHolder;
        holder.UpdateInfo(mItemList.get(position));

    }

    @Override
    public int getItemCount() {
        return mItemList == null ? 0: mItemList.size();
    }
}
