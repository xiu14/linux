package com.heytap.mcssdk.liquid;

import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private int a;
    private DownloadRequest b;

    /* renamed from: c, reason: collision with root package name */
    private List<DownloadRequest> f6911c;

    /* renamed from: d, reason: collision with root package name */
    private ILiquidTaskQueryCallback f6912d;

    /* renamed from: e, reason: collision with root package name */
    private String f6913e;

    /* renamed from: f, reason: collision with root package name */
    private IPackageAuthCallbackListener f6914f;

    /* renamed from: com.heytap.mcssdk.liquid.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0340a {
        public static final int a = 1;
        public static final int b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6915c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6916d = 4;
    }

    public a(int i, DownloadRequest downloadRequest) {
        this.a = i;
        this.b = downloadRequest;
    }

    public a(int i, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        this.a = i;
        this.f6912d = iLiquidTaskQueryCallback;
    }

    public a(int i, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        this.a = i;
        this.f6913e = str;
        this.f6914f = iPackageAuthCallbackListener;
    }

    public a(int i, List<DownloadRequest> list) {
        this.a = i;
        this.f6911c = list;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(DownloadRequest downloadRequest) {
        this.b = downloadRequest;
    }

    public void a(ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        this.f6912d = iLiquidTaskQueryCallback;
    }

    public void a(IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        this.f6914f = iPackageAuthCallbackListener;
    }

    public void a(String str) {
        this.f6913e = str;
    }

    public void a(List<DownloadRequest> list) {
        this.f6911c = list;
    }

    public DownloadRequest b() {
        return this.b;
    }

    public ILiquidTaskQueryCallback c() {
        return this.f6912d;
    }

    public List<DownloadRequest> d() {
        return this.f6911c;
    }

    public String e() {
        return this.f6913e;
    }

    public IPackageAuthCallbackListener f() {
        return this.f6914f;
    }
}
