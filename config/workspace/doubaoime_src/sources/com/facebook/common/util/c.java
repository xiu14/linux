package com.facebook.common.util;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
    public static final /* synthetic */ int b = 0;

    public static int a(Context context, Uri uri) {
        Integer valueOf;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String authority = uri.getAuthority();
            if (TextUtils.isEmpty(authority)) {
                authority = context.getPackageName();
            }
            String str = pathSegments.get(0);
            valueOf = Integer.valueOf(context.getResources().getIdentifier(pathSegments.get(1), str, authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    valueOf = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            valueOf = null;
        }
        if (valueOf == null) {
            throw new IllegalArgumentException(e.a.a.a.a.o("Unrecognized Uri format: ", uri));
        }
        if (valueOf.intValue() > 0) {
            return valueOf.intValue();
        }
        throw new IllegalArgumentException(e.a.a.a.a.o("Failed to obtain resource id for: ", uri));
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean c(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean d(Uri uri) {
        return e(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(a.getPath());
    }

    public static boolean e(Uri uri) {
        return "content".equals(b(uri));
    }

    public static boolean f(Uri uri) {
        return "file".equals(b(uri));
    }

    public static boolean g(Uri uri) {
        return "res".equals(b(uri));
    }

    public static boolean h(Uri uri) {
        String b2 = b(uri);
        return "https".equals(b2) || "http".equals(b2);
    }
}
