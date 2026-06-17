package com.bytedance.bdinstall.k0;

import android.content.Context;
import com.bytedance.bdinstall.C0629i;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.j0.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class q extends m {
    public q(Context context, Q q, C0641v c0641v) {
        super(context, q, c0641v);
    }

    @Override // com.bytedance.bdinstall.k0.m
    protected void p() {
        boolean a;
        super.p();
        if (this.f4032f.R()) {
            a = ((a.C0155a) C0629i.b()).a();
        } else {
            String valueOf = String.valueOf(this.f4032f.h());
            int i = C0629i.f4007c;
            a = ((a.C0155a) C0632l.n(valueOf).e()).a();
        }
        if (a) {
            com.bytedance.bdinstall.m0.k.n(this.f4031e).m();
        }
    }

    @Override // com.bytedance.bdinstall.k0.m
    public void w() {
        super.w();
        Objects.requireNonNull(this.f4032f);
        if (this.f4032f.a()) {
            if (com.bytedance.bdinstall.util.n.g()) {
                if (this.f4031e.getApplicationInfo().targetSdkVersion >= 30) {
                    int i = C0640u.a;
                    return;
                }
            }
            C0643x.i(this.f4032f.i(), new k(this.f4032f));
        }
    }
}
