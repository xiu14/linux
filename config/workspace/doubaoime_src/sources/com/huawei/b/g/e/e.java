package com.huawei.b.g.e;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class e implements com.huawei.b.g.d {
    private final com.huawei.b.g.c a;
    private SecretKey b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6969c = false;

    public e(com.huawei.b.g.c cVar) {
        this.a = cVar;
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    private String c(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    @Override // com.huawei.b.g.d
    public String a(String str, String str2) {
        String str3;
        if (!this.f6969c) {
            try {
                this.b = j.c(new d(this.a.getString("/code/code1", null), this.a.getString("/code/code2", null), this.a.getString("/code/code3", null), this.a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
                this.b = null;
            }
            this.f6969c = true;
        }
        if (this.b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!b(str)) {
                return str2;
            }
            try {
                return new String(j.d(this.b, a.a(c(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }
}
