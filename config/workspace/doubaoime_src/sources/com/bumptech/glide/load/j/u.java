package com.bumptech.glide.load.j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.j.o;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class u<DataT> implements o<Uri, DataT> {
    private final Context a;
    private final o<Integer, DataT> b;

    private static final class a implements p<Uri, AssetFileDescriptor> {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, AssetFileDescriptor> d(@NonNull s sVar) {
            return new u(this.a, sVar.c(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class b implements p<Uri, InputStream> {
        private final Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<Uri, InputStream> d(@NonNull s sVar) {
            return new u(this.a, sVar.c(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.a = context.getApplicationContext();
        this.b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> d(Context context) {
        return new b(context);
    }

    @Override // com.bumptech.glide.load.j.o
    public boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority());
    }

    @Override // com.bumptech.glide.load.j.o
    @Nullable
    public o.a b(@NonNull Uri uri, int i, int i2, @NonNull com.bumptech.glide.load.f fVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        o.a<DataT> aVar = null;
        if (pathSegments.size() == 1) {
            try {
                int parseInt = Integer.parseInt(uri2.getPathSegments().get(0));
                if (parseInt != 0) {
                    aVar = this.b.b(Integer.valueOf(parseInt), i, i2, fVar);
                } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                }
                return aVar;
            } catch (NumberFormatException e2) {
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return aVar;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e2);
                return aVar;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        int identifier = this.a.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), this.a.getPackageName());
        if (identifier != 0) {
            return this.b.b(Integer.valueOf(identifier), i, i2, fVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
        return null;
    }
}
