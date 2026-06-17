package com.bytedance.android.input.environment.impl;

import android.content.res.AssetManager;
import com.bytedance.android.input.basic.IAppGlobals;
import com.prolificinteractive.materialcalendarview.r;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.h;
import kotlin.io.b;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.e;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlinx.coroutines.G;

@e(c = "com.bytedance.android.input.environment.impl.EnvironmentImpl$copyIfNeeded$1", f = "EnvironmentImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class a extends i implements p<G, d<? super o>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ kotlin.s.b.a<Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2300c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ EnvironmentImpl f2301d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f2302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(kotlin.s.b.a<Boolean> aVar, String str, EnvironmentImpl environmentImpl, String str2, d<? super a> dVar) {
        super(2, dVar);
        this.b = aVar;
        this.f2300c = str;
        this.f2301d = environmentImpl;
        this.f2302e = str2;
    }

    @Override // kotlin.r.h.a.a
    public final d<o> create(Object obj, d<?> dVar) {
        a aVar = new a(this.b, this.f2300c, this.f2301d, this.f2302e, dVar);
        aVar.a = obj;
        return aVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, d<? super o> dVar) {
        a aVar = new a(this.b, this.f2300c, this.f2301d, this.f2302e, dVar);
        aVar.a = g2;
        o oVar = o.a;
        aVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        Object J2;
        Object J3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        if (this.b.invoke().booleanValue()) {
            IAppGlobals.a.j("Environment", "copyIfNeeded start");
            try {
                File file = new File(this.f2300c);
                if (file.exists()) {
                    b.a(file);
                }
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (h.b(J2) != null) {
                IAppGlobals.a.e("Environment", "copyIfNeeded error 01");
            }
            EnvironmentImpl environmentImpl = this.f2301d;
            String str = this.f2302e;
            String str2 = this.f2300c;
            try {
                AssetManager assets = IAppGlobals.a.getApplication().getAssets();
                l.e(assets, "IAppGlobals.application.assets");
                environmentImpl.r(assets, str, new File(str2));
                J3 = o.a;
            } catch (Throwable th2) {
                J3 = r.J(th2);
            }
            if (h.b(J3) != null) {
                IAppGlobals.a.e("Environment", "copyIfNeeded error 02");
            }
        }
        return o.a;
    }
}
