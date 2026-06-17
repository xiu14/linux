package com.vivo.push.d;

import android.app.Activity;
import android.os.SystemClock;
import com.vivo.push.IPushActionListener;
import com.vivo.push.m;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
public final class b {
    private long a;

    private static class a {
        private static final b a = new b(0);
    }

    /* synthetic */ b(byte b) {
        this();
    }

    public static b a() {
        return a.a;
    }

    private b() {
        this.a = 0L;
    }

    public final void a(Activity activity, IPushActionListener iPushActionListener) {
        if (iPushActionListener == null) {
            return;
        }
        com.vivo.push.util.g.a().execute(new c(this, activity, iPushActionListener));
    }

    public final void a(Activity activity, IPushActionListener iPushActionListener, long j) {
        if (iPushActionListener == null) {
            return;
        }
        m.a();
        if (!m.a(this.a)) {
            t.c("NotifyGuideDialogManage", "tryShowGuideDialog: isCallingTooQuick, return");
            iPushActionListener.onStateChanged(1002);
        } else {
            this.a = SystemClock.elapsedRealtime();
            com.vivo.push.util.g.a().execute(new e(this, activity, iPushActionListener, j));
        }
    }

    static /* synthetic */ int a(Activity activity) {
        if (!((activity == null || activity.isFinishing() || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getVisibility() != 0) ? false : true)) {
            return 8105;
        }
        if (com.vivo.push.restructure.a.a().g().a(16384)) {
            return com.vivo.push.restructure.a.a().f().b(activity) ? 8107 : 0;
        }
        return 8106;
    }
}
