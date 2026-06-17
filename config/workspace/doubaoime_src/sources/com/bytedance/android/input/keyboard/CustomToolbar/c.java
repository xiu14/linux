package com.bytedance.android.input.keyboard.CustomToolbar;

import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.OptionItemView;
import com.bytedance.android.input.keyboard.CustomToolbar.ToolbarPagerAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class c extends m implements p<String, Boolean, o> {
    final /* synthetic */ OptionItemView a;
    final /* synthetic */ ToolbarPagerAdapter b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<String, OptionItemView> f2507c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ToolbarPagerAdapter.a f2508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(OptionItemView optionItemView, ToolbarPagerAdapter toolbarPagerAdapter, Map<String, OptionItemView> map, ToolbarPagerAdapter.a aVar) {
        super(2);
        this.a = optionItemView;
        this.b = toolbarPagerAdapter;
        this.f2507c = map;
        this.f2508d = aVar;
    }

    @Override // kotlin.s.b.p
    public o invoke(String str, Boolean bool) {
        OptionItemView optionItemView;
        List list;
        List list2;
        String str2 = str;
        boolean booleanValue = bool.booleanValue();
        l.f(str2, "itemId");
        KeyboardJni.getKeyboardJni().customizeToolbarButton(booleanValue, str2);
        this.a.setCompactScale(this.b.b());
        if (booleanValue) {
            Object obj = null;
            if (l.a(str2, "btn_speech_bar_two")) {
                OptionItemView optionItemView2 = this.f2507c.get("btn_speech_bar_single");
                if (optionItemView2 != null) {
                    ToolbarPagerAdapter toolbarPagerAdapter = this.b;
                    if (optionItemView2.a()) {
                        optionItemView2.setAdded(false);
                        list2 = toolbarPagerAdapter.a;
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (l.a(((ToolbarPagerAdapter.a) next).c(), "btn_speech_bar_single")) {
                                obj = next;
                                break;
                            }
                        }
                        ToolbarPagerAdapter.a aVar = (ToolbarPagerAdapter.a) obj;
                        optionItemView2.setIcon(aVar != null ? aVar.b() : 0);
                        KeyboardJni.getKeyboardJni().customizeToolbarButton(false, "btn_speech_bar_single");
                    }
                }
            } else if (l.a(str2, "btn_speech_bar_single") && (optionItemView = this.f2507c.get("btn_speech_bar_two")) != null) {
                ToolbarPagerAdapter toolbarPagerAdapter2 = this.b;
                if (optionItemView.a()) {
                    optionItemView.setAdded(false);
                    list = toolbarPagerAdapter2.a;
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (l.a(((ToolbarPagerAdapter.a) next2).c(), "btn_speech_bar_two")) {
                            obj = next2;
                            break;
                        }
                    }
                    ToolbarPagerAdapter.a aVar2 = (ToolbarPagerAdapter.a) obj;
                    optionItemView.setIcon(aVar2 != null ? aVar2.b() : 0);
                    KeyboardJni.getKeyboardJni().customizeToolbarButton(false, "btn_speech_bar_two");
                }
            }
            this.a.setIcon(this.f2508d.a());
        } else {
            this.a.setIcon(this.f2508d.b());
        }
        return o.a;
    }
}
