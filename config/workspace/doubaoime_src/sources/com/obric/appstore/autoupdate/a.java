package com.obric.appstore.autoupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
class a implements View.OnClickListener {
    final /* synthetic */ d a;

    a(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Bundle bundle;
        Context context;
        String str;
        bundle = this.a.f7517g;
        int i = bundle.getInt("auto_update_version_code");
        e e2 = e.e();
        context = this.a.a;
        str = this.a.b;
        e2.c(context, str, i);
        d.d(this.a);
    }
}
