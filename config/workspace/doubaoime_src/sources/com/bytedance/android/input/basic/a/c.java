package com.bytedance.android.input.basic.a;

import android.content.Context;
import android.widget.Toast;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.basic.alog.ImeLogManager$uploadLog$1", f = "ImeLogManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class c extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.basic.alog.ImeLogManager$uploadLog$1$1$2$1", f = "ImeLogManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends i implements p<G, kotlin.r.d<? super o>, Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, Context context, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.a = z;
            this.b = context;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(this.a, this.b, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            a aVar = new a(this.a, this.b, dVar);
            o oVar = o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            Toast.makeText(this.b, this.a ? "上传成功" : "上传失败", 0).show();
            return o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(boolean z, Context context, kotlin.r.d<? super c> dVar) {
        super(2, dVar);
        this.a = z;
        this.b = context;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        return new c(this.a, this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        c cVar = new c(this.a, this.b, dVar);
        o oVar = o.a;
        cVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        long j = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j) - 10800;
        long currentTimeMillis2 = System.currentTimeMillis() / j;
        try {
            String g2 = com.ss.android.c.a.b.g();
            if (g2 != null) {
                boolean z = this.a;
                Context context = this.b;
                boolean z2 = true;
                if (g2.length() > 0) {
                    com.bytedance.android.input.basic.a.a aVar = new com.bytedance.apm.r.e() { // from class: com.bytedance.android.input.basic.a.a
                        @Override // com.bytedance.apm.r.e
                        public final void a() {
                            com.ss.android.c.a.g("ImeLogManager", "uploadLog syncFlush");
                            com.ss.android.c.a.t();
                        }
                    };
                    if (!z) {
                        z2 = false;
                    }
                    com.bytedance.apm.c.a(g2, currentTimeMillis, currentTimeMillis2, "ime_upload", aVar, new b(z2, context));
                }
            }
        } catch (Exception e2) {
            com.ss.android.c.a.i("ImeLogManager", "uploadLog error", e2);
        }
        return o.a;
    }
}
