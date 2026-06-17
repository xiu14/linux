package com.obric.oui.window.listener;

import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.g;

/* loaded from: classes2.dex */
public final class WindowConfigChangeListener extends ViewModel {
    private static ConcurrentHashMap<Integer, g<Configuration, Integer>> a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer, ConcurrentLinkedQueue<WeakReference<Fragment>>> b = new ConcurrentHashMap<>();

    public WindowConfigChangeListener() {
        new NextLiveData();
    }
}
