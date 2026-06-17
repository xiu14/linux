package e.c.c.f;

import android.webkit.MimeTypeMap;
import e.c.c.d.f;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    private static final MimeTypeMap a = MimeTypeMap.getSingleton();
    private static final Map<String, String> b;

    static {
        f.of("image/heif", "heif", "image/heic", "heic");
        b = f.of("heif", "image/heif", "heic", "image/heic");
    }

    public static String a(String str) {
        String str2 = b.get(str);
        return str2 != null ? str2 : a.getMimeTypeFromExtension(str);
    }
}
