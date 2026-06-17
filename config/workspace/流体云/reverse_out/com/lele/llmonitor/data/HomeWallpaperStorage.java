package com.lele.llmonitor.data;
public final class HomeWallpaperStorage {
    public static final int $stable;
    public static final com.lele.llmonitor.data.HomeWallpaperStorage INSTANCE;

    static HomeWallpaperStorage()
    {
        com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE = new com.lele.llmonitor.data.HomeWallpaperStorage();
        return;
    }

    private HomeWallpaperStorage()
    {
        return;
    }

    public static synthetic boolean a(java.io.File p0, java.io.File p1)
    {
        return com.lele.llmonitor.data.HomeWallpaperStorage.resolveHistoryFiles$lambda$2(p0, p1);
    }

    public static final synthetic boolean access$copyUriToFile(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1, android.net.Uri p2, java.io.File p3)
    {
        return p0.copyUriToFile(p1, p2, p3);
    }

    public static final synthetic java.io.File access$createHistoryFile(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1)
    {
        return p0.createHistoryFile(p1);
    }

    public static final synthetic void access$deleteLocalFileUri(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.net.Uri p1)
    {
        p0.deleteLocalFileUri(p1);
        return;
    }

    public static final synthetic void access$ensureWallpaperDirectories(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1)
    {
        p0.ensureWallpaperDirectories(p1);
        return;
    }

    public static final synthetic boolean access$exportStartupPreview(com.lele.llmonitor.data.HomeWallpaperStorage p0, java.io.File p1, java.io.File p2, int p3, float p4, float p5, float p6)
    {
        return p0.exportStartupPreview(p1, p2, p3, p4, p5, p6);
    }

    public static final synthetic void access$pruneHistory(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1)
    {
        p0.pruneHistory(p1);
        return;
    }

    public static final synthetic boolean access$replaceCurrentWallpaper(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1, java.io.File p2)
    {
        return p0.replaceCurrentWallpaper(p1, p2);
    }

    private final android.graphics.Bitmap applyApproximateGaussianBlur(android.graphics.Bitmap p5, float p6)
    {
        android.graphics.Bitmap v4_8;
        if (p6 < 1103101952) {
            if (p6 < 1096810496) {
                v4_8 = 1059481190;
            } else {
                v4_8 = 1057803469;
            }
        } else {
            v4_8 = 1055286886;
        }
        android.graphics.Bitmap v0_3 = l02.F((((float) p5.getWidth()) * v4_8));
        if (v0_3 < 1) {
            v0_3 = 1;
        }
        android.graphics.Bitmap v2_3 = l02.F((((float) p5.getHeight()) * v4_8));
        if (v2_3 < 1) {
            v2_3 = 1;
        }
        if ((v0_3 != p5.getWidth()) || (v2_3 != p5.getHeight())) {
            android.graphics.Bitmap v0_4 = android.graphics.Bitmap.createScaledBitmap(p5, v0_3, v2_3, 1);
            v0_4.getClass();
        } else {
            v0_4 = p5;
        }
        android.graphics.Bitmap v4_3 = l02.F((p6 * v4_8));
        if (v4_3 < 1) {
            v4_3 = 1;
        }
        int v6_2 = 0;
        android.graphics.Bitmap v2_4 = v0_4;
        while (v6_2 < 3) {
            android.graphics.Bitmap v3_4 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.boxBlur(v2_4, v4_3);
            if ((v6_2 > 0) || (v0_4 != p5)) {
                v2_4.recycle();
            }
            v6_2++;
            v2_4 = v3_4;
        }
        if ((v2_4.getWidth() != p5.getWidth()) || (v2_4.getHeight() != p5.getHeight())) {
            android.graphics.Bitmap v4_9 = android.graphics.Bitmap.createScaledBitmap(v2_4, p5.getWidth(), p5.getHeight(), 1);
            v2_4.recycle();
            v4_9.getClass();
            return v4_9;
        } else {
            return v2_4;
        }
    }

