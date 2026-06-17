package com.bytedance.android.input.keyboard.word_segmentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.databinding.LayoutWordSegmentationBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.ImeKeyboardTitleBar;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationDetailData;
import com.bytedance.android.input.speech.x;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.o;

/* loaded from: classes.dex */
public final class WordSegmentationLayoutNew extends FrameLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f2813J = 0;
    private int A;
    private int B;
    private boolean C;
    private final float D;
    private a E;
    private LayoutWordSegmentationBinding a;
    private WordSegmentationAdapterNew b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.android.input.keyboard.word_segmentation.o.a f2814c;

    /* renamed from: d, reason: collision with root package name */
    private WordSegmentationData f2815d;

    /* renamed from: e, reason: collision with root package name */
    private String f2816e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Integer> f2817f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f2818g;
    private ArrayList<j> h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private long p;
    private final long q;
    private final Set<Integer> r;
    private final Map<Integer, Boolean> s;
    private final Set<Integer> t;
    private boolean u;
    private boolean v;
    private final Choreographer w;
    private Choreographer.FrameCallback x;
    private RecyclerView y;
    private int z;

    public interface a {
        void a(List<String> list, String str);
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<String, o> {
        final /* synthetic */ ArrayList<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList<String> arrayList) {
            super(1);
            this.b = arrayList;
        }

        @Override // kotlin.s.b.l
        public o invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.f(str2, "str");
            com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "commitText = " + str2);
            WordSegmentationLayoutNew.this.f2816e = str2;
            WordSegmentationLayoutNew.this.f2814c.a(str2);
            InputView inputView = ImeService.x;
            if (inputView != null) {
                com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.CLIPBOARD, null, 2, null);
            }
            a aVar = WordSegmentationLayoutNew.this.E;
            if (aVar != null) {
                aVar.a(this.b, str2);
            }
            return o.a;
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.q.a.a((Integer) ((kotlin.g) t).c(), (Integer) ((kotlin.g) t2).c());
        }
    }

    public static final class d implements Choreographer.FrameCallback {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            RecyclerView recyclerView = WordSegmentationLayoutNew.this.y;
            if (recyclerView != null) {
                WordSegmentationLayoutNew wordSegmentationLayoutNew = WordSegmentationLayoutNew.this;
                recyclerView.scrollBy(0, wordSegmentationLayoutNew.z);
                if (wordSegmentationLayoutNew.C && wordSegmentationLayoutNew.A != -1 && wordSegmentationLayoutNew.B != -1) {
                    wordSegmentationLayoutNew.B(wordSegmentationLayoutNew.A, wordSegmentationLayoutNew.B);
                    wordSegmentationLayoutNew.C = false;
                }
            }
            WordSegmentationLayoutNew.this.w.postFrameCallback(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WordSegmentationLayoutNew(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    private final void A() {
        Choreographer.FrameCallback frameCallback = this.x;
        if (frameCallback != null) {
            this.w.removeFrameCallback(frameCallback);
            this.x = null;
        }
        this.y = null;
        this.z = 0;
        this.A = -1;
        this.B = -1;
        this.C = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i, int i2) {
        ArrayList<j> a2;
        WordSegmentationAdapterNew wordSegmentationAdapterNew = this.b;
        if (wordSegmentationAdapterNew == null || (a2 = wordSegmentationAdapterNew.a()) == null) {
            return;
        }
        int size = a2.size();
        if (i == -1 || i2 == -1) {
            return;
        }
        if (!(i >= 0 && i < size) || i2 < 0 || i2 >= size) {
            return;
        }
        boolean z = !this.o;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < size) {
            Boolean bool = this.s.get(Integer.valueOf(i3));
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            boolean z2 = min <= i3 && i3 <= max;
            boolean contains = this.t.contains(Integer.valueOf(i3));
            if (z2) {
                booleanValue = z;
            } else if (contains) {
                booleanValue = !z;
            }
            if (a2.get(i3).e() != booleanValue) {
                a2.get(i3).f(booleanValue);
                arrayList.add(Integer.valueOf(i3));
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            kotlin.collections.g.X(arrayList);
            int intValue = ((Number) arrayList.get(0)).intValue();
            int size2 = arrayList.size();
            int i4 = intValue;
            for (int i5 = 1; i5 < size2; i5++) {
                if (((Number) arrayList.get(i5)).intValue() == i4 + 1) {
                    i4 = ((Number) arrayList.get(i5)).intValue();
                } else {
                    if (intValue == i4) {
                        WordSegmentationAdapterNew wordSegmentationAdapterNew2 = this.b;
                        if (wordSegmentationAdapterNew2 != null) {
                            wordSegmentationAdapterNew2.notifyItemChanged(intValue);
                        }
                        e.a.a.a.a.j0("handleTouchEvent ACTION_MOVE 05 notifyItemChanged 01 at=", intValue, "WordSegmentationLayoutNew");
                    } else {
                        WordSegmentationAdapterNew wordSegmentationAdapterNew3 = this.b;
                        if (wordSegmentationAdapterNew3 != null) {
                            wordSegmentationAdapterNew3.notifyItemRangeChanged(intValue, (i4 - intValue) + 1);
                        }
                        e.a.a.a.a.m0("handleTouchEvent ACTION_MOVE 05 notifyItemRangeChanged 01 from=", intValue, " to=", i4, "WordSegmentationLayoutNew");
                    }
                    intValue = ((Number) arrayList.get(i5)).intValue();
                    i4 = intValue;
                }
            }
            if (intValue == i4) {
                WordSegmentationAdapterNew wordSegmentationAdapterNew4 = this.b;
                if (wordSegmentationAdapterNew4 != null) {
                    wordSegmentationAdapterNew4.notifyItemChanged(intValue);
                }
                e.a.a.a.a.j0("handleTouchEvent ACTION_MOVE 05 notifyItemChanged 02 at=", intValue, "WordSegmentationLayoutNew");
                return;
            }
            WordSegmentationAdapterNew wordSegmentationAdapterNew5 = this.b;
            if (wordSegmentationAdapterNew5 != null) {
                wordSegmentationAdapterNew5.notifyItemRangeChanged(intValue, (i4 - intValue) + 1);
            }
            e.a.a.a.a.m0("handleTouchEvent ACTION_MOVE 05 notifyItemRangeChanged 02 from=", intValue, " to=", i4, "WordSegmentationLayoutNew");
        }
    }

    public static final void a(final WordSegmentationLayoutNew wordSegmentationLayoutNew, RecyclerView recyclerView) {
        ArrayList<j> arrayList;
        WordSegmentationAdapterNew wordSegmentationAdapterNew;
        final ArrayList<j> a2;
        final int size;
        if (wordSegmentationLayoutNew.i) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        FlexboxLayoutManager flexboxLayoutManager = layoutManager instanceof FlexboxLayoutManager ? (FlexboxLayoutManager) layoutManager : null;
        if (flexboxLayoutManager == null) {
            return;
        }
        if (flexboxLayoutManager.findLastVisibleItemPosition() + 20 < flexboxLayoutManager.getItemCount() || (arrayList = wordSegmentationLayoutNew.h) == null || (wordSegmentationAdapterNew = wordSegmentationLayoutNew.b) == null || (a2 = wordSegmentationAdapterNew.a()) == null || (size = a2.size()) >= arrayList.size()) {
            return;
        }
        wordSegmentationLayoutNew.i = true;
        final List<j> subList = arrayList.subList(size, Math.min(size + 100, arrayList.size()));
        kotlin.s.c.l.e(subList, "allData.subList(nextPageStart, nextPageEnd)");
        wordSegmentationLayoutNew.f2818g.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.h
            @Override // java.lang.Runnable
            public final void run() {
                WordSegmentationLayoutNew.w(a2, subList, wordSegmentationLayoutNew, size);
            }
        });
    }

    private final void o() {
        String str;
        ArrayList<j> a2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        WordSegmentationAdapterNew wordSegmentationAdapterNew = this.b;
        if (wordSegmentationAdapterNew != null && (a2 = wordSegmentationAdapterNew.a()) != null) {
            for (j jVar : a2) {
                if (jVar.e() && jVar.b() >= 0) {
                    arrayList.add(Integer.valueOf(jVar.b()));
                    arrayList2.add(jVar.c());
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            StringBuilder N = e.a.a.a.a.N("commitText selectIndexList[", i, "] = ");
            N.append(arrayList.get(i).intValue());
            com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", N.toString());
        }
        this.f2817f = arrayList;
        com.bytedance.android.input.keyboard.word_segmentation.data.f fVar = com.bytedance.android.input.keyboard.word_segmentation.data.f.a;
        WordSegmentationData wordSegmentationData = this.f2815d;
        if (wordSegmentationData == null || (str = wordSegmentationData.getOriginText()) == null) {
            str = "";
        }
        fVar.f(str, arrayList, false, new b(arrayList2));
    }

    private final int p(RecyclerView recyclerView, MotionEvent motionEvent, boolean z) {
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "[findPositionByEvent]");
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        boolean z2 = true;
        if (findChildViewUnder != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(findChildViewUnder);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (childLayoutPosition >= 0 && childLayoutPosition < (adapter != null ? adapter.getItemCount() : 0)) {
                return childLayoutPosition;
            }
        }
        if (!z) {
            return -1;
        }
        int childCount = recyclerView.getChildCount();
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
        if (childCount == 0) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childLayoutPosition2 = recyclerView.getChildLayoutPosition(childAt);
            if (childLayoutPosition2 >= 0 && childLayoutPosition2 < itemCount) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                arrayList.add(new kotlin.g(Integer.valueOf(childLayoutPosition2), rect));
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        if (arrayList.size() > 1) {
            c cVar = new c();
            kotlin.s.c.l.f(arrayList, "<this>");
            kotlin.s.c.l.f(cVar, "comparator");
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, cVar);
            }
        }
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                kotlin.g gVar = (kotlin.g) arrayList.get(size);
                int intValue = ((Number) gVar.a()).intValue();
                Rect rect2 = (Rect) gVar.b();
                if (motionEvent.getY() >= rect2.bottom) {
                    int i3 = size + 1;
                    int size2 = arrayList.size();
                    int i4 = i3;
                    while (true) {
                        if (i4 >= size2) {
                            z2 = false;
                            break;
                        }
                        if (((Rect) ((kotlin.g) arrayList.get(i4)).b()).top > rect2.top) {
                            break;
                        }
                        i4++;
                    }
                    if (z2) {
                        int size3 = arrayList.size();
                        while (i3 < size3) {
                            kotlin.g gVar2 = (kotlin.g) arrayList.get(i3);
                            int intValue2 = ((Number) gVar2.a()).intValue();
                            if (((Rect) gVar2.b()).top != rect2.top) {
                                break;
                            }
                            i3++;
                            intValue = intValue2;
                        }
                    }
                    return intValue;
                }
                if (motionEvent.getY() >= rect2.top && motionEvent.getY() <= rect2.bottom && motionEvent.getX() >= rect2.right) {
                    return intValue;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[LOOP:0: B:15:0x0026->B:21:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[EDGE_INSN: B:22:0x00a2->B:23:0x00a2 BREAK  A[LOOP:0: B:15:0x0026->B:21:0x009f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Ld
            int r2 = r8.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 == 0) goto L11
            return r1
        L11:
            java.lang.CharSequence r8 = kotlin.text.a.U(r8)
            java.lang.String r8 = r8.toString()
            int r2 = r8.length()
            if (r2 != 0) goto L21
            r2 = r0
            goto L22
        L21:
            r2 = r1
        L22:
            if (r2 == 0) goto L25
            return r1
        L25:
            r2 = r1
        L26:
            int r3 = r8.length()
            if (r2 >= r3) goto La1
            char r3 = r8.charAt(r2)
            int r4 = r8.codePointAt(r2)
            int r5 = java.lang.Character.charCount(r4)
            boolean r6 = kotlin.text.a.t(r3)
            if (r6 == 0) goto L41
        L3e:
            r3 = r0
            goto L9c
        L41:
            kotlin.text.CharCategory r3 = kotlin.text.a.k(r3)
            kotlin.text.CharCategory r6 = kotlin.text.CharCategory.CONTROL
            if (r3 == r6) goto L3e
            kotlin.text.CharCategory r6 = kotlin.text.CharCategory.PRIVATE_USE
            if (r3 == r6) goto L3e
            kotlin.text.CharCategory r6 = kotlin.text.CharCategory.UNASSIGNED
            if (r3 != r6) goto L52
            goto L3e
        L52:
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r6 > r4) goto L5c
            r6 = 8208(0x2010, float:1.1502E-41)
            if (r4 >= r6) goto L5c
            r6 = r0
            goto L5d
        L5c:
            r6 = r1
        L5d:
            if (r6 != 0) goto L3e
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r6 > r4) goto L69
            r6 = 8240(0x2030, float:1.1547E-41)
            if (r4 >= r6) goto L69
            r6 = r0
            goto L6a
        L69:
            r6 = r1
        L6a:
            if (r6 != 0) goto L3e
            r6 = 8287(0x205f, float:1.1613E-41)
            if (r6 > r4) goto L76
            r6 = 8304(0x2070, float:1.1636E-41)
            if (r4 >= r6) goto L76
            r6 = r0
            goto L77
        L76:
            r6 = r1
        L77:
            if (r6 != 0) goto L3e
            r6 = 65024(0xfe00, float:9.1118E-41)
            if (r6 > r4) goto L85
            r6 = 65040(0xfe10, float:9.114E-41)
            if (r4 >= r6) goto L85
            r6 = r0
            goto L86
        L85:
            r6 = r1
        L86:
            if (r6 != 0) goto L3e
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r4 != r6) goto L8e
            goto L3e
        L8e:
            kotlin.text.CharCategory r6 = kotlin.text.CharCategory.FORMAT
            if (r3 != r6) goto L9b
            r3 = 8205(0x200d, float:1.1498E-41)
            if (r4 == r3) goto L9b
            r3 = 8204(0x200c, float:1.1496E-41)
            if (r4 == r3) goto L9b
            goto L3e
        L9b:
            r3 = r1
        L9c:
            if (r3 != 0) goto L9f
            goto La2
        L9f:
            int r2 = r2 + r5
            goto L26
        La1:
            r1 = r0
        La2:
            r8 = r1 ^ 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.s(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        if ((r7 == 0.0f) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r13 != 3) goto L199;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0358  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew r11, androidx.recyclerview.widget.RecyclerView r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.t(com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static void u(WordSegmentationLayoutNew wordSegmentationLayoutNew, View view) {
        kotlin.s.c.l.f(wordSegmentationLayoutNew, "this$0");
        String str = ((WordSegmentationLayoutNew) wordSegmentationLayoutNew).f2816e;
        if (str == null) {
            return;
        }
        e.a.a.a.a.r0("onClick() add common phrase, content=", str, "WordSegmentationLayoutNew");
        e.a.a.a.a.q0("add_source", "segment_page", IAppLog.a, "common_phrase_add");
        com.bytedance.android.input.keyboard.commonphrase.j jVar = com.bytedance.android.input.keyboard.commonphrase.j.a;
        com.bytedance.android.input.keyboard.commonphrase.j.c().e(str, "");
        com.bytedance.android.input.keyboard.commonphrase.j.c().f();
        while (true) {
            if (wordSegmentationLayoutNew == 0) {
                wordSegmentationLayoutNew = 0;
                break;
            } else {
                if (wordSegmentationLayoutNew instanceof InputViewRoot) {
                    break;
                }
                Object parent = wordSegmentationLayoutNew.getParent();
                wordSegmentationLayoutNew = parent instanceof View ? (View) parent : 0;
            }
        }
        InputViewRoot inputViewRoot = (InputViewRoot) wordSegmentationLayoutNew;
        if (inputViewRoot != null) {
            inputViewRoot.x0(true);
        }
        x xVar = x.a;
        x.g(false, true, null, null);
        n.a();
    }

    public static void v(WordSegmentationData wordSegmentationData, WordSegmentationLayoutNew wordSegmentationLayoutNew) {
        RecyclerView recyclerView;
        kotlin.s.c.l.f(wordSegmentationData, "$data");
        kotlin.s.c.l.f(wordSegmentationLayoutNew, "this$0");
        Iterator<T> it2 = wordSegmentationData.getDetail().iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((ArrayList) it2.next()).size();
        }
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "loadData totalCount = " + i);
        wordSegmentationLayoutNew.h = new ArrayList<>(i + 1);
        int i2 = 0;
        for (Object obj : wordSegmentationData.getDetail()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            int i4 = 0;
            for (Object obj2 : (ArrayList) obj) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.g.b0();
                    throw null;
                }
                WordSegmentationDetailData wordSegmentationDetailData = (WordSegmentationDetailData) obj2;
                String token = wordSegmentationDetailData.getToken();
                if (d.a.b.a.h(IAppGlobals.a)) {
                    StringBuilder O = e.a.a.a.a.O("loadData index=", i4, " i=", i2, " token=");
                    O.append(token);
                    O.append(", length=");
                    O.append(token != null ? Integer.valueOf(token.length()) : null);
                    O.append(", isValid=");
                    e.a.a.a.a.N0(O, wordSegmentationLayoutNew.s(token), "WordSegmentationLayoutNew");
                    if (token != null) {
                        for (int i6 = 0; i6 < token.length(); i6++) {
                            char charAt = token.charAt(i6);
                            com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "  char=" + charAt + ", code=" + ((int) charAt) + ", category=" + kotlin.text.a.k(charAt));
                        }
                    }
                }
                boolean z = i2 != 0 && i4 == 0;
                if (!(token == null || token.length() == 0) && kotlin.text.a.U(token).toString().length() > 0) {
                    WordSegmentationItemType wordSegmentationItemType = WordSegmentationItemType.TEXT;
                    if (token == null) {
                        token = "";
                    }
                    String str = token;
                    Integer index = wordSegmentationDetailData.getIndex();
                    j jVar = new j(wordSegmentationItemType, str, index != null ? index.intValue() : -1, false, z);
                    ArrayList<j> arrayList = wordSegmentationLayoutNew.h;
                    if (arrayList != null) {
                        arrayList.add(jVar);
                    }
                }
                i4 = i5;
            }
            i2 = i3;
        }
        j jVar2 = new j(WordSegmentationItemType.SPACE, "", -1, false, true);
        ArrayList<j> arrayList2 = wordSegmentationLayoutNew.h;
        if (arrayList2 != null) {
            arrayList2.add(jVar2);
        }
        wordSegmentationLayoutNew.i = false;
        ArrayList<j> arrayList3 = wordSegmentationLayoutNew.h;
        if (arrayList3 == null) {
            return;
        }
        ArrayList<j> arrayList4 = new ArrayList<>(arrayList3.subList(0, Math.min(100, arrayList3.size())));
        LayoutWordSegmentationBinding layoutWordSegmentationBinding = wordSegmentationLayoutNew.a;
        if (layoutWordSegmentationBinding == null || (recyclerView = layoutWordSegmentationBinding.f2015c) == null) {
            return;
        }
        WordSegmentationAdapterNew wordSegmentationAdapterNew = wordSegmentationLayoutNew.b;
        if (wordSegmentationAdapterNew == null) {
            com.bytedance.android.input.r.j.j("WordSegmentationLayoutNew", "loadFirstPage: mAdapter is null");
        } else {
            wordSegmentationAdapterNew.b(arrayList4);
            recyclerView.scrollToPosition(0);
        }
    }

    public static void w(ArrayList arrayList, List list, WordSegmentationLayoutNew wordSegmentationLayoutNew, int i) {
        kotlin.s.c.l.f(arrayList, "$currentAdapterData");
        kotlin.s.c.l.f(list, "$moreData");
        kotlin.s.c.l.f(wordSegmentationLayoutNew, "this$0");
        arrayList.addAll(list);
        WordSegmentationAdapterNew wordSegmentationAdapterNew = wordSegmentationLayoutNew.b;
        if (wordSegmentationAdapterNew != null) {
            wordSegmentationAdapterNew.notifyItemRangeInserted(i, list.size());
        }
        wordSegmentationLayoutNew.i = false;
    }

    private final void z(RecyclerView recyclerView, int i) {
        this.y = recyclerView;
        this.z = i;
        if (this.x != null) {
            return;
        }
        d dVar = new d();
        this.x = dVar;
        this.w.postFrameCallback(dVar);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final int q() {
        ArrayList<Integer> arrayList = this.f2817f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final String r() {
        String str = this.f2816e;
        return str == null ? "" : str;
    }

    public final void setOnSelectionListener(a aVar) {
        kotlin.s.c.l.f(aVar, "listener");
        this.E = aVar;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void x(final WordSegmentationData wordSegmentationData) {
        kotlin.s.c.l.f(wordSegmentationData, RemoteMessageConst.DATA);
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "loadData");
        this.f2815d = wordSegmentationData;
        this.f2818g.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.word_segmentation.g
            @Override // java.lang.Runnable
            public final void run() {
                WordSegmentationLayoutNew.v(WordSegmentationData.this, this);
            }
        });
        LayoutWordSegmentationBinding layoutWordSegmentationBinding = this.a;
        TextView textView = layoutWordSegmentationBinding != null ? layoutWordSegmentationBinding.b : null;
        if (textView == null) {
            return;
        }
        textView.setEnabled(false);
    }

    public final void y() {
        LinearLayout a2;
        LayoutWordSegmentationBinding layoutWordSegmentationBinding = this.a;
        ViewGroup.LayoutParams layoutParams = (layoutWordSegmentationBinding == null || (a2 = layoutWordSegmentationBinding.a()) == null) ? null : a2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            if (com.bytedance.android.input.keyboard.areacontrol.k.R()) {
                float f2 = 65;
                marginLayoutParams.leftMargin = (int) e.a.a.a.a.m("Resources.getSystem()", 1, f2);
                marginLayoutParams.rightMargin = (int) e.a.a.a.a.m("Resources.getSystem()", 1, f2);
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            LayoutWordSegmentationBinding layoutWordSegmentationBinding2 = this.a;
            LinearLayout a3 = layoutWordSegmentationBinding2 != null ? layoutWordSegmentationBinding2.a() : null;
            if (a3 == null) {
                return;
            }
            a3.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordSegmentationLayoutNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final RecyclerView recyclerView;
        TextView textView;
        ImeKeyboardTitleBar imeKeyboardTitleBar;
        ImeKeyboardTitleBar imeKeyboardTitleBar2;
        kotlin.s.c.l.f(context, "context");
        this.f2814c = new com.bytedance.android.input.keyboard.word_segmentation.o.c();
        this.f2818g = new Handler(Looper.getMainLooper());
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.q = 16L;
        this.r = new LinkedHashSet();
        this.s = new LinkedHashMap();
        this.t = new LinkedHashSet();
        this.u = true;
        Choreographer choreographer = Choreographer.getInstance();
        kotlin.s.c.l.e(choreographer, "getInstance()");
        this.w = choreographer;
        this.A = -1;
        this.B = -1;
        this.D = e.a.a.a.a.m("Resources.getSystem()", 1, 5);
        LayoutWordSegmentationBinding b2 = LayoutWordSegmentationBinding.b(LayoutInflater.from(context), this, true);
        this.a = b2;
        if (b2 != null && (imeKeyboardTitleBar2 = b2.f2016d) != null) {
            String string = getContext().getString(C0838R.string.word_segmentation_title);
            kotlin.s.c.l.e(string, "context.getString(R.stri….word_segmentation_title)");
            imeKeyboardTitleBar2.b(string);
        }
        LayoutWordSegmentationBinding layoutWordSegmentationBinding = this.a;
        if (layoutWordSegmentationBinding != null && (imeKeyboardTitleBar = layoutWordSegmentationBinding.f2016d) != null) {
            imeKeyboardTitleBar.a(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = WordSegmentationLayoutNew.f2813J;
                    com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "click wordSegmentationTitleBar back");
                    n.a();
                }
            });
        }
        LayoutWordSegmentationBinding layoutWordSegmentationBinding2 = this.a;
        if (layoutWordSegmentationBinding2 != null && (textView = layoutWordSegmentationBinding2.b) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WordSegmentationLayoutNew.u(WordSegmentationLayoutNew.this, view);
                }
            });
        }
        y();
        LayoutWordSegmentationBinding layoutWordSegmentationBinding3 = this.a;
        if (layoutWordSegmentationBinding3 != null && (recyclerView = layoutWordSegmentationBinding3.f2015c) != null) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
            flexboxLayoutManager.O(0);
            flexboxLayoutManager.P(1);
            flexboxLayoutManager.N(2);
            flexboxLayoutManager.Q(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
            recyclerView.setItemViewCacheSize(30);
            recyclerView.setHasFixedSize(true);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setVerticalScrollBarEnabled(false);
            recyclerView.setItemAnimator(null);
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WordSegmentationLayoutNew.t(WordSegmentationLayoutNew.this, recyclerView, view, motionEvent);
                }
            });
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew$initAdapter$1$2
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
                
                    if (r3 >= 0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
                
                    r2 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
                
                    if (r6 <= r5.getHeight()) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
                
                    if (r5.canScrollVertically(1) == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
                
                    if (r5.canScrollVertically(-1) == false) goto L17;
                 */
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onScrolled(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
                    /*
                        r4 = this;
                        java.lang.String r0 = "recyclerView"
                        kotlin.s.c.l.f(r5, r0)
                        super.onScrolled(r5, r6, r7)
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew r6 = com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.this
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.a(r6, r5)
                        androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r5.getLayoutManager()
                        boolean r7 = r6 instanceof com.google.android.flexbox.FlexboxLayoutManager
                        if (r7 == 0) goto L18
                        com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
                        goto L19
                    L18:
                        r6 = 0
                    L19:
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew r7 = com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.this
                        r0 = 1
                        r1 = 0
                        if (r6 == 0) goto L34
                        int r2 = r6.findFirstVisibleItemPosition()
                        android.view.View r3 = r6.findViewByPosition(r2)
                        if (r3 == 0) goto L2e
                        int r3 = r3.getTop()
                        goto L2f
                    L2e:
                        r3 = r1
                    L2f:
                        if (r2 != 0) goto L3d
                        if (r3 < 0) goto L3d
                        goto L3b
                    L34:
                        r2 = -1
                        boolean r2 = r5.canScrollVertically(r2)
                        if (r2 != 0) goto L3d
                    L3b:
                        r2 = r0
                        goto L3e
                    L3d:
                        r2 = r1
                    L3e:
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.k(r7, r2)
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew r7 = com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.this
                        if (r6 == 0) goto L63
                        int r2 = r6.getItemCount()
                        int r3 = r6.findLastVisibleItemPosition()
                        android.view.View r6 = r6.findViewByPosition(r3)
                        if (r6 == 0) goto L58
                        int r6 = r6.getBottom()
                        goto L59
                    L58:
                        r6 = r1
                    L59:
                        int r2 = r2 - r0
                        if (r3 != r2) goto L6a
                        int r5 = r5.getHeight()
                        if (r6 > r5) goto L6a
                        goto L6b
                    L63:
                        boolean r5 = r5.canScrollVertically(r0)
                        if (r5 != 0) goto L6a
                        goto L6b
                    L6a:
                        r0 = r1
                    L6b:
                        com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew.j(r7, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.word_segmentation.WordSegmentationLayoutNew$initAdapter$1$2.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
                }
            });
            WordSegmentationAdapterNew wordSegmentationAdapterNew = new WordSegmentationAdapterNew();
            this.b = wordSegmentationAdapterNew;
            recyclerView.setAdapter(wordSegmentationAdapterNew);
        }
        this.f2814c.init();
    }
}
