package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v {
    private static final Set<String> a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with other field name */
    private Context f1175a;

    /* renamed from: a, reason: collision with other field name */
    private RandomAccessFile f1176a;

    /* renamed from: a, reason: collision with other field name */
    private String f1177a;

    /* renamed from: a, reason: collision with other field name */
    private FileLock f1178a;

    private v(Context context) {
        this.f1175a = context;
    }

    public static v a(Context context, File file) {
        StringBuilder M = e.a.a.a.a.M("Locking: ");
        M.append(file.getAbsolutePath());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = a;
        if (!set.add(str)) {
            throw new IOException("abtain lock failure");
        }
        v vVar = new v(context);
        vVar.f1177a = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            vVar.f1176a = randomAccessFile;
            vVar.f1178a = randomAccessFile.getChannel().lock();
            com.xiaomi.channel.commonutils.logger.c.c("Locked: " + str + " :" + vVar.f1178a);
            if (vVar.f1178a == null) {
                RandomAccessFile randomAccessFile2 = vVar.f1176a;
                if (randomAccessFile2 != null) {
                    y.a(randomAccessFile2);
                }
                set.remove(vVar.f1177a);
            }
            return vVar;
        } catch (Throwable th) {
            if (vVar.f1178a == null) {
                RandomAccessFile randomAccessFile3 = vVar.f1176a;
                if (randomAccessFile3 != null) {
                    y.a(randomAccessFile3);
                }
                a.remove(vVar.f1177a);
            }
            throw th;
        }
    }

    public void a() {
        StringBuilder M = e.a.a.a.a.M("unLock: ");
        M.append(this.f1178a);
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        FileLock fileLock = this.f1178a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1178a.release();
            } catch (IOException unused) {
            }
            this.f1178a = null;
        }
        RandomAccessFile randomAccessFile = this.f1176a;
        if (randomAccessFile != null) {
            y.a(randomAccessFile);
        }
        a.remove(this.f1177a);
    }
}
