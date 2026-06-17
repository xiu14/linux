package com.bytedance.android.input.speech;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I {
    private boolean a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private E f3079c;

    /* renamed from: d, reason: collision with root package name */
    private E f3080d;

    /* renamed from: e, reason: collision with root package name */
    private E f3081e;

    /* renamed from: f, reason: collision with root package name */
    private E f3082f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3083g;
    private int h;
    private ArrayList<Long> i;
    private Integer j;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            kotlin.s.c.l.f(str, "it");
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            kotlin.s.c.l.f(str, "it");
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            kotlin.s.c.l.f(str, "it");
            return kotlin.o.a;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        d() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "end");
            I.this.f3079c.j(I.this.f3079c.c() + str2);
            return kotlin.o.a;
        }
    }

    public I() {
        new Handler(Looper.getMainLooper());
        this.b = "";
        this.f3079c = new E(this, b.a);
        this.f3080d = new E(this, c.a);
        this.f3081e = new E(this, new d());
        this.f3082f = new E(this, a.a);
        this.f3083g = true;
        this.i = new ArrayList<>();
    }

    private final void b() {
        if (this.i.size() >= 3) {
            this.i.remove((Object) 0L);
        }
        this.i.add(Long.valueOf(System.currentTimeMillis()));
    }

    private final void d(String str, boolean z, boolean z2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.x("Asr-Flow-ProcessEditText", "commitVoiceText start");
        i("commitVoiceText haveWaitResult = " + z + ", commit = " + z2 + ", commit_str = " + str);
        o();
        this.f3082f.i();
        com.bytedance.android.input.editor.a q = KeyboardJni.getService().q();
        if (q == null) {
            return;
        }
        AsrContext asrContext = AsrContext.a;
        String e2 = asrContext.G() ? new kotlin.text.i("\\p{Punct}").e(str, "") : str;
        if ((z2 && com.bytedance.android.input.common.g.b().equals("com.tencent.tmgp.sgame")) || asrContext.G()) {
            q.b(e2, 1);
        } else {
            i(e.a.a.a.a.s("commitVoiceText finishVoiceComposingText commit_str = ", str));
            q.c();
        }
        this.h = e2.length() + this.h;
        this.b = "";
        this.j = null;
        AsrManager asrManager = AsrManager.a;
        asrManager.k0(true);
        b();
        asrManager.g0(this.h);
        com.bytedance.android.input.common.o.c();
        com.bytedance.android.input.common.o.d(this.h);
        asrContext.c0(true);
        asrContext.W(true);
        if (z) {
            com.bytedance.android.input.speech.view.l.a.a();
        } else {
            com.bytedance.android.input.speech.view.l.a.e(this.b);
        }
        AsrManager.i0(asrManager, "StopCommit", 0L, false, null, 14);
        aVar.x("Asr-Flow-ProcessEditText", "commitVoiceText finish");
    }

    private final void i(String str) {
        IAppGlobals.a.j("Asr-Flow-ProcessEditText", str);
    }

    private final void o() {
        this.f3080d.i();
        this.f3081e.i();
        this.f3079c.j("");
    }

    public final void c() {
        com.bytedance.android.input.editor.a q;
        if (AsrManager.a.G() || (q = KeyboardJni.getService().q()) == null) {
            return;
        }
        if (!this.a) {
            StringBuilder M = e.a.a.a.a.M("end animation = ");
            M.append(this.b);
            com.bytedance.android.input.r.j.i("Asr-Flow-ProcessEditText", M.toString());
            SpannableString spannableString = new SpannableString(this.b);
            spannableString.setSpan(new ForegroundColorSpan(this.f3082f.b()), 0, this.b.length(), 33);
            q.g(spannableString, 1);
            return;
        }
        this.b = this.f3079c.c() + this.f3081e.c() + this.f3080d.c();
        StringBuilder M2 = e.a.a.a.a.M("all = ");
        M2.append(this.b);
        M2.append(", end = ");
        M2.append(this.f3079c.c());
        M2.append(", pre = ");
        M2.append(this.f3080d.c());
        com.bytedance.android.input.r.j.i("Asr-Flow-ProcessEditText", M2.toString());
        SpannableString spannableString2 = new SpannableString(this.b);
        if (this.f3079c.c().length() > 0) {
            spannableString2.setSpan(new StyleSpan(0), 0, this.f3079c.c().length(), 33);
        }
        if (this.f3081e.c().length() > 0) {
            spannableString2.setSpan(new ForegroundColorSpan(this.f3081e.b()), this.f3079c.c().length(), this.f3081e.c().length() + this.f3079c.c().length(), 33);
        }
        if (this.f3080d.c().length() > 0) {
            spannableString2.setSpan(new ForegroundColorSpan(this.f3080d.b()), this.f3081e.c().length() + this.f3079c.c().length(), this.b.length(), 33);
        }
        q.g(spannableString2, 1);
    }

    public final void e(boolean z) {
        if (this.b.length() > 0) {
            d(this.b, false, z);
        }
        AsrManager.a.f0(this.h);
        StringBuilder sb = new StringBuilder();
        sb.append("finishVoiceComposingText: commitPreEditText update ci = ");
        e.a.a.a.a.C0(sb, this.h, "Asr-Flow-AsrManager");
    }

    public final int f() {
        return this.h;
    }

    public final String g() {
        return this.b;
    }

    public final boolean h() {
        if (this.i.size() < 3) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.i.get(0);
        kotlin.s.c.l.e(l, "mUseAsrTime[0]");
        long longValue = currentTimeMillis - l.longValue();
        return longValue >= 0 && longValue < com.heytap.mcssdk.constant.a.f6888f;
    }

    public final int j() {
        return this.b.length();
    }

    public final void k() {
        if (this.b.length() > 0) {
            int length = this.b.length() + this.h;
            this.h = length;
            AsrManager asrManager = AsrManager.a;
            asrManager.g0(length);
            com.bytedance.android.input.common.o.c();
            com.bytedance.android.input.common.o.d(this.b.length());
            asrManager.f0(this.h);
            this.b = "";
            b();
            AsrManager.i0(asrManager, "StopCommit", 0L, false, null, 14);
        }
    }

    public final void l() {
        this.a = true;
        this.b = "";
        this.j = null;
        KeyboardJni.getService().F();
        n(false);
        this.h = 0;
    }

    public final void m() {
        o();
        this.a = false;
        com.bytedance.android.input.r.j.m("Asr-Flow-ProcessEditText", "stop");
    }

    public final void n(boolean z) {
        o();
        this.f3082f.i();
    }

    public final void p(String str) {
        kotlin.s.c.l.f(str, "text");
        q(str);
        if (this.b.length() > 0) {
            d(this.b, false, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.I.q(java.lang.String):void");
    }
}
