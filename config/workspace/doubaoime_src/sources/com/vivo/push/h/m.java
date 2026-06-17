package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class m implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f8830c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f8831d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f8832e;

    m(l lVar, int i, List list, List list2, String str) {
        this.f8832e = lVar;
        this.a = i;
        this.b = list;
        this.f8830c = list2;
        this.f8831d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        l lVar = this.f8832e;
        PushMessageCallback pushMessageCallback = ((ab) lVar).b;
        context = ((com.vivo.push.s) lVar).a;
        pushMessageCallback.onDelTags(context, this.a, this.b, this.f8830c, this.f8831d);
    }
}
