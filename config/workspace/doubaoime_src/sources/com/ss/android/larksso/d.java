package com.ss.android.larksso;

import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/* loaded from: classes2.dex */
public class d implements View.OnClickListener {
    public final /* synthetic */ LarkSSOActivity a;

    public d(LarkSSOActivity larkSSOActivity) {
        this.a = larkSSOActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.a.a.getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.removeSessionCookie();
        cookieManager.removeAllCookie();
        createInstance.sync();
        this.a.h();
    }
}
