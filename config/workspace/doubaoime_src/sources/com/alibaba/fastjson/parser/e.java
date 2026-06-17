package com.alibaba.fastjson.parser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class e implements com.alibaba.fastjson.parser.o.f {
    private final com.alibaba.fastjson.parser.o.d[] a;
    private final com.alibaba.fastjson.parser.o.d[] b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.alibaba.fastjson.parser.o.d> f1491c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f1492d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1493e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentMap<String, Object> f1494f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x066b A[LOOP:11: B:243:0x0669->B:244:0x066b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(com.alibaba.fastjson.parser.k r29, java.lang.Class<?> r30, java.lang.reflect.Type r31) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.e.<init>(com.alibaba.fastjson.parser.k, java.lang.Class, java.lang.reflect.Type):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0311, code lost:
    
        if ("@".equals(r0) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0313, code lost:
    
        r15 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0317, code lost:
    
        r1 = (T) r15.a;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036f, code lost:
    
        r14.s(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0374, code lost:
    
        if (r14.a != 13) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0376, code lost:
    
        r14.s(16);
        r47.M(r15, r1, r49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x037e, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0380, code lost:
    
        if (r2 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0382, code lost:
    
        r2.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0384, code lost:
    
        r47.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0387, code lost:
    
        return (T) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0388, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0391, code lost:
    
        throw new com.alibaba.fastjson.d("illegal ref");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0392, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0397, code lost:
    
        r6 = r1;
        r1 = r2;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0394, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0395, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x031b, code lost:
    
        r15 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0323, code lost:
    
        if ("..".equals(r0) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0325, code lost:
    
        r1 = r15.b;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0329, code lost:
    
        if (r2 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032b, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x036b, code lost:
    
        r1 = (T) r23;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x032e, code lost:
    
        r47.d(new com.alibaba.fastjson.parser.b.a(r1, r0));
        r47.j = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0340, code lost:
    
        if ("$".equals(r0) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0342, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0343, code lost:
    
        r2 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0345, code lost:
    
        if (r2 == null) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0347, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0349, code lost:
    
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x034b, code lost:
    
        if (r2 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x034e, code lost:
    
        r47.d(new com.alibaba.fastjson.parser.b.a(r1, r0));
        r47.j = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0360, code lost:
    
        r47.d(new com.alibaba.fastjson.parser.b.a(r15, r0));
        r47.j = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x039b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x039c, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03bf, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0319, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x039f, code lost:
    
        r15 = r20;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03bd, code lost:
    
        throw new com.alibaba.fastjson.d("illegal ref, " + d.a.b.a.k(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0798, code lost:
    
        throw new com.alibaba.fastjson.d("syntax error, unexpect token " + d.a.b.a.k(r0.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0670, code lost:
    
        r23 = r14;
        r0 = r25;
        r1 = r44;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0676, code lost:
    
        if (r23 != null) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0752, code lost:
    
        r0 = (T) r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0754, code lost:
    
        if (r1 == null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0756, code lost:
    
        r1.a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0758, code lost:
    
        r47.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x075b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0678, code lost:
    
        if (r0 != null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x067a, code lost:
    
        r2 = (T) b(r47, r48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x067e, code lost:
    
        if (r1 != null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x068e, code lost:
    
        if (r1 == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0690, code lost:
    
        r1.a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0692, code lost:
    
        r47.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0695, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0680, code lost:
    
        r1 = r47.M(r15, r2, r49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0685, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0686, code lost:
    
        r44 = r1;
        r6 = r2;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0699, code lost:
    
        r2 = r46.a.length;
        r3 = new java.lang.Object[r2];
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x06a0, code lost:
    
        if (r4 >= r2) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x06a2, code lost:
    
        r5 = r46.a[r4].a;
        r3[r4] = r0.get(r5.a);
        r6 = r0.get(r5.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x06b6, code lost:
    
        if (r6 != null) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x06b8, code lost:
    
        r5 = r5.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x06bc, code lost:
    
        if (r5 != java.lang.Byte.TYPE) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06be, code lost:
    
        r6 = java.lang.Byte.valueOf(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06f6, code lost:
    
        r3[r4] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x06f8, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06c5, code lost:
    
        if (r5 != java.lang.Short.TYPE) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06c7, code lost:
    
        r6 = java.lang.Short.valueOf(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x06ce, code lost:
    
        if (r5 != java.lang.Integer.TYPE) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06d0, code lost:
    
        r6 = java.lang.Integer.valueOf(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x06d7, code lost:
    
        if (r5 != java.lang.Long.TYPE) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x06d9, code lost:
    
        r6 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x06e0, code lost:
    
        if (r5 != java.lang.Float.TYPE) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x06e2, code lost:
    
        r6 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x06e9, code lost:
    
        if (r5 != java.lang.Double.TYPE) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x06eb, code lost:
    
        r6 = java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06f2, code lost:
    
        if (r5 != java.lang.Boolean.TYPE) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x06f4, code lost:
    
        r6 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x06fb, code lost:
    
        r0 = r46.f1493e;
        r2 = r0.f1495c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x06ff, code lost:
    
        if (r2 == null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0727, code lost:
    
        r0 = r0.f1496d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0729, code lost:
    
        if (r0 == null) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x072c, code lost:
    
        r23 = r0.invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0731, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0751, code lost:
    
        throw new com.alibaba.fastjson.d("create factory method error, " + r46.f1493e.f1496d.toString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0701, code lost:
    
        r23 = r2.newInstance(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0706, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0726, code lost:
    
        throw new com.alibaba.fastjson.d("create instance error, " + r46.f1493e.f1495c.toGenericString(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0696, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x040f, code lost:
    
        r0 = r25;
        r1 = r44;
        r16 = 0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x02d2, code lost:
    
        r14.s(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x02d7, code lost:
    
        r15 = r20;
        r44 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ff, code lost:
    
        r14.t(':');
        r0 = r14.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0305, code lost:
    
        if (r0 != 4) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0307, code lost:
    
        r0 = r14.V();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #21 {all -> 0x003c, blocks: (B:13:0x0031, B:18:0x0043, B:20:0x0049, B:25:0x0058, B:32:0x0067, B:37:0x0073, B:39:0x007d, B:42:0x0084, B:44:0x0099, B:45:0x00a1, B:46:0x00aa, B:52:0x00b1), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x03ea A[Catch: all -> 0x048b, TRY_LEAVE, TryCatch #10 {all -> 0x048b, blocks: (B:395:0x03e2, B:397:0x03ea, B:410:0x0425, B:421:0x0458, B:431:0x046d), top: B:394:0x03e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x04b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02be  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T d(com.alibaba.fastjson.parser.b r47, java.lang.reflect.Type r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.e.d(com.alibaba.fastjson.parser.b, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9 A[Catch: IllegalAccessException -> 0x0368, TryCatch #0 {IllegalAccessException -> 0x0368, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0032, B:14:0x0040, B:16:0x0044, B:19:0x0057, B:23:0x0051, B:25:0x005f, B:28:0x0072, B:29:0x006c, B:30:0x007a, B:31:0x0038, B:34:0x0085, B:36:0x0089, B:37:0x00b4, B:39:0x00b8, B:40:0x00c1, B:42:0x00c5, B:45:0x00d8, B:46:0x00d2, B:48:0x00df, B:51:0x00f2, B:52:0x00ec, B:53:0x00f9, B:54:0x00be, B:57:0x0092, B:59:0x009e, B:62:0x00b1, B:63:0x00ab, B:65:0x0100, B:66:0x0118, B:69:0x0119, B:71:0x011f, B:73:0x0127, B:74:0x0135, B:76:0x0139, B:79:0x014c, B:81:0x0146, B:83:0x0154, B:86:0x0167, B:88:0x0161, B:89:0x016f, B:91:0x012d, B:92:0x0174, B:94:0x017c, B:98:0x01a5, B:99:0x01b5, B:101:0x01b9, B:102:0x01c6, B:104:0x01ca, B:107:0x01dd, B:109:0x01d7, B:112:0x01e7, B:115:0x01fa, B:117:0x01f4, B:118:0x0202, B:120:0x01bf, B:121:0x018a, B:125:0x0198, B:130:0x01b1, B:131:0x0207, B:133:0x020d, B:135:0x0213, B:138:0x024a, B:140:0x0251, B:143:0x0264, B:145:0x025e, B:148:0x026e, B:151:0x0281, B:153:0x027b, B:154:0x0289, B:156:0x021d, B:160:0x0228, B:162:0x0236, B:163:0x0242, B:165:0x028e, B:166:0x02a8, B:170:0x02ad, B:172:0x02b1, B:174:0x02c1, B:177:0x02d4, B:179:0x02ce, B:182:0x02de, B:185:0x02f1, B:187:0x02eb, B:188:0x02f9, B:190:0x02fd, B:192:0x0303, B:195:0x0316, B:196:0x033e, B:199:0x034a, B:204:0x0351, B:205:0x0356, B:207:0x0359, B:212:0x035e, B:213:0x0363, B:215:0x0310, B:218:0x0321, B:221:0x0334, B:222:0x032e, B:223:0x033b), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca A[Catch: IllegalAccessException -> 0x0368, TryCatch #0 {IllegalAccessException -> 0x0368, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0032, B:14:0x0040, B:16:0x0044, B:19:0x0057, B:23:0x0051, B:25:0x005f, B:28:0x0072, B:29:0x006c, B:30:0x007a, B:31:0x0038, B:34:0x0085, B:36:0x0089, B:37:0x00b4, B:39:0x00b8, B:40:0x00c1, B:42:0x00c5, B:45:0x00d8, B:46:0x00d2, B:48:0x00df, B:51:0x00f2, B:52:0x00ec, B:53:0x00f9, B:54:0x00be, B:57:0x0092, B:59:0x009e, B:62:0x00b1, B:63:0x00ab, B:65:0x0100, B:66:0x0118, B:69:0x0119, B:71:0x011f, B:73:0x0127, B:74:0x0135, B:76:0x0139, B:79:0x014c, B:81:0x0146, B:83:0x0154, B:86:0x0167, B:88:0x0161, B:89:0x016f, B:91:0x012d, B:92:0x0174, B:94:0x017c, B:98:0x01a5, B:99:0x01b5, B:101:0x01b9, B:102:0x01c6, B:104:0x01ca, B:107:0x01dd, B:109:0x01d7, B:112:0x01e7, B:115:0x01fa, B:117:0x01f4, B:118:0x0202, B:120:0x01bf, B:121:0x018a, B:125:0x0198, B:130:0x01b1, B:131:0x0207, B:133:0x020d, B:135:0x0213, B:138:0x024a, B:140:0x0251, B:143:0x0264, B:145:0x025e, B:148:0x026e, B:151:0x0281, B:153:0x027b, B:154:0x0289, B:156:0x021d, B:160:0x0228, B:162:0x0236, B:163:0x0242, B:165:0x028e, B:166:0x02a8, B:170:0x02ad, B:172:0x02b1, B:174:0x02c1, B:177:0x02d4, B:179:0x02ce, B:182:0x02de, B:185:0x02f1, B:187:0x02eb, B:188:0x02f9, B:190:0x02fd, B:192:0x0303, B:195:0x0316, B:196:0x033e, B:199:0x034a, B:204:0x0351, B:205:0x0356, B:207:0x0359, B:212:0x035e, B:213:0x0363, B:215:0x0310, B:218:0x0321, B:221:0x0334, B:222:0x032e, B:223:0x033b), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf A[Catch: IllegalAccessException -> 0x0368, TryCatch #0 {IllegalAccessException -> 0x0368, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0032, B:14:0x0040, B:16:0x0044, B:19:0x0057, B:23:0x0051, B:25:0x005f, B:28:0x0072, B:29:0x006c, B:30:0x007a, B:31:0x0038, B:34:0x0085, B:36:0x0089, B:37:0x00b4, B:39:0x00b8, B:40:0x00c1, B:42:0x00c5, B:45:0x00d8, B:46:0x00d2, B:48:0x00df, B:51:0x00f2, B:52:0x00ec, B:53:0x00f9, B:54:0x00be, B:57:0x0092, B:59:0x009e, B:62:0x00b1, B:63:0x00ab, B:65:0x0100, B:66:0x0118, B:69:0x0119, B:71:0x011f, B:73:0x0127, B:74:0x0135, B:76:0x0139, B:79:0x014c, B:81:0x0146, B:83:0x0154, B:86:0x0167, B:88:0x0161, B:89:0x016f, B:91:0x012d, B:92:0x0174, B:94:0x017c, B:98:0x01a5, B:99:0x01b5, B:101:0x01b9, B:102:0x01c6, B:104:0x01ca, B:107:0x01dd, B:109:0x01d7, B:112:0x01e7, B:115:0x01fa, B:117:0x01f4, B:118:0x0202, B:120:0x01bf, B:121:0x018a, B:125:0x0198, B:130:0x01b1, B:131:0x0207, B:133:0x020d, B:135:0x0213, B:138:0x024a, B:140:0x0251, B:143:0x0264, B:145:0x025e, B:148:0x026e, B:151:0x0281, B:153:0x027b, B:154:0x0289, B:156:0x021d, B:160:0x0228, B:162:0x0236, B:163:0x0242, B:165:0x028e, B:166:0x02a8, B:170:0x02ad, B:172:0x02b1, B:174:0x02c1, B:177:0x02d4, B:179:0x02ce, B:182:0x02de, B:185:0x02f1, B:187:0x02eb, B:188:0x02f9, B:190:0x02fd, B:192:0x0303, B:195:0x0316, B:196:0x033e, B:199:0x034a, B:204:0x0351, B:205:0x0356, B:207:0x0359, B:212:0x035e, B:213:0x0363, B:215:0x0310, B:218:0x0321, B:221:0x0334, B:222:0x032e, B:223:0x033b), top: B:8:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T e(com.alibaba.fastjson.parser.b r17, java.lang.reflect.Type r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.e.e(com.alibaba.fastjson.parser.b, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private boolean i(b bVar, String str, Object obj, Type type, Map<String, Object> map) {
        Type type2;
        d dVar = bVar.f1481e;
        com.alibaba.fastjson.parser.o.d f2 = f(str);
        if (f2 == null) {
            boolean startsWith = str.startsWith("is");
            for (com.alibaba.fastjson.parser.o.d dVar2 : this.b) {
                com.alibaba.fastjson.h.a aVar = dVar2.a;
                Class<?> cls = aVar.f1474g;
                String str2 = aVar.a;
                if (str2.equalsIgnoreCase(str) || (startsWith && ((cls == Boolean.TYPE || cls == Boolean.class) && str2.equalsIgnoreCase(str.substring(2))))) {
                    f2 = dVar2;
                    break;
                }
            }
        }
        int i = Feature.SupportNonPublicField.mask;
        if (f2 == null && ((bVar.f1481e.f1486c & i) != 0 || (i & this.f1493e.l) != 0)) {
            if (this.f1494f == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                for (Field field : this.f1492d.getDeclaredFields()) {
                    String name = field.getName();
                    if (f(name) == null) {
                        int modifiers = field.getModifiers();
                        if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                            concurrentHashMap.put(name, field);
                        }
                    }
                }
                this.f1494f = concurrentHashMap;
            }
            Object obj2 = this.f1494f.get(str);
            if (obj2 != null) {
                if (obj2 instanceof com.alibaba.fastjson.parser.o.d) {
                    f2 = (com.alibaba.fastjson.parser.o.d) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    f2 = new a(this.f1492d, new com.alibaba.fastjson.h.a(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0));
                    this.f1494f.put(str, f2);
                }
            }
        }
        if (f2 != null) {
            dVar.t(':');
            f2.b(bVar, obj, type, map);
            return true;
        }
        d dVar3 = bVar.f1481e;
        if ((dVar3.f1486c & Feature.IgnoreNotMatch.mask) == 0) {
            StringBuilder M = e.a.a.a.a.M("setter not found, class ");
            M.append(this.f1492d.getName());
            M.append(", property ");
            M.append(str);
            throw new com.alibaba.fastjson.d(M.toString());
        }
        dVar3.t(':');
        List<com.alibaba.fastjson.parser.o.c> list = bVar.k;
        if (list != null) {
            Iterator<com.alibaba.fastjson.parser.o.c> it2 = list.iterator();
            type2 = null;
            while (it2.hasNext()) {
                type2 = it2.next().a(obj, str);
            }
        } else {
            type2 = null;
        }
        Object s = type2 == null ? bVar.s() : bVar.A(type2, null);
        if (obj instanceof com.alibaba.fastjson.parser.o.a) {
            ((com.alibaba.fastjson.parser.o.a) obj).a(str, s);
        } else {
            List<com.alibaba.fastjson.parser.o.b> list2 = bVar.l;
            if (list2 != null) {
                Iterator<com.alibaba.fastjson.parser.o.b> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().a(obj, str, s);
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(b bVar, Type type, Object obj) {
        return (T) d(bVar, type, obj, null);
    }

    protected Object b(b bVar, Type type) {
        if ((type instanceof Class) && this.f1492d.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new com.alibaba.fastjson.e((bVar.f1481e.f1486c & Feature.OrderedField.mask) != 0));
        }
        f fVar = this.f1493e;
        Constructor<?> constructor = fVar.a;
        if (constructor == null && fVar.f1496d == null) {
            return null;
        }
        Method method = fVar.f1496d;
        if (method != null && fVar.b > 0) {
            return null;
        }
        try {
            Object newInstance = fVar.b == 0 ? constructor != null ? constructor.newInstance(new Object[0]) : method.invoke(null, new Object[0]) : constructor.newInstance(bVar.f1482f.a);
            if (bVar != null && (bVar.f1481e.f1486c & Feature.InitStringFieldAsEmpty.mask) != 0) {
                for (com.alibaba.fastjson.h.a aVar : this.f1493e.f1497e) {
                    if (aVar.f1474g == String.class) {
                        Method method2 = aVar.b;
                        if (method2 != null) {
                            method2.invoke(newInstance, "");
                        } else {
                            aVar.f1470c.set(newInstance, "");
                        }
                    }
                }
            }
            return newInstance;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("create instance error, class ");
            M.append(this.f1492d.getName());
            throw new com.alibaba.fastjson.d(M.toString(), e2);
        }
    }

    public Object c(Map<String, Object> map, k kVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f fVar = this.f1493e;
        if (fVar.f1495c == null) {
            Object b = b(null, this.f1492d);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                com.alibaba.fastjson.parser.o.d f2 = f(entry.getKey());
                if (f2 != null) {
                    Object value = entry.getValue();
                    com.alibaba.fastjson.h.a aVar = f2.a;
                    Method method = aVar.b;
                    if (method != null) {
                        method.invoke(b, com.alibaba.fastjson.h.d.b(value, method.getGenericParameterTypes()[0], kVar));
                    } else {
                        aVar.f1470c.set(b, com.alibaba.fastjson.h.d.b(value, aVar.h, kVar));
                    }
                }
            }
            return b;
        }
        com.alibaba.fastjson.h.a[] aVarArr = fVar.f1497e;
        int length = aVarArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(aVarArr[i].a);
        }
        Constructor<?> constructor = this.f1493e.f1495c;
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("create instance error, ");
            M.append(this.f1493e.f1495c.toGenericString());
            throw new com.alibaba.fastjson.d(M.toString(), e2);
        }
    }

    protected com.alibaba.fastjson.parser.o.d f(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (!this.f1493e.h) {
            int length = this.b.length - 1;
            while (i <= length) {
                int i2 = (i + length) >>> 1;
                int compareTo = this.b[i2].a.a.compareTo(str);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else {
                    if (compareTo <= 0) {
                        return this.b[i2];
                    }
                    length = i2 - 1;
                }
            }
            Map<String, com.alibaba.fastjson.parser.o.d> map = this.f1491c;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
        while (true) {
            com.alibaba.fastjson.parser.o.d[] dVarArr = this.b;
            if (i >= dVarArr.length) {
                return null;
            }
            com.alibaba.fastjson.parser.o.d dVar = dVarArr[i];
            if (dVar.a.a.equalsIgnoreCase(str)) {
                return dVar;
            }
            i++;
        }
    }

    protected com.alibaba.fastjson.parser.o.d g(long j) {
        int i = 0;
        while (true) {
            com.alibaba.fastjson.parser.o.d[] dVarArr = this.b;
            if (i >= dVarArr.length) {
                return null;
            }
            com.alibaba.fastjson.parser.o.d dVar = dVarArr[i];
            if (dVar.a.o == j) {
                return dVar;
            }
            i++;
        }
    }

    protected e h(k kVar, f fVar, String str) {
        com.alibaba.fastjson.g.c cVar = fVar.f1499g;
        if (cVar == null) {
            return null;
        }
        for (Class<?> cls : cVar.seeAlso()) {
            com.alibaba.fastjson.parser.o.f b = kVar.b(cls);
            if (b instanceof e) {
                e eVar = (e) b;
                f fVar2 = eVar.f1493e;
                if (fVar2.j.equals(str)) {
                    return eVar;
                }
                e h = h(kVar, fVar2, str);
                if (h != null) {
                    return h;
                }
            }
        }
        return null;
    }
}
