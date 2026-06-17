package androidx.core.net;

import android.net.Uri;
import e.a.a.a.a;
import java.io.File;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class UriKt {
    public static final File toFile(Uri uri) {
        l.f(uri, "<this>");
        if (!l.a(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(a.o("Uri lacks 'file' scheme: ", uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(a.o("Uri path is null: ", uri).toString());
    }

    public static final Uri toUri(String str) {
        l.f(str, "<this>");
        Uri parse = Uri.parse(str);
        l.e(parse, "parse(this)");
        return parse;
    }

    public static final Uri toUri(File file) {
        l.f(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        l.e(fromFile, "fromFile(this)");
        return fromFile;
    }
}