    private final android.graphics.Bitmap applyRenderNodeBlur(android.graphics.Bitmap p5, float p6)
    {
        try {
            android.graphics.Bitmap v4_0 = p5.getWidth();
            int v0 = p5.getHeight();
            t41.i();
            android.graphics.RenderNode v1 = t41.f();
            t41.r(v1, v4_0, v0);
            k6.u(v1, k6.d(p6, p6));
            android.graphics.RecordingCanvas v6_2 = t41.e(v1, v4_0, v0);
            v6_2.getClass();
            t41.n(v6_2, p5, new android.graphics.Paint(3));
            t41.y(v1);
            android.graphics.Bitmap v4_1 = android.graphics.Bitmap.createBitmap(v4_0, v0, android.graphics.Bitmap$Config.ARGB_8888);
            v4_1.getClass();
            t41.l(new android.graphics.Canvas(v4_1), v1);
        } catch (android.graphics.Bitmap v4_2) {
            v4_1 = new cw2(v4_2);
        }
        if ((v4_1 instanceof cw2)) {
            v4_1 = 0;
        }
        return ((android.graphics.Bitmap) v4_1);
    }

    private final android.graphics.Bitmap applyWallpaperBlur(android.graphics.Bitmap p2, float p3, float p4)
    {
        float v3_1 = com.lele.llmonitor.data.HomeWallpaperBlurSupportKt.resolveHomeWallpaperBlurRadiusPx(p3, p4);
        if (v3_1 > 1056964608) {
            if (android.os.Build$VERSION.SDK_INT >= 31) {
                android.graphics.Bitmap v4_4 = this.applyRenderNodeBlur(p2, v3_1);
                if (v4_4 != null) {
                    return v4_4;
                }
            }
            return this.applyApproximateGaussianBlur(p2, v3_1);
        } else {
            return p2;
        }
    }

    public static synthetic boolean b(java.io.File p0)
    {
        return com.lele.llmonitor.data.HomeWallpaperStorage.resolveHistoryFiles$lambda$1(p0);
    }

