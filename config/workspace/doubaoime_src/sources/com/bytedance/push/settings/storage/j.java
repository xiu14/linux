package com.bytedance.push.settings.storage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
final class j implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f5841c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f5842d;

    j(String str, String str2, String str3, Context context) {
        this.a = str;
        this.b = str2;
        this.f5841c = str3;
        this.f5842d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri a = SmpProcessSettingsProvider.a(this.f5842d, new b(this.a, this.b, "val", this.f5841c));
        if (a == null) {
            return;
        }
        try {
            this.f5842d.getContentResolver().notifyChange(a, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
