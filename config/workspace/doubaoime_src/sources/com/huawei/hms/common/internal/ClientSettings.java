package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public class ClientSettings {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private List<Scope> f7248c;

    /* renamed from: d, reason: collision with root package name */
    private String f7249d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f7250e;

    /* renamed from: f, reason: collision with root package name */
    private String f7251f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f7252g;
    private WeakReference<Activity> h;
    private boolean i;
    private String j;
    private boolean k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.a = str;
        this.b = str2;
        this.f7248c = list;
        this.f7249d = str3;
        this.f7250e = list2;
    }

    public List<String> getApiName() {
        return this.f7250e;
    }

    public String getAppID() {
        return this.f7249d;
    }

    public String getClientClassName() {
        return this.b;
    }

    public String getClientPackageName() {
        return this.a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getCpID() {
        return this.f7251f;
    }

    public String getInnerHmsPkg() {
        return this.j;
    }

    public List<Scope> getScopes() {
        return this.f7248c;
    }

    public SubAppInfo getSubAppID() {
        return this.f7252g;
    }

    public boolean isHasActivity() {
        return this.i;
    }

    public boolean isUseInnerHms() {
        return this.k;
    }

    public void setApiName(List<String> list) {
        this.f7250e = list;
    }

    public void setAppID(String str) {
        this.f7249d = str;
    }

    public void setClientClassName(String str) {
        this.b = str;
    }

    public void setClientPackageName(String str) {
        this.a = str;
    }

    public void setCpActivity(Activity activity) {
        this.h = new WeakReference<>(activity);
        this.i = true;
    }

    public void setCpID(String str) {
        this.f7251f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f7248c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f7252g = subAppInfo;
    }

    public void setUseInnerHms(boolean z) {
        this.k = z;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f7252g = subAppInfo;
    }
}
