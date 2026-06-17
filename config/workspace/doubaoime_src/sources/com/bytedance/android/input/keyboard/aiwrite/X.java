package com.bytedance.android.input.keyboard.aiwrite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes.dex */
public final class X {
    public static final X a = null;
    private static MutableLiveData<Integer> b = new MutableLiveData<>(0);

    public static final LiveData<Integer> a() {
        return b;
    }

    public static final void b(int i) {
        b.setValue(Integer.valueOf(i));
    }
}
