package com.bytedance.android.alog;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class a implements FilenameFilter {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Pattern b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f1874c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f1875d;

    a(ArrayList arrayList, Pattern pattern, long j, long j2) {
        this.a = arrayList;
        this.b = pattern;
        this.f1874c = j;
        this.f1875d = j2;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String group;
        this.a.add(str);
        Matcher matcher = this.b.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1 || (group = matcher.group(1)) == null) {
            return false;
        }
        long parseLong = Long.parseLong(group);
        if (parseLong > 0 && parseLong <= this.f1874c) {
            long lastModified = new File(file, str).lastModified();
            if (lastModified > 0 && lastModified >= this.f1875d) {
                return true;
            }
        }
        return false;
    }
}
