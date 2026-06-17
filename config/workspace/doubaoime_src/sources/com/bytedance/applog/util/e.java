package com.bytedance.applog.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class e {
    private static final List<String> b = Collections.singletonList("EncryptUtils");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f3897c = {WsConstants.KEY_APP_ID, "app_version", "tt_data", "device_id"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3898d = {WsConstants.KEY_APP_ID, "version_code", "ab_version", WsConstants.KEY_INSTALL_ID, "device_platform", "device_id"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f3899e = {"tt_data", "device_platform"};
    private final com.bytedance.applog.c a;

    public e(com.bytedance.applog.c cVar) {
        this.a = cVar;
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; bArr != null && i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] b(byte[] bArr, String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, new SecretKeySpec(h(str), "AES"), new IvParameterSpec(h(str2)));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            com.bytedance.applog.w.k.z().t(b, "Cannot decrypt aes cbc", th, new Object[0]);
            return null;
        }
    }

    public static String[] e() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(128, secureRandom);
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            String[] strArr = {a(keyGenerator.generateKey().getEncoded()), a(bArr)};
            if (g(strArr)) {
                return strArr;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L3d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L3d
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L3e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L3e
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
        L18:
            int r3 = r5.read(r1)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            if (r3 < 0) goto L23
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            goto L18
        L23:
            r5.close()     // Catch: java.io.IOException -> L45
            goto L45
        L27:
            r0 = move-exception
            r1 = r5
            goto L32
        L2a:
            r1 = r5
            goto L3e
        L2c:
            r5 = move-exception
            r0 = r5
            goto L32
        L2f:
            r5 = move-exception
            r0 = r5
            r2 = r1
        L32:
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            throw r0
        L3d:
            r2 = r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            if (r2 == 0) goto L48
        L45:
            r2.close()     // Catch: java.io.IOException -> L48
        L48:
            byte[] r5 = r0.toByteArray()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.e.f(byte[]):byte[]");
    }

    public static boolean g(String[] strArr) {
        return strArr != null && strArr.length == 2 && !TextUtils.isEmpty(strArr[0]) && strArr[0].length() == 32 && !TextUtils.isEmpty(strArr[1]) && strArr[1].length() == 16;
    }

    private static byte[] h(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public byte[] c(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        if (this.a.t()) {
            if (this.a.C() != null) {
                Objects.requireNonNull(this.a.C());
            }
            bArr = EncryptorUtil.a(bArr, bArr.length);
            if (bArr == null) {
                this.a.K().i(StatsCountKeys.ENCRYPT_ERROR_COUNT, 1);
            }
        }
        return bArr;
    }

    public String d(String str) {
        if (TextUtils.isEmpty(str) || !this.a.t()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        ArrayList arrayList = new ArrayList();
        for (String str2 : f3897c) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                arrayList.add(new Pair(str2, queryParameter));
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(i(query), 8)));
        return buildUpon.build().toString();
    }

    public byte[] i(String str) {
        byte[] bArr;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            this.a.I().t(b, "get bytes failed", e2, new Object[0]);
            bArr = null;
        }
        if (this.a.t()) {
            if (bArr == null) {
                bArr = new byte[0];
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(bArr);
                            gZIPOutputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            try {
                                com.bytedance.applog.w.k.z().t(b, "gzip write failed", th, new Object[0]);
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                bArr = byteArrayOutputStream.toByteArray();
                                return c(bArr);
                            } catch (Throwable th2) {
                                if (gZIPOutputStream != null) {
                                    try {
                                        gZIPOutputStream.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                throw th2;
                            }
                        }
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                bArr = byteArrayOutputStream.toByteArray();
            }
        }
        return c(bArr);
    }
}
