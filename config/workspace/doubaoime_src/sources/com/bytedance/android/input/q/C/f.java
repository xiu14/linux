package com.bytedance.android.input.q.C;

import com.bytedance.android.input.network.api.IRecommends;
import java.io.BufferedReader;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.AIWritingRequest$parseRequest$1", f = "AIWritingRequest.kt", l = {208, 231, 239, 269, 273, 281, 288}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class f extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
    Object a;
    Object b;

    /* renamed from: c, reason: collision with root package name */
    Object f2926c;

    /* renamed from: d, reason: collision with root package name */
    Object f2927d;

    /* renamed from: e, reason: collision with root package name */
    int f2928e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f2929f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BufferedReader f2930g;
    final /* synthetic */ g h;
    final /* synthetic */ IRecommends.Data.Source i;
    final /* synthetic */ IRecommends.Data.Type j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(BufferedReader bufferedReader, g gVar, IRecommends.Data.Source source, IRecommends.Data.Type type, kotlin.r.d<? super f> dVar) {
        super(2, dVar);
        this.f2930g = bufferedReader;
        this.h = gVar;
        this.i = source;
        this.j = type;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        f fVar = new f(this.f2930g, this.h, this.i, this.j, dVar);
        fVar.f2929f = obj;
        return fVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        f fVar = new f(this.f2930g, this.h, this.i, this.j, dVar);
        fVar.f2929f = gVar;
        return fVar.invokeSuspend(kotlin.o.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0105, code lost:
    
        if (((kotlin.text.a.s(r7) ? 1 : 0) ^ r5) != 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f9 A[Catch: all -> 0x0370, TryCatch #7 {all -> 0x0370, blocks: (B:107:0x02ac, B:117:0x02d6, B:121:0x02ec, B:126:0x02f9, B:127:0x0303, B:173:0x0341), top: B:106:0x02ac }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0303 A[Catch: all -> 0x0370, TryCatch #7 {all -> 0x0370, blocks: (B:107:0x02ac, B:117:0x02d6, B:121:0x02ec, B:126:0x02f9, B:127:0x0303, B:173:0x0341), top: B:106:0x02ac }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00ec A[Catch: all -> 0x03a0, TRY_LEAVE, TryCatch #0 {all -> 0x03a0, blocks: (B:31:0x00b9, B:36:0x00d0, B:39:0x0107, B:45:0x012d, B:47:0x0135, B:50:0x013f, B:52:0x0147, B:55:0x0151, B:180:0x00ec), top: B:30:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[Catch: all -> 0x039d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x039d, blocks: (B:15:0x0382, B:33:0x00c6, B:41:0x0121, B:182:0x0100), top: B:14:0x0382 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[Catch: all -> 0x039d, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x039d, blocks: (B:15:0x0382, B:33:0x00c6, B:41:0x0121, B:182:0x0100), top: B:14:0x0382 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[Catch: all -> 0x03a0, TRY_ENTER, TryCatch #0 {all -> 0x03a0, blocks: (B:31:0x00b9, B:36:0x00d0, B:39:0x0107, B:45:0x012d, B:47:0x0135, B:50:0x013f, B:52:0x0147, B:55:0x0151, B:180:0x00ec), top: B:30:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x037e -> B:14:0x0382). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0329 -> B:13:0x02cc). Please report as a decompilation issue!!! */
    @Override // kotlin.r.h.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
