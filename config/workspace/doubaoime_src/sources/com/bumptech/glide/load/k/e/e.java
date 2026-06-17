package com.bumptech.glide.load.k.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.g;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class e implements g<Uri, Drawable> {
    public static final com.bumptech.glide.load.e<Resources.Theme> b = com.bumptech.glide.load.e.c("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private final Context a;

    public e(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@NonNull Uri uri, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // com.bumptech.glide.load.g
    @Nullable
    public /* bridge */ /* synthetic */ v<Drawable> b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) throws IOException {
        return c(uri, fVar);
    }

    @Nullable
    public v c(@NonNull Uri uri, @NonNull com.bumptech.glide.load.f fVar) {
        Context context;
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(this.a.getPackageName())) {
                    throw new IllegalArgumentException(e.a.a.a.a.o("Failed to obtain context or unrecognized Uri format for: ", uri), e2);
                }
                context = this.a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException(e.a.a.a.a.o("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(e.a.a.a.a.o("Unrecognized Uri format: ", uri));
            }
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(e.a.a.a.a.o("Unrecognized Uri format: ", uri), e3);
            }
        }
        Resources.Theme theme = authority.equals(this.a.getPackageName()) ? (Resources.Theme) fVar.c(b) : null;
        return d.b(theme == null ? b.b(this.a, context, parseInt) : b.a(this.a, parseInt, theme));
    }
}
