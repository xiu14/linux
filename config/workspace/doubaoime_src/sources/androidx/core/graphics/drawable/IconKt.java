package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class IconKt {
    @RequiresApi(26)
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        l.f(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        l.e(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Bitmap bitmap) {
        l.f(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        l.e(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Uri uri) {
        l.f(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        l.e(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @RequiresApi(26)
    public static final Icon toIcon(byte[] bArr) {
        l.f(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        l.e(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
