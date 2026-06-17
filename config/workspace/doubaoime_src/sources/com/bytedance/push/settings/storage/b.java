package com.bytedance.push.settings.storage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
final class b {
    String a;
    String b;

    /* renamed from: c, reason: collision with root package name */
    String f5829c;

    /* renamed from: d, reason: collision with root package name */
    String f5830d;

    b(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.f5829c = str3;
        this.f5830d = str4;
    }

    public static b a(Uri uri) {
        List<String> pathSegments;
        if (uri == null || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 4) {
            return null;
        }
        return new b(pathSegments.get(0), pathSegments.get(1), pathSegments.get(2), pathSegments.get(3));
    }

    Uri b(Uri uri) {
        return uri.buildUpon().appendPath(this.a).appendPath(this.b).appendPath(this.f5829c).appendPath(this.f5830d).build();
    }
}
