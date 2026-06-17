package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public abstract class ImmersionFragment extends Fragment implements b {
    private c a = new c(this);

    @Override // com.gyf.barlibrary.b
    public boolean b() {
        return true;
    }

    @Override // com.gyf.barlibrary.b
    public void c() {
    }

    @Override // com.gyf.barlibrary.b
    public void e() {
    }

    @Override // com.gyf.barlibrary.b
    public void f() {
    }

    @Override // com.gyf.barlibrary.b
    public void h() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.a();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.a.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.a.e(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.a.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.a.h();
    }
}
