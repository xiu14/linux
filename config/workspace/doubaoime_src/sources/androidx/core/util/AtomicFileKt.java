package androidx.core.util;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.o;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class AtomicFileKt {
    @RequiresApi(17)
    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        l.f(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        l.e(readFully, "readFully()");
        return readFully;
    }

    @RequiresApi(17)
    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        l.f(atomicFile, "<this>");
        l.f(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        l.e(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.c.a;
        }
        return readText(atomicFile, charset);
    }

    @RequiresApi(17)
    public static final void tryWrite(android.util.AtomicFile atomicFile, kotlin.s.b.l<? super FileOutputStream, o> lVar) {
        l.f(atomicFile, "<this>");
        l.f(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l.e(startWrite, "stream");
            lVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) {
        l.f(atomicFile, "<this>");
        l.f(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l.e(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) {
        l.f(atomicFile, "<this>");
        l.f(str, "text");
        l.f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.c.a;
        }
        writeText(atomicFile, str, charset);
    }
}
