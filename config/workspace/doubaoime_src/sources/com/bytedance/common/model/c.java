package com.bytedance.common.model;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.common.push.e.g;
import com.bytedance.push.interfaze.InterfaceC0687b;
import com.bytedance.push.interfaze.InterfaceC0688c;
import com.bytedance.push.interfaze.e;

/* loaded from: classes.dex */
public class c {
    public Application a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f4151c;

    /* renamed from: d, reason: collision with root package name */
    public int f4152d;

    /* renamed from: e, reason: collision with root package name */
    public int f4153e;

    /* renamed from: f, reason: collision with root package name */
    public String f4154f;

    /* renamed from: g, reason: collision with root package name */
    public String f4155g;
    public String h;
    public InterfaceC0688c i;
    public InterfaceC0687b j;
    public e l;
    public boolean m;
    public com.bytedance.common.model.a n;
    public String p;
    public boolean k = false;
    public g o = new a(this);

    class a extends g {
        a(c cVar) {
        }

        @Override // com.bytedance.common.push.e.g
        public boolean hasAgreedForPrivacyDialog() {
            return !TextUtils.isEmpty(com.ss.android.message.f.a.k(com.ss.android.message.a.a()));
        }
    }
}
