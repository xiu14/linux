package com.bytedance.android.input.service;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import androidx.annotation.CallSuper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ServiceLifecycleDispatcher;

/* loaded from: classes.dex */
public class LifecycleInputMethodService extends InputMethodService implements LifecycleOwner {
    private final ServiceLifecycleDispatcher a = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.a.getLifecycle();
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onBindInput() {
        this.a.onServicePreSuperOnStart();
        super.onBindInput();
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    @CallSuper
    public void onCreate() {
        this.a.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    @CallSuper
    public void onDestroy() {
        this.a.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @CallSuper
    public void onStart(Intent intent, int i) {
        this.a.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
