package com.bytedance.android.input.common;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class p {
    private static final Pattern a = Pattern.compile("(^|[^0-9])[0-9]{4,6}([^0-9]|$)");
    private static final Pattern b = Pattern.compile("(pin for (S|s)martisan)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f2207c;

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f2208d;

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern[] f2209e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f2210f;

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f2211g;
    private static final String[] h;
    private static final String[] i;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;

    static {
        Pattern.compile("(^|[^A-Za-z0-9])(([0-9]{3}\\-[0-9]{3})|([A-Za-z0-9]{4,10}))([^A-Za-z0-9]|$)");
        f2207c = Pattern.compile("(^|[^0-9])(([0-9]{3}\\-[0-9]{3})|([0-9]{4,10}))([^0-9]|$)");
        f2208d = Pattern.compile("(((验证|激活|校验|确认|检验|上网|随机|识别|动态|短信|授权|无线|认证|交易|安全)(短信)?((代|密)?码|口令))|(((代|密)码|口令)(验证|激活|校验|确认|检验))|(登录(代|密)码)|(验证号码))");
        f2209e = new Pattern[]{Pattern.compile("(((无|不)需(要)?)|(及(短信)?)|(退(订)?))(((验证|激活|校验|确认|检验|上网|随机|识别|动态|短信|授权|无线|认证|交易|安全)(短信)?((代|密)?码|口令))|(((代|密)码|口令)(验证|激活|校验|确认|检验))|(登录(代|密)码)|(验证号码))"), Pattern.compile("(((验证|激活|校验|确认|检验|上网|随机|识别|动态|短信|授权|无线|认证|交易|安全)(短信)?((代|密)?码|口令))|(((代|密)码|口令)(验证|激活|校验|确认|检验))|(登录(代|密)码)|(验证号码))(等信息|错误)"), Pattern.compile("(QQ|qq)?群(号)?(码)?[0-9]+验证码(验)?[0-9]+")};
        f2210f = Pattern.compile("(Snapchat(\\s|\\n)+代码)");
        f2211g = new String[]{"Microsoft", "google", "Google", "GOOGLE", "wifi", "Wifi", "WiFi", "WIFI", "Facebook", "10010", "10000", "10086", "CVV2", "NSMS", "Alice", "aWiFi", "aWIFI"};
        h = new String[]{"Tapole", "TLSG"};
        i = new String[]{"Tapole眼镜", "[TLSG]"};
        j = Pattern.compile("((代|密)?码|口令)");
        k = Pattern.compile("(^|[^0-9])(([0-9]{3}\\-[0-9]{3})|([0-9]{4,10}))([^0-9]|$)");
        l = Pattern.compile("([^a-zA-Z\\?\\&])(code|Code|CODE)([^a-zA-Z])");
        m = Pattern.compile("(Ctrip)([^a-zA-Z\\?\\&])(code|Code|CODE)([^a-zA-Z])");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r8, java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r9) {
        /*
            r7 = this;
            java.util.Iterator r0 = r9.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r5 = "((QQ|qq|发票|专)号(码)?|(QQ|qq)?群(号)?(码)?|联系(方式)?|咨询|详询|客服|专线|热线|速电|官方|电话|致电|拨打|尾(号|数)|交易|消费|支付|金额|序(列)?号|单号|榜单|榜|卡|在|回复|满|减|@|&|=|-|\\*|\\.|/)(是|为)?(:|：|\\s+)?%s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r3 = r3.find()
            java.lang.String r5 = "VerificationParser"
            if (r3 == 0) goto L62
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r3 = "([G|g]-)%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r8)
            boolean r2 = r2.find()
            if (r2 == 0) goto L4a
            java.lang.String r1 = "google verification code number prefix filter matched, Do not remove!"
            com.bytedance.android.input.r.j.i(r5, r1)
            goto L4
        L4a:
            r9.remove(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "prefix filter match, remove number: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.android.input.r.j.i(r5, r1)
            goto L4
        L62:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r6 = "%s(\\*|:|@|-|年|月|日|时|分|秒|元|号|个|位|名|(的)?名义|(全国)?(反诈)?(热线|电话)|/|\\.[A-Za-z0-9])"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r3 = r3.find()
            if (r3 == 0) goto L93
            r9.remove(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "suffix filter match, remove number: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.android.input.r.j.i(r5, r1)
            goto L4
        L93:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r6 = "【%s】"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            boolean r3 = r8.endsWith(r3)
            if (r3 == 0) goto L4
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto Laa
            goto Lbb
        Laa:
            r3 = r4
        Lab:
            int r6 = r1.length()
            if (r3 >= r6) goto Lc0
            char r6 = r1.charAt(r3)
            boolean r6 = r7.f(r6, r2)
            if (r6 != 0) goto Lbd
        Lbb:
            r2 = r4
            goto Lc0
        Lbd:
            int r3 = r3 + 1
            goto Lab
        Lc0:
            if (r2 != 0) goto L4
            r9.remove(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "end 【】 filter match, remove number: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.android.input.r.j.i(r5, r1)
            goto L4
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.p.a(java.lang.String, java.util.concurrent.CopyOnWriteArrayList):void");
    }

    private void b(String str, CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            int i2 = 0;
            if (f2211g != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr = f2211g;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    if (TextUtils.equals(str2, strArr[i3])) {
                        copyOnWriteArrayList.remove(str2);
                        com.bytedance.android.input.r.j.i("VerificationParser", "text contains " + strArr[i3] + ", remove number: " + str2);
                        break;
                    }
                    i3++;
                }
            }
            if (h != null) {
                while (true) {
                    String[] strArr2 = h;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    if (TextUtils.equals(str2, strArr2[i2])) {
                        String[] strArr3 = i;
                        if (str.contains(strArr3[i2])) {
                            copyOnWriteArrayList.remove(str2);
                            com.bytedance.android.input.r.j.i("VerificationParser", "text contains " + strArr3[i2] + ", remove number: " + str2);
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
    }

    private void c(String str, int i2, CopyOnWriteArrayList<String> copyOnWriteArrayList, boolean z) {
        Matcher matcher = (z ? k : f2207c).matcher(str);
        if (matcher.find(i2)) {
            boolean z2 = true;
            int i3 = !z ? 3 : 1;
            int start = matcher.start();
            while (!f(str.charAt(start), i3)) {
                start++;
            }
            int end = matcher.end();
            while (true) {
                int i4 = end - 1;
                if (f(str.charAt(i4), i3)) {
                    break;
                } else {
                    end = i4;
                }
            }
            if (start < 0 || start > end || end > str.length()) {
                return;
            }
            String substring = str.substring(start, end);
            if (!TextUtils.isEmpty(substring)) {
                if (Pattern.compile(String.format(z ? "%s(\\s|\\n)+(is)" : "(使用)?(\\s|\\n)*%s(\\s|\\n)*(以上|使用此|作为)", substring)).matcher(str).find()) {
                    com.bytedance.android.input.r.j.i("VerificationParser", "verification code flag match");
                } else {
                    z2 = false;
                }
                if (z2) {
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.add(substring);
                    return;
                } else if (!copyOnWriteArrayList.contains(substring)) {
                    copyOnWriteArrayList.add(substring);
                }
            }
            c(str, end, copyOnWriteArrayList, z);
        }
    }

    private String d(String str, int i2, int i3, int i4) {
        while (!f(str.charAt(i2), i4)) {
            i2++;
        }
        while (true) {
            int i5 = i3 - 1;
            if (f(str.charAt(i5), i4)) {
                break;
            }
            i3 = i5;
        }
        if (i2 < 0 || i2 > i3 || i3 > str.length()) {
            return null;
        }
        return str.substring(i2, i3);
    }

    private String e(String str, String str2, boolean z) {
        int i2;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Matcher matcher = Pattern.compile(String.format(z ? "%s(\\s|\\n)+((is)(\\s|\\n)+|)[0-9]" : "%s(\\s|\\n)*[是为:：]*(\\s|\\n)*[A-Za-z0-9]", str)).matcher(str2);
        if (matcher.find()) {
            com.bytedance.android.input.r.j.i("VerificationParser", "verification string flag match");
            i2 = matcher.end();
        } else {
            i2 = -1;
        }
        int i3 = i2 - 1;
        if (i3 > 0) {
            Matcher matcher2 = f2207c.matcher(str2);
            if (z) {
                matcher2 = k.matcher(str2);
            }
            if (matcher2.find(i3 - 1)) {
                String d2 = d(str2, matcher2.start(), matcher2.end(), !z ? 3 : 1);
                if (!TextUtils.isEmpty(d2) && !copyOnWriteArrayList.contains(d2)) {
                    copyOnWriteArrayList.add(d2);
                }
            }
        }
        a(str2, copyOnWriteArrayList);
        b(str2, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() <= 0) {
            c(str2, 0, copyOnWriteArrayList, z);
            a(str2, copyOnWriteArrayList);
            b(str2, copyOnWriteArrayList);
        }
        String str3 = copyOnWriteArrayList.size() == 1 ? copyOnWriteArrayList.get(0) : null;
        StringBuilder M = e.a.a.a.a.M("after filter verification number: ");
        M.append(copyOnWriteArrayList.toString());
        com.bytedance.android.input.r.j.i("VerificationParser", M.toString());
        return str3;
    }

    private boolean f(char c2, int i2) {
        if ((i2 & 1) == 1 && '0' <= c2 && c2 <= '9') {
            return true;
        }
        if ((i2 & 2) == 2) {
            return ('A' <= c2 && c2 <= 'Z') || ('a' <= c2 && c2 <= 'z');
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.android.input.common.f g(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.p.g(java.lang.String):com.bytedance.android.input.common.f");
    }
}