    private final android.graphics.Bitmap boxBlur(android.graphics.Bitmap p19, int p20)
    {
        int v1_0 = 0;
        if (p20 > 0) {
            int v3_5 = 1;
            if ((p19.getWidth() > 1) && (p19.getHeight() > 1)) {
                int v7 = p19.getWidth();
                int v11 = p19.getHeight();
                int v2_2 = (v7 * v11);
                int v5_1 = new int[v2_2];
                p19.getPixels(v5_1, 0, v7, 0, 0, v7, v11);
                android.graphics.Bitmap v4_2 = new int[v2_2];
                int v2_15 = new int[v2_2];
                int v6_2 = ((p20 * 2) + 1);
                int v8_1 = 0;
                while (v8_1 < v11) {
                    int v14_4;
                    int v15;
                    int v13_6;
                    int v12_2;
                    int v9_1 = (v8_1 * v7);
                    int v10_1 = (- p20);
                    if (v10_1 > p20) {
                        this = v3_5;
                        v12_2 = 0;
                        v13_6 = 0;
                        v14_4 = 0;
                        v15 = 0;
                    } else {
                        v12_2 = v1_0;
                        v13_6 = v12_2;
                        v14_4 = v13_6;
                        v15 = v14_4;
                        while(true) {
                            this = v3_5;
                            int v3_4 = v5_1[(ib1.l(v10_1, v1_0, (v7 - 1)) + v9_1)];
                            v12_2 += (v3_4 >> 24);
                            v13_6 += ((v3_4 >> 16) & 255);
                            v14_4 += ((v3_4 >> 8) & 255);
                            v15 += (v3_4 & 255);
                            if (v10_1 == p20) {
                                break;
                            }
                            v10_1++;
                            v3_5 = this;
                            v1_0 = 0;
                        }
                    }
                    int v1_6 = 0;
                    while (v1_6 < v7) {
                        v4_2[(v9_1 + v1_6)] = (((((v12_2 / v6_2) << 24) | ((v13_6 / v6_2) << 16)) | ((v14_4 / v6_2) << 8)) | (v15 / v6_2));
                        int v10_7 = (v7 - 1);
                        int v17_5 = v1_6;
                        int v3_10 = v5_1[(ib1.l((v1_6 - p20), 0, v10_7) + v9_1)];
                        int v1_8 = v5_1[(ib1.l(((v17_5 + p20) + 1), 0, v10_7) + v9_1)];
                        v12_2 += ((v1_8 >> 24) - (v3_10 >> 24));
                        v13_6 += (((v1_8 >> 16) & 255) - ((v3_10 >> 16) & 255));
                        v14_4 += (((v1_8 >> 8) & 255) - ((v3_10 >> 8) & 255));
                        v15 += ((v1_8 & 255) - (v3_10 & 255));
                        v1_6 = (v17_5 + 1);
                    }
                    v8_1++;
                    v3_5 = this;
                    v1_0 = 0;
                }
                int v19_2 = v2_15;
                int v1_11 = 0;
                while (v1_11 < v7) {
                    int v2_1 = (- p20);
                    int v3_0 = 0;
                    int v5_0 = 0;
                    int v8_0 = 0;
                    int v9_0 = 0;
                    if (v2_1 <= p20) {
                        while(true) {
                            int v10_19 = v4_2[((ib1.l(v2_1, 0, (v11 - 1)) * v7) + v1_11)];
                            v3_0 += (v10_19 >> 24);
                            v5_0 += ((v10_19 >> 16) & 255);
                            v8_0 += ((v10_19 >> 8) & 255);
                            v9_0 += (v10_19 & 255);
                            if (v2_1 == p20) {
                                break;
                            }
                            v2_1++;
                        }
                    }
                    int v2_0 = 0;
                    while (v2_0 < v11) {
                        v19_2[((v2_0 * v7) + v1_11)] = (((((v3_0 / v6_2) << 24) | ((v5_0 / v6_2) << 16)) | ((v8_0 / v6_2) << 8)) | (v9_0 / v6_2));
                        int v12_14 = (v11 - 1);
                        int v10_27 = v4_2[((ib1.l((v2_0 - p20), 0, v12_14) * v7) + v1_11)];
                        int v12_18 = v4_2[((ib1.l(((v2_0 + p20) + 1), 0, v12_14) * v7) + v1_11)];
                        v3_0 += ((v12_18 >> 24) - (v10_27 >> 24));
                        v5_0 += (((v12_18 >> 16) & 255) - ((v10_27 >> 16) & 255));
                        v8_0 += (((v12_18 >> 8) & 255) - ((v10_27 >> 8) & 255));
                        v9_0 += ((v12_18 & 255) - (v10_27 & 255));
                        v2_0++;
                    }
                    v1_11++;
                }
                android.graphics.Bitmap v4_3 = android.graphics.Bitmap.createBitmap(v7, v11, android.graphics.Bitmap$Config.ARGB_8888);
                v4_3.setPixels(v19_2, 0, v7, 0, 0, v7, v11);
                return v4_3;
            }
        }
        android.graphics.Bitmap$Config v0_2 = p19.copy(android.graphics.Bitmap$Config.ARGB_8888, 0);
        v0_2.getClass();
        return v0_2;
    }

    public static synthetic void c(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.graphics.ImageDecoder p1, android.graphics.ImageDecoder$ImageInfo p2, android.graphics.ImageDecoder$Source p3)
    {
        com.lele.llmonitor.data.HomeWallpaperStorage.decodeStartupPreviewBitmap$lambda$0$0(p0, p1, p2, p3);
        return;
    }

    private final int calculateInSampleSize(int p3, int p4, int p5)
    {
        int v0 = 1;
        while ((Math.max(p3, p4) / 2) >= p5) {
            p3 /= 2;
            p4 /= 2;
            v0 *= 2;
        }
        if (v0 >= 1) {
            return v0;
        } else {
            return 1;
        }
    }

