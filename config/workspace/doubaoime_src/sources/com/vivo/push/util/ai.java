package com.vivo.push.util;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class ai {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /* renamed from: c, reason: collision with root package name */
    private static volatile ai f8908c;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f8909d = new CopyOnWriteArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private String f8910e;

    private static class a {
        private long a;
        private long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    private ai() {
    }

    public static synchronized ai a() {
        ai aiVar;
        synchronized (ai.class) {
            if (f8908c == null) {
                f8908c = new ai();
            }
            aiVar = f8908c;
        }
        return aiVar;
    }

    public final boolean a(String str) {
        long j;
        long j2;
        int i;
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        char c2 = 1;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            t.c("WindowPeriodManager", "invalid period");
        } else if (TextUtils.equals(str, this.f8910e)) {
            t.c("WindowPeriodManager", "has already updated");
        } else {
            this.f8910e = str;
            this.f8909d.clear();
            Date date = new Date();
            long a2 = ag.a();
            String[] split = str.split(";");
            int length = split.length;
            char c3 = 0;
            while (i2 < length) {
                String[] split2 = split[i2].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split2.length == 2) {
                    try {
                        simpleDateFormat = b;
                        StringBuilder sb = new StringBuilder();
                        simpleDateFormat2 = a;
                        sb.append(simpleDateFormat2.format(date));
                        sb.append(" ");
                        sb.append(split2[c3]);
                        j = simpleDateFormat.parse(sb.toString()).getTime();
                    } catch (Exception e2) {
                        e = e2;
                        j = -1;
                    }
                    try {
                        j2 = simpleDateFormat.parse(simpleDateFormat2.format(date) + " " + split2[c2]).getTime();
                    } catch (Exception e3) {
                        e = e3;
                        e.a.a.a.a.h0(e, new StringBuilder("parse window period failed."), "WindowPeriodManager");
                        j2 = -1;
                        if (a2 > 0) {
                            i = i2;
                            this.f8909d.add(new a(j - a2, j2 - a2));
                            t.c("WindowPeriodManager", "set window period to [" + split2[0] + ", " + split2[1] + "]");
                            i2 = i + 1;
                            c3 = 0;
                            c2 = 1;
                        }
                        i = i2;
                        i2 = i + 1;
                        c3 = 0;
                        c2 = 1;
                    }
                    if (a2 > 0 && j > 0 && j2 > 0 && j < j2) {
                        i = i2;
                        this.f8909d.add(new a(j - a2, j2 - a2));
                        t.c("WindowPeriodManager", "set window period to [" + split2[0] + ", " + split2[1] + "]");
                        i2 = i + 1;
                        c3 = 0;
                        c2 = 1;
                    }
                }
                i = i2;
                i2 = i + 1;
                c3 = 0;
                c2 = 1;
            }
        }
        if (ah.a(this.f8909d)) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - ag.a();
        Iterator<a> it2 = this.f8909d.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (currentTimeMillis >= next.a() && currentTimeMillis <= next.b()) {
                return true;
            }
        }
        return false;
    }
}
