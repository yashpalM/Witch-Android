package se.snylt.witchprocessortest;

import android.support.v4.view.PagerAdapter;
import android.view.View;

class ViewPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    void setItems(Object items) {

    }
}