    private final boolean copyUriToFile(android.content.Context p4, android.net.Uri p5, java.io.File p6)
    {
        Boolean v3_7;
        Throwable v4_1;
        int v0_2 = 0;
        if (!ni1.o(p5.getScheme(), "file")) {
            v4_1 = p4.getContentResolver().openInputStream(p5);
            if (v4_1 != null) {
                try {
                    Boolean v3_2 = new java.io.FileOutputStream;
                    v3_2(p6);
                    try {
                        ni1.x(v4_1, v3_2);
                    } catch (Throwable v5_3) {
                        try {
                            throw v5_3;
                        } catch (int v0_1) {
                            p34.j(v3_2, v5_3);
                            throw v0_1;
                        }
                    }
                    v3_2.close();
                    v4_1.close();
                    if (p6.length() > 0) {
                        v0_2 = 1;
                    }
                    v3_7 = Boolean.valueOf(v0_2);
                    if (dw2.a(v3_7) != null) {
                        v3_7 = Boolean.FALSE;
                    }
                    Boolean v3_10 = ((Boolean) v3_7).booleanValue();
                    if (v3_10 == null) {
                        p6.delete();
                    }
                    return v3_10;
                } catch (Boolean v3_3) {
                    try {
                        throw v3_3;
                    } catch (Throwable v5_4) {
                        p34.j(v4_1, v3_3);
                        throw v5_4;
                    }
                }
            }
        } else {
            Boolean v3_1 = p5.getPath();
            if (v3_1 != null) {
                v4_1 = new java.io.FileInputStream(new java.io.File(v3_1));
            } else {
            }
        }
        return 0;
    }

    private final java.io.File createHistoryFile(android.content.Context p6)
    {
        String v0_2 = java.util.UUID.randomUUID().toString();
        v0_2.getClass();
        String v0_3 = hh3.N0(v0_2, 8);
        java.io.File v5_1 = this.resolveHistoryDirectory(p6);
        String v2_0 = System.currentTimeMillis();
        String v6_2 = new StringBuilder("wallpaper_");
        v6_2.append(v2_0);
        v6_2.append("_");
        v6_2.append(v0_3);
        v6_2.append(".img");
        return new java.io.File(v5_1, v6_2.toString());
    }

    public static synthetic boolean d(java.io.File p0)
    {
        return com.lele.llmonitor.data.HomeWallpaperStorage.pruneHistory$lambda$0(p0);
    }

