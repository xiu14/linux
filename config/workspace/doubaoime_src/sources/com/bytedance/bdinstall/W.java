package com.bytedance.bdinstall;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.bdinstall.c0;

/* loaded from: classes.dex */
final class W implements E {
    private final Context a;
    private Q b;

    class a implements c0.c {
        final /* synthetic */ b a;

        a(W w, b bVar) {
            this.a = bVar;
        }

        @Override // com.bytedance.bdinstall.c0.c
        public void b(String str, String str2) {
            int i = C0640u.a;
            P h = P.h(str);
            if (h == null || TextUtils.isEmpty(h.c()) || TextUtils.isEmpty(h.e())) {
                String str3 = "install_info onUpdate invalid value " + h;
                return;
            }
            b bVar = this.a;
            if (bVar != null) {
                ((X) bVar).j(h, str2);
            }
        }
    }

    interface b {
    }

    W(Context context) {
        this.a = context;
    }

    @Override // com.bytedance.bdinstall.E
    public void a(@NonNull P p) {
        if (this.b == null) {
            return;
        }
        String jSONObject = p.o().toString();
        if (this.b.O) {
            this.a.getSharedPreferences("ug_install_op_pref", 0).edit().putString("install_info", jSONObject).apply();
        }
        c0.c(this.a).e(this.b.i(), "install_info", jSONObject);
    }

    P b() {
        try {
            String string = this.a.getSharedPreferences("ug_install_op_pref", 0).getString("install_info", null);
            if (TextUtils.isEmpty(string)) {
                int i = e0.f3978d;
            }
            return P.h(string);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void c(Q q) {
        this.b = q;
    }

    void d(Context context, b bVar) {
        if (this.b == null) {
            return;
        }
        c0.c(context).d(this.b.i(), "install_info", new a(this, bVar));
    }

    void e() {
        Q q = this.b;
        if (q == null) {
            return;
        }
        String valueOf = String.valueOf(q.h());
        int i = C0629i.f4007c;
        C0632l.n(valueOf).a(true, this);
    }
}
