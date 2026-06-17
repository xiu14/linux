package com.bytedance.android.input.q;

import android.os.Handler;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;

/* loaded from: classes.dex */
final class B extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(String str, String str2, String str3) {
        super(2);
        this.a = str;
        this.b = str2;
        this.f2925c = str3;
    }

    @Override // kotlin.s.b.p
    public kotlin.o invoke(String str, IRecognizer.e eVar) {
        int l;
        String str2 = str;
        IRecognizer.e eVar2 = eVar;
        kotlin.s.c.l.f(str2, "id");
        kotlin.s.c.l.f(eVar2, "result");
        IRecognizer.a.b(str2);
        z zVar = z.a;
        StringBuilder M = e.a.a.a.a.M("recognizeAndLoadRecommend currentScene=");
        M.append(z.k);
        com.bytedance.android.input.r.j.i("RecommendsManager", M.toString());
        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
        l = z.a.l(eVar2.a());
        keyboardJni.setEnableRecommend(l);
        KeyboardJni.getKeyboardJni().setRecommendScene(eVar2.a().ordinal());
        Handler handler = z.b;
        final String str3 = this.a;
        final String str4 = this.b;
        final String str5 = this.f2925c;
        handler.post(new Runnable() { // from class: com.bytedance.android.input.q.k
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                String str7 = str4;
                String str8 = str5;
                e.a.a.a.a.u0(str6, "$inputText", str7, "$message", str8, "$mandate");
                z.v(z.a, str6, str7, str8, false, false, 24);
            }
        });
        return kotlin.o.a;
    }
}
