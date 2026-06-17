package com.bytedance.android.input.fragment.custom_symbol;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.custom_symbol.ui.CompatSymbolEditText;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.BiConsumer;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* JADX WARN: Unexpected interfaces in signature: [androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener] */
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes.dex */
public final class KeyCustomSymbolAdapter extends RecyclerView.Adapter<CustomSymbolViewHolder> implements Object {
    private com.bytedance.android.input.fragment.custom_symbol.n.a b;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2311f;
    private ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private ArrayMap<Integer, CustomSymbolViewHolder> f2308c = new ArrayMap<>();

    /* renamed from: d, reason: collision with root package name */
    private HashMap<Integer, TextWatcher> f2309d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private HashMap<Integer, View.OnFocusChangeListener> f2310e = new HashMap<>();

    static final class a extends m implements p<Integer, CustomSymbolViewHolder, o> {
        final /* synthetic */ boolean a;
        final /* synthetic */ KeyCustomSymbolAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, KeyCustomSymbolAdapter keyCustomSymbolAdapter) {
            super(2);
            this.a = z;
            this.b = keyCustomSymbolAdapter;
        }

        @Override // kotlin.s.b.p
        public o invoke(Integer num, CustomSymbolViewHolder customSymbolViewHolder) {
            Integer num2 = num;
            customSymbolViewHolder.a(false, this.a);
            this.b.f2308c.remove(num2);
            KeyCustomSymbolAdapter keyCustomSymbolAdapter = this.b;
            l.e(num2, "position");
            keyCustomSymbolAdapter.k(num2.intValue());
            return o.a;
        }
    }

    public static void g(CustomSymbolViewHolder customSymbolViewHolder, int i, com.bytedance.android.input.fragment.custom_symbol.m.a aVar, KeyCustomSymbolAdapter keyCustomSymbolAdapter, View view) {
        l.f(customSymbolViewHolder, "$holder");
        l.f(aVar, "$itemData");
        l.f(keyCustomSymbolAdapter, "this$0");
        if (customSymbolViewHolder.getAdapterPosition() != i) {
            StringBuilder N = e.a.a.a.a.N("deleteLayout click different position = ", i, ", adapterPosition = ");
            N.append(customSymbolViewHolder.getAdapterPosition());
            String sb = N.toString();
            l.f(sb, "msg");
            IAppGlobals.a.j("[custom_symbol]", sb);
            return;
        }
        aVar.e(false);
        int i2 = CustomSymbolViewHolder.f2303g;
        customSymbolViewHolder.a(false, false);
        keyCustomSymbolAdapter.f2308c.remove(Integer.valueOf(i));
        keyCustomSymbolAdapter.f2309d.remove(Integer.valueOf(i));
        keyCustomSymbolAdapter.f2310e.remove(Integer.valueOf(i));
        com.bytedance.android.input.fragment.custom_symbol.n.a aVar2 = keyCustomSymbolAdapter.b;
        if (aVar2 != null) {
            aVar2.b(i, aVar);
        }
    }

    public static void h(CustomSymbolViewHolder customSymbolViewHolder, int i, KeyCustomSymbolAdapter keyCustomSymbolAdapter, com.bytedance.android.input.fragment.custom_symbol.m.a aVar, View view) {
        l.f(customSymbolViewHolder, "$holder");
        l.f(keyCustomSymbolAdapter, "this$0");
        l.f(aVar, "$itemData");
        if (customSymbolViewHolder.getAdapterPosition() != i) {
            StringBuilder N = e.a.a.a.a.N("ivDeleteTip click different position = ", i, ", adapterPosition = ");
            N.append(customSymbolViewHolder.getAdapterPosition());
            String sb = N.toString();
            l.f(sb, "msg");
            IAppGlobals.a.j("[custom_symbol]", sb);
            return;
        }
        keyCustomSymbolAdapter.c(true);
        aVar.e(true);
        int i2 = CustomSymbolViewHolder.f2303g;
        customSymbolViewHolder.a(true, false);
        keyCustomSymbolAdapter.f2308c.put(Integer.valueOf(i), customSymbolViewHolder);
    }

    public static boolean i(CustomSymbolViewHolder customSymbolViewHolder, int i, KeyCustomSymbolAdapter keyCustomSymbolAdapter, View view) {
        boolean z;
        l.f(customSymbolViewHolder, "$holder");
        l.f(keyCustomSymbolAdapter, "this$0");
        if (customSymbolViewHolder.getAdapterPosition() != i) {
            StringBuilder N = e.a.a.a.a.N("itemView click different position = ", i, ", adapterPosition = ");
            N.append(customSymbolViewHolder.getAdapterPosition());
            String sb = N.toString();
            l.f(sb, "msg");
            IAppGlobals.a.j("[custom_symbol]", sb);
        } else if (keyCustomSymbolAdapter.f2311f) {
            l.f("current is Edit State", "msg");
            IAppGlobals.a.j("[custom_symbol]", "current is Edit State");
        } else {
            IAppGlobals.a aVar = IAppGlobals.a;
            Context context = aVar.getContext();
            l.f(context, "appContext");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                aVar.x("[Vibrate]-Utils", "Fetch System Settings start");
                z = Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 1;
                aVar.x("[Vibrate]-Utils", "Fetch System Settings end, open = " + z + " cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                Throwable b = kotlin.h.b(r.J(th));
                if (b != null) {
                    IAppGlobals.a.e("[Vibrate]-Utils", e.a.a.a.a.w("System.VIBRATE_ON exception = ", b));
                }
                z = true;
            }
            if (!z) {
                view.setHapticFeedbackEnabled(true);
                view.performHapticFeedback(3, 2);
            }
        }
        return false;
    }

    public final void c(boolean z) {
        boolean z2 = false;
        for (com.bytedance.android.input.fragment.custom_symbol.m.a aVar : this.a) {
            if (aVar.d()) {
                aVar.e(false);
                z2 = true;
            }
        }
        if (z2) {
            ArrayMap<Integer, CustomSymbolViewHolder> arrayMap = this.f2308c;
            final a aVar2 = new a(z, this);
            arrayMap.forEach(new BiConsumer() { // from class: com.bytedance.android.input.fragment.custom_symbol.f
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    p pVar = p.this;
                    l.f(pVar, "$tmp0");
                    pVar.invoke(obj, obj2);
                }
            });
        }
    }

    public final boolean d() {
        boolean z;
        Iterator<T> it2 = this.a.iterator();
        do {
            z = false;
            if (!it2.hasNext()) {
                return false;
            }
            if (((com.bytedance.android.input.fragment.custom_symbol.m.a) it2.next()).c().length() == 0) {
                z = true;
            }
        } while (!z);
        return true;
    }

    public final ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> e() {
        return this.a;
    }

    public final void f() {
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((com.bytedance.android.input.fragment.custom_symbol.m.a) it2.next()).g(false);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    public boolean j(int i, int i2) {
        ArrayList<com.bytedance.android.input.fragment.custom_symbol.m.a> arrayList = this.a;
        if (getItemCount() <= 1 || i >= getItemCount() || i2 >= getItemCount()) {
            return false;
        }
        Collections.swap(arrayList, i, i2);
        notifyItemMoved(i, i2);
        com.bytedance.android.input.fragment.custom_symbol.n.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
        return true;
    }

    public final void k(int i) {
        this.f2309d.remove(Integer.valueOf(i));
        this.f2310e.remove(Integer.valueOf(i));
    }

    public final void l() {
        this.f2308c.clear();
        this.f2309d.clear();
        this.f2310e.clear();
        this.f2311f = false;
    }

    public final void m(boolean z) {
        this.f2311f = z;
    }

    public final void n(com.bytedance.android.input.fragment.custom_symbol.n.a aVar) {
        this.b = aVar;
    }

    public final void o() {
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((com.bytedance.android.input.fragment.custom_symbol.m.a) it2.next()).g(true);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(CustomSymbolViewHolder customSymbolViewHolder, final int i) {
        final CustomSymbolViewHolder customSymbolViewHolder2 = customSymbolViewHolder;
        l.f(customSymbolViewHolder2, "holder");
        com.bytedance.android.input.fragment.custom_symbol.m.a aVar = this.a.get(i);
        l.e(aVar, "customSymbolItemList[position]");
        final com.bytedance.android.input.fragment.custom_symbol.m.a aVar2 = aVar;
        customSymbolViewHolder2.b(aVar2, i);
        customSymbolViewHolder2.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.bytedance.android.input.fragment.custom_symbol.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                KeyCustomSymbolAdapter.i(CustomSymbolViewHolder.this, i, this, view);
                return false;
            }
        });
        boolean d2 = aVar2.d();
        int i2 = CustomSymbolViewHolder.f2303g;
        customSymbolViewHolder2.a(d2, false);
        ImageView e2 = customSymbolViewHolder2.e();
        if (e2 != null) {
            e2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.custom_symbol.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolAdapter.h(CustomSymbolViewHolder.this, i, this, aVar2, view);
                }
            });
        }
        LinearLayout c2 = customSymbolViewHolder2.c();
        if (c2 != null) {
            c2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.custom_symbol.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyCustomSymbolAdapter.g(CustomSymbolViewHolder.this, i, aVar2, this, view);
                }
            });
        }
        CompatSymbolEditText d3 = customSymbolViewHolder2.d();
        if (d3 != null) {
            if (this.f2310e.containsKey(Integer.valueOf(i))) {
                String str = "OnFocusChangeListener contain current position = " + i;
                l.f(str, "msg");
                IAppGlobals.a.j("[custom_symbol]", str);
                d3.setOnFocusChangeListener(null);
                this.f2310e.remove(Integer.valueOf(i));
            }
            k kVar = new k(customSymbolViewHolder2, i, d3, aVar2, this);
            d3.setOnFocusChangeListener(kVar);
            this.f2310e.put(Integer.valueOf(i), kVar);
        }
        e eVar = new InputFilter() { // from class: com.bytedance.android.input.fragment.custom_symbol.e
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                return kotlin.text.a.E(kotlin.text.a.E(charSequence.toString(), " ", "", false, 4, null), "\u3000", "", false, 4, null);
            }
        };
        com.bytedance.android.input.fragment.custom_symbol.p.a aVar3 = new com.bytedance.android.input.fragment.custom_symbol.p.a(1);
        CompatSymbolEditText d4 = customSymbolViewHolder2.d();
        if (d4 != null) {
            d4.setFilters(new InputFilter[]{eVar, aVar3});
            if (this.f2309d.containsKey(Integer.valueOf(i))) {
                String str2 = "TextWatcher contain current position = " + i + ", begin remove";
                l.f(str2, "msg");
                IAppGlobals.a.j("[custom_symbol]", str2);
                d4.removeTextChangedListener(this.f2309d.get(Integer.valueOf(i)));
                this.f2309d.remove(Integer.valueOf(i));
            }
            j jVar = new j(customSymbolViewHolder2, i, d4, aVar2, this);
            d4.addTextChangedListener(jVar);
            this.f2309d.put(Integer.valueOf(i), jVar);
        }
        LinearLayout c3 = customSymbolViewHolder2.c();
        if (c3 != null) {
            if (i == getItemCount() - 1) {
                c3.setBackground(ContextCompat.getDrawable(c3.getContext(), C0838R.drawable.bg_settings_last_delete));
            } else {
                c3.setBackground(ContextCompat.getDrawable(c3.getContext(), C0838R.drawable.bg_settings_normal_delete));
            }
        }
    }

    public void onChildViewAttachedToWindow(View view) {
        l.f(view, "view");
    }

    public void onChildViewDetachedFromWindow(View view) {
        l.f(view, "view");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CustomSymbolViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.adapter_custom_symbol_item, viewGroup, false);
        l.e(inflate, "view");
        return new CustomSymbolViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(CustomSymbolViewHolder customSymbolViewHolder) {
        CompatSymbolEditText d2;
        CustomSymbolViewHolder customSymbolViewHolder2 = customSymbolViewHolder;
        l.f(customSymbolViewHolder2, "holder");
        super.onViewRecycled(customSymbolViewHolder2);
        if (customSymbolViewHolder2.getAdapterPosition() == -1 || (d2 = customSymbolViewHolder2.d()) == null) {
            return;
        }
        TextWatcher textWatcher = this.f2309d.get(Integer.valueOf(customSymbolViewHolder2.getAdapterPosition()));
        if (textWatcher != null) {
            d2.removeTextChangedListener(textWatcher);
        }
        this.f2309d.remove(Integer.valueOf(customSymbolViewHolder2.getAdapterPosition()));
        if (this.f2310e.get(Integer.valueOf(customSymbolViewHolder2.getAdapterPosition())) != null) {
            d2.setOnFocusChangeListener(null);
        }
        this.f2310e.remove(Integer.valueOf(customSymbolViewHolder2.getAdapterPosition()));
    }
}
