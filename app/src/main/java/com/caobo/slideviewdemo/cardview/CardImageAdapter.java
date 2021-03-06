package com.caobo.slideviewdemo.cardview;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.caobo.slideviewdemo.R;
import com.caobo.slideviewdemo.adapter.BaseCompatAdapter;
import com.caobo.slideviewdemo.bean.ArticleBean;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by cb
 * on 2020-06-19.
 */
public class CardImageAdapter extends BaseCompatAdapter<ArticleBean, BaseViewHolder> {


    public CardImageAdapter(int layoutResId, List<ArticleBean> data) {
        super(layoutResId, data);
    }

    public CardImageAdapter(List<ArticleBean> data) {
        super(data);
    }

    public CardImageAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, ArticleBean item) {
        helper.setText(R.id.articleListTitle, item.getTitle()).setText(R.id.articleListSummary, item.getAuthor());
        Glide.with(mContext).load(item.getImageUrl()).fitCenter()
                .into((ImageView) helper.getView(R.id.articleListImg));
    }
}