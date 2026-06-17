package com.bytedance.android.input.fragment.message.l;

import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.bytedance.android.input.common_biz.permission.e;
import com.bytedance.android.input.common_biz.permission.i;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.bytedance.android.input.fragment.message.l.a$a, reason: collision with other inner class name */
    public static final class C0069a implements e {
        C0069a() {
        }

        @Override // com.bytedance.android.input.common_biz.permission.e
        public void a(String[] strArr) {
            l.f(strArr, "denies");
            j.j("MessageCenter-Permission", "request notification permission fail, denies--POST_NOTIFICATIONS");
        }

        @Override // com.bytedance.android.input.common_biz.permission.e
        public void b() {
            j.m("MessageCenter-Permission", "request notification permission success");
        }

        public void c(String[] strArr) {
            l.f(strArr, "denies");
            j.j("MessageCenter-Permission", "request notification permission ignoredFail, denies--POST_NOTIFICATIONS");
        }
    }

    public static final void a(Context context) {
        Object J2;
        l.f(context, "context");
        try {
            j.i("MessageCenter-Permission", "areNotificationsEnabled: " + NotificationManagerCompat.from(context).areNotificationsEnabled());
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (Build.VERSION.SDK_INT < 33) {
            j.i("MessageCenter-Permission", "Android version is below 13, no need permission");
            return;
        }
        if (i.a(context, "android.permission.POST_NOTIFICATIONS")) {
            j.m("MessageCenter-Permission", "has notification permission");
            return;
        }
        j.m("MessageCenter-Permission", "prepare request notification permission");
        i.c(context, new String[]{"android.permission.POST_NOTIFICATIONS"}, null, null, new C0069a(), 12);
        J2 = o.a;
        Throwable b = h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("request notification permission error: "), "MessageCenter-Permission");
        }
    }
}
