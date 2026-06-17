package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* loaded from: classes2.dex */
public final class k implements BaseNotifyDataAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static int f8921e;

    /* renamed from: f, reason: collision with root package name */
    private static int f8922f;
    private Resources a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8923c;

    /* renamed from: d, reason: collision with root package name */
    private String f8924d;

    private static boolean a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }

    private static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        t.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        int a;
        if (a(f8921e)) {
            return f8921e;
        }
        String str = this.f8924d;
        if (a(str)) {
            a = a(str, "_notifyicon");
        } else {
            t.d("DefaultNotifyDataAdapter", "getNotifyIconByArdVersion isSystemCodeUsable is false ");
            a = -1;
        }
        f8921e = a;
        if (a(a)) {
            return f8921e;
        }
        String str2 = this.f8923c;
        while (true) {
            t.d("DefaultNotifyDataAdapter", "getNotifyIconByRomVersion codeReg = ".concat(String.valueOf(str2)));
            if (TextUtils.isEmpty(str2)) {
                return this.a.getIdentifier("vivo_push_notifyicon", "drawable", this.b);
            }
            int identifier = this.a.getIdentifier("vivo_push_rom" + str2 + "_notifyicon", "drawable", this.b);
            if (identifier > 0) {
                t.d("DefaultNotifyDataAdapter", "getNotifyIconByRomVersion find notifyicon = vivo_push_rom" + str2 + "_notifyicon");
                return identifier;
            }
            str2 = str2.substring(0, str2.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        int a;
        if (a(f8922f)) {
            return f8922f;
        }
        String str = this.f8924d;
        if (a(str)) {
            a = a(str, "_icon");
        } else {
            t.d("DefaultNotifyDataAdapter", "getSmallIconByArdVersion isSystemCodeUsable is false ");
            a = -1;
        }
        f8922f = a;
        if (a(a)) {
            return f8922f;
        }
        String str2 = this.f8923c;
        while (true) {
            t.d("DefaultNotifyDataAdapter", "getSmallIconByRomVersion codeReg = ".concat(String.valueOf(str2)));
            if (TextUtils.isEmpty(str2)) {
                return this.a.getIdentifier("vivo_push_icon", "drawable", this.b);
            }
            int identifier = this.a.getIdentifier("vivo_push_rom" + str2 + "_icon", "drawable", this.b);
            if (identifier > 0) {
                t.d("DefaultNotifyDataAdapter", "getSmallIconByRomVersion find smallIcon = vivo_push_rom" + str2 + "_icon");
                return identifier;
            }
            str2 = str2.substring(0, str2.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.a = context.getResources();
        this.f8923c = m.a();
        this.f8924d = Build.VERSION.RELEASE;
    }

    private int a(String str, String str2) {
        t.d("DefaultNotifyDataAdapter", "getIcon systemVersion = " + str + " suffix= " + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            if (split != null && split.length > 0) {
                str = split[0];
            }
            try {
                for (int parseInt = Integer.parseInt(str); parseInt > 0; parseInt--) {
                    String str3 = "vivo_push_ard" + parseInt + str2;
                    t.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                    int identifier = this.a.getIdentifier(str3, "drawable", this.b);
                    if (identifier > 0) {
                        t.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                        return identifier;
                    }
                }
            } catch (Exception e2) {
                t.a("DefaultNotifyDataAdapter", e2);
            }
        }
        return -1;
    }
}
