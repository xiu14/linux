package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class UpdateBean implements Serializable {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f7471c;

    /* renamed from: d, reason: collision with root package name */
    private int f7472d;

    /* renamed from: e, reason: collision with root package name */
    private String f7473e;

    /* renamed from: f, reason: collision with root package name */
    private String f7474f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f7475g;
    private boolean h = true;

    private static <T> T a(T t) {
        return t;
    }

    public String getClientAppId() {
        return (String) a(this.f7473e);
    }

    public String getClientAppName() {
        return (String) a(this.f7474f);
    }

    public String getClientPackageName() {
        return (String) a(this.f7471c);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.f7472d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f7475g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f7473e = str;
    }

    public void setClientAppName(String str) {
        this.f7474f = str;
    }

    public void setClientPackageName(String str) {
        this.f7471c = str;
    }

    public void setClientVersionCode(int i) {
        this.f7472d = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.h = z;
    }

    public void setResolutionInstallHMS(boolean z) {
        this.b = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f7475g = arrayList;
    }
}
