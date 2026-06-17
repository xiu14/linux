package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter;
import com.bytedance.android.input.keyboard.ClipboardHistory.v;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ClipboardHistoryItemAdapter extends RecyclerView.Adapter<ItemHolder> {
    private List<v.b> a;
    private final ClipboardHistoryView b;

    /* renamed from: c, reason: collision with root package name */
    private final y f2467c;

    /* renamed from: d, reason: collision with root package name */
    private a f2468d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<RecyclerView> f2469e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.OnItemTouchListener f2470f;

    public final class ItemHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ int A = 0;
        private TextView a;
        private FrameLayout b;

        /* renamed from: c, reason: collision with root package name */
        private View f2471c;

        /* renamed from: d, reason: collision with root package name */
        private View f2472d;

        /* renamed from: e, reason: collision with root package name */
        private ImageView f2473e;

        /* renamed from: f, reason: collision with root package name */
        private View f2474f;

        /* renamed from: g, reason: collision with root package name */
        private View f2475g;
        private HorizontalScrollView h;
        private LinearLayout i;
        private final FrameLayout j;
        private final LinearLayout k;
        private boolean l;
        private final float m;
        private final float n;
        private PanelMode o;
        private v.b p;
        private final Handler q;
        private boolean r;
        private float s;
        private float t;
        private View u;
        private final kotlin.s.b.l<String, kotlin.o> v;
        private final Runnable w;
        private boolean x;
        private final View.OnTouchListener y;
        final /* synthetic */ ClipboardHistoryItemAdapter z;

        static final class a extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
            final /* synthetic */ View b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClipboardHistoryItemAdapter f2476c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ClipboardHistoryItemAdapter clipboardHistoryItemAdapter) {
                super(1);
                this.b = view;
                this.f2476c = clipboardHistoryItemAdapter;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v7, types: [android.widget.TextView] */
            @Override // kotlin.s.b.l
            public kotlin.o invoke(String str) {
                v.b bVar;
                WordSegmentationData b;
                String str2 = str;
                kotlin.s.c.l.f(str2, "showFrom");
                IAppGlobals.a.u().edit().putBoolean("has_clicked_clipboard_word_segmentation", true).apply();
                ItemHolder.this.f(false);
                ?? h = ItemHolder.this.h();
                ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = null;
                if (h != 0) {
                    while (true) {
                        if (h == 0) {
                            break;
                        }
                        if (h instanceof ClipboardCommonPhraseContainer) {
                            clipboardCommonPhraseContainer = h;
                            break;
                        }
                        Object parent = h.getParent();
                        h = parent instanceof View ? (View) parent : 0;
                    }
                    clipboardCommonPhraseContainer = clipboardCommonPhraseContainer;
                }
                if (clipboardCommonPhraseContainer != null && (bVar = ItemHolder.this.p) != null && (b = bVar.b()) != null) {
                    com.bytedance.android.input.keyboard.word_segmentation.n.f(this.b.getContext(), clipboardCommonPhraseContainer, str2, b, new x(this.f2476c));
                }
                return kotlin.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemHolder(final ClipboardHistoryItemAdapter clipboardHistoryItemAdapter, View view) {
            super(view);
            kotlin.s.c.l.f(view, "itemView");
            this.z = clipboardHistoryItemAdapter;
            this.j = (FrameLayout) view.findViewById(C0838R.id.clipboard_history_list_item_bg);
            this.k = (LinearLayout) view.findViewById(C0838R.id.delete_panel);
            this.m = view.getContext().getResources().getDimension(C0838R.dimen.clipboard_history_item_slide_width);
            this.n = view.getContext().getResources().getDimension(C0838R.dimen.clipboard_history_item_slide_width_when_confirm);
            this.o = PanelMode.Actions;
            this.q = new Handler(Looper.getMainLooper());
            this.v = new a(view, clipboardHistoryItemAdapter);
            this.w = new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.f
                @Override // java.lang.Runnable
                public final void run() {
                    ClipboardHistoryItemAdapter.ItemHolder.o(ClipboardHistoryItemAdapter.ItemHolder.this);
                }
            };
            View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return ClipboardHistoryItemAdapter.ItemHolder.r(ClipboardHistoryItemAdapter.ItemHolder.this, view2, motionEvent);
                }
            };
            this.y = onTouchListener;
            this.a = (TextView) view.findViewById(C0838R.id.clipboard_history_item_text);
            view.getContext();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ClipboardHistoryItemAdapter.ItemHolder.n(ClipboardHistoryItemAdapter.ItemHolder.this, clipboardHistoryItemAdapter, view2);
                }
            };
            TextView textView = this.a;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.a;
            if (textView2 != null) {
                textView2.setOnTouchListener(onTouchListener);
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C0838R.id.clipboard_history_list_item_bg);
            this.b = frameLayout;
            if (frameLayout != null) {
                frameLayout.setClickable(true);
            }
            FrameLayout frameLayout2 = this.b;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(onClickListener);
            }
            FrameLayout frameLayout3 = this.b;
            if (frameLayout3 != null) {
                frameLayout3.setOnTouchListener(onTouchListener);
            }
            this.f2471c = view.findViewById(C0838R.id.clipboard_history_item_expand_btn);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(C0838R.id.clipboard_history_word_segmentation_container);
            this.h = horizontalScrollView;
            if (horizontalScrollView != null) {
                horizontalScrollView.setClickable(true);
            }
            HorizontalScrollView horizontalScrollView2 = this.h;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setOnClickListener(onClickListener);
            }
            HorizontalScrollView horizontalScrollView3 = this.h;
            if (horizontalScrollView3 != null) {
                horizontalScrollView3.setOnTouchListener(onTouchListener);
            }
            this.i = (LinearLayout) view.findViewById(C0838R.id.clipboard_history_word_segmentation_layout);
            View view2 = this.f2471c;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ClipboardHistoryItemAdapter.ItemHolder.p(ClipboardHistoryItemAdapter.ItemHolder.this, view3);
                    }
                });
            }
            View findViewById = view.findViewById(C0838R.id.clipboard_history_seg_btn);
            this.f2472d = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ClipboardHistoryItemAdapter.ItemHolder.s(ClipboardHistoryItemAdapter.ItemHolder.this, view3);
                    }
                });
            }
            final View findViewById2 = view.findViewById(C0838R.id.clipboard_history_add_btn);
            this.f2474f = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ClipboardHistoryItemAdapter.ItemHolder.l(ClipboardHistoryItemAdapter.ItemHolder.this, findViewById2, view3);
                    }
                });
            }
            ImageView imageView = (ImageView) view.findViewById(C0838R.id.clipboard_history_delete_btn);
            this.f2473e = imageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f2473e;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ClipboardHistoryItemAdapter.ItemHolder.m(ClipboardHistoryItemAdapter.ItemHolder.this, view3);
                    }
                });
            }
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (aVar.n() || (aVar.K() && !KeyboardJni.isFloatingMode())) {
                com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "assistantScene. set phraseItem background");
                ImageView imageView3 = this.f2473e;
                if (imageView3 != null) {
                    imageView3.setBackgroundResource(C0838R.drawable.background_delete_icon_transparent);
                }
                View view3 = this.f2474f;
                if (view3 != null) {
                    view3.setBackgroundResource(C0838R.drawable.bg_clipboard_item_option_transparent);
                }
                View view4 = this.f2472d;
                if (view4 != null) {
                    view4.setBackgroundResource(C0838R.drawable.bg_clipboard_item_option_transparent);
                }
                FrameLayout frameLayout4 = this.b;
                if (frameLayout4 != null) {
                    frameLayout4.setBackgroundResource(C0838R.drawable.bg_clipboard_history_item_transparent);
                }
            }
            View findViewById3 = view.findViewById(C0838R.id.clipboard_history_item_delete_confirm_btn);
            this.f2475g = findViewById3;
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        ClipboardHistoryItemAdapter.ItemHolder.q(ClipboardHistoryItemAdapter.ItemHolder.this, clipboardHistoryItemAdapter, view5);
                    }
                });
            }
        }

        private final void c(final boolean z) {
            this.j.animate().cancel();
            this.k.animate().cancel();
            float g2 = g();
            float f2 = z ? -g2 : 0.0f;
            if (z) {
                g2 = 0.0f;
            }
            this.j.animate().translationX(f2).setDuration(300L).start();
            this.k.animate().translationX(g2).setDuration(300L).withEndAction(new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.d
                @Override // java.lang.Runnable
                public final void run() {
                    ClipboardHistoryItemAdapter.ItemHolder.k(z, this);
                }
            }).start();
        }

        private final void d(boolean z, PanelMode panelMode) {
            this.l = z;
            this.o = panelMode;
            float g2 = g();
            this.j.animate().cancel();
            this.k.animate().cancel();
            this.j.setTranslationX(z ? -g2 : 0.0f);
            this.k.setTranslationX(z ? 0.0f : this.m);
            int ordinal = panelMode.ordinal();
            if (ordinal == 0) {
                View view = this.f2475g;
                if (view != null) {
                    view.setEnabled(true);
                }
                View view2 = this.f2472d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = this.f2474f;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                ImageView imageView = this.f2473e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                View view4 = this.f2475g;
                if (view4 == null) {
                    return;
                }
                view4.setVisibility(8);
                return;
            }
            if (ordinal != 1) {
                return;
            }
            View view5 = this.f2475g;
            if (view5 != null) {
                view5.setEnabled(true);
            }
            View view6 = this.f2472d;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f2474f;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            ImageView imageView2 = this.f2473e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            View view8 = this.f2475g;
            if (view8 == null) {
                return;
            }
            view8.setVisibility(0);
        }

        private final float g() {
            int ordinal = this.o.ordinal();
            if (ordinal == 0) {
                return this.m;
            }
            if (ordinal == 1) {
                return this.n;
            }
            throw new kotlin.f();
        }

        public static void k(boolean z, ItemHolder itemHolder) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            if (z) {
                return;
            }
            itemHolder.o = PanelMode.Actions;
            View view = itemHolder.f2472d;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = itemHolder.f2474f;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            ImageView imageView = itemHolder.f2473e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View view3 = itemHolder.f2475g;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            itemHolder.k.setTranslationX(itemHolder.m);
            itemHolder.l = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v4, types: [com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer] */
        /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        static final void l(ItemHolder itemHolder, View view, View view2) {
            String str;
            String str2;
            kotlin.s.c.l.f(itemHolder, "this$0");
            kotlin.s.c.l.f(view, "$addCommonPhraseView");
            com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "onClick() add common phrase on clipboard list expand menu");
            v.b bVar = itemHolder.p;
            if (bVar == null || (str = bVar.a()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                return;
            }
            e.a.a.a.a.r0("add common phrase content = ", str, "ClipboardHistoryItemAdapter");
            while (true) {
                if (view == null) {
                    view = null;
                    break;
                } else {
                    if (view instanceof ClipboardCommonPhraseContainer) {
                        break;
                    }
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
            }
            ?? r8 = (ClipboardCommonPhraseContainer) view;
            if (r8 != 0) {
                com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "onClick() add common phrase list data");
                v.b bVar2 = itemHolder.p;
                if (bVar2 == null || (str2 = bVar2.a()) == null) {
                    str2 = "";
                }
                e.a.a.a.a.r0("insert common phrase content = ", str2, "ClipboardHistoryItemAdapter");
                e.a.a.a.a.q0("add_source", "clipboard_list", IAppLog.a, "common_phrase_add");
                r8.e(str2, "");
                while (true) {
                    if (r8 == 0) {
                        r8 = 0;
                        break;
                    } else {
                        if (r8 instanceof InputViewRoot) {
                            break;
                        }
                        Object parent2 = r8.getParent();
                        r8 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                }
                InputViewRoot inputViewRoot = (InputViewRoot) r8;
                if (inputViewRoot != null) {
                    inputViewRoot.x0(true);
                }
                com.bytedance.android.input.speech.x xVar = com.bytedance.android.input.speech.x.a;
                com.bytedance.android.input.speech.x.g(false, true, null, null);
            }
        }

        static final void m(ItemHolder itemHolder, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            View view2 = itemHolder.f2472d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = itemHolder.f2474f;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            ImageView imageView = itemHolder.f2473e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view4 = itemHolder.f2475g;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            itemHolder.o = PanelMode.ConfirmDelete;
            itemHolder.l = true;
            if (1 == 0) {
                return;
            }
            itemHolder.j.animate().cancel();
            itemHolder.j.animate().translationX(-itemHolder.g()).setDuration(300L).start();
        }

        public static void n(ItemHolder itemHolder, ClipboardHistoryItemAdapter clipboardHistoryItemAdapter, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            kotlin.s.c.l.f(clipboardHistoryItemAdapter, "this$1");
            boolean z = itemHolder.l || Math.abs(itemHolder.j.getTranslationX()) > 0.5f || Math.abs(itemHolder.k.getTranslationX() - itemHolder.m) > 0.5f;
            ClipboardHistoryItemAdapter.d(clipboardHistoryItemAdapter, true, null, 2);
            if (z) {
                return;
            }
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            kotlin.s.c.l.f("clipboard", "type");
            com.bytedance.android.input.i.c.d();
            e.a.a.a.a.q0("type", "clipboard", IAppLog.a, "clipboard_paste");
            TextView textView = itemHolder.a;
            KeyboardJni.DoCommit(String.valueOf(textView != null ? textView.getText() : null), 0);
        }

        public static void o(ItemHolder itemHolder) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            itemHolder.r = true;
            View view = itemHolder.u;
            if (view != null) {
                view.setPressed(false);
            }
            com.bytedance.android.input.r.j.m("ClipboardHistoryItemAdapter", "listItem onLongClick 300ms");
            itemHolder.v.invoke("clipboard_long_press");
        }

        public static void p(ItemHolder itemHolder, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            itemHolder.u(!itemHolder.l);
        }

        public static void q(ItemHolder itemHolder, ClipboardHistoryItemAdapter clipboardHistoryItemAdapter, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            kotlin.s.c.l.f(clipboardHistoryItemAdapter, "this$1");
            com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "clipboard history delete confirm button clicked");
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", MonitorConstants.SINGLE);
            aVar.t("clipboard_delete", jSONObject);
            int adapterPosition = itemHolder.getAdapterPosition();
            if (adapterPosition != -1) {
                View view2 = itemHolder.f2475g;
                if (view2 != null) {
                    view2.setEnabled(false);
                }
                v.b bVar = clipboardHistoryItemAdapter.e().get(adapterPosition);
                clipboardHistoryItemAdapter.b.f(bVar.a());
                a aVar2 = clipboardHistoryItemAdapter.f2468d;
                if (aVar2 != null) {
                    aVar2.a(adapterPosition, bVar.a());
                }
                clipboardHistoryItemAdapter.b.m(true);
                return;
            }
            itemHolder.o = PanelMode.Actions;
            View view3 = itemHolder.f2472d;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = itemHolder.f2474f;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            ImageView imageView = itemHolder.f2473e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View view5 = itemHolder.f2475g;
            if (view5 == null) {
                return;
            }
            view5.setVisibility(8);
        }

        public static boolean r(ItemHolder itemHolder, View view, MotionEvent motionEvent) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                itemHolder.r = false;
                itemHolder.x = false;
                itemHolder.s = motionEvent.getX();
                itemHolder.t = motionEvent.getY();
                itemHolder.u = view;
                itemHolder.q.postDelayed(itemHolder.w, 300L);
            } else if (actionMasked == 1) {
                itemHolder.q.removeCallbacks(itemHolder.w);
                if (itemHolder.r) {
                    return true;
                }
                if (!itemHolder.x) {
                    view.performClick();
                    return true;
                }
            } else if (actionMasked == 2) {
                int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (!itemHolder.r && !itemHolder.x) {
                    float f2 = scaledTouchSlop;
                    if (Math.abs(motionEvent.getX() - itemHolder.s) > f2 || Math.abs(motionEvent.getY() - itemHolder.t) > f2) {
                        itemHolder.x = true;
                        itemHolder.q.removeCallbacks(itemHolder.w);
                    }
                }
            } else if (actionMasked == 3) {
                itemHolder.q.removeCallbacks(itemHolder.w);
            }
            return false;
        }

        public static void s(ItemHolder itemHolder, View view) {
            kotlin.s.c.l.f(itemHolder, "this$0");
            itemHolder.v.invoke("clipboard_list");
        }

        private final void u(boolean z) {
            if (z) {
                this.o = PanelMode.Actions;
                View view = this.f2472d;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f2474f;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ImageView imageView = this.f2473e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                View view3 = this.f2475g;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                this.z.c(true, this);
            }
            c(z);
            this.l = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v(WordSegmentationData wordSegmentationData) {
            if (wordSegmentationData.getPreview().isEmpty()) {
                HorizontalScrollView horizontalScrollView = this.h;
                if (horizontalScrollView == null) {
                    return;
                }
                horizontalScrollView.setVisibility(8);
                return;
            }
            HorizontalScrollView horizontalScrollView2 = this.h;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setVisibility(0);
            }
            LinearLayout linearLayout = this.i;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            Context context = this.itemView.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            int size = wordSegmentationData.getPreview().size();
            for (int i = 0; i < size; i++) {
                String str = wordSegmentationData.getPreview().get(i);
                kotlin.s.c.l.e(str, "data.preview[i]");
                final String str2 = str;
                View inflate = from.inflate(C0838R.layout.clipboard_history_word_segmentation_item, (ViewGroup) this.i, false);
                kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
                AppCompatTextView appCompatTextView = (AppCompatTextView) inflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, context.getResources().getDimensionPixelSize(C0838R.dimen.clipboard_history_item_seg_height));
                if (i > 0) {
                    layoutParams.setMarginStart(context.getResources().getDimensionPixelSize(C0838R.dimen.clipboard_history_item_seg_margin));
                }
                appCompatTextView.setLayoutParams(layoutParams);
                appCompatTextView.setText(str2);
                appCompatTextView.setOnTouchListener(this.y);
                appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str3 = str2;
                        int i2 = ClipboardHistoryItemAdapter.ItemHolder.A;
                        kotlin.s.c.l.f(str3, "$word");
                        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
                        kotlin.s.c.l.f("clipboard_segmentation", "type");
                        com.bytedance.android.input.i.c.d();
                        e.a.a.a.a.q0("type", "clipboard_segmentation", IAppLog.a, "clipboard_paste");
                        KeyboardJni.DoCommit(str3, 0);
                    }
                });
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(inflate);
                }
            }
        }

        public final void e(v.b bVar) {
            kotlin.o oVar;
            kotlin.s.c.l.f(bVar, "itemData");
            this.p = bVar;
            d(false, PanelMode.Actions);
            TextView textView = this.a;
            if (textView != null) {
                textView.setText(bVar.a());
            }
            WordSegmentationData b = bVar.b();
            if (b != null) {
                v(b);
                oVar = kotlin.o.a;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                if (bVar.b() == null) {
                    com.bytedance.android.input.keyboard.word_segmentation.data.f.a.c(bVar.a(), true, new w(this, bVar));
                    return;
                }
                WordSegmentationData b2 = bVar.b();
                kotlin.s.c.l.c(b2);
                v(b2);
            }
        }

        public final void f(boolean z) {
            boolean z2 = Math.abs(this.j.getTranslationX()) < 0.5f && Math.abs(this.k.getTranslationX() - this.m) < 0.5f;
            if (this.l || !z2) {
                if (z) {
                    c(false);
                } else {
                    d(false, PanelMode.Actions);
                }
                this.l = false;
            }
        }

        public final TextView h() {
            return this.a;
        }

        public final float i() {
            return this.m;
        }

        public final boolean j() {
            return this.l;
        }

        public final void t(boolean z) {
            if (z && this.l) {
                return;
            }
            if (z || this.l) {
                u(z);
            }
        }
    }

    private enum PanelMode {
        Actions,
        ConfirmDelete
    }

    public interface a {
        void a(int i, String str);
    }

    public ClipboardHistoryItemAdapter(List<v.b> list, ClipboardHistoryView clipboardHistoryView, y yVar) {
        kotlin.s.c.l.f(list, "items");
        kotlin.s.c.l.f(clipboardHistoryView, "view");
        kotlin.s.c.l.f(yVar, "swipeStateChangeListener");
        this.a = list;
        this.b = clipboardHistoryView;
        this.f2467c = yVar;
    }

    public static /* synthetic */ void d(ClipboardHistoryItemAdapter clipboardHistoryItemAdapter, boolean z, ItemHolder itemHolder, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        int i2 = i & 2;
        clipboardHistoryItemAdapter.c(z, null);
    }

    public final void c(boolean z, ItemHolder itemHolder) {
        WeakReference<RecyclerView> weakReference = this.f2469e;
        RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            ItemHolder itemHolder2 = childViewHolder instanceof ItemHolder ? (ItemHolder) childViewHolder : null;
            if (itemHolder2 != null && itemHolder2 != itemHolder) {
                itemHolder2.f(z);
            }
        }
    }

    public final List<v.b> e() {
        return this.a;
    }

    public final void f(List<v.b> list) {
        kotlin.s.c.l.f(list, "<set-?>");
        this.a = list;
    }

    public final void g(a aVar) {
        kotlin.s.c.l.f(aVar, "listener");
        this.f2468d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        StringBuilder M = e.a.a.a.a.M("getItemCount: ");
        M.append(this.a.size());
        com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", M.toString());
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.s.c.l.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f2469e = new WeakReference<>(recyclerView);
        final int scaledTouchSlop = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        RecyclerView.SimpleOnItemTouchListener simpleOnItemTouchListener = new RecyclerView.SimpleOnItemTouchListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter$onAttachedToRecyclerView$1
            private ClipboardHistoryItemAdapter.ItemHolder a;
            private float b;

            /* renamed from: c, reason: collision with root package name */
            private float f2477c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f2478d;

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
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter$ItemHolder r0 = r5.a
                    if (r0 != 0) goto L20
                    return r2
                L20:
                    float r1 = r7.getX()
                    float r4 = r5.b
                    float r1 = r1 - r4
                    float r7 = r7.getY()
                    float r4 = r5.f2477c
                    float r7 = r7 - r4
                    boolean r0 = r0.j()
                    if (r0 != 0) goto L35
                    return r2
                L35:
                    boolean r0 = r5.f2478d
                    if (r0 != 0) goto L58
                    int r0 = r2
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L58
                    float r0 = java.lang.Math.abs(r1)
                    float r7 = java.lang.Math.abs(r7)
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 <= 0) goto L58
                    r5.f2478d = r3
                    android.view.ViewParent r6 = r6.getParent()
                    if (r6 == 0) goto L57
                    r6.requestDisallowInterceptTouchEvent(r3)
                L57:
                    return r3
                L58:
                    boolean r6 = r5.f2478d
                    return r6
                L5b:
                    boolean r6 = r5.f2478d
                    return r6
                L5e:
                    float r0 = r7.getX()
                    r5.b = r0
                    float r0 = r7.getY()
                    r5.f2477c = r0
                    r5.f2478d = r2
                    float r0 = r7.getX()
                    float r7 = r7.getY()
                    android.view.View r7 = r6.findChildViewUnder(r0, r7)
                    r0 = 0
                    if (r7 == 0) goto L86
                    androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r6.getChildViewHolder(r7)
                    boolean r7 = r6 instanceof com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.ItemHolder
                    if (r7 == 0) goto L86
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter$ItemHolder r6 = (com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.ItemHolder) r6
                    goto L87
                L86:
                    r6 = r0
                L87:
                    r5.a = r6
                    if (r6 != 0) goto L91
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter r6 = com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.this
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.d(r6, r3, r0, r1)
                    goto L9c
                L91:
                    boolean r7 = r6.j()
                    if (r7 != 0) goto L9c
                    com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter r7 = com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter.this
                    r7.c(r3, r6)
                L9c:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryItemAdapter$onAttachedToRecyclerView$1.onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView2, MotionEvent motionEvent) {
                ClipboardHistoryItemAdapter.ItemHolder itemHolder;
                kotlin.s.c.l.f(recyclerView2, "rv");
                kotlin.s.c.l.f(motionEvent, "e");
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && (itemHolder = this.a) != null) {
                    if (motionEvent.getX() - this.b > Math.max(scaledTouchSlop * 4.0f, itemHolder.i() / 3.0f)) {
                        itemHolder.t(false);
                    }
                    this.f2478d = false;
                    this.a = null;
                }
            }
        };
        this.f2470f = simpleOnItemTouchListener;
        recyclerView.addOnItemTouchListener(simpleOnItemTouchListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ItemHolder itemHolder, int i) {
        ItemHolder itemHolder2 = itemHolder;
        kotlin.s.c.l.f(itemHolder2, "holder");
        com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "onBindViewHolder position:" + i + ", itemCount:" + getItemCount());
        itemHolder2.e(this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.s.c.l.f(viewGroup, "viewGroup");
        com.bytedance.android.input.r.j.i("ClipboardHistoryItemAdapter", "onCreateViewHolder viewType: " + i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.clipboard_history_expand_item, viewGroup, false);
        kotlin.s.c.l.e(inflate, "from(viewGroup.context)\n…d_item, viewGroup, false)");
        return new ItemHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.s.c.l.f(recyclerView, "recyclerView");
        RecyclerView.OnItemTouchListener onItemTouchListener = this.f2470f;
        if (onItemTouchListener != null) {
            recyclerView.removeOnItemTouchListener(onItemTouchListener);
        }
        this.f2470f = null;
        this.f2469e = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(ItemHolder itemHolder) {
        ItemHolder itemHolder2 = itemHolder;
        kotlin.s.c.l.f(itemHolder2, "holder");
        super.onViewRecycled(itemHolder2);
        itemHolder2.f(false);
    }
}
