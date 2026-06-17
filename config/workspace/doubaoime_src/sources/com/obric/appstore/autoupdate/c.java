package com.obric.appstore.autoupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
class c implements View.OnClickListener {
    final /* synthetic */ d a;

    c(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        int i;
        Context context;
        String str;
        boolean z2;
        Bundle bundle;
        Context context2;
        String str2;
        int i2;
        Context context3;
        String str3;
        Bundle bundle2;
        z = this.a.f7516f;
        if (z) {
            e e2 = e.e();
            context3 = this.a.a;
            str3 = this.a.f7514d;
            bundle2 = this.a.f7517g;
            e2.f(context3, str3, bundle2);
            d.d(this.a);
            return;
        }
        i = this.a.f7513c;
        if (i == 2) {
            context2 = this.a.a;
            str2 = this.a.b;
            i2 = this.a.f7513c;
            new g(context2, str2, i2).i(300L);
        }
        e e3 = e.e();
        context = this.a.a;
        str = this.a.f7514d;
        z2 = this.a.f7515e;
        bundle = this.a.f7517g;
        e3.i(context, str, z2, bundle);
        d.d(this.a);
    }
}
