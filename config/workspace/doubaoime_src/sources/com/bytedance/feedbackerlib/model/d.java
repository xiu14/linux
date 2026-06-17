package com.bytedance.feedbackerlib.model;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.model.b;
import java.util.List;

/* loaded from: classes.dex */
class d implements b.s {
    final /* synthetic */ b.s a;
    final /* synthetic */ Uri b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4942c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f4943d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f4944e;

    d(b bVar, b.s sVar, Uri uri, String str, String str2) {
        this.f4944e = bVar;
        this.a = sVar;
        this.b = uri;
        this.f4942c = str;
        this.f4943d = str2;
    }

    @Override // com.bytedance.feedbackerlib.model.b.s
    public void a(int i, @Nullable String str, List<String> list, List<String> list2) {
        if (i == 1) {
            this.a.a(1, str, null, null);
            return;
        }
        Uri uri = this.b;
        if (uri != null) {
            this.f4944e.Z(this.f4942c, uri, this.a, list, this.f4943d);
        } else {
            this.a.a(0, str, list, list2);
        }
    }
}
