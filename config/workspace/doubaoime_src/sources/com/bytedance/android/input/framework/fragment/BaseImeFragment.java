package com.bytedance.android.input.framework.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class BaseImeFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
