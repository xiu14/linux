package com.obric.common.upgrade.util;

import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.TreeSet;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.l;

@SourceDebugExtension({"SMAP\nSignatureUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureUtil.kt\ncom/obric/common/upgrade/util/SignatureUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n13586#2,2:54\n*S KotlinDebug\n*F\n+ 1 SignatureUtil.kt\ncom/obric/common/upgrade/util/SignatureUtil\n*L\n43#1:54,2\n*E\n"})
/* loaded from: classes2.dex */
public final class e {
    public static final String a(String str, String str2, byte[] bArr) {
        l.f(str, "accessKey");
        l.f(str2, "secretKey");
        l.f(bArr, "body");
        List J2 = kotlin.text.a.J("", new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, null);
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(J2);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("POST");
        sb.append('\n');
        String G = e.a.a.a.a.G(sb, g.C(treeSet, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null), '\n');
        if (!(bArr.length == 0)) {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            l.e(digest, "md5.digest()");
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(hexString);
            }
            String sb3 = sb2.toString();
            l.e(sb3, "result.toString()");
            G = G + sb3 + '\n';
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = kotlin.text.c.a;
        byte[] bytes = str2.getBytes(charset);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = G.getBytes(charset);
        l.e(bytes2, "this as java.lang.String).getBytes(charset)");
        mac.update(bytes2);
        String encodeToString = Base64.encodeToString(mac.doFinal(), 2);
        l.e(encodeToString, "encodeToString(hmac.doFinal(), Base64.NO_WRAP)");
        return str + ':' + encodeToString;
    }
}
