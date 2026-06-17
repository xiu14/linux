package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class fm extends fj {
    public fm(Context context) {
        super(context, new fq() { // from class: com.xiaomi.push.fm.1
            @Override // com.xiaomi.push.fq
            public long a() {
                return 180000L;
            }

            @Override // com.xiaomi.push.fq
            /* renamed from: b */
            public long mo801b() {
                return 180000L;
            }
        });
    }

    @Override // com.xiaomi.push.fj
    protected void a(boolean z, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || ((fj) this).a == 0) {
            ((fj) this).a = elapsedRealtime + j;
        } else if (((fj) this).a <= elapsedRealtime) {
            ((fj) this).a += j;
            if (((fj) this).a < elapsedRealtime) {
                ((fj) this).a = elapsedRealtime + j;
            }
        }
    }

    @Override // com.xiaomi.push.fj, com.xiaomi.push.fk.a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo396b() {
        super.mo396b();
    }

    @Override // com.xiaomi.push.fj
    /* renamed from: a */
    protected Intent mo393a() {
        Intent mo393a = super.mo393a();
        mo393a.putExtra("FLAG_ALIGN_ALARM", true);
        mo393a.putExtra("ALARM_INTERVAL", 180000L);
        return mo393a;
    }
}
