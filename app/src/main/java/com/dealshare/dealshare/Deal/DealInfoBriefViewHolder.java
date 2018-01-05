package com.dealshare.dealshare.Deal;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

import com.dealshare.dealshare.R;

/**
 * Created by Alex on 1/2/2018.
 */

public class DealInfoBriefViewHolder extends ViewHolder
{

    TextView mDealTitle,mDealDescription,mDealTags,mDealPoster,mDealDistance,mDealFavorites,mDealShares;


    public DealInfoBriefViewHolder(View itemView) {
        super(itemView);
        mDealTitle = itemView.findViewById(R.id.dealTitle);
        mDealDescription = itemView.findViewById(R.id.dealSubtitle);
        mDealTags = itemView.findViewById(R.id.dealTags);
        mDealPoster = itemView.findViewById(R.id.dealPoster);
        mDealDistance = itemView.findViewById(R.id.dealDistance);
        mDealFavorites = itemView.findViewById(R.id.dealFavorites);
        mDealShares = itemView.findViewById(R.id.dealShares);
    }

    public void UpdateInfo(DealInfo info)
    {
        mDealTitle.setText(info.Name);
        mDealDescription.setText(info.Description);
        mDealFavorites.setText(info.AmountOfLikes +"");
        mDealShares.setText(info.Shares+"");

    }
}
