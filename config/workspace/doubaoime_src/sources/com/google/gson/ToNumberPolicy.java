package com.google.gson;

import com.google.gson.internal.u;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public enum ToNumberPolicy implements s {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.s
        public Double readNumber(com.google.gson.stream.a aVar) throws IOException {
            return Double.valueOf(aVar.I());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.s
        public Number readNumber(com.google.gson.stream.a aVar) throws IOException {
            return new u(aVar.Y());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.s
        public Number readNumber(com.google.gson.stream.a aVar) throws IOException, m {
            String Y = aVar.Y();
            try {
                try {
                    return Long.valueOf(Long.parseLong(Y));
                } catch (NumberFormatException e2) {
                    throw new m(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Cannot parse ", Y, "; at path ")), e2);
                }
            } catch (NumberFormatException unused) {
                Double valueOf = Double.valueOf(Y);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar.A()) {
                    return valueOf;
                }
                throw new com.google.gson.stream.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.x());
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberPolicy, com.google.gson.s
        public BigDecimal readNumber(com.google.gson.stream.a aVar) throws IOException {
            String Y = aVar.Y();
            try {
                return new BigDecimal(Y);
            } catch (NumberFormatException e2) {
                throw new m(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Cannot parse ", Y, "; at path ")), e2);
            }
        }
    };

    @Override // com.google.gson.s
    public abstract /* synthetic */ Number readNumber(com.google.gson.stream.a aVar) throws IOException;
}
