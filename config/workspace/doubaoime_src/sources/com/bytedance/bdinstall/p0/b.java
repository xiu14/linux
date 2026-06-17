package com.bytedance.bdinstall.p0;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.Q;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b extends d {
    private final AccountManager b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4093c;

    /* renamed from: d, reason: collision with root package name */
    private Account f4094d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f4095e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private Q f4096f;

    class a implements Runnable {
        final /* synthetic */ Account a;

        a(Account account) {
            this.a = account;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                if (b.this.f4095e.size() > 0 && b.this.b != null) {
                    for (Map.Entry entry : b.this.f4095e.entrySet()) {
                        if (entry != null) {
                            b.this.b.setUserData(this.a, (String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    b.this.f4095e.clear();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    b(Context context, String str, Q q) {
        this.b = AccountManager.get(context);
        this.f4093c = str;
        this.f4096f = q;
    }

    private String q(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(this.f4093c);
        if (!this.f4096f.R()) {
            stringBuffer.append(BundleUtil.UNDERLINE_TAG);
            stringBuffer.append(this.f4096f.i());
        }
        return stringBuffer.toString();
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    @SuppressLint({"MissingPermission"})
    public void a(String str, String str2) {
        String q = q(str);
        Account account = this.f4094d;
        if (account == null) {
            this.f4095e.put(q, str2);
        } else {
            if (str2 == null) {
                return;
            }
            try {
                this.b.setUserData(account, q, str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    @SuppressLint({"MissingPermission"})
    public String b(String str) {
        String q = q(str);
        String str2 = this.f4095e.get(q);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Account account = this.f4094d;
        if (account == null) {
            return null;
        }
        try {
            return this.b.getUserData(account, q);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected void d(String str, String[] strArr) {
        if (strArr == null) {
            return;
        }
        a(str, TextUtils.join("\n", strArr));
    }

    @Override // com.bytedance.bdinstall.p0.d
    @SuppressLint({"MissingPermission"})
    public void e(List<String> list) {
        AccountManager accountManager;
        if (list == null) {
            return;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String q = q(it2.next());
            this.f4095e.remove(q);
            try {
                Account account = this.f4094d;
                if (account != null && (accountManager = this.b) != null) {
                    accountManager.setUserData(account, q, null);
                }
            } catch (Exception unused) {
            }
        }
        super.e(list);
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected String[] f(String str) {
        String b = b(str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return b.split("\n");
    }

    void p(String str, Account account) {
        if (account != null) {
            this.f4094d = account;
            if (this.f4095e.size() <= 0) {
                return;
            }
            C0643x.i(str, new a(account));
        }
    }
}
