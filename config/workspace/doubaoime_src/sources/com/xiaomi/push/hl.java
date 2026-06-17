package com.xiaomi.push;

import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vivo.push.PushClient;
import com.xiaomi.push.hb;
import com.xiaomi.push.hf;
import com.xiaomi.push.hh;
import com.xiaomi.push.service.ax;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public class hl {
    private static XmlPullParser a;

    public static hd a(XmlPullParser xmlPullParser) {
        String str;
        boolean z = false;
        String str2 = null;
        if (PushClient.DEFAULT_REQUEST_ID.equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            ax.b a2 = com.xiaomi.push.service.ax.a().a(attributeValue, attributeValue4);
            if (a2 == null) {
                a2 = com.xiaomi.push.service.ax.a().a(attributeValue, attributeValue3);
            }
            if (a2 == null) {
                throw new gx("the channel id is wrong while receiving a encrypted message");
            }
            hd hdVar = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!"s".equals(xmlPullParser.getName())) {
                        throw new gx("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new gx("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                        hc hcVar = new hc();
                        hcVar.l(attributeValue);
                        hcVar.b(true);
                        hcVar.n(attributeValue3);
                        hcVar.m(attributeValue4);
                        hcVar.k(attributeValue2);
                        hcVar.f(attributeValue5);
                        ha haVar = new ha("s", null, null, null);
                        haVar.m467a(text);
                        hcVar.a(haVar);
                        return hcVar;
                    }
                    a(com.xiaomi.push.service.bc.a(com.xiaomi.push.service.bc.a(a2.h, attributeValue2), text));
                    a.next();
                    hdVar = a(a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z = true;
                }
            }
            if (hdVar != null) {
                return hdVar;
            }
            throw new gx("error while receiving a encrypted message with wrong format");
        }
        hc hcVar2 = new hc();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        hcVar2.k(attributeValue6);
        hcVar2.m(xmlPullParser.getAttributeValue("", "to"));
        hcVar2.n(xmlPullParser.getAttributeValue("", "from"));
        hcVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        hcVar2.a(xmlPullParser.getAttributeValue("", HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                hcVar2.b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                hcVar2.c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                hcVar2.d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                hcVar2.e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        hcVar2.a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        hcVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String b = b(xmlPullParser);
        if (b == null || "".equals(b.trim())) {
            hd.q();
        } else {
            hcVar2.j(b);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    b(xmlPullParser);
                    hcVar2.g(m481a(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String m481a = m481a(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue11)) {
                        hcVar2.h(m481a);
                    } else {
                        hcVar2.a(m481a, attributeValue11);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals(WsConstants.KEY_CONNECTION_ERROR)) {
                    hcVar2.a(m480a(xmlPullParser));
                } else {
                    hcVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        hcVar2.i(str2);
        return hcVar2;
    }

    private static String b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static void a(byte[] bArr) {
        if (a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
            }
        }
        a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m481a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            StringBuilder M = e.a.a.a.a.M(str);
            M.append(xmlPullParser.getText());
            str = M.toString();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hf m478a(XmlPullParser xmlPullParser) {
        hf.b bVar = hf.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = hf.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        hf hfVar = new hf(bVar);
        hfVar.m(xmlPullParser.getAttributeValue("", "to"));
        hfVar.n(xmlPullParser.getAttributeValue("", "from"));
        hfVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        hfVar.k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    hfVar.a(xmlPullParser.nextText());
                } else if (name.equals(RemoteMessageConst.Notification.PRIORITY)) {
                    try {
                        hfVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        hfVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        hfVar.a(hf.a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals(WsConstants.KEY_CONNECTION_ERROR)) {
                    hfVar.a(m480a(xmlPullParser));
                } else {
                    hfVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return hfVar;
    }

    public static hb a(XmlPullParser xmlPullParser, gp gpVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        hb.a a2 = hb.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        hb hbVar = null;
        hh hhVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(WsConstants.KEY_CONNECTION_ERROR)) {
                    hhVar = m480a(xmlPullParser);
                } else {
                    hbVar = new hb();
                    hbVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (hbVar == null) {
            if (hb.a.a != a2 && hb.a.b != a2) {
                hbVar = new hb() { // from class: com.xiaomi.push.hl.2
                    @Override // com.xiaomi.push.hb
                    public String b() {
                        return null;
                    }
                };
            } else {
                hb hbVar2 = new hb() { // from class: com.xiaomi.push.hl.1
                    @Override // com.xiaomi.push.hb
                    public String b() {
                        return null;
                    }
                };
                hbVar2.k(attributeValue);
                hbVar2.m(attributeValue3);
                hbVar2.n(attributeValue2);
                hbVar2.a(hb.a.f9127d);
                hbVar2.l(attributeValue4);
                hbVar2.a(new hh(hh.a.f9151e));
                gpVar.a(hbVar2);
                com.xiaomi.channel.commonutils.logger.c.d("iq usage error. send packet in packet parser.");
                return null;
            }
        }
        hbVar.k(attributeValue);
        hbVar.m(attributeValue2);
        hbVar.l(attributeValue4);
        hbVar.n(attributeValue3);
        hbVar.a(a2);
        hbVar.a(hhVar);
        hbVar.a(hashMap);
        return hbVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hg m479a(XmlPullParser xmlPullParser) {
        hg hgVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                hgVar = new hg(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals(WsConstants.KEY_CONNECTION_ERROR)) {
                z = true;
            }
        }
        return hgVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hh m480a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = "-1";
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(WsConstants.KEY_CONNECTION_ERROR)) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new hh(Integer.parseInt(str), str3 == null ? "cancel" : str3, str2, str4, str5, arrayList);
    }

    public static ha a(String str, String str2, XmlPullParser xmlPullParser) {
        Object m476a = hk.a().m476a("all", "xm:chat");
        if (m476a == null || !(m476a instanceof com.xiaomi.push.service.j)) {
            return null;
        }
        return ((com.xiaomi.push.service.j) m476a).b(xmlPullParser);
    }
}
