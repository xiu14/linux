package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d {

    @NonNull
    private final c a;

    public d(@NonNull c cVar) {
        this.a = cVar;
    }

    private static String b(String str, FileExtension fileExtension, boolean z) {
        StringBuilder M = e.a.a.a.a.M("lottie_cache_");
        M.append(str.replaceAll("\\W+", ""));
        M.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return M.toString();
    }

    private File c() {
        File a = this.a.a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    @Nullable
    @WorkerThread
    Pair<FileExtension, InputStream> a(String str) {
        try {
            File c2 = c();
            FileExtension fileExtension = FileExtension.JSON;
            File file = new File(c2, b(str, fileExtension, false));
            if (!file.exists()) {
                file = new File(c(), b(str, FileExtension.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            }
            StringBuilder U = e.a.a.a.a.U("Cache hit for ", str, " at ");
            U.append(file.getAbsolutePath());
            com.airbnb.lottie.y.d.a(U.toString());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void d(String str, FileExtension fileExtension) {
        File file = new File(c(), b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.y.d.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Unable to rename cache file ");
        M.append(file.getAbsolutePath());
        M.append(" to ");
        M.append(file2.getAbsolutePath());
        M.append(".");
        com.airbnb.lottie.y.d.c(M.toString());
    }

    File e(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(c(), b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
