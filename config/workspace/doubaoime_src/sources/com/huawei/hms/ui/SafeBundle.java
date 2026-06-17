package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.LogUtil;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class SafeBundle {
    private final Bundle a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.a.containsKey(str);
        } catch (Throwable unused) {
            LogUtil.e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.a.get(str);
        } catch (Exception e2) {
            StringBuilder M = a.M("get exception: ");
            M.append(e2.getMessage());
            LogUtil.e("SafeBundle", M.toString(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.a.getString(str);
        } catch (Throwable th) {
            StringBuilder M = a.M("getString exception: ");
            M.append(th.getMessage());
            LogUtil.e("SafeBundle", M.toString(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.a.isEmpty();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.a.size();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i) {
        try {
            return this.a.getInt(str, i);
        } catch (Throwable th) {
            StringBuilder M = a.M("getInt exception: ");
            M.append(th.getMessage());
            LogUtil.e("SafeBundle", M.toString(), true);
            return i;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception e2) {
            StringBuilder M = a.M("getString exception: ");
            M.append(e2.getMessage());
            LogUtil.e("SafeBundle", M.toString(), true);
            return str2;
        }
    }
}
