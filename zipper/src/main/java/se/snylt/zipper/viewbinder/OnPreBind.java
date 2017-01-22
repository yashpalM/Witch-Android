package se.snylt.zipper.viewbinder;

import android.view.View;

import se.snylt.zipper.BindAction;

public interface OnPreBind<V extends View, Value> extends BindAction {
    void onPreBind(V view, Value value);
}
