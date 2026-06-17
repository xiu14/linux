package com.bytedance.android.input.fragment.settings;

import android.os.Handler;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;

/* loaded from: classes.dex */
final class Y0 extends kotlin.s.c.m implements kotlin.s.b.q<Integer, String, Boolean, kotlin.o> {
    final /* synthetic */ KeyFeedbackFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y0(KeyFeedbackFragment keyFeedbackFragment) {
        super(3);
        this.a = keyFeedbackFragment;
    }

    @Override // kotlin.s.b.q
    public kotlin.o d(Integer num, String str, Boolean bool) {
        Handler handler;
        Handler handler2;
        final kotlin.s.b.a aVar;
        long j;
        int intValue = num.intValue();
        String str2 = str;
        boolean booleanValue = bool.booleanValue();
        kotlin.s.c.l.f(str2, "text");
        StringBuilder sb = new StringBuilder();
        sb.append("keyFeedbackSound sound progress: ");
        sb.append(intValue);
        sb.append(" text=");
        sb.append(str2);
        sb.append(" state=");
        e.a.a.a.a.N0(sb, booleanValue, "KeyFeedbackFragment");
        if (this.a.f2390e != intValue) {
            this.a.f2390e = intValue;
            String string = this.a.getString(C0838R.string.key_sound_volume);
            kotlin.s.c.l.e(string, "getString(R.string.key_sound_volume)");
            SettingsConfigNext.l(string, Integer.valueOf(this.a.f2390e));
            handler = this.a.f2388c;
            handler.removeCallbacksAndMessages(null);
            handler2 = this.a.f2388c;
            aVar = this.a.f2392g;
            Runnable runnable = new Runnable() { // from class: com.bytedance.android.input.fragment.settings.O
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.s.b.a aVar2 = kotlin.s.b.a.this;
                    kotlin.s.c.l.f(aVar2, "$tmp0");
                    aVar2.invoke();
                }
            };
            j = this.a.f2389d;
            handler2.postDelayed(runnable, j);
        }
        return kotlin.o.a;
    }
}
