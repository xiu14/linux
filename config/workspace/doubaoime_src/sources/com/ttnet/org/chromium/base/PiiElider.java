package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class PiiElider {
    private static final Pattern a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-\ufdcfﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    private static final Pattern b = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.|Caused by: java.lang.(ClassNotFoundException|NoClassDefFoundError):");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f8552c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f8553d;

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        f8552c = new String[]{"com.ttnet.org.chromium.", "com.google.", "com.chrome."};
        f8553d = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    public static String a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            if (b.matcher(str).find()) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            Matcher matcher = a.matcher(sb);
            int i = 0;
            while (matcher.find(i)) {
                int start = matcher.start();
                int end = matcher.end();
                String substring = sb.substring(start, end);
                String[] strArr = f8552c;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    }
                    if (substring.startsWith(strArr[i2])) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (!z2) {
                    String[] strArr2 = f8553d;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z3 = false;
                            break;
                        }
                        if (substring.startsWith(strArr2[i3])) {
                            z3 = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z3) {
                        try {
                            Class.forName(substring, false, c.b().getClassLoader());
                            z4 = true;
                        } catch (Throwable unused) {
                            z4 = false;
                        }
                        if (!z4) {
                            int lastIndexOf = substring.lastIndexOf(".");
                            if (lastIndexOf != -1) {
                                try {
                                    Class.forName(substring.substring(0, lastIndexOf), false, c.b().getClassLoader());
                                } catch (Throwable unused2) {
                                }
                            }
                            z = false;
                        }
                        if (!z) {
                            sb.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                            i = start + 24;
                            matcher = a.matcher(sb);
                        }
                    }
                }
                i = end;
            }
            return sb.toString();
        } catch (IllegalArgumentException unused3) {
            return "";
        }
    }

    @UsedByReflection
    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = a(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = a(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
