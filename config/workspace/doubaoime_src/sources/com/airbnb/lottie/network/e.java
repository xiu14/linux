package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class e {

    @NonNull
    private final d a;

    @NonNull
    private final b b;

    public e(@NonNull d dVar, @NonNull b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @NonNull
    private o<g> b(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        o<g> n;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.y.d.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            n = str3 == null ? h.n(new ZipInputStream(inputStream), null) : h.n(new ZipInputStream(new FileInputStream(this.a.e(str, inputStream, fileExtension))), str);
        } else {
            com.airbnb.lottie.y.d.a("Received json response.");
            fileExtension = FileExtension.JSON;
            n = str3 == null ? h.g(inputStream, null) : h.g(new FileInputStream(new File(this.a.e(str, inputStream, fileExtension).getAbsolutePath())), str);
        }
        if (str3 != null && n.b() != null) {
            this.a.d(str, fileExtension);
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.airbnb.lottie.o<com.airbnb.lottie.g>] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:18:0x00ce). Please report as a decompilation issue!!! */
    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.airbnb.lottie.o<com.airbnb.lottie.g> a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
        L3:
            r1 = r0
            goto L34
        L5:
            com.airbnb.lottie.network.d r1 = r4.a
            android.util.Pair r1 = r1.a(r5)
            if (r1 != 0) goto Le
            goto L3
        Le:
            java.lang.Object r2 = r1.first
            com.airbnb.lottie.network.FileExtension r2 = (com.airbnb.lottie.network.FileExtension) r2
            java.lang.Object r1 = r1.second
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.airbnb.lottie.network.FileExtension r3 = com.airbnb.lottie.network.FileExtension.ZIP
            if (r2 != r3) goto L24
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r1)
            com.airbnb.lottie.o r1 = com.airbnb.lottie.h.n(r2, r5)
            goto L28
        L24:
            com.airbnb.lottie.o r1 = com.airbnb.lottie.h.g(r1, r5)
        L28:
            java.lang.Object r2 = r1.b()
            if (r2 == 0) goto L3
            java.lang.Object r1 = r1.b()
            com.airbnb.lottie.g r1 = (com.airbnb.lottie.g) r1
        L34:
            if (r1 == 0) goto L3c
            com.airbnb.lottie.o r5 = new com.airbnb.lottie.o
            r5.<init>(r1)
            return r5
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Animation for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " not found in cache. Fetching from network."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.airbnb.lottie.y.d.a(r1)
            java.lang.String r1 = "LottieFetchResult close failed "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fetching "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.airbnb.lottie.y.d.a(r2)
            com.airbnb.lottie.network.b r2 = r4.b     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            com.airbnb.lottie.network.a r0 = r2.a(r5)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            boolean r2 = r0.o()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            if (r2 == 0) goto La9
            java.io.InputStream r2 = r0.a()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.String r3 = r0.d()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            com.airbnb.lottie.o r5 = r4.b(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            r6.<init>()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.String r2 = "Completed fetch from network. Success: "
            r6.append(r2)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.Object r2 = r5.b()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            if (r2 == 0) goto L95
            r2 = 1
            goto L96
        L95:
            r2 = 0
        L96:
            r6.append(r2)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            com.airbnb.lottie.y.d.a(r6)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            r0.close()     // Catch: java.io.IOException -> La4
            goto Lce
        La4:
            r6 = move-exception
            com.airbnb.lottie.y.d.d(r1, r6)
            goto Lce
        La9:
            com.airbnb.lottie.o r5 = new com.airbnb.lottie.o     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            java.lang.String r2 = r0.h()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbd
            r0.close()     // Catch: java.io.IOException -> La4
            goto Lce
        Lbb:
            r5 = move-exception
            goto Lcf
        Lbd:
            r5 = move-exception
            com.airbnb.lottie.o r6 = new com.airbnb.lottie.o     // Catch: java.lang.Throwable -> Lbb
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lcd
            r0.close()     // Catch: java.io.IOException -> Lc9
            goto Lcd
        Lc9:
            r5 = move-exception
            com.airbnb.lottie.y.d.d(r1, r5)
        Lcd:
            r5 = r6
        Lce:
            return r5
        Lcf:
            if (r0 == 0) goto Ld9
            r0.close()     // Catch: java.io.IOException -> Ld5
            goto Ld9
        Ld5:
            r6 = move-exception
            com.airbnb.lottie.y.d.d(r1, r6)
        Ld9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.e.a(java.lang.String, java.lang.String):com.airbnb.lottie.o");
    }
}
