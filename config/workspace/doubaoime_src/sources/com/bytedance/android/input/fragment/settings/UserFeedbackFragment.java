package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class UserFeedbackFragment extends BaseSettingsFragment {
    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        return layoutInflater.inflate(C0838R.layout.fragment_user_feedback, viewGroup, false);
    }
}
