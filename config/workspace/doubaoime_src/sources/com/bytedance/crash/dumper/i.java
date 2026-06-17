package com.bytedance.crash.dumper;

import com.bytedance.crash.C0652g;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes.dex */
public class i {
    private File a;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f4597c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f4598d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4599e = false;

    /* renamed from: f, reason: collision with root package name */
    private String f4600f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f4601g = null;
    private String h = null;

    public i(File file) {
        this.a = null;
        this.a = file;
    }

    public void a() {
        if (this.a == null || this.h == null) {
            return;
        }
        try {
            com.bytedance.crash.util.a.x(new File(this.a, "protector_history.txt"), this.h, false);
        } catch (Throwable unused) {
        }
    }

    public int b() {
        return this.f4598d;
    }

    public String c() {
        return this.f4600f;
    }

    public String d() {
        return this.f4601g;
    }

    public String e() {
        return this.f4597c;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        long j;
        long parseLong;
        long parseLong2;
        int parseInt;
        int parseInt2;
        String str;
        int i;
        boolean z = false;
        z = false;
        if (this.a == null) {
            return false;
        }
        File file = new File(C0652g.k(), "protector_history.txt");
        if (!file.exists() || file.length() == 0) {
            return false;
        }
        try {
            String[] split = this.a.getName().split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 1) {
                j = Long.parseLong(split[0]);
                File parentFile = this.a.getParentFile();
                if (parentFile != null) {
                    split = parentFile.getName().split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                }
            } else {
                j = 0;
            }
            char c2 = 3;
            char c3 = 2;
            if (split.length != 2 && split.length != 3) {
                return false;
            }
            long parseLong3 = Long.parseLong(split[0]);
            int parseInt3 = Integer.parseInt(split[1]);
            if (split.length == 3) {
                this.f4598d = Integer.parseInt(split[2]);
                this.f4599e = true;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.equals("V002")) {
                StringBuilder sb = null;
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null) {
                        break;
                    }
                    String[] split2 = readLine2.split(" ");
                    if (split2.length == 5) {
                        try {
                            parseLong = Long.parseLong(split2[z ? 1 : 0]);
                            parseLong2 = Long.parseLong(split2[1]);
                            parseInt = Integer.parseInt(split2[c3]);
                            parseInt2 = Integer.parseInt(split2[c2]);
                            str = split2[4];
                        } catch (Throwable unused) {
                        }
                        if (parseInt == parseInt3 && parseLong >= parseLong3 && ((j != 0 || parseLong2 == parseLong3) && (j == 0 || parseLong <= j))) {
                            if (this.f4599e) {
                                int i2 = this.f4598d;
                                if (i2 == parseInt2 + 1) {
                                    this.f4600f = str;
                                } else if (i2 == parseInt2) {
                                    this.f4601g = str;
                                }
                            } else {
                                this.f4598d = parseInt2;
                                this.f4600f = str;
                            }
                            if (sb == null) {
                                this.b = true;
                                StringBuilder sb2 = new StringBuilder();
                                i = parseInt3;
                                try {
                                    sb2.append(split2[1]);
                                    sb2.append('-');
                                    sb2.append(split2[2]);
                                    this.f4597c = sb2.toString();
                                    sb = new StringBuilder("sid: " + this.f4597c + "\n");
                                } catch (Throwable unused2) {
                                }
                            } else {
                                i = parseInt3;
                            }
                            sb.append("performed_count: ");
                            sb.append(parseInt2);
                            sb.append("\n  time: ");
                            sb.append(com.bytedance.crash.util.a.d(parseLong));
                            sb.append("\n  scope: ");
                            sb.append(str);
                            sb.append("\n");
                            parseInt3 = i;
                            z = false;
                            c2 = 3;
                            c3 = 2;
                        }
                    }
                    i = parseInt3;
                    parseInt3 = i;
                    z = false;
                    c2 = 3;
                    c3 = 2;
                }
                if (sb != null) {
                    try {
                        this.h = sb.toString();
                    } catch (Throwable unused3) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused4) {
            return z;
        }
    }

    public boolean h() {
        return this.f4599e;
    }
}
