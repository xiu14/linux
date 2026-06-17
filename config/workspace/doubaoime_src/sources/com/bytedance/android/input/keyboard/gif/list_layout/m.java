package com.bytedance.android.input.keyboard.gif.list_layout;

import android.content.Context;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {
    public static final m a = new m();

    private m() {
    }

    public static final long a(m mVar, File file) {
        Objects.requireNonNull(mVar);
        try {
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
            return file.lastModified();
        }
    }

    private final String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "hexString.toString()");
        return sb2;
    }

    public final Uri b(Context context, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        File file;
        String str;
        String upperCase;
        String str2;
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(bVar, RemoteMessageConst.DATA);
        String c2 = bVar.c();
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(c2, "url");
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(c2, "url");
        try {
            com.bumptech.glide.request.h e2 = new com.bumptech.glide.request.h().e(com.bumptech.glide.load.engine.j.f1647c);
            kotlin.s.c.l.e(e2, "RequestOptions()\n       …kCacheStrategy.AUTOMATIC)");
            file = (File) ((com.bumptech.glide.request.f) com.bumptech.glide.c.n(context).m().m0(c2).a(e2).p0()).get();
        } catch (Throwable th) {
            kotlin.h.b(com.prolificinteractive.materialcalendarview.r.J(th));
            file = null;
        }
        if (file == null || !file.exists() || file.isDirectory()) {
            str = DownloadSettingKeys.BugFix.DEFAULT;
        } else {
            str = file.getName();
            kotlin.s.c.l.e(str, "fullFileName");
            int w = kotlin.text.a.w(str, ".", 0, false, 6, null);
            if (w != -1) {
                str = str.substring(0, w);
                kotlin.s.c.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        String str3 = "webp";
        if (file != null) {
            if (file.exists()) {
                long length = file.length();
                int i = length >= 12 ? 12 : (int) length;
                if (i >= 4) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[i];
                    try {
                        try {
                            fileInputStream.read(bArr);
                            upperCase = c(bArr).toUpperCase(Locale.ROOT);
                            kotlin.s.c.l.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        if (kotlin.text.a.K(upperCase, "FFD8FF", false, 2, null)) {
                            str2 = "jpg";
                        } else if (kotlin.text.a.K(upperCase, "89504E47", false, 2, null)) {
                            str2 = "png";
                        } else if (kotlin.text.a.K(upperCase, "47494638", false, 2, null)) {
                            str2 = "gif";
                        } else if (kotlin.text.a.K(upperCase, "52494646", false, 2, null) && i >= 12 && upperCase.length() >= 16) {
                            String substring = upperCase.substring(8, 16);
                            kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            kotlin.s.c.l.a(substring, "57454250");
                        }
                        str3 = str2;
                    } finally {
                        fileInputStream.close();
                    }
                }
            }
            str3 = null;
        }
        File file2 = new File(context.getExternalCacheDir(), "share/emoticons");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str + '.' + str3);
        if (file != null) {
            kotlin.s.c.l.f(file, "<this>");
            kotlin.s.c.l.f(file3, TypedValues.AttributesType.S_TARGET);
            if (!file.exists()) {
                throw new kotlin.io.h(file, null, "The source file doesn't exist.", 2);
            }
            if (file3.exists() && !file3.delete()) {
                throw new kotlin.io.d(file, file3, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (!file.isDirectory()) {
                File parentFile = file3.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        com.prolificinteractive.materialcalendarview.r.G(fileInputStream2, fileOutputStream, 8192);
                        com.prolificinteractive.materialcalendarview.r.E(fileOutputStream, null);
                        com.prolificinteractive.materialcalendarview.r.E(fileInputStream2, null);
                    } finally {
                    }
                } finally {
                }
            } else if (!file3.mkdirs()) {
                throw new kotlin.io.e(file, file3, "Failed to create target directory.");
            }
        }
        StringBuilder W = e.a.a.a.a.W("buildUri fileName = ", str, "---suffix = ", str3, "---targetFilePath = ");
        W.append(file3);
        W.append(".path");
        com.bytedance.android.input.r.j.i("ImeEmoticons-Helper", W.toString());
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file3);
        kotlin.s.c.l.e(uriForFile, "imageUri");
        return uriForFile;
    }
}
