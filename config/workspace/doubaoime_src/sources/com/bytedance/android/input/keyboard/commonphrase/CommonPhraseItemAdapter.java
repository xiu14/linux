package com.bytedance.android.input.keyboard.commonphrase;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter;
import com.bytedance.android.input.keyboard.commonphrase.j;
import com.bytedance.android.input.speech.x;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CommonPhraseItemAdapter extends RecyclerView.Adapter<ItemHolder> {
    private List<j.b> a;
    private final CommonPhraseView b;

    /* renamed from: c, reason: collision with root package name */
    private final l f2660c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2661d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Integer, WeakReference<ItemHolder>> f2662e;

    /* renamed from: f, reason: collision with root package name */
    private int f2663f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<RecyclerView> f2664g;
    private RecyclerView.OnItemTouchListener h;
    private a i;

    public final class ItemHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ int n = 0;
        private TextView a;
        private FrameLayout b;

        /* renamed from: c, reason: collision with root package name */
        private View f2665c;

        /* renamed from: d, reason: collision with root package name */
        private ImageView f2666d;

        /* renamed from: e, reason: collision with root package name */
        private ImageView f2667e;

        /* renamed from: f, reason: collision with root package name */
        private final FrameLayout f2668f;

        /* renamed from: g, reason: collision with root package name */
        private final LinearLayout f2669g;
        private boolean h;
        private final float i;
        private final float j;
        private PanelMode k;
        private View l;
        final /* synthetic */ CommonPhraseItemAdapter m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemHolder(final CommonPhraseItemAdapter commonPhraseItemAdapter, View view) {
            super(view);
            kotlin.s.c.l.f(view, "itemView");
            this.m = commonPhraseItemAdapter;
            this.f2668f = (FrameLayout) view.findViewById(C0838R.id.common_phrase_list_item_bg);
            this.f2669g = (LinearLayout) view.findViewById(C0838R.id.delete_panel);
            this.i = view.getContext().getResources().getDimension(C0838R.dimen.common_phrase_item_slide_width);
            this.j = view.getContext().getResources().getDimension(C0838R.dimen.common_phrase_item_slide_width_when_confirm);
            this.k = PanelMode.Actions;
            this.a = (TextView) view.findViewById(C0838R.id.common_phrase_item_text);
            this.l = view.findViewById(C0838R.id.swipe_bottom_delete_confirm_btn);
            TextView textView = this.a;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommonPhraseItemAdapter.ItemHolder.i(CommonPhraseItemAdapter.ItemHolder.this, commonPhraseItemAdapter, view2);
                    }
                });
            }
            this.b = (FrameLayout) view.findViewById(C0838R.id.common_phrase_list_item_bg);
            View findViewById = view.findViewById(C0838R.id.common_phrase_item_expand_btn);
            this.f2665c = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommonPhraseItemAdapter.ItemHolder.j(CommonPhraseItemAdapter.this, this, view2);
                    }
                });
            }
            View view2 = this.l;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        CommonPhraseView commonPhraseView;
                        CommonPhraseItemAdapter.a aVar;
                        CommonPhraseView commonPhraseView2;
                        CommonPhraseItemAdapter.ItemHolder itemHolder = CommonPhraseItemAdapter.ItemHolder.this;
                        CommonPhraseItemAdapter commonPhraseItemAdapter2 = commonPhraseItemAdapter;
                        int i = CommonPhraseItemAdapter.ItemHolder.n;
                        kotlin.s.c.l.f(itemHolder, "this$0");
                        kotlin.s.c.l.f(commonPhraseItemAdapter2, "this$1");
                        if (itemHolder.getAdapterPosition() != -1) {
                            com.bytedance.android.input.r.j.i(commonPhraseItemAdapter2.f2661d, "common phrase confirm delete button clicked");
                            j.b bVar = commonPhraseItemAdapter2.h().get(itemHolder.getAdapterPosition());
                            commonPhraseView = commonPhraseItemAdapter2.b;
                            if (commonPhraseView != null) {
                                commonPhraseView.b(bVar.a(), bVar.b());
                            }
                            aVar = commonPhraseItemAdapter2.i;
                            if (aVar != null) {
                                aVar.a();
                            }
                            commonPhraseView2 = commonPhraseItemAdapter2.b;
                            if (commonPhraseView2 != null) {
                                com.bytedance.android.input.r.j.i(commonPhraseItemAdapter2.f2661d, "showview");
                                commonPhraseView2.j();
                            }
                            x xVar = x.a;
                            x.g(false, true, null, null);
                        }
                    }
                });
            }
            this.f2666d = (ImageView) view.findViewById(C0838R.id.swipe_bottom_edit_btn);
            this.f2667e = (ImageView) view.findViewById(C0838R.id.common_phrase_delete_btn);
            ImageView imageView = this.f2666d;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        CommonPhraseView commonPhraseView;
                        CommonPhraseItemAdapter.ItemHolder itemHolder = CommonPhraseItemAdapter.ItemHolder.this;
                        CommonPhraseItemAdapter commonPhraseItemAdapter2 = commonPhraseItemAdapter;
                        int i = CommonPhraseItemAdapter.ItemHolder.n;
                        kotlin.s.c.l.f(itemHolder, "this$0");
                        kotlin.s.c.l.f(commonPhraseItemAdapter2, "this$1");
                        if (itemHolder.getAdapterPosition() != -1) {
                            com.bytedance.android.input.r.j.i(commonPhraseItemAdapter2.f2661d, "common phrase edit button clicked");
                            j.b bVar = commonPhraseItemAdapter2.h().get(itemHolder.getAdapterPosition());
                            commonPhraseView = commonPhraseItemAdapter2.b;
                            if (commonPhraseView != null) {
                                commonPhraseView.c(bVar.a(), bVar.b());
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = this.f2667e;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        CommonPhraseItemAdapter.ItemHolder.h(CommonPhraseItemAdapter.this, this, view3);
                    }
                });
            }
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (aVar.n() || (aVar.K() && !KeyboardJni.isFloatingMode())) {
                com.bytedance.android.input.r.j.i(commonPhraseItemAdapter.f2661d, "assistantScene. set phraseItem background");
                ImageView imageView3 = this.f2667e;
                if (imageView3 != null) {
                    imageView3.setBackgroundResource(C0838R.drawable.background_delete_icon_transparent);
                }
                ImageView imageView4 = this.f2666d;
                if (imageView4 != null) {
                    imageView4.setBackgroundResource(C0838R.drawable.bg_clipboard_item_option_transparent);
                }
                FrameLayout frameLayout = this.b;
                if (frameLayout != null) {
                    frameLayout.setBackgroundResource(C0838R.drawable.bg_clipboard_history_item_transparent);
                }
            }
        }

        private final void a(final boolean z) {
            this.f2668f.animate().cancel();
            this.f2669g.animate().cancel();
            float e2 = e();
            float f2 = z ? -e2 : 0.0f;
            if (z) {
                e2 = 0.0f;
            }
            this.f2668f.animate().translationX(f2).setDuration(300L).start();
            this.f2669g.animate().translationX(e2).setDuration(300L).withEndAction(new Runnable() { // from class: com.bytedance.android.input.keyboard.commonphrase.e
                @Override // java.lang.Runnable
                public final void run() {
                    CommonPhraseItemAdapter.ItemHolder.k(z, this);
                }
            }).start();
        }

        private final void b(boolean z, PanelMode panelMode) {
            this.h = z;
            this.k = panelMode;
            this.f2668f.setTranslationX(z ? -e() : 0.0f);
            this.f2669g.setTranslationX(z ? 0.0f : this.i);
            int ordinal = panelMode.ordinal();
            if (ordinal == 0) {
                ImageView imageView = this.f2666d;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.f2667e;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                View view = this.l;
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            if (ordinal != 1) {
                return;
            }
            ImageView imageView3 = this.f2666d;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            ImageView imageView4 = this.f2667e;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            View view2 = this.l;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(0);
        }

        private final float e() {
            int ordinal = this.k.ordinal();
            if (ordinal == 0) {
                return this.i;
            }
            if (ordinal == 1) {
                return this.j;
            }
            throw new kotlin.f();
        }

        static final void h(CommonPhraseItemAdapter commonPhraseItemAdapter, ItemHolder itemHolder, View view) {
            kotlin.s.c.l.f(commonPhraseItemAdapter, "this$0");
            kotlin.s.c.l.f(itemHolder, "this$1");
            com.bytedance.android.input.r.j.i(commonPhraseItemAdapter.f2661d, "common phrase delete button clicked");
            ImageView imageView = itemHolder.f2666d;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = itemHolder.f2667e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            View view2 = itemHolder.l;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            itemHolder.k = PanelMode.ConfirmDelete;
            if (itemHolder.h) {
                itemHolder.f2668f.animate().cancel();
                itemHolder.f2668f.animate().translationX(-itemHolder.e()).setDuration(300L).start();
            }
        }

        public static void i(ItemHolder itemHolder, CommonPhraseItemAdapter commonPhraseItemAdapter, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            kotlin.s.c.l.f(commonPhraseItemAdapter, "this$1");
            boolean z = itemHolder.h || Math.abs(itemHolder.f2668f.getTranslationX()) > 0.5f || Math.abs(itemHolder.f2669g.getTranslationX() - itemHolder.i) > 0.5f;
            CommonPhraseItemAdapter.g(commonPhraseItemAdapter, true, null, 2);
            if (z) {
                return;
            }
            String str = commonPhraseItemAdapter.f2661d;
            StringBuilder M = e.a.a.a.a.M("itemView clicked, commit : ");
            TextView textView = itemHolder.a;
            M.append((Object) (textView != null ? textView.getText() : null));
            com.bytedance.android.input.r.j.i(str, M.toString());
            TextView textView2 = itemHolder.a;
            KeyboardJni.DoCommit(String.valueOf(textView2 != null ? textView2.getText() : null), 0);
        }

        public static void j(CommonPhraseItemAdapter commonPhraseItemAdapter, ItemHolder itemHolder, View view) {
            kotlin.s.c.l.f(commonPhraseItemAdapter, "this$0");
            kotlin.s.c.l.f(itemHolder, "this$1");
            String str = commonPhraseItemAdapter.f2661d;
            StringBuilder M = e.a.a.a.a.M("Expand clicked | Last position: ");
            M.append(commonPhraseItemAdapter.f2663f);
            M.append(" | Current: ");
            M.append(itemHolder.getAdapterPosition());
            com.bytedance.android.input.r.j.i(str, M.toString());
            itemHolder.l(!itemHolder.h);
        }

        public static void k(boolean z, ItemHolder itemHolder) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            if (z) {
                return;
            }
            itemHolder.k = PanelMode.Actions;
            ImageView imageView = itemHolder.f2666d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = itemHolder.f2667e;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            View view = itemHolder.l;
            if (view != null) {
                view.setVisibility(8);
            }
            itemHolder.f2669g.setTranslationX(itemHolder.i);
        }

        public final void c(String str, int i) {
            kotlin.s.c.l.f(str, "item");
            if (i == this.m.f2663f) {
                b(true, this.k);
            } else {
                b(false, PanelMode.Actions);
            }
            TextView textView = this.a;
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }

        public final void d(boolean z) {
            boolean z2 = Math.abs(this.f2668f.getTranslationX()) < 0.5f && Math.abs(this.f2669g.getTranslationX() - this.i) < 0.5f;
            if (this.h || !z2) {
                if (z) {
                    a(false);
                } else {
                    b(false, PanelMode.Actions);
                }
                this.h = false;
            }
        }

        public final float f() {
            return this.i;
        }

        public final boolean g() {
            return this.h;
        }

        public final void l(boolean z) {
            if (z && this.h) {
                return;
            }
            if (z || this.h) {
                if (z) {
                    this.k = PanelMode.Actions;
                    ImageView imageView = this.f2667e;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = this.f2666d;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    View view = this.l;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.m.f(true, this);
                }
                a(z);
                this.h = z;
                this.m.f2663f = z ? getAdapterPosition() : -1;
                String str = this.m.f2661d;
                StringBuilder X = e.a.a.a.a.X("New expanded state: ", z, " | Last position: ");
                X.append(this.m.f2663f);
                com.bytedance.android.input.r.j.i(str, X.toString());
            }
        }
    }

    private enum PanelMode {
        Actions,
        ConfirmDelete
    }

    public interface a {
        void a();
    }

    public CommonPhraseItemAdapter(List<j.b> list, CommonPhraseView commonPhraseView, l lVar) {
        kotlin.s.c.l.f(list, "items");
        kotlin.s.c.l.f(commonPhraseView, "view");
        kotlin.s.c.l.f(lVar, "swipeStateChangeListener");
        this.a = list;
        this.b = commonPhraseView;
        this.f2660c = lVar;
        this.f2661d = "CommonPhraseItemAdapter";
        this.f2662e = new LinkedHashMap();
        this.f2663f = -1;
    }

    public static /* synthetic */ void g(CommonPhraseItemAdapter commonPhraseItemAdapter, boolean z, ItemHolder itemHolder, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        int i2 = i & 2;
        commonPhraseItemAdapter.f(z, null);
    }

    public final void f(boolean z, ItemHolder itemHolder) {
        WeakReference<RecyclerView> weakReference = this.f2664g;
        RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            ItemHolder itemHolder2 = childViewHolder instanceof ItemHolder ? (ItemHolder) childViewHolder : null;
            if (itemHolder2 != null && itemHolder2 != itemHolder) {
                itemHolder2.d(z);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String str = this.f2661d;
        StringBuilder M = e.a.a.a.a.M("getItemCount: ");
        M.append(this.a.size());
        com.bytedance.android.input.r.j.i(str, M.toString());
        return this.a.size();
    }

    public final List<j.b> h() {
        return this.a;
    }

    public final void i(List<j.b> list) {
        kotlin.s.c.l.f(list, "<set-?>");
        this.a = list;
    }

    public final void j(a aVar) {
        kotlin.s.c.l.f(aVar, "listener");
        this.i = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.s.c.l.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f2664g = new WeakReference<>(recyclerView);
        final int scaledTouchSlop = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        RecyclerView.SimpleOnItemTouchListener simpleOnItemTouchListener = new RecyclerView.SimpleOnItemTouchListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter$onAttachedToRecyclerView$1
            private CommonPhraseItemAdapter.ItemHolder a;
            private float b;

            /* renamed from: c, reason: collision with root package name */
            private float f2670c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f2671d;

            /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "rv"
                    kotlin.s.c.l.f(r6, r0)
                    java.lang.String r0 = "e"
                    kotlin.s.c.l.f(r7, r0)
                    int r0 = r7.getActionMasked()
                    r1 = 2
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L5e
                    if (r0 == r3) goto L5b
                    if (r0 == r1) goto L1b
                    r6 = 3
                    if (r0 == r6) goto L5b
                    return r2
                L1b:
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter$ItemHolder r0 = r5.a
                    if (r0 != 0) goto L20
                    return r2
                L20:
                    float r1 = r7.getX()
                    float r4 = r5.b
                    float r1 = r1 - r4
                    float r7 = r7.getY()
                    float r4 = r5.f2670c
                    float r7 = r7 - r4
                    boolean r0 = r0.g()
                    if (r0 != 0) goto L35
                    return r2
                L35:
                    boolean r0 = r5.f2671d
                    if (r0 != 0) goto L58
                    int r0 = r2
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L58
                    float r0 = java.lang.Math.abs(r1)
                    float r7 = java.lang.Math.abs(r7)
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 <= 0) goto L58
                    r5.f2671d = r3
                    android.view.ViewParent r6 = r6.getParent()
                    if (r6 == 0) goto L57
                    r6.requestDisallowInterceptTouchEvent(r3)
                L57:
                    return r3
                L58:
                    boolean r6 = r5.f2671d
                    return r6
                L5b:
                    boolean r6 = r5.f2671d
                    return r6
                L5e:
                    float r0 = r7.getX()
                    r5.b = r0
                    float r0 = r7.getY()
                    r5.f2670c = r0
                    r5.f2671d = r2
                    float r0 = r7.getX()
                    float r7 = r7.getY()
                    android.view.View r7 = r6.findChildViewUnder(r0, r7)
                    r0 = 0
                    if (r7 == 0) goto L86
                    androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r6.getChildViewHolder(r7)
                    boolean r7 = r6 instanceof com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.ItemHolder
                    if (r7 == 0) goto L86
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter$ItemHolder r6 = (com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.ItemHolder) r6
                    goto L87
                L86:
                    r6 = r0
                L87:
                    r5.a = r6
                    if (r6 != 0) goto L91
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter r6 = com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.this
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.g(r6, r3, r0, r1)
                    goto L9c
                L91:
                    boolean r7 = r6.g()
                    if (r7 != 0) goto L9c
                    com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter r7 = com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter.this
                    r7.f(r3, r6)
                L9c:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.commonphrase.CommonPhraseItemAdapter$onAttachedToRecyclerView$1.onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView2, MotionEvent motionEvent) {
                CommonPhraseItemAdapter.ItemHolder itemHolder;
                kotlin.s.c.l.f(recyclerView2, "rv");
                kotlin.s.c.l.f(motionEvent, "e");
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && (itemHolder = this.a) != null) {
                    if (motionEvent.getX() - this.b > Math.max(scaledTouchSlop * 4.0f, itemHolder.f() / 3.0f)) {
                        itemHolder.l(false);
                    }
                    this.f2671d = false;
                    this.a = null;
                }
            }
        };
        this.h = simpleOnItemTouchListener;
        recyclerView.addOnItemTouchListener(simpleOnItemTouchListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ItemHolder itemHolder, int i) {
        ItemHolder itemHolder2 = itemHolder;
        kotlin.s.c.l.f(itemHolder2, "holder");
        String str = this.f2661d;
        StringBuilder N = e.a.a.a.a.N("onBindViewHolder position:", i, ", itemCount:");
        N.append(getItemCount());
        com.bytedance.android.input.r.j.i(str, N.toString());
        itemHolder2.c(this.a.get(i).a(), i);
        this.f2662e.put(Integer.valueOf(i), new WeakReference<>(itemHolder2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "viewGroup");
        com.bytedance.android.input.r.j.i(this.f2661d, "onCreateViewHolder viewType: " + i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.common_phrase_expand_item, viewGroup, false);
        kotlin.s.c.l.e(inflate, "from(viewGroup.context)\n…d_item, viewGroup, false)");
        return new ItemHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.s.c.l.f(recyclerView, "recyclerView");
        RecyclerView.OnItemTouchListener onItemTouchListener = this.h;
        if (onItemTouchListener != null) {
            recyclerView.removeOnItemTouchListener(onItemTouchListener);
        }
        this.h = null;
        this.f2664g = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(ItemHolder itemHolder) {
        ItemHolder itemHolder2 = itemHolder;
        kotlin.s.c.l.f(itemHolder2, "holder");
        super.onViewRecycled(itemHolder2);
        itemHolder2.d(false);
        kotlin.collections.g.R(this.f2662e.entrySet(), new k(itemHolder2));
    }
}
