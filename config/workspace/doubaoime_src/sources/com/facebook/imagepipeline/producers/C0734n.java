package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.producers.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0734n implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final com.facebook.common.memory.a a;
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.j.c f6627c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.h.j.e f6628d;

    /* renamed from: e, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6629e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6630f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6631g;
    private final boolean h;
    private final int i;
    private final e.c.h.g.b j;
    private final Runnable k;
    private final e.c.c.d.j<Boolean> l;
    private final boolean m;

    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    private class a extends c {
        public a(C0734n c0734n, InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v, boolean z, int i) {
            super(interfaceC0732l, v, z, i);
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected synchronized boolean A(com.facebook.imagepipeline.image.f fVar, int i) {
            if (AbstractC0722b.f(i)) {
                return false;
            }
            return super.A(fVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected int u(com.facebook.imagepipeline.image.f fVar) {
            return fVar.I();
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected com.facebook.imagepipeline.image.k v() {
            return com.facebook.imagepipeline.image.i.d(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n$b */
    private class b extends c {
        private final e.c.h.j.f j;
        private final e.c.h.j.e k;
        private final e.c.h.j.d l;
        private final V m;
        private int n;

        public b(C0734n c0734n, InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v, e.c.h.j.f fVar, e.c.h.j.e eVar, e.c.h.j.d dVar, boolean z, int i) {
            super(interfaceC0732l, v, z, i);
            this.j = fVar;
            Objects.requireNonNull(eVar);
            this.k = eVar;
            this.l = dVar;
            this.m = v;
            this.n = 0;
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected synchronized boolean A(com.facebook.imagepipeline.image.f fVar, int i) {
            boolean A = super.A(fVar, i);
            if ((AbstractC0722b.f(i) || AbstractC0722b.m(i, 8)) && !AbstractC0722b.m(i, 4) && com.facebook.imagepipeline.image.f.c0(fVar)) {
                if (fVar.z() == e.c.g.c.a) {
                    if (!this.m.d().p()) {
                        return false;
                    }
                    if (!this.j.e(fVar)) {
                        return false;
                    }
                    int c2 = this.j.c();
                    int i2 = this.n;
                    if (c2 <= i2) {
                        return false;
                    }
                    if (c2 < this.k.b(i2) && !this.j.d()) {
                        return false;
                    }
                    this.n = c2;
                } else if (fVar.z() == e.c.g.c.j) {
                    if (!this.m.d().o()) {
                        return false;
                    }
                    if (!this.l.d(fVar)) {
                        return false;
                    }
                    int c3 = this.l.c();
                    if (c3 - this.n < this.m.d().b() && this.n != 0) {
                        return false;
                    }
                    this.n = c3;
                } else if (e.c.g.c.a(fVar.z()) && !this.m.d().q()) {
                    return false;
                }
            }
            return A;
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected int u(com.facebook.imagepipeline.image.f fVar) {
            if (fVar.z() == e.c.g.c.a) {
                return this.j.b();
            }
            if (fVar.z() == e.c.g.c.j) {
                return this.l.b();
            }
            return 0;
        }

        @Override // com.facebook.imagepipeline.producers.C0734n.c
        protected com.facebook.imagepipeline.image.k v() {
            return this.k.a(this.j.c());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n$c */
    private abstract class c extends AbstractC0735o<com.facebook.imagepipeline.image.f, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        private final V f6632c;

        /* renamed from: d, reason: collision with root package name */
        private final X f6633d;

        /* renamed from: e, reason: collision with root package name */
        private final com.facebook.imagepipeline.common.c f6634e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6635f;

        /* renamed from: g, reason: collision with root package name */
        private AtomicBoolean f6636g;
        private final JobScheduler h;

        /* renamed from: com.facebook.imagepipeline.producers.n$c$a */
        class a extends JobScheduler.e {
            final /* synthetic */ V b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6637c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Priority priority, C0734n c0734n, V v, int i) {
                super(priority);
                this.b = v;
                this.f6637c = i;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.c
            public void a(com.facebook.imagepipeline.image.f fVar, int i) {
                if (fVar != null) {
                    c.o(c.this, fVar, i);
                    c.this.f6632c.c("image_format", fVar.z().a());
                    if (C0734n.this.f6630f && !AbstractC0722b.m(i, 16)) {
                        ImageRequest d2 = this.b.d();
                        if (C0734n.this.f6631g || !com.facebook.common.util.c.h(d2.v())) {
                            fVar.u0(e.c.h.n.a.a(d2.t(), d2.s(), fVar, this.f6637c));
                        }
                    }
                    Objects.requireNonNull(this.b.f().j());
                    c.q(c.this, fVar, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.n$c$b */
        class b extends C0725e {
            final /* synthetic */ boolean a;

            b(C0734n c0734n, boolean z) {
                this.a = z;
            }

            @Override // com.facebook.imagepipeline.producers.W
            public void a() {
                if (this.a) {
                    c.s(c.this);
                }
            }

            @Override // com.facebook.imagepipeline.producers.C0725e, com.facebook.imagepipeline.producers.W
            public void b() {
                if (c.this.f6632c.o()) {
                    c.this.h.g();
                }
            }
        }

        public c(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v, boolean z, int i) {
            super(interfaceC0732l);
            this.f6636g = new AtomicBoolean(true);
            this.f6632c = v;
            this.f6633d = v.n();
            com.facebook.imagepipeline.common.c h = v.d().h();
            this.f6634e = h;
            this.f6635f = false;
            this.h = new JobScheduler(C0734n.this.b, new a(v.a(), C0734n.this, v, i), h.a);
            v.e(new b(C0734n.this, z));
        }

        static void o(c cVar, com.facebook.imagepipeline.image.f fVar, int i) {
            boolean compareAndSet = cVar.f6636g.compareAndSet(true, false);
            boolean e2 = AbstractC0722b.e(i);
            if (compareAndSet && e2) {
                fVar.l0(0);
                return;
            }
            if (compareAndSet && !e2) {
                fVar.l0(1);
                return;
            }
            if (!compareAndSet && !e2) {
                fVar.l0(2);
            } else {
                if (compareAndSet || !e2) {
                    return;
                }
                fVar.l0(3);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(34:45|(1:47)(1:155)|48|(1:154)(1:52)|53|(2:55|(1:57))(1:153)|(1:59)(1:152)|60|(3:62|(1:64)|65)(1:151)|66|(1:68)(1:150)|69|70|71|(19:75|(17:79|80|81|82|83|84|85|(1:87)(1:105)|88|89|(1:91)(1:104)|92|93|94|(1:96)|97|98)|145|80|81|82|83|84|85|(0)(0)|88|89|(0)(0)|92|93|94|(0)|97|98)|146|(17:79|80|81|82|83|84|85|(0)(0)|88|89|(0)(0)|92|93|94|(0)|97|98)|145|80|81|82|83|84|85|(0)(0)|88|89|(0)(0)|92|93|94|(0)|97|98) */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0237, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0238, code lost:
        
            r25 = r4;
            r21 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x027c, code lost:
        
            r2 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x02c8, code lost:
        
            r22 = r28.M();
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x02d3, code lost:
        
            if (r28.U() == false) goto L141;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x02d5, code lost:
        
            r19 = r28.I();
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x02df, code lost:
        
            r27.f6633d.k(r27.f6632c, "DecodeProducer", r0, r27.t(r2, r17, r25, r6, r7, r8, r9, r10, r11, r16, false, 0, r22, r19));
            r27.z(true);
            r27.n().a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x02dd, code lost:
        
            r19 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0230, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0231, code lost:
        
            r25 = r4;
            r21 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0241, code lost:
        
            r2 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0286, code lost:
        
            if (r27.i.m == false) goto L135;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0288, code lost:
        
            r21 = r28.M();
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0290, code lost:
        
            if (r28.U() != false) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0292, code lost:
        
            r19 = r28.I();
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x029c, code lost:
        
            r27.f6633d.k(r27.f6632c, "DecodeProducer", r0, r27.t(r2, r17, r25, r6, r7, r8, r9, r10, r11, r16, false, 0, r21, r19));
            r27.z(true);
            r27.n().a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
        
            r19 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x02c5, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x0248, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0249, code lost:
        
            r25 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x024c, code lost:
        
            r0 = r0.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x0250, code lost:
        
            r14 = new java.lang.Object[4];
            r14[0] = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x025f, code lost:
        
            r14[1] = r5;
            r14[2] = r0.w(10);
            r14[3] = java.lang.Integer.valueOf(r0.I());
            e.c.c.e.a.x("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x0278, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x027b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0279, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x02c6, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0244, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0245, code lost:
        
            r25 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x023e, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x023f, code lost:
        
            r25 = r4;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x02d5 A[Catch: all -> 0x030b, TryCatch #8 {all -> 0x030b, blocks: (B:71:0x0184, B:75:0x019d, B:79:0x01ab, B:80:0x01b2, B:83:0x01be, B:85:0x01c2, B:89:0x01d0, B:91:0x01da, B:92:0x01e4, B:96:0x0224, B:102:0x022c, B:103:0x022f, B:118:0x0280, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:125:0x02c5, B:110:0x02c8, B:112:0x02d5, B:113:0x02df, B:130:0x024c, B:132:0x0250, B:133:0x025f, B:134:0x0278, B:145:0x01b0, B:146:0x01a2, B:94:0x0214), top: B:70:0x0184, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02dd  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0288 A[Catch: all -> 0x030b, TryCatch #8 {all -> 0x030b, blocks: (B:71:0x0184, B:75:0x019d, B:79:0x01ab, B:80:0x01b2, B:83:0x01be, B:85:0x01c2, B:89:0x01d0, B:91:0x01da, B:92:0x01e4, B:96:0x0224, B:102:0x022c, B:103:0x022f, B:118:0x0280, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:125:0x02c5, B:110:0x02c8, B:112:0x02d5, B:113:0x02df, B:130:0x024c, B:132:0x0250, B:133:0x025f, B:134:0x0278, B:145:0x01b0, B:146:0x01a2, B:94:0x0214), top: B:70:0x0184, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x02c5 A[Catch: all -> 0x030b, TryCatch #8 {all -> 0x030b, blocks: (B:71:0x0184, B:75:0x019d, B:79:0x01ab, B:80:0x01b2, B:83:0x01be, B:85:0x01c2, B:89:0x01d0, B:91:0x01da, B:92:0x01e4, B:96:0x0224, B:102:0x022c, B:103:0x022f, B:118:0x0280, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:125:0x02c5, B:110:0x02c8, B:112:0x02d5, B:113:0x02df, B:130:0x024c, B:132:0x0250, B:133:0x025f, B:134:0x0278, B:145:0x01b0, B:146:0x01a2, B:94:0x0214), top: B:70:0x0184, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01da A[Catch: all -> 0x030b, TryCatch #8 {all -> 0x030b, blocks: (B:71:0x0184, B:75:0x019d, B:79:0x01ab, B:80:0x01b2, B:83:0x01be, B:85:0x01c2, B:89:0x01d0, B:91:0x01da, B:92:0x01e4, B:96:0x0224, B:102:0x022c, B:103:0x022f, B:118:0x0280, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:125:0x02c5, B:110:0x02c8, B:112:0x02d5, B:113:0x02df, B:130:0x024c, B:132:0x0250, B:133:0x025f, B:134:0x0278, B:145:0x01b0, B:146:0x01a2, B:94:0x0214), top: B:70:0x0184, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0224 A[Catch: all -> 0x030b, TRY_ENTER, TryCatch #8 {all -> 0x030b, blocks: (B:71:0x0184, B:75:0x019d, B:79:0x01ab, B:80:0x01b2, B:83:0x01be, B:85:0x01c2, B:89:0x01d0, B:91:0x01da, B:92:0x01e4, B:96:0x0224, B:102:0x022c, B:103:0x022f, B:118:0x0280, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:125:0x02c5, B:110:0x02c8, B:112:0x02d5, B:113:0x02df, B:130:0x024c, B:132:0x0250, B:133:0x025f, B:134:0x0278, B:145:0x01b0, B:146:0x01a2, B:94:0x0214), top: B:70:0x0184, inners: #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void q(com.facebook.imagepipeline.producers.C0734n.c r27, com.facebook.imagepipeline.image.f r28, int r29) {
            /*
                Method dump skipped, instructions count: 790
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C0734n.c.q(com.facebook.imagepipeline.producers.n$c, com.facebook.imagepipeline.image.f, int):void");
        }

        static void s(c cVar) {
            cVar.z(true);
            cVar.n().d();
        }

        private Map<String, String> t(com.facebook.imagepipeline.image.d dVar, long j, com.facebook.imagepipeline.image.k kVar, boolean z, String str, String str2, String str3, String str4, boolean z2, Rect rect, boolean z3, int i, long j2, long j3) {
            boolean z4;
            boolean z5;
            String str5;
            if (!this.f6633d.g(this.f6632c, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(((com.facebook.imagepipeline.image.i) kVar).c());
            String valueOf3 = String.valueOf(z);
            if (!(dVar instanceof com.facebook.imagepipeline.image.e)) {
                HashMap hashMap = new HashMap(11);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                hashMap.put("isCrop", z2 ? PushClient.DEFAULT_REQUEST_ID : "0");
                if (rect != null) {
                    hashMap.put("regionToDecode", rect.flattenToString());
                }
                hashMap.put("imageCount", dVar == null ? "-1" : String.valueOf(dVar.d()));
                hashMap.put("imageQuality", "not_static_image");
                return e.c.c.d.f.a(hashMap);
            }
            Bitmap s = ((com.facebook.imagepipeline.image.e) dVar).s();
            String str6 = s.getWidth() + "x" + s.getHeight();
            HashMap hashMap2 = new HashMap(20);
            hashMap2.put("bitmapSize", str6);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            hashMap2.put("byteCount", s.getByteCount() + "");
            hashMap2.put("bitmapRamSize", String.valueOf(com.facebook.imageutils.b.e(s)));
            hashMap2.put("isCrop", z2 ? PushClient.DEFAULT_REQUEST_ID : "0");
            hashMap2.put("extra_bitmap_config", s.getConfig() == null ? "unkown" : s.getConfig().name());
            hashMap2.put("heic_sys_first", z3 ? PushClient.DEFAULT_REQUEST_ID : "0");
            hashMap2.put("heic_custom_decoder", String.valueOf(i));
            if (rect != null) {
                hashMap2.put("regionToDecode", rect.flattenToString());
            }
            hashMap2.put("imageCount", String.valueOf(dVar.d()));
            int width = s.getWidth();
            int height = s.getHeight();
            ArrayList arrayList = new ArrayList();
            Random random = new Random();
            Random random2 = new Random();
            int a2 = e.c.h.g.j.g().a();
            e.c.h.m.b.b();
            boolean z6 = false;
            for (int i2 = 0; i2 < a2; i2++) {
                arrayList.add(Integer.valueOf(s.getPixel(random.nextInt(width), random2.nextInt(height))));
            }
            e.c.h.m.b.b();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z4 = true;
                    break;
                }
                if (((Integer) it2.next()).intValue() != -1) {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                str5 = "white_suspected";
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z5 = true;
                        break;
                    }
                    if (((Integer) it3.next()).intValue() != -16777216) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    str5 = "black_suspected";
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z6 = true;
                            break;
                        }
                        if (((Integer) it4.next()).intValue() != 0) {
                            break;
                        }
                    }
                    str5 = z6 ? "transparent_suspected" : "normal";
                }
            }
            hashMap2.put("imageQuality", str5);
            if (j2 != -1) {
                hashMap2.put("thumb_decode_duration", String.valueOf(j2));
                hashMap2.put("thumb_file_size", String.valueOf(j3));
            }
            return e.c.c.d.f.a(hashMap2);
        }

        private void w() {
            z(true);
            n().d();
        }

        private void x(Throwable th) {
            z(true);
            n().a(th);
        }

        private com.facebook.imagepipeline.image.d y(com.facebook.imagepipeline.image.f fVar, int i, com.facebook.imagepipeline.image.k kVar) {
            com.facebook.imagepipeline.image.d a2;
            boolean z = C0734n.this.k != null && ((Boolean) C0734n.this.l.get()).booleanValue();
            try {
                if (Build.VERSION.SDK_INT == 28 && e.c.g.c.c(fVar.z()) && (e.c.h.g.l.j().n() instanceof com.facebook.imagepipeline.platform.c)) {
                    com.facebook.imagepipeline.common.c cVar = this.f6634e;
                    Bitmap.Config config = cVar.h;
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    if (config != config2) {
                        cVar.h = config2;
                    }
                }
                a2 = C0734n.this.f6627c.a(fVar, i, kVar, this.f6634e);
            } catch (OutOfMemoryError e2) {
                if (!z) {
                    throw e2;
                }
                C0734n.this.k.run();
                System.gc();
                a2 = C0734n.this.f6627c.a(fVar, i, kVar, this.f6634e);
            }
            this.f6632c.c("encoded_width", Integer.valueOf(fVar.N()));
            this.f6632c.c("encoded_height", Integer.valueOf(fVar.x()));
            this.f6632c.c("encoded_size", Integer.valueOf(fVar.I()));
            if (a2 instanceof com.facebook.imagepipeline.image.b) {
                Bitmap s = ((com.facebook.imagepipeline.image.b) a2).s();
                this.f6632c.c("bitmap_config", String.valueOf(s == null ? null : s.getConfig()));
            }
            if (a2 != null) {
                a2.r(this.f6632c.getExtras());
            }
            return a2;
        }

        private void z(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f6635f) {
                        n().b(1.0f);
                        this.f6635f = true;
                        this.h.c();
                    }
                }
            }
        }

        protected boolean A(com.facebook.imagepipeline.image.f fVar, int i) {
            return this.h.i(fVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        public void g() {
            w();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        public void h(Throwable th) {
            x(th);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            try {
                e.c.h.m.b.b();
                boolean e2 = AbstractC0722b.e(i);
                if (e2) {
                    if (fVar == null) {
                        com.facebook.common.util.a aVar = new com.facebook.common.util.a("Encoded image is null.");
                        z(true);
                        n().a(aVar);
                    } else if (!fVar.a0()) {
                        com.facebook.common.util.a aVar2 = new com.facebook.common.util.a("Encoded image is not valid.");
                        z(true);
                        n().a(aVar2);
                    }
                }
                if (A(fVar, i)) {
                    boolean m = AbstractC0722b.m(i, 4);
                    if (e2 || m || this.f6632c.o()) {
                        this.h.g();
                    }
                }
            } finally {
                e.c.h.m.b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void j(float f2) {
            super.j(f2 * 0.99f);
        }

        protected abstract int u(com.facebook.imagepipeline.image.f fVar);

        protected abstract com.facebook.imagepipeline.image.k v();
    }

    public C0734n(com.facebook.common.memory.a aVar, Executor executor, e.c.h.j.c cVar, e.c.h.j.e eVar, boolean z, boolean z2, boolean z3, U<com.facebook.imagepipeline.image.f> u, int i, e.c.h.g.b bVar, Runnable runnable, e.c.c.d.j<Boolean> jVar, boolean z4) {
        Objects.requireNonNull(aVar);
        this.a = aVar;
        Objects.requireNonNull(executor);
        this.b = executor;
        Objects.requireNonNull(cVar);
        this.f6627c = cVar;
        Objects.requireNonNull(eVar);
        this.f6628d = eVar;
        this.f6630f = z;
        this.f6631g = z2;
        Objects.requireNonNull(u);
        this.f6629e = u;
        this.h = z3;
        this.i = i;
        this.j = bVar;
        this.k = null;
        this.l = jVar;
        this.m = z4;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        InterfaceC0732l<com.facebook.imagepipeline.image.f> bVar;
        try {
            e.c.h.m.b.b();
            if (com.facebook.common.util.c.h(v.d().v())) {
                bVar = new b(this, interfaceC0732l, v, new e.c.h.j.f(this.a), this.f6628d, new e.c.h.j.d(this.a), this.h, this.i);
            } else {
                bVar = new a(this, interfaceC0732l, v, this.h, this.i);
            }
            this.f6629e.b(bVar, v);
        } finally {
            e.c.h.m.b.b();
        }
    }
}
