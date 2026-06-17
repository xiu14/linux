package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class ae implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f8825c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8826d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ac f8827e;

    ae(ac acVar, int i, List list, List list2, String str) {
        this.f8827e = acVar;
        this.a = i;
        this.b = list;
        this.f8825c = list2;
        this.f8826d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ac acVar = this.f8827e;
        PushMessageCallback pushMessageCallback = ((ab) acVar).b;
        context = ((com.vivo.push.s) acVar).a;
        pushMessageCallback.onSetAlias(context, this.a, this.b, this.f8825c, this.f8826d);
    }
}
