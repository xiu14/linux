package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.bytedance.bdinstall.C0640u;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class x extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4044e;

    x(Context context) {
        super(true, false);
        this.f4044e = context;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        Signature signature;
        byte[] byteArray;
        String str = null;
        try {
            packageInfo = this.f4044e.getPackageManager().getPackageInfo(this.f4044e.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException unused) {
            int i = C0640u.a;
            packageInfo = null;
        }
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null && (byteArray = signature.toByteArray()) != null) {
            try {
                if (byteArray.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(byteArray);
                    str = com.bytedance.bdinstall.util.c.a(messageDigest.digest());
                }
            } catch (Exception unused2) {
            }
        }
        if (str == null) {
            return true;
        }
        jSONObject.put("sig_hash", str);
        return true;
    }
}
