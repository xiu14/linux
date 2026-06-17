package com.bytedance.apm.r;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class c implements FilenameFilter {
    final /* synthetic */ Pattern a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f3473c;

    c(d dVar, Pattern pattern, long j, long j2) {
        this.a = pattern;
        this.b = j;
        this.f3473c = j2;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String group;
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1 || (group = matcher.group(1)) == null) {
            return false;
        }
        long parseLong = Long.parseLong(group);
        if (parseLong <= 0 || parseLong > this.b) {
            return false;
        }
        long lastModified = new File(file, str).lastModified();
        return lastModified > 0 && lastModified >= this.f3473c;
    }
}
