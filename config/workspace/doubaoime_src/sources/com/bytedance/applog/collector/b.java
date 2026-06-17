package com.bytedance.applog.collector;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.applog.B.i;
import com.bytedance.applog.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class b implements Handler.Callback {
    private final c a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3780c = true;

    /* renamed from: d, reason: collision with root package name */
    private int f3781d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3782e = false;

    public b(c cVar, Looper looper) {
        this.a = cVar;
        this.b = new Handler(looper, this);
    }

    public void a(i iVar) {
        if (iVar.w > 0) {
            this.b.sendEmptyMessageDelayed(9999, 500L);
            this.f3781d = Math.max(0, this.f3781d - 1);
            return;
        }
        this.b.removeMessages(9999);
        this.f3781d++;
        if (this.f3780c) {
            this.f3780c = false;
            this.a.I().h("App first to frontend...", new Object[0]);
        }
        if (this.f3782e) {
            this.f3782e = false;
            this.a.I().h("App back to frontend...", new Object[0]);
            if (this.a.C() != null) {
                Objects.requireNonNull(this.a.C());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 9999) {
            this.f3782e = true;
            this.a.I().h("App enter to background...", new Object[0]);
            if (this.a.C() != null) {
                Objects.requireNonNull(this.a.C());
            }
            if (this.a.C() != null) {
                Objects.requireNonNull(this.a.C());
            }
            this.a.K().g();
        }
        return false;
    }
}
