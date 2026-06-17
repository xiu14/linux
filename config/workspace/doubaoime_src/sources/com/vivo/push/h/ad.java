package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class ad implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f8822c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8823d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ac f8824e;

    ad(ac acVar, int i, List list, List list2, String str) {
        this.f8824e = acVar;
        this.a = i;
        this.b = list;
        this.f8822c = list2;
        this.f8823d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ac acVar = this.f8824e;
        PushMessageCallback pushMessageCallback = ((ab) acVar).b;
        context = ((com.vivo.push.s) acVar).a;
        pushMessageCallback.onSetTags(context, this.a, this.b, this.f8822c, this.f8823d);
    }
}
