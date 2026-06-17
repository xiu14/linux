package com.bytedance.crash.Z;

import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
final class i implements FilenameFilter {
    private long a = 2147483647L;
    final /* synthetic */ a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long[] f4548c;

    i(a aVar, long[] jArr) {
        this.b = aVar;
        this.f4548c = jArr;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        try {
            String[] split = str.split(BundleUtil.UNDERLINE_TAG);
            int parseInt = Integer.parseInt(split[0]);
            long parseLong = Long.parseLong(split[1]);
            if (parseInt == this.b.f()) {
                long m = this.b.m() - parseLong;
                if (m > 0 && m < this.a) {
                    this.f4548c[0] = parseLong;
                    this.a = m;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
