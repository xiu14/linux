package com.alibaba.fastjson.parser;

/* loaded from: classes.dex */
public class n extends e {
    public n(k kVar, Class<?> cls) {
        super(kVar, cls, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (java.lang.Throwable.class.isAssignableFrom(r1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r1 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        r0 = (T) new java.lang.Exception(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015b, code lost:
    
        if (r12 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015d, code lost:
    
        ((java.lang.Throwable) r0).setStackTrace(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0160, code lost:
    
        return (T) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r0 = r1.getConstructors();
        r1 = r0.length;
        r4 = null;
        r5 = null;
        r8 = null;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        if (r3 >= r1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r13 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (r13.getParameterTypes().length != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r13.getParameterTypes().length != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r13.getParameterTypes()[0] != java.lang.String.class) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
    
        if (r13.getParameterTypes().length != 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r13.getParameterTypes()[0] != java.lang.String.class) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r13.getParameterTypes()[1] != java.lang.Throwable.class) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        if (r4 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r6 = (java.lang.Throwable) r4.newInstance(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        if (r6 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        r0 = (T) new java.lang.Exception(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015a, code lost:
    
        r0 = (T) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r5 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        r6 = (java.lang.Throwable) r5.newInstance(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        if (r8 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        r6 = (java.lang.Throwable) r8.newInstance(new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        throw new com.alibaba.fastjson.d("create instance error", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.e, com.alibaba.fastjson.parser.o.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T a(com.alibaba.fastjson.parser.b r17, java.lang.reflect.Type r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.n.a(com.alibaba.fastjson.parser.b, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
