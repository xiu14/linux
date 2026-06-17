package com.bytedance.push.settings.storage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
final class d implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f5835c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f5836d;

    d(String str, String str2, String str3, Context context) {
        this.a = str;
        this.b = str2;
        this.f5835c = str3;
        this.f5836d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri a = MainProcessSettingsProvider.a(this.f5836d, new b(this.a, this.b, "val", this.f5835c));
        if (a == null) {
            return;
        }
        try {
            this.f5836d.getContentResolver().notifyChange(a, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
