package com.bytedance.android.input.fragment.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.ItemMessageCenterBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.message.entity.MessageState;
import com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout;
import com.prolificinteractive.materialcalendarview.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.b.q;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MessageCenterAdapter extends RecyclerView.Adapter<MessageCenterViewHolder> {
    private final List<com.bytedance.android.input.fragment.message.entity.c> a = new ArrayList();
    private p<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, o> b;

    /* renamed from: c, reason: collision with root package name */
    private q<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, ? super Integer, o> f2333c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<RecyclerView> f2334d;

    public MessageCenterAdapter() {
        Object J2;
        try {
            setHasStableIds(true);
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("setHasStableIds failed, error: "), IAppGlobals.a, "MessageCenterAdapter");
        }
    }

    public static /* synthetic */ void d(MessageCenterAdapter messageCenterAdapter, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        int i2 = i & 2;
        messageCenterAdapter.c(z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e(String str) {
        Iterator<com.bytedance.android.input.fragment.message.entity.c> it2 = this.a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (l.a(it2.next().d(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void f(LinearLayout linearLayout, MessageCenterAdapter messageCenterAdapter, View view) {
        l.f(linearLayout, "$confirmDeleteButton");
        l.f(messageCenterAdapter, "this$0");
        Object tag = linearLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || messageCenterAdapter.e(str) == -1) {
            return;
        }
        int e2 = messageCenterAdapter.e(str);
        boolean z = false;
        if (e2 >= 0 && e2 < messageCenterAdapter.a.size()) {
            z = true;
        }
        if (z) {
            com.bytedance.android.input.fragment.message.entity.c remove = messageCenterAdapter.a.remove(e2);
            messageCenterAdapter.notifyItemRemoved(e2);
            q<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, ? super Integer, o> qVar = messageCenterAdapter.f2333c;
            if (qVar != null) {
                qVar.d(Integer.valueOf(e2), remove, Integer.valueOf(messageCenterAdapter.a.size()));
            }
        }
    }

    public static void g(MessageCenterViewHolder messageCenterViewHolder, MessageCenterAdapter messageCenterAdapter, ImeCustomSwipeLayout imeCustomSwipeLayout, View view) {
        int e2;
        l.f(messageCenterViewHolder, "$holder");
        l.f(messageCenterAdapter, "this$0");
        l.f(imeCustomSwipeLayout, "$swipeLayout");
        Object tag = messageCenterViewHolder.a().b.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (e2 = messageCenterAdapter.e(str)) == -1) {
            return;
        }
        boolean z = false;
        if (e2 >= 0 && e2 < messageCenterAdapter.a.size()) {
            z = true;
        }
        if (z) {
            if (messageCenterAdapter.a.get(e2).i()) {
                imeCustomSwipeLayout.m(true);
                return;
            }
            p<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, o> pVar = messageCenterAdapter.b;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(e2), messageCenterAdapter.a.get(e2));
            }
        }
    }

    public static void h(final ImageView imageView, MessageCenterAdapter messageCenterAdapter, final LinearLayout linearLayout, final ImeCustomSwipeLayout imeCustomSwipeLayout, FrameLayout frameLayout, View view) {
        int e2;
        Object J2;
        l.f(imageView, "$deleteButton");
        l.f(messageCenterAdapter, "this$0");
        l.f(linearLayout, "$confirmDeleteButton");
        l.f(imeCustomSwipeLayout, "$swipeLayout");
        l.f(frameLayout, "$menuContainer");
        Object tag = imageView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (e2 = messageCenterAdapter.e(str)) == -1) {
            return;
        }
        if (e2 >= 0 && e2 < messageCenterAdapter.a.size()) {
            messageCenterAdapter.a.get(e2).j(true);
            linearLayout.setVisibility(0);
            try {
                imageView.animate().cancel();
                linearLayout.animate().cancel();
                J2 = Boolean.valueOf(imageView.post(new Runnable() { // from class: com.bytedance.android.input.fragment.message.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        final View view2 = imageView;
                        View view3 = linearLayout;
                        ImeCustomSwipeLayout imeCustomSwipeLayout2 = imeCustomSwipeLayout;
                        l.f(view2, "$deleteButton");
                        l.f(view3, "$confirmDeleteButton");
                        l.f(imeCustomSwipeLayout2, "$swipeLayout");
                        Integer valueOf = Integer.valueOf(view2.getWidth());
                        if (!(valueOf.intValue() > 0)) {
                            valueOf = null;
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : view2.getMeasuredWidth();
                        Integer valueOf2 = Integer.valueOf(view3.getWidth());
                        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
                        int intValue2 = num != null ? num.intValue() : view3.getMeasuredWidth();
                        if (intValue <= 0 || intValue2 <= 0) {
                            view2.setVisibility(8);
                            view3.setVisibility(0);
                            imeCustomSwipeLayout2.D(true);
                            return;
                        }
                        view3.setVisibility(0);
                        float f2 = intValue2;
                        view3.setPivotX(f2);
                        view3.setPivotY(kotlin.w.h.a(view3.getHeight() / 2.0f, 0.0f));
                        view3.setScaleX(intValue / f2);
                        view3.setAlpha(0.75f);
                        imeCustomSwipeLayout2.D(true);
                        view2.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: com.bytedance.android.input.fragment.message.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                View view4 = view2;
                                l.f(view4, "$deleteButton");
                                view4.setVisibility(8);
                                view4.setAlpha(1.0f);
                            }
                        }).start();
                        view3.animate().scaleX(1.0f).alpha(1.0f).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.6f)).setListener(new h(view3)).start();
                    }
                }));
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                e.a.a.a.a.O0(b, e.a.a.a.a.M("animateDeleteToConfirm error: "), IAppGlobals.a, "MessageCenterAdapter");
            }
        }
    }

    private final void i(MessageCenterViewHolder messageCenterViewHolder) {
        messageCenterViewHolder.a().f2002d.animate().cancel();
        messageCenterViewHolder.a().f2003e.animate().cancel();
        messageCenterViewHolder.a().f2002d.setVisibility(0);
        messageCenterViewHolder.a().f2002d.setAlpha(1.0f);
        messageCenterViewHolder.a().f2003e.setVisibility(8);
        messageCenterViewHolder.a().f2003e.setAlpha(1.0f);
        messageCenterViewHolder.a().f2003e.setScaleX(1.0f);
    }

    public final void c(boolean z, String str) {
        Object J2;
        ItemMessageCenterBinding a;
        ImeCustomSwipeLayout a2;
        try {
            WeakReference<RecyclerView> weakReference = this.f2334d;
            RecyclerView recyclerView = weakReference != null ? weakReference.get() : null;
            List<com.bytedance.android.input.fragment.message.entity.c> list = this.a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                com.bytedance.android.input.fragment.message.entity.c cVar = (com.bytedance.android.input.fragment.message.entity.c) next;
                if (cVar.i() && !l.a(cVar.d(), str)) {
                    z2 = true;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g.e(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((com.bytedance.android.input.fragment.message.entity.c) it3.next()).d());
            }
            com.bytedance.android.input.r.j.i("MessageCenterAdapter", "collapseAllExpandedItems expandedIds: " + arrayList2);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                int e2 = e((String) it4.next());
                com.bytedance.android.input.r.j.i("MessageCenterAdapter", "collapseAllExpandedItems index: " + e2);
                if (e2 != -1) {
                    this.a.get(e2).j(false);
                    RecyclerView.ViewHolder findViewHolderForItemId = recyclerView != null ? recyclerView.findViewHolderForItemId(r3.hashCode()) : null;
                    MessageCenterViewHolder messageCenterViewHolder = findViewHolderForItemId instanceof MessageCenterViewHolder ? (MessageCenterViewHolder) findViewHolderForItemId : null;
                    com.bytedance.android.input.r.j.i("MessageCenterAdapter", "collapseAllExpandedItems holder: " + messageCenterViewHolder + "---close--animated = " + z);
                    if (messageCenterViewHolder != null && (a = messageCenterViewHolder.a()) != null && (a2 = a.a()) != null) {
                        a2.m(z);
                    }
                }
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("collapseAllExpandedItems error: "), IAppGlobals.a, "MessageCenterAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.a.get(i).d().hashCode();
    }

    public final void j(p<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, o> pVar) {
        l.f(pVar, "onItemClickListener");
        this.b = pVar;
    }

    public final void k(q<? super Integer, ? super com.bytedance.android.input.fragment.message.entity.c, ? super Integer, o> qVar) {
        l.f(qVar, "onItemDeleteListener");
        this.f2333c = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f2334d = new WeakReference<>(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MessageCenterViewHolder messageCenterViewHolder, int i) {
        String str;
        final MessageCenterViewHolder messageCenterViewHolder2 = messageCenterViewHolder;
        l.f(messageCenterViewHolder2, "holder");
        com.bytedance.android.input.fragment.message.entity.c cVar = this.a.get(i);
        final ImeCustomSwipeLayout a = messageCenterViewHolder2.a().a();
        l.e(a, "holder.binding.root");
        messageCenterViewHolder2.a().a().setTag(cVar.d());
        messageCenterViewHolder2.a().f2002d.setTag(cVar.d());
        messageCenterViewHolder2.a().f2003e.setTag(cVar.d());
        messageCenterViewHolder2.a().b.setTag(cVar.d());
        i(messageCenterViewHolder2);
        if (cVar.i()) {
            a.B(false);
        } else {
            a.m(false);
        }
        Context context = messageCenterViewHolder2.a().a().getContext();
        l.e(context, "holder.binding.root.context");
        String a2 = cVar.a();
        ImageView imageView = messageCenterViewHolder2.a().f2004f;
        l.e(imageView, "holder.binding.messageCenterIcon");
        com.bytedance.android.input.basic.image.j.b(new com.bytedance.android.input.basic.image.i(context, a2, imageView, 0, 0, 0, 0, 0, true, null, null, 1784));
        messageCenterViewHolder2.a().j.setVisibility(cVar.e() != MessageState.UNREAD ? 8 : 0);
        messageCenterViewHolder2.a().i.setText(cVar.h());
        TextView textView = messageCenterViewHolder2.a().h;
        try {
            str = com.bytedance.android.input.basic.d.i.b(Long.parseLong(cVar.f()));
        } catch (Throwable th) {
            r.J(th);
            str = "";
        }
        textView.setText(str);
        messageCenterViewHolder2.a().f2001c.setText(cVar.c());
        messageCenterViewHolder2.a().b.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.message.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageCenterAdapter.g(MessageCenterViewHolder.this, this, a, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MessageCenterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        ItemMessageCenterBinding b = ItemMessageCenterBinding.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        l.e(b, "inflate(LayoutInflater.f….context), parent, false)");
        MessageCenterViewHolder messageCenterViewHolder = new MessageCenterViewHolder(b);
        final ImeCustomSwipeLayout a = messageCenterViewHolder.a().a();
        l.e(a, "holder.binding.root");
        final ImageView imageView = messageCenterViewHolder.a().f2002d;
        l.e(imageView, "holder.binding.messageCenterDeleteBtn");
        final LinearLayout linearLayout = messageCenterViewHolder.a().f2003e;
        l.e(linearLayout, "holder.binding.messageCenterDeleteConfirmBtn");
        final FrameLayout frameLayout = messageCenterViewHolder.a().f2005g;
        l.e(frameLayout, "holder.binding.messageCenterMenuContainer");
        messageCenterViewHolder.a().a().h(new i(messageCenterViewHolder, this, imageView, linearLayout, a));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.message.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageCenterAdapter.h(imageView, this, linearLayout, a, frameLayout, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.message.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageCenterAdapter.f(linearLayout, this, view);
            }
        });
        return messageCenterViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.f(recyclerView, "recyclerView");
        this.f2334d = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(MessageCenterViewHolder messageCenterViewHolder) {
        MessageCenterViewHolder messageCenterViewHolder2 = messageCenterViewHolder;
        l.f(messageCenterViewHolder2, "holder");
        super.onViewRecycled(messageCenterViewHolder2);
        i(messageCenterViewHolder2);
        messageCenterViewHolder2.a().a().m(false);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(List<com.bytedance.android.input.fragment.message.entity.c> list) {
        l.f(list, "newItems");
        this.a.clear();
        this.a.addAll(list);
        notifyDataSetChanged();
    }
}
