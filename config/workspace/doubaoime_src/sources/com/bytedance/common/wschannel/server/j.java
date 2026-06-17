package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.server.e;
import java.util.Objects;

/* loaded from: classes.dex */
class j implements e {
    private final Handler a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private e.a f4330c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4331d;

    /* renamed from: e, reason: collision with root package name */
    private ContentObserver f4332e;

    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            if (Logger.debug()) {
                Logger.d("WsChannelService", "KEY_FRONTIER_ENABLED");
            }
            j.c(j.this);
        }
    }

    j(Context context, Handler handler) {
        this.a = handler;
        this.b = context;
    }

    static void c(j jVar) {
        e.a aVar;
        Objects.requireNonNull(jVar);
        try {
            boolean z = jVar.f4331d;
            jVar.d();
            boolean z2 = jVar.f4331d;
            if (z == z2 || (aVar = jVar.f4330c) == null) {
                return;
            }
            ((b) aVar).k(z2);
        } catch (Exception unused) {
        }
    }

    private void d() {
        try {
            boolean f2 = com.bytedance.common.wschannel.k.e(this.b).f();
            if (Logger.debug()) {
                Logger.d("WsChannelService", "pushSdkEnabled = " + f2);
            }
            if (f2 != this.f4331d) {
                this.f4331d = f2;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.e
    public void a() {
        d();
        this.f4332e = new a(this.a);
        try {
            this.b.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.b(this.b, WsConstants.KEY_FRONTIER_ENABLED, TypedValues.Custom.S_BOOLEAN), true, this.f4332e);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.e
    public void b(e.a aVar) {
        this.f4330c = aVar;
    }

    @Override // com.bytedance.common.wschannel.server.e
    public boolean isEnable() {
        return this.f4331d;
    }
}
