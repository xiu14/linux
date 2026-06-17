package com.bytedance.frameworks.baselib.network.http.impl;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public class f implements Cloneable {
    private static final Set<String> k;
    private static Pattern l;
    private static Pattern m;
    private static final ThreadLocal<DateFormat> n;
    private static final String[] o;
    public static final /* synthetic */ int p = 0;
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f5135c;

    /* renamed from: e, reason: collision with root package name */
    private final String f5137e;

    /* renamed from: f, reason: collision with root package name */
    private String f5138f;

    /* renamed from: g, reason: collision with root package name */
    private String f5139g;
    private boolean h;
    private String i;

    /* renamed from: d, reason: collision with root package name */
    private long f5136d = -1;
    private int j = 0;

    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    static class b {
        private final String a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private int f5140c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f5141d = false;

        b(String str) {
            this.a = str;
            this.b = str.toLowerCase(Locale.US);
        }

        private int a(String str) {
            for (int i = this.f5140c; i < this.a.length(); i++) {
                if (str.indexOf(this.a.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.a.length();
        }

        private String c(boolean z) {
            e();
            int a = a(",;= \t");
            String str = z ? this.b : this.a;
            int i = this.f5140c;
            String substring = i < a ? str.substring(i, a) : null;
            this.f5140c = a;
            return substring;
        }

        private boolean d() {
            e();
            if (this.f5140c >= this.a.length() || this.a.charAt(this.f5140c) != '=') {
                return false;
            }
            this.f5140c++;
            return true;
        }

        private void e() {
            while (this.f5140c < this.a.length() && " \t".indexOf(this.a.charAt(this.f5140c)) != -1) {
                this.f5140c++;
            }
        }

        public List<f> b() {
            int i;
            ArrayList arrayList = new ArrayList(2);
            if (this.b.startsWith("set-cookie2:")) {
                this.f5140c += 12;
                this.f5141d = true;
                i = 0;
            } else {
                if (this.b.startsWith("set-cookie:")) {
                    this.f5140c += 11;
                }
                i = 1;
            }
            while (true) {
                String c2 = c(false);
                if (c2 == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    StringBuilder M = e.a.a.a.a.M("No cookies in ");
                    M.append(this.a);
                    throw new IllegalArgumentException(M.toString());
                }
                if (!d()) {
                    StringBuilder U = e.a.a.a.a.U("Expected '=' after ", c2, " in ");
                    U.append(this.a);
                    throw new IllegalArgumentException(U.toString());
                }
                String str = i != 0 ? ";" : ",;";
                e();
                int a = a(str);
                String substring = this.a.substring(this.f5140c, a);
                this.f5140c = a;
                f fVar = new f(c2, substring);
                fVar.j = i ^ 1;
                arrayList.add(fVar);
                while (true) {
                    e();
                    if (this.f5140c != this.a.length()) {
                        if (this.a.charAt(this.f5140c) == ',') {
                            this.f5140c++;
                            break;
                        }
                        if (this.a.charAt(this.f5140c) == ';') {
                            this.f5140c++;
                        }
                        String c3 = c(true);
                        if (c3 != null) {
                            String str2 = (i != 0 || "expires".equals(c3) || "port".equals(c3)) ? ";" : ";,";
                            String str3 = null;
                            if (d()) {
                                e();
                                int a2 = a(str2);
                                str3 = this.a.substring(this.f5140c, a2);
                                this.f5140c = a2;
                            }
                            if (c3.equals("comment") && fVar.a == null) {
                                fVar.a = str3;
                            } else if (c3.equals("commenturl") && fVar.b == null) {
                                fVar.b = str3;
                            } else if (c3.equals("discard")) {
                                continue;
                            } else if (c3.equals("domain") && fVar.f5135c == null) {
                                if (!TextUtils.isEmpty(str3) && str3.charAt(0) == '.') {
                                    str3 = str3.substring(1);
                                }
                                fVar.f5135c = str3;
                            } else if (c3.equals("expires")) {
                                if (fVar.f5136d == -1) {
                                    Date y = f.y(str3);
                                    if (y != null) {
                                        f.j(fVar, y);
                                    } else {
                                        fVar.f5136d = 0L;
                                    }
                                }
                            } else if (c3.equals("max-age")) {
                                try {
                                    fVar.f5136d = Long.parseLong(str3);
                                } catch (NumberFormatException unused) {
                                    throw new IllegalArgumentException(e.a.a.a.a.s("Invalid max-age: ", str3));
                                }
                            } else if (c3.equals(DownloadConstants.PATH_KEY) && fVar.f5138f == null) {
                                fVar.f5138f = str3;
                            } else if (c3.equals("port") && fVar.f5139g == null) {
                                if (str3 == null) {
                                    str3 = "";
                                }
                                fVar.f5139g = str3;
                            } else if (c3.equals("secure")) {
                                fVar.h = true;
                            } else if (!c3.equals("httponly") && c3.equals("version") && !this.f5141d) {
                                fVar.j = Integer.parseInt(str3);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add("comment");
        hashSet.add("commenturl");
        hashSet.add("discard");
        hashSet.add("domain");
        hashSet.add("expires");
        hashSet.add("httponly");
        hashSet.add("max-age");
        hashSet.add(DownloadConstants.PATH_KEY);
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add("version");
        l = null;
        m = null;
        try {
            l = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            m = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
        n = new a();
        o = new String[]{"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r6.f5137e = r1;
        r6.i = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.<init>()
            r0 = -1
            r6.f5136d = r0
            r0 = 0
            r6.j = r0
            java.lang.String r1 = r7.trim()
            int r2 = r1.length()
            if (r2 == 0) goto L2c
            java.lang.String r2 = "$"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L2c
            java.util.Set<java.lang.String> r2 = com.bytedance.frameworks.baselib.network.http.impl.f.k
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r1.toLowerCase(r3)
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = r0
        L2d:
            if (r2 == 0) goto L56
            r3 = r0
        L30:
            int r4 = r1.length()
            if (r3 >= r4) goto L56
            char r4 = r1.charAt(r3)
            if (r4 < 0) goto L57
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L57
            r5 = 59
            if (r4 == r5) goto L57
            r5 = 44
            if (r4 == r5) goto L57
            boolean r5 = java.lang.Character.isWhitespace(r4)
            if (r5 == 0) goto L53
            r5 = 32
            if (r4 == r5) goto L53
            goto L57
        L53:
            int r3 = r3 + 1
            goto L30
        L56:
            r0 = r2
        L57:
            if (r0 == 0) goto L5e
            r6.f5137e = r1
            r6.i = r8
            return
        L5e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid name: "
            java.lang.String r7 = e.a.a.a.a.s(r0, r7)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.f.<init>(java.lang.String, java.lang.String):void");
    }

    public static boolean A(f fVar, URI uri) {
        String str = fVar.f5139g;
        if (str == null) {
            return true;
        }
        return Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).contains(Integer.toString(i.c(uri.getScheme(), uri.getPort())));
    }

    public static boolean B(f fVar, URI uri) {
        return !fVar.h || "https".equalsIgnoreCase(uri.getScheme());
    }

    static void j(f fVar, Date date) {
        Objects.requireNonNull(fVar);
        fVar.f5136d = (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (com.bytedance.frameworks.baselib.network.http.impl.f.m.matcher(r7).matches() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L91
            if (r7 != 0) goto L7
            goto L91
        L7:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            java.lang.String r6 = r6.toLowerCase(r1)
            boolean r1 = r7.equals(r6)
            r2 = 1
            if (r1 == 0) goto L41
            boolean r1 = w(r7, r0)
            if (r1 != 0) goto L40
            java.util.regex.Pattern r1 = com.bytedance.frameworks.baselib.network.http.impl.f.l     // Catch: java.lang.Throwable -> L39
            java.util.regex.Matcher r1 = r1.matcher(r7)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L2c
        L2a:
            r1 = r2
            goto L3e
        L2c:
            java.util.regex.Pattern r1 = com.bytedance.frameworks.baselib.network.http.impl.f.m     // Catch: java.lang.Throwable -> L39
            java.util.regex.Matcher r1 = r1.matcher(r7)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3d
            goto L2a
        L39:
            r1 = move-exception
            r1.printStackTrace()
        L3d:
            r1 = r0
        L3e:
            if (r1 == 0) goto L41
        L40:
            return r2
        L41:
            boolean r1 = w(r7, r0)
            java.lang.String r3 = ".local"
            if (r1 != 0) goto L4e
            boolean r6 = r6.equals(r3)
            return r6
        L4e:
            int r1 = r6.length()
            int r4 = r7.length()
            int r4 = r4 + r2
            java.lang.String r5 = "."
            if (r1 != r4) goto L6e
            boolean r1 = r6.startsWith(r5)
            if (r1 == 0) goto L6e
            boolean r1 = r6.endsWith(r7)
            if (r1 == 0) goto L6e
            boolean r1 = w(r6, r2)
            if (r1 == 0) goto L6e
            return r2
        L6e:
            int r1 = r7.length()
            int r4 = r6.length()
            if (r1 <= r4) goto L91
            boolean r7 = r7.endsWith(r6)
            if (r7 == 0) goto L91
            boolean r7 = r6.startsWith(r5)
            if (r7 == 0) goto L8a
            boolean r7 = w(r6, r2)
            if (r7 != 0) goto L90
        L8a:
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L91
        L90:
            r0 = r2
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.impl.f.p(java.lang.String, java.lang.String):boolean");
    }

    private static boolean w(String str, int i) {
        int indexOf = str.indexOf(46, i + 1);
        return indexOf != -1 && indexOf < str.length() - 1;
    }

    private static String x(String str) {
        return str == null ? "/" : str.endsWith("/") ? str : e.a.a.a.a.s(str, "/");
    }

    public static Date y(String str) {
        try {
            return n.get().parse(str);
        } catch (ParseException unused) {
            for (String str2 : o) {
                try {
                    return new SimpleDateFormat(str2, Locale.US).parse(str);
                } catch (ParseException unused2) {
                }
            }
            return null;
        }
    }

    public static boolean z(f fVar, URI uri) {
        return x(uri.getPath()).startsWith(x(fVar.f5138f));
    }

    public void C(String str) {
        this.f5135c = str == null ? null : str.toLowerCase(Locale.US);
    }

    public void D(String str) {
        this.f5138f = str;
    }

    public void E(String str) {
        this.f5139g = str;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f5137e.equalsIgnoreCase(fVar.f5137e) && ((str = this.f5135c) == null ? fVar.f5135c == null : str.equalsIgnoreCase(fVar.f5135c))) {
            String str2 = this.f5138f;
            String str3 = fVar.f5138f;
            if (str2 == null ? str3 == null : str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5137e;
        Locale locale = Locale.US;
        int hashCode = str.toLowerCase(locale).hashCode();
        String str2 = this.f5135c;
        int hashCode2 = hashCode + (str2 == null ? 0 : str2.toLowerCase(locale).hashCode());
        String str3 = this.f5138f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String q() {
        return this.f5135c;
    }

    public long r() {
        return this.f5136d;
    }

    public String s() {
        return this.f5137e;
    }

    public String t() {
        return this.f5138f;
    }

    public String toString() {
        return this.f5137e + ContainerUtils.KEY_VALUE_DELIMITER + this.i;
    }

    public String u() {
        return this.f5139g;
    }

    public int v() {
        return this.j;
    }
}
