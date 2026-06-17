.class public final Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final e:[B

.field public static final f:Ljava/util/List;

.field public static final g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/CountDownLatch;

.field public c:[B

.field public d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/16 v1, 0x2a

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-byte v1, v0, v2

    .line 8
    .line 9
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    .line 10
    .line 11
    const-string v0, "*"

    .line 12
    .line 13
    invoke-static {v0}, Lq3/a;->Q(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 20
    .line 21
    invoke-direct {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x2e

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    invoke-static {p0, v1}, Ll5/e;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lq4/i;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v3, ""

    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sub-int/2addr v1, v0

    .line 30
    if-gez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v2, v1

    .line 34
    :goto_0
    invoke-static {v2, p0}, Lq4/i;->D0(ILjava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_1
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "unicodeDomain"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lq4/r;->h:Lq4/r;

    .line 15
    .line 16
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_2

    .line 50
    :catch_0
    move-exception v5

    .line 51
    :try_start_1
    sget-object v6, Le6/n;->a:Le6/n;

    .line 52
    .line 53
    sget-object v6, Le6/n;->a:Le6/n;

    .line 54
    .line 55
    const-string v7, "Failed to read public suffix list"

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x5

    .line 61
    invoke-static {v7, v6, v5}, Le6/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    goto :goto_0

    .line 72
    :goto_2
    if-eqz v2, :cond_0

    .line 73
    .line 74
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 79
    .line 80
    .line 81
    :cond_0
    throw p1

    .line 82
    :cond_1
    :try_start_2
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 93
    .line 94
    .line 95
    :cond_2
    :goto_3
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 96
    .line 97
    if-eqz v2, :cond_16

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    new-array v5, v2, [[B

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    :goto_4
    if-ge v6, v2, :cond_3

    .line 107
    .line 108
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Ljava/lang/String;

    .line 113
    .line 114
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 115
    .line 116
    const-string v9, "UTF_8"

    .line 117
    .line 118
    invoke-static {v8, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    const-string v8, "this as java.lang.String).getBytes(charset)"

    .line 126
    .line 127
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    aput-object v7, v5, v6

    .line 131
    .line 132
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_3
    const/4 v6, 0x0

    .line 136
    :goto_5
    const-string v7, "publicSuffixListBytes"

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    if-ge v6, v2, :cond_6

    .line 140
    .line 141
    iget-object v9, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 142
    .line 143
    if-eqz v9, :cond_5

    .line 144
    .line 145
    invoke-static {v9, v5, v6}, La1/d;->h([B[[BI)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    if-eqz v9, :cond_4

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/j;->l(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v8

    .line 159
    :cond_6
    move-object v9, v8

    .line 160
    :goto_6
    if-le v2, v4, :cond_9

    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, [[B

    .line 167
    .line 168
    array-length v10, v6

    .line 169
    sub-int/2addr v10, v4

    .line 170
    const/4 v11, 0x0

    .line 171
    :goto_7
    if-ge v11, v10, :cond_9

    .line 172
    .line 173
    sget-object v12, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    .line 174
    .line 175
    aput-object v12, v6, v11

    .line 176
    .line 177
    iget-object v12, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 178
    .line 179
    if-eqz v12, :cond_8

    .line 180
    .line 181
    invoke-static {v12, v6, v11}, La1/d;->h([B[[BI)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    if-eqz v12, :cond_7

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/j;->l(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v8

    .line 195
    :cond_9
    move-object v12, v8

    .line 196
    :goto_8
    if-eqz v12, :cond_c

    .line 197
    .line 198
    sub-int/2addr v2, v4

    .line 199
    const/4 v6, 0x0

    .line 200
    :goto_9
    if-ge v6, v2, :cond_c

    .line 201
    .line 202
    iget-object v7, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:[B

    .line 203
    .line 204
    if-eqz v7, :cond_b

    .line 205
    .line 206
    invoke-static {v7, v5, v6}, La1/d;->h([B[[BI)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    if-eqz v7, :cond_a

    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_b
    const-string p1, "publicSuffixExceptionListBytes"

    .line 217
    .line 218
    invoke-static {p1}, Lkotlin/jvm/internal/j;->l(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v8

    .line 222
    :cond_c
    move-object v7, v8

    .line 223
    :goto_a
    const/16 v2, 0x2e

    .line 224
    .line 225
    if-eqz v7, :cond_d

    .line 226
    .line 227
    const-string v1, "!"

    .line 228
    .line 229
    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-array v5, v4, [C

    .line 234
    .line 235
    aput-char v2, v5, v3

    .line 236
    .line 237
    invoke-static {v1, v5}, Ll5/e;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    goto :goto_c

    .line 242
    :cond_d
    if-nez v9, :cond_e

    .line 243
    .line 244
    if-nez v12, :cond_e

    .line 245
    .line 246
    sget-object v1, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:Ljava/util/List;

    .line 247
    .line 248
    goto :goto_c

    .line 249
    :cond_e
    if-eqz v9, :cond_f

    .line 250
    .line 251
    new-array v5, v4, [C

    .line 252
    .line 253
    aput-char v2, v5, v3

    .line 254
    .line 255
    invoke-static {v9, v5}, Ll5/e;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    goto :goto_b

    .line 260
    :cond_f
    move-object v5, v1

    .line 261
    :goto_b
    if-eqz v12, :cond_10

    .line 262
    .line 263
    new-array v1, v4, [C

    .line 264
    .line 265
    aput-char v2, v1, v3

    .line 266
    .line 267
    invoke-static {v12, v1}, Ll5/e;->C0(Ljava/lang/String;[C)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    :cond_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-le v2, v6, :cond_11

    .line 280
    .line 281
    move-object v1, v5

    .line 282
    :cond_11
    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    const/16 v6, 0x21

    .line 291
    .line 292
    if-ne v2, v5, :cond_12

    .line 293
    .line 294
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-eq v2, v6, :cond_12

    .line 305
    .line 306
    return-object v8

    .line 307
    :cond_12
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-ne v2, v6, :cond_13

    .line 318
    .line 319
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    :goto_d
    sub-int/2addr v0, v1

    .line 328
    goto :goto_e

    .line 329
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    add-int/2addr v1, v4

    .line 338
    goto :goto_d

    .line 339
    :goto_e
    invoke-static {p1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    new-instance v1, Lk5/g;

    .line 344
    .line 345
    const/4 v2, 0x3

    .line 346
    invoke-direct {v1, v2, p1}, Lk5/g;-><init>(ILjava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    if-ltz v0, :cond_15

    .line 350
    .line 351
    if-nez v0, :cond_14

    .line 352
    .line 353
    goto :goto_f

    .line 354
    :cond_14
    new-instance p1, Lk5/c;

    .line 355
    .line 356
    invoke-direct {p1, v1, v0}, Lk5/c;-><init>(Lk5/h;I)V

    .line 357
    .line 358
    .line 359
    move-object v1, p1

    .line 360
    :goto_f
    const-string p1, "."

    .line 361
    .line 362
    invoke-static {v1, p1}, Lk5/j;->L(Lk5/h;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    return-object p1

    .line 367
    :cond_15
    const-string p1, "Requested element count "

    .line 368
    .line 369
    const-string v1, " is less than zero."

    .line 370
    .line 371
    invoke-static {v0, p1, v1}, Landroidx/appcompat/app/b;->k(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v0

    .line 385
    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 386
    .line 387
    const-string v0, "Unable to load publicsuffixes.gz resource from the classpath."

    .line 388
    .line 389
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw p1
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final b()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 2
    .line 3
    const-string v1, "publicsuffixes.gz"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    new-instance v1, Lj6/s;

    .line 18
    .line 19
    invoke-static {v0}, Le6/l;->F(Ljava/io/InputStream;)Lj6/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {v1, v0}, Lj6/s;-><init>(Lj6/i0;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    invoke-virtual {v0}, Lj6/c0;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-long v1, v1

    .line 35
    invoke-virtual {v0, v1, v2}, Lj6/c0;->j0(J)V

    .line 36
    .line 37
    .line 38
    iget-object v3, v0, Lj6/c0;->i:Lj6/i;

    .line 39
    .line 40
    invoke-virtual {v3, v1, v2}, Lj6/i;->Q(J)[B

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0}, Lj6/c0;->readInt()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v2, v2

    .line 49
    invoke-virtual {v0, v2, v3}, Lj6/c0;->j0(J)V

    .line 50
    .line 51
    .line 52
    iget-object v4, v0, Lj6/c0;->i:Lj6/i;

    .line 53
    .line 54
    invoke-virtual {v4, v2, v3}, Lj6/i;->Q(J)[B

    .line 55
    .line 56
    .line 57
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 58
    :try_start_3
    invoke-virtual {v0}, Lj6/c0;->close()V

    .line 59
    .line 60
    .line 61
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    :try_start_4
    iput-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 63
    .line 64
    iput-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:[B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 65
    .line 66
    :try_start_5
    monitor-exit p0

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception v0

    .line 71
    monitor-exit p0

    .line 72
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 73
    :catchall_2
    move-exception v1

    .line 74
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 75
    :catchall_3
    move-exception v2

    .line 76
    :try_start_7
    invoke-static {v0, v1}, Lq3/a;->p(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 80
    :goto_1
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 83
    .line 84
    .line 85
    throw v0
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
