package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.serializer.z;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class b implements Closeable {
    public final m a;
    public k b;

    /* renamed from: c, reason: collision with root package name */
    private String f1479c;

    /* renamed from: d, reason: collision with root package name */
    private DateFormat f1480d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1481e;

    /* renamed from: f, reason: collision with root package name */
    protected j f1482f;

    /* renamed from: g, reason: collision with root package name */
    private j[] f1483g;
    private int h;
    private List<a> i;
    public int j;
    protected List<com.alibaba.fastjson.parser.o.c> k;
    protected List<com.alibaba.fastjson.parser.o.b> l;
    public com.alibaba.fastjson.parser.o.e m;

    public static class a {
        private final j a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        public com.alibaba.fastjson.parser.o.d f1484c;

        /* renamed from: d, reason: collision with root package name */
        public j f1485d;

        public a(j jVar, String str) {
            this.a = jVar;
            this.b = str;
        }
    }

    public b(String str, k kVar, int i) {
        d dVar = new d(str, i);
        this.f1479c = com.alibaba.fastjson.a.f1465d;
        this.h = 0;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.f1481e = dVar;
        this.b = kVar;
        this.a = kVar.b;
        char c2 = dVar.f1487d;
        if (c2 == '{') {
            int i2 = dVar.f1488e + 1;
            dVar.f1488e = i2;
            dVar.f1487d = i2 < dVar.q ? dVar.p.charAt(i2) : (char) 26;
            dVar.a = 12;
            return;
        }
        if (c2 != '[') {
            dVar.r();
            return;
        }
        int i3 = dVar.f1488e + 1;
        dVar.f1488e = i3;
        dVar.f1487d = i3 < dVar.q ? dVar.p.charAt(i3) : (char) 26;
        dVar.a = 14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T A(Type type, Object obj) {
        d dVar = this.f1481e;
        int i = dVar.a;
        if (i == 8) {
            dVar.r();
            return null;
        }
        if (i == 4) {
            if (type == byte[].class) {
                T t = (T) d.h(dVar.p, dVar.j + 1, dVar.f1490g);
                this.f1481e.r();
                return t;
            }
            if (type == char[].class) {
                String V = dVar.V();
                this.f1481e.r();
                return (T) V.toCharArray();
            }
        }
        try {
            return (T) this.b.b(type).a(this, type, obj);
        } catch (com.alibaba.fastjson.d e2) {
            throw e2;
        } catch (Exception e3) {
            throw new com.alibaba.fastjson.d(e3.getMessage(), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x021c, code lost:
    
        r3.s(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0223, code lost:
    
        if (r3.a != 13) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0225, code lost:
    
        r3.s(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0228, code lost:
    
        r0 = r18.b.b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0230, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson.parser.e) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0232, code lost:
    
        r13 = ((com.alibaba.fastjson.parser.e) r0).b(r18, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0238, code lost:
    
        if (r13 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x023c, code lost:
    
        if (r14 != java.lang.Cloneable.class) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x023e, code lost:
    
        r13 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x024a, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r10) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x024c, code lost:
    
        r13 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0251, code lost:
    
        r13 = r14.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0255, code lost:
    
        if (r7 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0257, code lost:
    
        r18.f1482f = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0259, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x025a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0262, code lost:
    
        throw new com.alibaba.fastjson.d("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0263, code lost:
    
        r18.j = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0268, code lost:
    
        if (r18.f1482f == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x026c, code lost:
    
        if ((r20 instanceof java.lang.Integer) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x026e, code lost:
    
        I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0275, code lost:
    
        if (r19.size() <= 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0277, code lost:
    
        r0 = com.alibaba.fastjson.h.d.a(r19, r14, r18.b);
        G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0280, code lost:
    
        if (r7 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0282, code lost:
    
        r18.f1482f = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0284, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0285, code lost:
    
        r0 = r18.b.b(r14).a(r18, r14, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x028f, code lost:
    
        if (r7 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0291, code lost:
    
        r18.f1482f = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0293, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0372 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0534 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x054b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x048c A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x049b A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a4 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ad A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a8 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01f2 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:19:0x005e, B:22:0x0068, B:26:0x0071, B:30:0x0084, B:32:0x008e, B:36:0x0097, B:37:0x00b5, B:41:0x01bf, B:44:0x01d0, B:339:0x01ec, B:59:0x01f4, B:62:0x01fb, B:296:0x0203, B:298:0x0217, B:301:0x021c, B:303:0x0225, B:305:0x0228, B:307:0x0232, B:311:0x023e, B:312:0x0244, B:314:0x024c, B:315:0x0251, B:320:0x025b, B:321:0x0262, B:322:0x0263, B:324:0x026a, B:326:0x026e, B:327:0x0271, B:329:0x0277, B:333:0x0285, B:68:0x029b, B:71:0x02a3, B:73:0x02aa, B:75:0x02b9, B:77:0x02c1, B:80:0x02c6, B:82:0x02ca, B:83:0x0314, B:85:0x0318, B:89:0x0322, B:90:0x033a, B:93:0x02cd, B:95:0x02d5, B:97:0x02db, B:98:0x02e7, B:101:0x02f0, B:105:0x02f6, B:108:0x02fc, B:109:0x0308, B:110:0x033b, B:111:0x0357, B:114:0x035c, B:119:0x0372, B:121:0x0378, B:123:0x0384, B:124:0x038a, B:126:0x038f, B:128:0x0521, B:132:0x052b, B:135:0x0534, B:138:0x0547, B:142:0x0541, B:146:0x054f, B:149:0x0562, B:151:0x056b, B:154:0x057e, B:156:0x05c6, B:160:0x0578, B:163:0x0589, B:166:0x059c, B:167:0x0596, B:170:0x05a7, B:173:0x05ba, B:174:0x05b4, B:175:0x05c1, B:176:0x055c, B:177:0x05d0, B:178:0x05e8, B:179:0x0393, B:184:0x03a3, B:189:0x03b2, B:192:0x03c9, B:194:0x03d2, B:198:0x03df, B:199:0x03e2, B:201:0x03ec, B:202:0x03f3, B:211:0x03f7, B:208:0x0409, B:209:0x0421, B:215:0x03f0, B:217:0x03c3, B:220:0x0426, B:223:0x0439, B:225:0x044a, B:228:0x045e, B:229:0x0464, B:232:0x046a, B:233:0x0470, B:235:0x047a, B:237:0x048c, B:240:0x0494, B:241:0x0496, B:243:0x049b, B:245:0x04a4, B:247:0x04ad, B:248:0x04b0, B:256:0x04b6, B:258:0x04bd, B:253:0x04ca, B:254:0x04e2, B:262:0x04a8, B:267:0x0455, B:268:0x0433, B:271:0x04e9, B:273:0x04f5, B:276:0x0508, B:278:0x0514, B:279:0x05e9, B:281:0x05f8, B:282:0x05fc, B:290:0x0605, B:287:0x0618, B:288:0x0630, B:346:0x01ca, B:347:0x01f2, B:410:0x00ba, B:413:0x00cb, B:417:0x00c5, B:352:0x00de, B:354:0x00e8, B:355:0x00eb, B:359:0x00f1, B:360:0x0107, B:368:0x011a, B:370:0x0120, B:372:0x0125, B:374:0x0131, B:375:0x0135, B:379:0x013a, B:380:0x0154, B:381:0x012a, B:383:0x0155, B:384:0x016f, B:392:0x0179, B:395:0x0188, B:397:0x018e, B:398:0x01ac, B:399:0x01ad, B:401:0x01b6, B:404:0x0631, B:405:0x0649, B:407:0x064a, B:408:0x0662), top: B:18:0x005e, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.alibaba.fastjson.parser.b] */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.util.Date] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.util.Map r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.b.D(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public void G(Object obj) {
        Object a2;
        Class<?> cls = obj.getClass();
        com.alibaba.fastjson.parser.o.f b = this.b.b(cls);
        e eVar = b instanceof e ? (e) b : null;
        int i = this.f1481e.a;
        if (i != 12 && i != 16) {
            StringBuilder M = e.a.a.a.a.M("syntax error, expect {, actual ");
            M.append(d.a.b.a.k(i));
            throw new com.alibaba.fastjson.d(M.toString());
        }
        while (true) {
            String P = this.f1481e.P(this.a);
            if (P == null) {
                d dVar = this.f1481e;
                int i2 = dVar.a;
                if (i2 == 13) {
                    dVar.s(16);
                    return;
                } else if (i2 == 16) {
                    continue;
                }
            }
            com.alibaba.fastjson.parser.o.d f2 = eVar != null ? eVar.f(P) : null;
            if (f2 == null) {
                d dVar2 = this.f1481e;
                if ((dVar2.f1486c & Feature.IgnoreNotMatch.mask) == 0) {
                    StringBuilder M2 = e.a.a.a.a.M("setter not found, class ");
                    M2.append(cls.getName());
                    M2.append(", property ");
                    M2.append(P);
                    throw new com.alibaba.fastjson.d(M2.toString());
                }
                dVar2.t(':');
                s();
                d dVar3 = this.f1481e;
                if (dVar3.a == 13) {
                    dVar3.r();
                    return;
                }
            } else {
                com.alibaba.fastjson.h.a aVar = f2.a;
                Class<?> cls2 = aVar.f1474g;
                Type type = aVar.h;
                if (cls2 == Integer.TYPE) {
                    this.f1481e.t(':');
                    a2 = com.alibaba.fastjson.serializer.k.a.a(this, type, null);
                } else if (cls2 == String.class) {
                    this.f1481e.t(':');
                    a2 = H();
                } else if (cls2 == Long.TYPE) {
                    this.f1481e.t(':');
                    a2 = com.alibaba.fastjson.serializer.k.a.a(this, type, null);
                } else {
                    com.alibaba.fastjson.parser.o.f a3 = this.b.a(cls2, type);
                    this.f1481e.t(':');
                    a2 = a3.a(this, type, null);
                }
                f2.g(obj, a2);
                d dVar4 = this.f1481e;
                int i3 = dVar4.a;
                if (i3 != 16 && i3 == 13) {
                    dVar4.s(16);
                    return;
                }
            }
        }
    }

    public String H() {
        d dVar = this.f1481e;
        int i = dVar.a;
        if (i != 4) {
            if (i == 2) {
                String u = dVar.u();
                this.f1481e.s(16);
                return u;
            }
            Object s = s();
            if (s == null) {
                return null;
            }
            return s.toString();
        }
        String V = dVar.V();
        d dVar2 = this.f1481e;
        char c2 = dVar2.f1487d;
        if (c2 == ',') {
            int i2 = dVar2.f1488e + 1;
            dVar2.f1488e = i2;
            dVar2.f1487d = i2 < dVar2.q ? dVar2.p.charAt(i2) : (char) 26;
            this.f1481e.a = 16;
        } else if (c2 == ']') {
            int i3 = dVar2.f1488e + 1;
            dVar2.f1488e = i3;
            dVar2.f1487d = i3 < dVar2.q ? dVar2.p.charAt(i3) : (char) 26;
            this.f1481e.a = 15;
        } else if (c2 == '}') {
            int i4 = dVar2.f1488e + 1;
            dVar2.f1488e = i4;
            dVar2.f1487d = i4 < dVar2.q ? dVar2.p.charAt(i4) : (char) 26;
            this.f1481e.a = 13;
        } else {
            dVar2.r();
        }
        return V;
    }

    protected void I() {
        this.f1482f = this.f1482f.b;
        j[] jVarArr = this.f1483g;
        int i = this.h;
        jVarArr[i - 1] = null;
        this.h = i - 1;
    }

    protected j M(j jVar, Object obj, Object obj2) {
        if (this.f1481e.s) {
            return null;
        }
        this.f1482f = new j(jVar, obj, obj2);
        int i = this.h;
        this.h = i + 1;
        j[] jVarArr = this.f1483g;
        if (jVarArr == null) {
            this.f1483g = new j[8];
        } else if (i >= jVarArr.length) {
            j[] jVarArr2 = new j[(jVarArr.length * 3) / 2];
            System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            this.f1483g = jVarArr2;
        }
        j[] jVarArr3 = this.f1483g;
        j jVar2 = this.f1482f;
        jVarArr3[i] = jVar2;
        return jVar2;
    }

    public void N(j jVar) {
        if (this.f1481e.s) {
            return;
        }
        this.f1482f = jVar;
    }

    public final void a(int i) {
        d dVar = this.f1481e;
        if (dVar.a == i) {
            dVar.r();
            return;
        }
        StringBuilder M = e.a.a.a.a.M("syntax error, expect ");
        M.append(d.a.b.a.k(i));
        M.append(", actual ");
        M.append(d.a.b.a.k(this.f1481e.a));
        throw new com.alibaba.fastjson.d(M.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            d dVar = this.f1481e;
            if (dVar.a == 20) {
                dVar.e();
                return;
            }
            throw new com.alibaba.fastjson.d("not close json text, token : " + d.a.b.a.k(this.f1481e.a));
        } catch (Throwable th) {
            this.f1481e.e();
            throw th;
        }
    }

    protected void d(a aVar) {
        if (this.i == null) {
            this.i = new ArrayList(2);
        }
        this.i.add(aVar);
    }

    protected void h(Collection collection) {
        if (collection instanceof List) {
            a p = p();
            p.f1484c = new l(this, (List) collection, collection.size() - 1);
            p.f1485d = this.f1482f;
            this.j = 0;
            return;
        }
        a p2 = p();
        p2.f1484c = new l(collection);
        p2.f1485d = this.f1482f;
        this.j = 0;
    }

    protected void l(Map map, Object obj) {
        l lVar = new l(map, obj);
        a p = p();
        p.f1484c = lVar;
        p.f1485d = this.f1482f;
        this.j = 0;
    }

    public DateFormat o() {
        if (this.f1480d == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f1479c, this.f1481e.m);
            this.f1480d = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.f1481e.l);
        }
        return this.f1480d;
    }

    protected a p() {
        return this.i.get(r0.size() - 1);
    }

    public void r() {
        List<a> list = this.i;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.i.get(i);
            com.alibaba.fastjson.parser.o.d dVar = aVar.f1484c;
            if (dVar != null) {
                j jVar = aVar.f1485d;
                Object obj = null;
                Object obj2 = jVar != null ? jVar.a : null;
                String str = aVar.b;
                if (str.startsWith("$")) {
                    for (int i2 = 0; i2 < this.h; i2++) {
                        if (str.equals(this.f1483g[i2].toString())) {
                            obj = this.f1483g[i2].a;
                        }
                    }
                } else {
                    obj = aVar.a.a;
                }
                dVar.g(obj2, obj);
            }
        }
    }

    public Object s() {
        return w(null);
    }

    public Object w(Object obj) {
        d dVar = this.f1481e;
        int i = dVar.a;
        if (i == 2) {
            Number k = dVar.k();
            this.f1481e.r();
            return k;
        }
        if (i == 3) {
            Number f2 = dVar.f((dVar.f1486c & Feature.UseBigDecimal.mask) != 0);
            this.f1481e.r();
            return f2;
        }
        if (i == 4) {
            String V = dVar.V();
            this.f1481e.s(16);
            if ((this.f1481e.f1486c & Feature.AllowISO8601DateFormat.mask) != 0) {
                d dVar2 = new d(V, com.alibaba.fastjson.a.f1464c);
                try {
                    if (dVar2.I(true)) {
                        return dVar2.n.getTime();
                    }
                } finally {
                    dVar2.e();
                }
            }
            return V;
        }
        if (i == 12) {
            return D((dVar.f1486c & Feature.OrderedField.mask) != 0 ? new com.alibaba.fastjson.e(new LinkedHashMap()) : new com.alibaba.fastjson.e(), obj);
        }
        if (i == 14) {
            com.alibaba.fastjson.b bVar = new com.alibaba.fastjson.b();
            z(bVar, obj);
            return bVar;
        }
        switch (i) {
            case 6:
                dVar.s(16);
                return Boolean.TRUE;
            case 7:
                dVar.s(16);
                return Boolean.FALSE;
            case 8:
                break;
            case 9:
                dVar.s(18);
                d dVar3 = this.f1481e;
                if (dVar3.a != 18) {
                    StringBuilder M = e.a.a.a.a.M("syntax error, ");
                    M.append(this.f1481e.i());
                    throw new com.alibaba.fastjson.d(M.toString());
                }
                dVar3.s(10);
                a(10);
                long longValue = this.f1481e.k().longValue();
                a(2);
                a(11);
                return new Date(longValue);
            default:
                switch (i) {
                    case 20:
                        if (dVar.l()) {
                            return null;
                        }
                        StringBuilder M2 = e.a.a.a.a.M("syntax error, ");
                        M2.append(this.f1481e.i());
                        throw new com.alibaba.fastjson.d(M2.toString());
                    case 21:
                        dVar.r();
                        HashSet hashSet = new HashSet();
                        z(hashSet, obj);
                        return hashSet;
                    case 22:
                        dVar.r();
                        TreeSet treeSet = new TreeSet();
                        z(treeSet, obj);
                        return treeSet;
                    case 23:
                        break;
                    default:
                        StringBuilder M3 = e.a.a.a.a.M("syntax error, ");
                        M3.append(this.f1481e.i());
                        throw new com.alibaba.fastjson.d(M3.toString());
                }
        }
        dVar.r();
        return null;
    }

    public void x(Type type, Collection collection, Object obj) {
        com.alibaba.fastjson.parser.o.f b;
        String str;
        d dVar = this.f1481e;
        int i = dVar.a;
        if (i == 21 || i == 22) {
            dVar.r();
        }
        d dVar2 = this.f1481e;
        if (dVar2.a != 14) {
            StringBuilder M = e.a.a.a.a.M("exepct '[', but ");
            M.append(d.a.b.a.k(this.f1481e.a));
            M.append(", ");
            M.append(this.f1481e.i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        if (Integer.TYPE == type) {
            b = com.alibaba.fastjson.serializer.k.a;
            dVar2.s(2);
        } else if (String.class == type) {
            b = z.a;
            dVar2.s(4);
        } else {
            b = this.b.b(type);
            this.f1481e.s(12);
        }
        j jVar = this.f1482f;
        if (!this.f1481e.s) {
            M(jVar, collection, obj);
        }
        int i2 = 0;
        while (true) {
            try {
                d dVar3 = this.f1481e;
                int i3 = dVar3.a;
                if (i3 == 16) {
                    dVar3.r();
                } else {
                    if (i3 == 15) {
                        this.f1482f = jVar;
                        dVar3.s(16);
                        return;
                    }
                    Object obj2 = null;
                    String obj3 = null;
                    if (Integer.TYPE == type) {
                        collection.add(com.alibaba.fastjson.serializer.k.a.a(this, null, null));
                    } else if (String.class == type) {
                        if (i3 == 4) {
                            str = dVar3.V();
                            this.f1481e.s(16);
                        } else {
                            Object s = s();
                            if (s != null) {
                                obj3 = s.toString();
                            }
                            str = obj3;
                        }
                        collection.add(str);
                    } else {
                        if (i3 == 8) {
                            dVar3.r();
                        } else {
                            obj2 = b.a(this, type, Integer.valueOf(i2));
                        }
                        collection.add(obj2);
                        if (this.j == 1) {
                            h(collection);
                        }
                    }
                    d dVar4 = this.f1481e;
                    if (dVar4.a == 16) {
                        dVar4.r();
                    }
                    i2++;
                }
            } catch (Throwable th) {
                this.f1482f = jVar;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3 A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:11:0x0022, B:14:0x0036, B:21:0x0045, B:24:0x0057, B:28:0x0074, B:30:0x007a, B:32:0x0086, B:35:0x0098, B:37:0x00a1, B:42:0x00a8, B:43:0x0092, B:47:0x00b1, B:50:0x00c3, B:52:0x00cc, B:53:0x00cf, B:58:0x00bd, B:45:0x00d9, B:59:0x00dc, B:61:0x00e2, B:83:0x0111, B:84:0x01ce, B:86:0x01d5, B:87:0x01d8, B:89:0x01de, B:91:0x01e2, B:97:0x01f2, B:101:0x01fe, B:104:0x0212, B:106:0x020c, B:107:0x0215, B:111:0x0117, B:116:0x0121, B:117:0x012f, B:119:0x0136, B:120:0x013d, B:121:0x013e, B:123:0x0149, B:124:0x0159, B:125:0x0154, B:126:0x0163, B:127:0x0169, B:128:0x0171, B:129:0x0179, B:131:0x018f, B:133:0x019c, B:134:0x01a3, B:135:0x01a7, B:137:0x01b2, B:138:0x01bc, B:139:0x01b7, B:140:0x01c3, B:141:0x0051, B:142:0x005e, B:143:0x0062, B:146:0x006d), top: B:10:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:11:0x0022, B:14:0x0036, B:21:0x0045, B:24:0x0057, B:28:0x0074, B:30:0x007a, B:32:0x0086, B:35:0x0098, B:37:0x00a1, B:42:0x00a8, B:43:0x0092, B:47:0x00b1, B:50:0x00c3, B:52:0x00cc, B:53:0x00cf, B:58:0x00bd, B:45:0x00d9, B:59:0x00dc, B:61:0x00e2, B:83:0x0111, B:84:0x01ce, B:86:0x01d5, B:87:0x01d8, B:89:0x01de, B:91:0x01e2, B:97:0x01f2, B:101:0x01fe, B:104:0x0212, B:106:0x020c, B:107:0x0215, B:111:0x0117, B:116:0x0121, B:117:0x012f, B:119:0x0136, B:120:0x013d, B:121:0x013e, B:123:0x0149, B:124:0x0159, B:125:0x0154, B:126:0x0163, B:127:0x0169, B:128:0x0171, B:129:0x0179, B:131:0x018f, B:133:0x019c, B:134:0x01a3, B:135:0x01a7, B:137:0x01b2, B:138:0x01bc, B:139:0x01b7, B:140:0x01c3, B:141:0x0051, B:142:0x005e, B:143:0x0062, B:146:0x006d), top: B:10:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2 A[Catch: all -> 0x021c, LOOP:1: B:60:0x00e0->B:61:0x00e2, LOOP_END, TryCatch #0 {all -> 0x021c, blocks: (B:11:0x0022, B:14:0x0036, B:21:0x0045, B:24:0x0057, B:28:0x0074, B:30:0x007a, B:32:0x0086, B:35:0x0098, B:37:0x00a1, B:42:0x00a8, B:43:0x0092, B:47:0x00b1, B:50:0x00c3, B:52:0x00cc, B:53:0x00cf, B:58:0x00bd, B:45:0x00d9, B:59:0x00dc, B:61:0x00e2, B:83:0x0111, B:84:0x01ce, B:86:0x01d5, B:87:0x01d8, B:89:0x01de, B:91:0x01e2, B:97:0x01f2, B:101:0x01fe, B:104:0x0212, B:106:0x020c, B:107:0x0215, B:111:0x0117, B:116:0x0121, B:117:0x012f, B:119:0x0136, B:120:0x013d, B:121:0x013e, B:123:0x0149, B:124:0x0159, B:125:0x0154, B:126:0x0163, B:127:0x0169, B:128:0x0171, B:129:0x0179, B:131:0x018f, B:133:0x019c, B:134:0x01a3, B:135:0x01a7, B:137:0x01b2, B:138:0x01bc, B:139:0x01b7, B:140:0x01c3, B:141:0x0051, B:142:0x005e, B:143:0x0062, B:146:0x006d), top: B:10:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5 A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:11:0x0022, B:14:0x0036, B:21:0x0045, B:24:0x0057, B:28:0x0074, B:30:0x007a, B:32:0x0086, B:35:0x0098, B:37:0x00a1, B:42:0x00a8, B:43:0x0092, B:47:0x00b1, B:50:0x00c3, B:52:0x00cc, B:53:0x00cf, B:58:0x00bd, B:45:0x00d9, B:59:0x00dc, B:61:0x00e2, B:83:0x0111, B:84:0x01ce, B:86:0x01d5, B:87:0x01d8, B:89:0x01de, B:91:0x01e2, B:97:0x01f2, B:101:0x01fe, B:104:0x0212, B:106:0x020c, B:107:0x0215, B:111:0x0117, B:116:0x0121, B:117:0x012f, B:119:0x0136, B:120:0x013d, B:121:0x013e, B:123:0x0149, B:124:0x0159, B:125:0x0154, B:126:0x0163, B:127:0x0169, B:128:0x0171, B:129:0x0179, B:131:0x018f, B:133:0x019c, B:134:0x01a3, B:135:0x01a7, B:137:0x01b2, B:138:0x01bc, B:139:0x01b7, B:140:0x01c3, B:141:0x0051, B:142:0x005e, B:143:0x0062, B:146:0x006d), top: B:10:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:11:0x0022, B:14:0x0036, B:21:0x0045, B:24:0x0057, B:28:0x0074, B:30:0x007a, B:32:0x0086, B:35:0x0098, B:37:0x00a1, B:42:0x00a8, B:43:0x0092, B:47:0x00b1, B:50:0x00c3, B:52:0x00cc, B:53:0x00cf, B:58:0x00bd, B:45:0x00d9, B:59:0x00dc, B:61:0x00e2, B:83:0x0111, B:84:0x01ce, B:86:0x01d5, B:87:0x01d8, B:89:0x01de, B:91:0x01e2, B:97:0x01f2, B:101:0x01fe, B:104:0x0212, B:106:0x020c, B:107:0x0215, B:111:0x0117, B:116:0x0121, B:117:0x012f, B:119:0x0136, B:120:0x013d, B:121:0x013e, B:123:0x0149, B:124:0x0159, B:125:0x0154, B:126:0x0163, B:127:0x0169, B:128:0x0171, B:129:0x0179, B:131:0x018f, B:133:0x019c, B:134:0x01a3, B:135:0x01a7, B:137:0x01b2, B:138:0x01bc, B:139:0x01b7, B:140:0x01c3, B:141:0x0051, B:142:0x005e, B:143:0x0062, B:146:0x006d), top: B:10:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.util.Collection r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.b.z(java.util.Collection, java.lang.Object):void");
    }
}
