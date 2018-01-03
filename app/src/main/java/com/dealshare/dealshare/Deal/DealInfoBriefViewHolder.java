package com.dealshare.dealshare.Deal;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

/**
 * Created by Alex on 1/2/2018.
 */

public class DealInfoBriefViewHolder extends ViewHolder
{


    public DealInfoBriefViewHolder(View itemView) {
        super(itemView);



    }

    public static DealInfoBriefViewHolder newInstace(View parent)
    {
        return new DealInfoBriefViewHolder(parent);
    }

    public static void UpdateInfo(DealInfo info)
    {

    }
}
