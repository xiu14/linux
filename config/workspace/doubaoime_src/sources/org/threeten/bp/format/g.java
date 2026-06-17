package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;

/* loaded from: classes2.dex */
final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<Map.Entry<String, Long>> f10838d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10839e = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Map.Entry<org.threeten.bp.temporal.e, Locale>, Object> f10840c = new ConcurrentHashMap(16, 0.75f, 2);

    static class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    static final class b {
        private final Map<TextStyle, Map<Long, String>> a;

        b(Map<TextStyle, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (TextStyle textStyle : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(textStyle).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    int i = g.f10839e;
                    hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, g.f10838d);
                hashMap.put(textStyle, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, g.f10838d);
        }

        String a(long j, TextStyle textStyle) {
            Map<Long, String> map = this.a.get(textStyle);
            if (map != null) {
                return map.get(Long.valueOf(j));
            }
            return null;
        }
    }

    g() {
    }

    private static b d(Map<TextStyle, Map<Long, String>> map) {
        map.put(TextStyle.FULL_STANDALONE, map.get(TextStyle.FULL));
        map.put(TextStyle.SHORT_STANDALONE, map.get(TextStyle.SHORT));
        TextStyle textStyle = TextStyle.NARROW;
        if (map.containsKey(textStyle)) {
            TextStyle textStyle2 = TextStyle.NARROW_STANDALONE;
            if (!map.containsKey(textStyle2)) {
                map.put(textStyle2, map.get(textStyle));
            }
        }
        return new b(map);
    }

    @Override // org.threeten.bp.format.e
    public String b(org.threeten.bp.temporal.e eVar, long j, TextStyle textStyle, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(eVar, locale);
        Object obj2 = this.f10840c.get(simpleImmutableEntry2);
        if (obj2 == null) {
            if (eVar == ChronoField.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap = new HashMap();
                String[] months = dateFormatSymbols.getMonths();
                simpleImmutableEntry = simpleImmutableEntry2;
                HashMap hashMap2 = new HashMap();
                hashMap2.put(1L, months[0]);
                hashMap2.put(2L, months[1]);
                hashMap2.put(3L, months[2]);
                hashMap2.put(4L, months[3]);
                hashMap2.put(5L, months[4]);
                hashMap2.put(6L, months[5]);
                hashMap2.put(7L, months[6]);
                hashMap2.put(8L, months[7]);
                hashMap2.put(9L, months[8]);
                hashMap2.put(10L, months[9]);
                hashMap2.put(11L, months[10]);
                hashMap2.put(12L, months[11]);
                hashMap.put(TextStyle.FULL, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(1L, months[0].substring(0, 1));
                hashMap3.put(2L, months[1].substring(0, 1));
                hashMap3.put(3L, months[2].substring(0, 1));
                hashMap3.put(4L, months[3].substring(0, 1));
                hashMap3.put(5L, months[4].substring(0, 1));
                hashMap3.put(6L, months[5].substring(0, 1));
                hashMap3.put(7L, months[6].substring(0, 1));
                hashMap3.put(8L, months[7].substring(0, 1));
                hashMap3.put(9L, months[8].substring(0, 1));
                hashMap3.put(10L, months[9].substring(0, 1));
                hashMap3.put(11L, months[10].substring(0, 1));
                hashMap3.put(12L, months[11].substring(0, 1));
                hashMap.put(TextStyle.NARROW, hashMap3);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap hashMap4 = new HashMap();
                hashMap4.put(1L, shortMonths[0]);
                hashMap4.put(2L, shortMonths[1]);
                hashMap4.put(3L, shortMonths[2]);
                hashMap4.put(4L, shortMonths[3]);
                hashMap4.put(5L, shortMonths[4]);
                hashMap4.put(6L, shortMonths[5]);
                hashMap4.put(7L, shortMonths[6]);
                hashMap4.put(8L, shortMonths[7]);
                hashMap4.put(9L, shortMonths[8]);
                hashMap4.put(10L, shortMonths[9]);
                hashMap4.put(11L, shortMonths[10]);
                hashMap4.put(12L, shortMonths[11]);
                hashMap.put(TextStyle.SHORT, hashMap4);
                obj = d(hashMap);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                if (eVar == ChronoField.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap5 = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put(1L, weekdays[2]);
                    hashMap6.put(2L, weekdays[3]);
                    hashMap6.put(3L, weekdays[4]);
                    hashMap6.put(4L, weekdays[5]);
                    hashMap6.put(5L, weekdays[6]);
                    hashMap6.put(6L, weekdays[7]);
                    hashMap6.put(7L, weekdays[1]);
                    hashMap5.put(TextStyle.FULL, hashMap6);
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(1L, weekdays[2].substring(0, 1));
                    hashMap7.put(2L, weekdays[3].substring(0, 1));
                    hashMap7.put(3L, weekdays[4].substring(0, 1));
                    hashMap7.put(4L, weekdays[5].substring(0, 1));
                    hashMap7.put(5L, weekdays[6].substring(0, 1));
                    hashMap7.put(6L, weekdays[7].substring(0, 1));
                    hashMap7.put(7L, weekdays[1].substring(0, 1));
                    hashMap5.put(TextStyle.NARROW, hashMap7);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(1L, shortWeekdays[2]);
                    hashMap8.put(2L, shortWeekdays[3]);
                    hashMap8.put(3L, shortWeekdays[4]);
                    hashMap8.put(4L, shortWeekdays[5]);
                    hashMap8.put(5L, shortWeekdays[6]);
                    hashMap8.put(6L, shortWeekdays[7]);
                    hashMap8.put(7L, shortWeekdays[1]);
                    hashMap5.put(TextStyle.SHORT, hashMap8);
                    obj = d(hashMap5);
                } else if (eVar == ChronoField.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap9 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put(0L, amPmStrings[0]);
                    hashMap10.put(1L, amPmStrings[1]);
                    hashMap9.put(TextStyle.FULL, hashMap10);
                    hashMap9.put(TextStyle.SHORT, hashMap10);
                    obj = d(hashMap9);
                } else if (eVar == ChronoField.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap11 = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap hashMap12 = new HashMap();
                    hashMap12.put(0L, eras[0]);
                    hashMap12.put(1L, eras[1]);
                    hashMap11.put(TextStyle.SHORT, hashMap12);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put(0L, "Before Christ");
                        hashMap13.put(1L, "Anno Domini");
                        hashMap11.put(TextStyle.FULL, hashMap13);
                    } else {
                        hashMap11.put(TextStyle.FULL, hashMap12);
                    }
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put(0L, eras[0].substring(0, 1));
                    hashMap14.put(1L, eras[1].substring(0, 1));
                    hashMap11.put(TextStyle.NARROW, hashMap14);
                    obj = d(hashMap11);
                } else if (eVar == IsoFields.a) {
                    HashMap hashMap15 = new HashMap();
                    HashMap hashMap16 = new HashMap();
                    hashMap16.put(1L, "Q1");
                    hashMap16.put(2L, "Q2");
                    hashMap16.put(3L, "Q3");
                    hashMap16.put(4L, "Q4");
                    hashMap15.put(TextStyle.SHORT, hashMap16);
                    HashMap hashMap17 = new HashMap();
                    hashMap17.put(1L, "1st quarter");
                    hashMap17.put(2L, "2nd quarter");
                    hashMap17.put(3L, "3rd quarter");
                    hashMap17.put(4L, "4th quarter");
                    hashMap15.put(TextStyle.FULL, hashMap17);
                    obj = d(hashMap15);
                } else {
                    obj = "";
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            this.f10840c.putIfAbsent(simpleImmutableEntry3, obj);
            obj2 = this.f10840c.get(simpleImmutableEntry3);
        }
        if (obj2 instanceof b) {
            return ((b) obj2).a(j, textStyle);
        }
        return null;
    }
}
