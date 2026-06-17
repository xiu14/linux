package com.bytedance.android.input.upgrade;

import com.bytedance.android.input.h.a;
import com.bytedance.android.input.upgrade.DownloadClient;
import com.obric.common.upgrade.VersionCheckResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d extends a.AbstractBinderC0071a {
    final /* synthetic */ DownloadClient b;

    d(DownloadClient downloadClient) {
        this.b = downloadClient;
    }

    @Override // com.bytedance.android.input.h.a
    public void a(int i, String str) {
        List list;
        l.f(str, "errorMsg");
        Objects.requireNonNull(this.b);
        Objects.requireNonNull(this.b);
        this.b.f3216f = DownloadClient.DownloadStatus.FAILED;
        list = this.b.f3217g;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((DownloadClient.b) it2.next()).a(i, str);
        }
    }

    @Override // com.bytedance.android.input.h.a
    public void b(VersionCheckResponse versionCheckResponse) {
        List list;
        l.f(versionCheckResponse, "response");
        Objects.requireNonNull(this.b);
        this.b.f3216f = DownloadClient.DownloadStatus.SUCCESS;
        list = this.b.f3217g;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((DownloadClient.b) it2.next()).b(versionCheckResponse);
        }
    }

    @Override // com.bytedance.android.input.h.a
    public void c(int i, long j, long j2, String str) {
        List list;
        l.f(str, "downloadUrl");
        Objects.requireNonNull(this.b);
        this.b.f3216f = DownloadClient.DownloadStatus.IN_PROGRESS;
        list = this.b.f3217g;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((DownloadClient.b) it2.next()).c(i, j, j2, str);
        }
    }
}