    private final android.graphics.Bitmap decodeStartupPreviewBitmap(java.io.File p8)
    {
        android.graphics.Bitmap v0_0 = 0;
        android.graphics.Bitmap v7_4;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            android.graphics.BitmapFactory$Options v1_7 = new android.graphics.BitmapFactory$Options();
            v1_7.inJustDecodeBounds = 1;
            android.graphics.BitmapFactory.decodeFile(p8.getAbsolutePath(), v1_7);
            if (v1_7.outWidth > 0) {
                if (v1_7.outHeight > 0) {
                    android.graphics.BitmapFactory$Options v1_3 = new android.graphics.BitmapFactory$Options();
                    android.graphics.Bitmap$Config v2_2 = android.graphics.Bitmap$Config.ARGB_8888;
                    v1_3.inPreferredConfig = v2_2;
                    v1_3.inSampleSize = this.calculateInSampleSize(v1_3.outWidth, v1_3.outHeight, 960);
                    android.graphics.Bitmap v7_3 = android.graphics.BitmapFactory.decodeFile(p8.getAbsolutePath(), v1_3);
                    if (v7_3 != null) {
                        v7_4 = v7_3.copy(v2_2, 0);
                        if (!(v7_4 instanceof cw2)) {
                            v0_0 = v7_4;
                        }
                        return ((android.graphics.Bitmap) v0_0);
                    }
                } else {
                }
            }
            v7_4 = 0;
        } else {
            boolean v8_1 = j.g(p8);
            v8_1.getClass();
            v7_4 = j.e(v8_1, new o71(this)).copy(android.graphics.Bitmap$Config.ARGB_8888, 0);
        }
    }

    private static final void decodeStartupPreviewBitmap$lambda$0$0(com.lele.llmonitor.data.HomeWallpaperStorage p1, android.graphics.ImageDecoder p2, android.graphics.ImageDecoder$ImageInfo p3, android.graphics.ImageDecoder$Source p4)
    {
        p2.getClass();
        p3.getClass();
        p4.getClass();
        j.p(p2);
        j.z(p2);
        j.q(p2, p1.calculateInSampleSize(j.i(p3).getWidth(), j.i(p3).getHeight(), 960));
        return;
    }

    private final void deleteLocalFileUri(android.net.Uri p2)
    {
        if (ni1.o(p2.getScheme(), "file")) {
            String v1_2 = p2.getPath();
            if (v1_2 != null) {
                new java.io.File(v1_2).delete();
            }
        }
        return;
    }

    private final void ensureWallpaperDirectories(android.content.Context p2)
    {
        this.resolveWallpaperDirectory(p2).mkdirs();
        this.resolveHistoryDirectory(p2).mkdirs();
        return;
    }

    private final boolean exportStartupPreview(java.io.File p6, java.io.File p7, int p8, float p9, float p10, float p11)
    {
        int v1_1 = p7.getParentFile();
        android.graphics.Bitmap v2_3 = p7.getName();
        android.graphics.Canvas v3_4 = new StringBuilder();
        v3_4.append(v2_3);
        v3_4.append(".tmp");
        java.io.File v0_1 = new java.io.File(v1_1, v3_4.toString());
        v0_1.delete();
        android.graphics.Bitmap v6_1 = this.decodeStartupPreviewBitmap(p6);
        if (v6_1 != null) {
            android.graphics.Bitmap v2_2 = android.graphics.Bitmap.createBitmap(v6_1.getWidth(), v6_1.getHeight(), android.graphics.Bitmap$Config.ARGB_8888);
            v2_2.getClass();
            android.graphics.Canvas v3_2 = new android.graphics.Canvas(v2_2);
            v3_2.drawColor(p8);
            boolean v5_1 = this.applyWallpaperBlur(v6_1, p10, p11);
            boolean v8_2 = new android.graphics.Paint(3);
            v8_2.setAlpha(l02.F((ib1.k(p9, 0, 1065353216) * 1132396544)));
            v3_2.drawBitmap(v5_1, 0, 0, v8_2);
            try {
                boolean v8_9;
                boolean v8_4 = new java.io.FileOutputStream(v0_1);
                try {
                    v2_2.compress(android.graphics.Bitmap$CompressFormat.PNG, 100, v8_4);
                } catch (Throwable v9_5) {
                    try {
                        throw v9_5;
                    } catch (Throwable v10_5) {
                        p34.j(v8_4, v9_5);
                        throw v10_5;
                    }
                }
                boolean v8_7;
                v8_4.close();
                if (v0_1.length() <= 0) {
                    v8_7 = 0;
                } else {
                    v8_7 = 1;
                }
                v8_9 = Boolean.valueOf(v8_7);
                if (dw2.a(v8_9) != null) {
                    v8_9 = Boolean.FALSE;
                }
                boolean v8_11 = ((Boolean) v8_9).booleanValue();
                if (v5_1 == v6_1) {
                    v6_1.recycle();
                } else {
                    v6_1.recycle();
                    v5_1.recycle();
                }
                v2_2.recycle();
                if (v8_11) {
                    if (p7.exists()) {
                        p7.delete();
                    }
                    return v0_1.renameTo(p7);
                } else {
                    v0_1.delete();
                    return 0;
                }
            } catch (boolean v8_8) {
                v8_9 = new cw2(v8_8);
            }
        } else {
            v0_1.delete();
            p7.delete();
            return 0;
        }
    }

    private final boolean fastSignatureEquals(java.io.File p6, java.io.File p7)
    {
        if (!ni1.o(p6.getAbsolutePath(), p7.getAbsolutePath())) {
            if ((p6.length() != p7.length()) || (p6.lastModified() != p7.lastModified())) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public static synthetic Object importWallpaper$default(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1, android.net.Uri p2, boolean p3, n60 p4, int p5, Object p6)
    {
        if ((p5 & 4) != 0) {
            p3 = 0;
        }
        return p0.importWallpaper(p1, p2, p3, p4);
    }

    private final void pruneHistory(android.content.Context p3)
    {
        java.util.Iterator v2_6 = this.resolveHistoryDirectory(p3).listFiles();
        if (v2_6 != null) {
            bu0 v0_1 = new bu0(wh.R(v2_6), 1, new u70(21));
            java.util.Iterator v2_2 = new com.lele.llmonitor.data.HomeWallpaperStorage$pruneHistory$$inlined$sortedByDescending$1;
            v2_2();
            java.util.Iterator v2_5 = b63.b0(new m21(1, v0_1, v2_2), 10).iterator();
            while (v2_5.hasNext()) {
                ((java.io.File) v2_5.next()).delete();
            }
        }
        return;
    }

    private static final boolean pruneHistory$lambda$0(java.io.File p0)
    {
        return p0.isFile();
    }

    private final boolean replaceCurrentWallpaper(android.content.Context p8, java.io.File p9)
    {
        boolean v7_1 = this.resolveWallpaperFile(p8);
        int v8_2 = v7_1.getParentFile();
        if (v8_2 != 0) {
            java.io.File v1_1 = new java.io.File(v8_2, "current_wallpaper.tmp");
            java.io.File v2_0 = new java.io.File(v8_2, "current_wallpaper.bak");
            v1_1.delete();
            v2_0.delete();
            try {
                Boolean v9_7;
                boolean v3_2 = new java.io.FileInputStream(p9);
                try {
                    Boolean v9_2 = new java.io.FileOutputStream(v1_1);
                    try {
                        ni1.x(v3_2, v9_2);
                    } catch (Throwable v4_0) {
                        try {
                            throw v4_0;
                        } catch (Throwable v5_0) {
                            p34.j(v9_2, v4_0);
                            throw v5_0;
                        }
                    }
                    v9_2.close();
                    Boolean v9_5;
                    v3_2.close();
                    if (v1_1.length() <= 0) {
                        v9_5 = 0;
                    } else {
                        v9_5 = 1;
                    }
                    v9_7 = Boolean.valueOf(v9_5);
                    if (dw2.a(v9_7) != null) {
                        v9_7 = Boolean.FALSE;
                    }
                    if (((Boolean) v9_7).booleanValue()) {
                        Boolean v9_10 = v7_1.exists();
                        if ((v9_10 == null) || (v7_1.renameTo(v2_0))) {
                            if (v1_1.renameTo(v7_1)) {
                                if (v2_0.exists()) {
                                    v2_0.delete();
                                }
                                return 1;
                            } else {
                                v1_1.delete();
                                if (v9_10 != null) {
                                    v2_0.renameTo(v7_1);
                                }
                            }
                        } else {
                            v1_1.delete();
                            return 0;
                        }
                    } else {
                        v1_1.delete();
                        return 0;
                    }
                } catch (Boolean v9_3) {
                    try {
                        throw v9_3;
                    } catch (Throwable v4_1) {
                        p34.j(v3_2, v9_3);
                        throw v4_1;
                    }
                }
            } catch (Boolean v9_6) {
                v9_7 = new cw2(v9_6);
            }
        }
        return 0;
    }

    private final java.io.File resolveHistoryDirectory(android.content.Context p2)
    {
        return new java.io.File(this.resolveWallpaperDirectory(p2), "history");
    }

    public static synthetic java.util.List resolveHistoryFiles$default(com.lele.llmonitor.data.HomeWallpaperStorage p0, android.content.Context p1, java.io.File p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        return p0.resolveHistoryFiles(p1, p2);
    }

    private static final boolean resolveHistoryFiles$lambda$1(java.io.File p4)
    {
        if ((!p4.isFile()) || (p4.length() <= 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final boolean resolveHistoryFiles$lambda$2(java.io.File p2, java.io.File p3)
    {
        if (p2 != 0) {
            p3.getClass();
            if (com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.fastSignatureEquals(p3, p2)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    private final java.io.File resolveWallpaperDirectory(android.content.Context p2)
    {
        this = new java.io.File;
        this(p2.getFilesDir(), "home_wallpaper");
        return this;
    }

    public final Object applyWallpaperFromHistory(android.content.Context p3, String p4, n60 p5)
    {
        return xt3.k0(bd0.f, new com.lele.llmonitor.data.HomeWallpaperStorage$applyWallpaperFromHistory$2(p3, p4, 0), p5);
    }

    public final Object clearWallpaper(android.content.Context p3, n60 p4)
    {
        return xt3.k0(bd0.f, new com.lele.llmonitor.data.HomeWallpaperStorage$clearWallpaper$2(p3, 0), p4);
    }

    public final Object deleteHistoryWallpaper(android.content.Context p3, String p4, n60 p5)
    {
        return xt3.k0(bd0.f, new com.lele.llmonitor.data.HomeWallpaperStorage$deleteHistoryWallpaper$2(p3, p4, 0), p5);
    }

    public final Object importWallpaper(android.content.Context p3, android.net.Uri p4, boolean p5, n60 p6)
    {
        return xt3.k0(bd0.f, new com.lele.llmonitor.data.HomeWallpaperStorage$importWallpaper$2(p3, p4, p5, 0), p6);
    }

    public final Object refreshStartupPreview(android.content.Context p7, int p8, float p9, float p10, n60 p11)
    {
        return xt3.k0(bd0.f, new com.lele.llmonitor.data.HomeWallpaperStorage$refreshStartupPreview$2(p7, p8, p9, p10, 0), p11);
    }

    public final java.util.List resolveHistoryFiles(android.content.Context p6, java.io.File p7)
    {
        p6.getClass();
        java.util.List v0_0 = 0;
        if ((p7 == null) || ((!p7.exists()) || ((!p7.isFile()) || (p7.length() <= 0)))) {
            p7 = 0;
        }
        uo0 v5_2 = this.resolveHistoryDirectory(p6).listFiles();
        if (v5_2 != null) {
            uo0 v5_7;
            java.util.List v0_3 = new bu0(wh.R(v5_2), 1, new u70(20));
            uo0 v5_4 = new k;
            v5_4(16, p7);
            bu0 v6_5 = new bu0(v0_3, 1, v5_4);
            uo0 v5_5 = new com.lele.llmonitor.data.HomeWallpaperStorage$resolveHistoryFiles$$inlined$sortedByDescending$1;
            v5_5();
            wl0 v7_2 = new m21(1, v6_5, v5_5);
            if (!(v7_2 instanceof wl0)) {
                v5_7 = new xk3;
                v5_7(v7_2);
            } else {
                v5_7 = ((wl0) v7_2).take();
            }
            v0_0 = b63.e0(v5_7);
        }
        if (v0_0 != null) {
            return v0_0;
        } else {
            return uo0.d;
        }
    }

    public final java.io.File resolveStartupPreviewFile(android.content.Context p2)
    {
        p2.getClass();
        return new java.io.File(this.resolveWallpaperDirectory(p2), "startup_preview.png");
    }

    public final java.io.File resolveWallpaperFile(android.content.Context p2)
    {
        p2.getClass();
        return new java.io.File(this.resolveWallpaperDirectory(p2), "current_wallpaper.img");
    }
}
