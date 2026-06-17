package com.bytedance.android.input.speech.M;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.d;
import java.io.File;
import java.util.Objects;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class h {
    private final kotlin.e a = kotlin.a.c(a.a);
    private final kotlin.e b = kotlin.a.c(new b());

    static final class a extends m implements kotlin.s.b.a<Context> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Context invoke() {
            return IAppGlobals.a.getApplication().getApplicationContext();
        }
    }

    static final class b extends m implements kotlin.s.b.a<EffectConfig> {
        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public EffectConfig invoke() {
            Object J2;
            File filesDir;
            Objects.requireNonNull(h.this);
            boolean z = false;
            try {
                String string = IAppGlobals.a.getContext().getString(C0838R.string.enable_download_test_env_asr_mode);
                l.e(string, "IAppGlobals.context.getS…wnload_test_env_asr_mode)");
                Object g2 = SettingsConfigNext.g(string, Boolean.FALSE);
                l.d(g2, "null cannot be cast to non-null type kotlin.Boolean");
                z = ((Boolean) g2).booleanValue();
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                com.bytedance.android.input.r.j.i("EffectPlatformProvider", "SettingsConfigNext.getValue onFailure = " + b);
            }
            EffectConfig.ModelFileEnv modelFileEnv = z ? EffectConfig.ModelFileEnv.TEST : EffectConfig.ModelFileEnv.ONLINE;
            com.bytedance.android.input.r.j.i("EffectPlatformProvider", "modelFileEnv = " + modelFileEnv + "---status = " + modelFileEnv.ordinal());
            EffectConfig.a aVar = new EffectConfig.a();
            aVar.e("online");
            aVar.M("1.0.5");
            Objects.requireNonNull(IAppGlobals.a);
            aVar.c("1.3.9");
            String str = Build.MODEL;
            l.e(str, "MODEL");
            aVar.g(str);
            aVar.G(new com.ss.ugc.effectplatform.d.b.b(new i()));
            aVar.f(IAppLog.a.getDeviceId());
            aVar.a(h.a(h.this));
            StringBuilder sb = new StringBuilder();
            Context a = h.a(h.this);
            aVar.h(new File(e.a.a.a.a.J(sb, (a == null || (filesDir = a.getFilesDir()) == null) ? null : filesDir.getAbsolutePath(), "/effect/")).getAbsolutePath());
            aVar.i(new e());
            aVar.E("https://effect.snssdk.com");
            aVar.H(modelFileEnv);
            aVar.b("401734");
            aVar.L(1);
            aVar.K("CN");
            aVar.J("android");
            aVar.F(true);
            aVar.I(new g());
            return aVar.d();
        }
    }

    public static final Context a(h hVar) {
        return (Context) hVar.a.getValue();
    }

    public final void b() {
        d.a aVar = com.ss.ugc.effectplatform.algorithm.d.f8435g;
        if (aVar.a()) {
            return;
        }
        EffectConfig effectConfig = (EffectConfig) this.b.getValue();
        f fVar = new f();
        Objects.requireNonNull(effectConfig);
        l.g(fVar, "customLogger");
        d.a.c.b.b.d(fVar);
        EffectConfig effectConfig2 = (EffectConfig) this.b.getValue();
        synchronized (aVar) {
            l.g(effectConfig2, "config");
            if (com.ss.ugc.effectplatform.algorithm.d.f8434f != null) {
                throw new IllegalStateException("Duplicate initialization");
            }
            com.ss.ugc.effectplatform.algorithm.d.f8434f = new com.ss.ugc.effectplatform.algorithm.d(effectConfig2, null);
        }
    }
}
