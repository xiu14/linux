package com.huawei.b.g.e;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class f implements com.huawei.b.g.d {
    private SecretKey a;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6970c = false;

    public f(d dVar) {
        this.b = dVar;
    }

    @Override // com.huawei.b.g.d
    public String a(String str, String str2) {
        StringBuilder M;
        if (!this.f6970c) {
            try {
                this.a = j.c(this.b);
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                StringBuilder M2 = e.a.a.a.a.M("Exception when reading the 'K&I' for 'Config'. error is ");
                M2.append(e2.getMessage());
                Log.e("AGC_LocalResource", M2.toString());
                this.a = null;
            }
            this.f6970c = true;
        }
        if (this.a == null || TextUtils.isEmpty(str)) {
            M = e.a.a.a.a.M("decrypt exception: secretKey = ");
            M.append(this.a);
            M.append("raw = ");
        } else {
            try {
                return new String(j.d(this.a, a.a(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e3) {
                M = e.a.a.a.a.M("decrypt exception:");
                str = e3.getMessage();
            }
        }
        M.append(str);
        Log.e("AGC_LocalResource", M.toString());
        return str2;
    }
}
