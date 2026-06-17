package ms.bd.c;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class v implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches((String) y2.a(16777217, 0, 0L, "f6999a", new byte[]{116, 36, 95, 118, 86, 59, 60, 42}), file.getName());
    }
}
