package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class n implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f8833c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8834d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f8835e;

    n(l lVar, int i, List list, List list2, String str) {
        this.f8835e = lVar;
        this.a = i;
        this.b = list;
        this.f8833c = list2;
        this.f8834d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        l lVar = this.f8835e;
        PushMessageCallback pushMessageCallback = ((ab) lVar).b;
        context = ((com.vivo.push.s) lVar).a;
        pushMessageCallback.onDelAlias(context, this.a, this.b, this.f8833c, this.f8834d);
    }
}
