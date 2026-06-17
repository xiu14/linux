package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {
    private static final t b = new NumberTypeAdapter(ToNumberPolicy.LAZILY_PARSED_NUMBER).new AnonymousClass1();
    private final s a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements t {
        AnonymousClass1() {
        }

        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    }

    private NumberTypeAdapter(s sVar) {
        this.a = sVar;
    }

    public static t d(s sVar) {
        return sVar == ToNumberPolicy.LAZILY_PARSED_NUMBER ? b : new NumberTypeAdapter(sVar).new AnonymousClass1();
    }

    @Override // com.google.gson.TypeAdapter
    public Number b(com.google.gson.stream.a aVar) throws IOException {
        JsonToken c0 = aVar.c0();
        int ordinal = c0.ordinal();
        if (ordinal == 5 || ordinal == 6) {
            return this.a.readNumber(aVar);
        }
        if (ordinal == 8) {
            aVar.S();
            return null;
        }
        throw new r("Expecting number, got: " + c0 + "; at path " + aVar.s());
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
        bVar.c0(number);
    }
}
