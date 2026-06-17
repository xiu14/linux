package com.alibaba.fastjson.serializer;

/* loaded from: classes.dex */
public class n implements t {

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f1521f = {'t', 'r', 'u', 'e'};

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f1522g = {'f', 'a', 'l', 's', 'e'};
    private final j[] a;
    private final j[] b;

    /* renamed from: c, reason: collision with root package name */
    protected int f1523c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f1524d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f1525e;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[LOOP:2: B:27:0x009b->B:29:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.lang.Class<?> r13, com.alibaba.fastjson.PropertyNamingStrategy r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.n.<init>(java.lang.Class, com.alibaba.fastjson.PropertyNamingStrategy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0409 A[Catch: all -> 0x04d0, Exception -> 0x04d6, TryCatch #9 {Exception -> 0x04d6, all -> 0x04d0, blocks: (B:90:0x0162, B:92:0x017d, B:94:0x0181, B:101:0x0186, B:103:0x018a, B:107:0x0193, B:108:0x0197, B:110:0x019d, B:115:0x01b6, B:117:0x01bd, B:119:0x01c1, B:122:0x020d, B:124:0x0211, B:126:0x0218, B:128:0x021c, B:129:0x0221, B:131:0x0225, B:132:0x022a, B:133:0x022e, B:135:0x0234, B:145:0x0254, B:147:0x0258, B:149:0x0260, B:151:0x0264, B:152:0x0269, B:154:0x026d, B:155:0x0272, B:156:0x0279, B:158:0x027f, B:163:0x0299, B:165:0x029d, B:167:0x02a4, B:169:0x02a8, B:170:0x02ad, B:172:0x02b1, B:173:0x02b6, B:174:0x02bd, B:176:0x02c3, B:182:0x02e0, B:184:0x02e4, B:190:0x02f8, B:192:0x02fc, B:194:0x0300, B:196:0x0304, B:198:0x0308, B:200:0x030c, B:202:0x031e, B:204:0x0322, B:206:0x0326, B:208:0x0310, B:210:0x0314, B:214:0x0338, B:216:0x0341, B:218:0x0345, B:219:0x0349, B:220:0x034d, B:222:0x0362, B:225:0x036e, B:226:0x0372, B:232:0x037c, B:233:0x037f, B:236:0x0387, B:238:0x0392, B:240:0x0396, B:242:0x039b, B:246:0x03b7, B:249:0x03c1, B:252:0x03c8, B:256:0x03d2, B:260:0x03de, B:264:0x03e4, B:266:0x03e8, B:267:0x03ea, B:269:0x03f2, B:271:0x03f6, B:272:0x03fa, B:274:0x0409, B:262:0x0413, B:277:0x0416, B:279:0x041a, B:280:0x0423, B:283:0x0429, B:284:0x0434, B:289:0x0447, B:291:0x0450, B:294:0x0456, B:295:0x045b, B:296:0x0462, B:298:0x0466, B:299:0x046b, B:300:0x0472, B:303:0x0478, B:305:0x0481, B:309:0x0495, B:310:0x049a, B:312:0x049f, B:313:0x04aa, B:314:0x04af, B:315:0x04b4, B:322:0x01d1, B:324:0x01d5, B:326:0x01e1, B:328:0x01e5, B:329:0x01f5, B:331:0x01fc, B:356:0x04eb, B:357:0x04ef, B:359:0x04f5, B:365:0x0505, B:367:0x050e, B:370:0x051d, B:372:0x0521, B:373:0x0525), top: B:89:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x054d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0505 A[Catch: all -> 0x04d0, Exception -> 0x04d6, TRY_ENTER, TryCatch #9 {Exception -> 0x04d6, all -> 0x04d0, blocks: (B:90:0x0162, B:92:0x017d, B:94:0x0181, B:101:0x0186, B:103:0x018a, B:107:0x0193, B:108:0x0197, B:110:0x019d, B:115:0x01b6, B:117:0x01bd, B:119:0x01c1, B:122:0x020d, B:124:0x0211, B:126:0x0218, B:128:0x021c, B:129:0x0221, B:131:0x0225, B:132:0x022a, B:133:0x022e, B:135:0x0234, B:145:0x0254, B:147:0x0258, B:149:0x0260, B:151:0x0264, B:152:0x0269, B:154:0x026d, B:155:0x0272, B:156:0x0279, B:158:0x027f, B:163:0x0299, B:165:0x029d, B:167:0x02a4, B:169:0x02a8, B:170:0x02ad, B:172:0x02b1, B:173:0x02b6, B:174:0x02bd, B:176:0x02c3, B:182:0x02e0, B:184:0x02e4, B:190:0x02f8, B:192:0x02fc, B:194:0x0300, B:196:0x0304, B:198:0x0308, B:200:0x030c, B:202:0x031e, B:204:0x0322, B:206:0x0326, B:208:0x0310, B:210:0x0314, B:214:0x0338, B:216:0x0341, B:218:0x0345, B:219:0x0349, B:220:0x034d, B:222:0x0362, B:225:0x036e, B:226:0x0372, B:232:0x037c, B:233:0x037f, B:236:0x0387, B:238:0x0392, B:240:0x0396, B:242:0x039b, B:246:0x03b7, B:249:0x03c1, B:252:0x03c8, B:256:0x03d2, B:260:0x03de, B:264:0x03e4, B:266:0x03e8, B:267:0x03ea, B:269:0x03f2, B:271:0x03f6, B:272:0x03fa, B:274:0x0409, B:262:0x0413, B:277:0x0416, B:279:0x041a, B:280:0x0423, B:283:0x0429, B:284:0x0434, B:289:0x0447, B:291:0x0450, B:294:0x0456, B:295:0x045b, B:296:0x0462, B:298:0x0466, B:299:0x046b, B:300:0x0472, B:303:0x0478, B:305:0x0481, B:309:0x0495, B:310:0x049a, B:312:0x049f, B:313:0x04aa, B:314:0x04af, B:315:0x04b4, B:322:0x01d1, B:324:0x01d5, B:326:0x01e1, B:328:0x01e5, B:329:0x01f5, B:331:0x01fc, B:356:0x04eb, B:357:0x04ef, B:359:0x04f5, B:365:0x0505, B:367:0x050e, B:370:0x051d, B:372:0x0521, B:373:0x0525), top: B:89:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x051d A[Catch: all -> 0x04d0, Exception -> 0x04d6, TRY_ENTER, TryCatch #9 {Exception -> 0x04d6, all -> 0x04d0, blocks: (B:90:0x0162, B:92:0x017d, B:94:0x0181, B:101:0x0186, B:103:0x018a, B:107:0x0193, B:108:0x0197, B:110:0x019d, B:115:0x01b6, B:117:0x01bd, B:119:0x01c1, B:122:0x020d, B:124:0x0211, B:126:0x0218, B:128:0x021c, B:129:0x0221, B:131:0x0225, B:132:0x022a, B:133:0x022e, B:135:0x0234, B:145:0x0254, B:147:0x0258, B:149:0x0260, B:151:0x0264, B:152:0x0269, B:154:0x026d, B:155:0x0272, B:156:0x0279, B:158:0x027f, B:163:0x0299, B:165:0x029d, B:167:0x02a4, B:169:0x02a8, B:170:0x02ad, B:172:0x02b1, B:173:0x02b6, B:174:0x02bd, B:176:0x02c3, B:182:0x02e0, B:184:0x02e4, B:190:0x02f8, B:192:0x02fc, B:194:0x0300, B:196:0x0304, B:198:0x0308, B:200:0x030c, B:202:0x031e, B:204:0x0322, B:206:0x0326, B:208:0x0310, B:210:0x0314, B:214:0x0338, B:216:0x0341, B:218:0x0345, B:219:0x0349, B:220:0x034d, B:222:0x0362, B:225:0x036e, B:226:0x0372, B:232:0x037c, B:233:0x037f, B:236:0x0387, B:238:0x0392, B:240:0x0396, B:242:0x039b, B:246:0x03b7, B:249:0x03c1, B:252:0x03c8, B:256:0x03d2, B:260:0x03de, B:264:0x03e4, B:266:0x03e8, B:267:0x03ea, B:269:0x03f2, B:271:0x03f6, B:272:0x03fa, B:274:0x0409, B:262:0x0413, B:277:0x0416, B:279:0x041a, B:280:0x0423, B:283:0x0429, B:284:0x0434, B:289:0x0447, B:291:0x0450, B:294:0x0456, B:295:0x045b, B:296:0x0462, B:298:0x0466, B:299:0x046b, B:300:0x0472, B:303:0x0478, B:305:0x0481, B:309:0x0495, B:310:0x049a, B:312:0x049f, B:313:0x04aa, B:314:0x04af, B:315:0x04b4, B:322:0x01d1, B:324:0x01d5, B:326:0x01e1, B:328:0x01e5, B:329:0x01f5, B:331:0x01fc, B:356:0x04eb, B:357:0x04ef, B:359:0x04f5, B:365:0x0505, B:367:0x050e, B:370:0x051d, B:372:0x0521, B:373:0x0525), top: B:89:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f A[Catch: all -> 0x0096, Exception -> 0x009b, TRY_ENTER, TryCatch #6 {Exception -> 0x009b, all -> 0x0096, blocks: (B:400:0x0089, B:402:0x008d, B:403:0x0091, B:33:0x00ab, B:35:0x00b4, B:39:0x00c3, B:42:0x00ca, B:44:0x00d1, B:49:0x00dd, B:51:0x00e3, B:54:0x00ef, B:56:0x00f6, B:57:0x00fe, B:64:0x010f, B:65:0x0113, B:67:0x0119, B:74:0x0132, B:396:0x00e8), top: B:399:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[Catch: all -> 0x0096, Exception -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x009b, all -> 0x0096, blocks: (B:400:0x0089, B:402:0x008d, B:403:0x0091, B:33:0x00ab, B:35:0x00b4, B:39:0x00c3, B:42:0x00ca, B:44:0x00d1, B:49:0x00dd, B:51:0x00e3, B:54:0x00ef, B:56:0x00f6, B:57:0x00fe, B:64:0x010f, B:65:0x0113, B:67:0x0119, B:74:0x0132, B:396:0x00e8), top: B:399:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.fastjson.serializer.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.alibaba.fastjson.serializer.m r35, java.lang.Object r36, java.lang.Object r37, java.lang.reflect.Type r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.n.b(com.alibaba.fastjson.serializer.m, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
