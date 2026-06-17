.class public final Lr1/f;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lr1/b;


# instance fields
.field public final h:Lr1/m;

.field public final i:Lr1/m;

.field public final j:Ljava/lang/ThreadLocal;

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final l:J


# direct methods
.method public constructor <init>(Lu2/c;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lr1/f;->j:Ljava/lang/ThreadLocal;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lr1/f;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    sget v0, Lm5/a;->j:I

    sget-object v0, Lm5/c;->k:Lm5/c;

    const-string v1, "unit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x1

    const/16 v3, 0x1e

    if-gtz v1, :cond_0

    int-to-long v3, v3

    .line 6
    sget-object v1, Lm5/c;->i:Lm5/c;

    invoke-static {v3, v4, v0, v1}, Lq3/a;->t(JLm5/c;Lm5/c;)J

    move-result-wide v0

    shl-long/2addr v0, v2

    .line 7
    sget v3, Lm5/b;->a:I

    goto :goto_0

    :cond_0
    int-to-long v3, v3

    .line 8
    invoke-static {v3, v4, v0}, Le6/l;->J(JLm5/c;)J

    move-result-wide v0

    .line 9
    :goto_0
    iput-wide v0, p0, Lr1/f;->l:J

    .line 10
    new-instance v0, Lr1/m;

    new-instance v1, La2/e;

    const/16 v3, 0x1a

    invoke-direct {v1, v3, p1}, La2/e;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v2, v1}, Lr1/m;-><init>(ILd5/a;)V

    iput-object v0, p0, Lr1/f;->h:Lr1/m;

    .line 11
    iput-object v0, p0, Lr1/f;->i:Lr1/m;

    return-void
.end method

.method public constructor <init>(Lu2/c;Ljava/lang/String;I)V
    .locals 6

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lr1/f;->j:Ljava/lang/ThreadLocal;

    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lr1/f;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    sget v0, Lm5/a;->j:I

    sget-object v0, Lm5/c;->k:Lm5/c;

    const-string v2, "unit"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x1e

    if-gtz v2, :cond_0

    int-to-long v4, v4

    .line 17
    sget-object v2, Lm5/c;->i:Lm5/c;

    invoke-static {v4, v5, v0, v2}, Lq3/a;->t(JLm5/c;Lm5/c;)J

    move-result-wide v4

    shl-long/2addr v4, v3

    .line 18
    sget v0, Lm5/b;->a:I

    goto :goto_0

    :cond_0
    int-to-long v4, v4

    .line 19
    invoke-static {v4, v5, v0}, Le6/l;->J(JLm5/c;)J

    move-result-wide v4

    .line 20
    :goto_0
    iput-wide v4, p0, Lr1/f;->l:J

    if-lez p3, :cond_1

    .line 21
    new-instance v0, Lr1/m;

    .line 22
    new-instance v2, Lr1/c;

    invoke-direct {v2, p1, p2, v1}, Lr1/c;-><init>(Lu2/c;Ljava/lang/String;I)V

    .line 23
    invoke-direct {v0, p3, v2}, Lr1/m;-><init>(ILd5/a;)V

    .line 24
    iput-object v0, p0, Lr1/f;->h:Lr1/m;

    .line 25
    new-instance p3, Lr1/m;

    new-instance v0, Lr1/c;

    invoke-direct {v0, p1, p2, v3}, Lr1/c;-><init>(Lu2/c;Ljava/lang/String;I)V

    invoke-direct {p3, v3, v0}, Lr1/m;-><init>(ILd5/a;)V

    .line 26
    iput-object p3, p0, Lr1/f;->i:Lr1/m;

    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum number of readers must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final V(ZLd5/p;Lt4/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lr1/e;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lr1/e;

    .line 15
    .line 16
    iget v5, v4, Lr1/e;->q:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lr1/e;->q:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lr1/e;

    .line 29
    .line 30
    invoke-direct {v4, v1, v3}, Lr1/e;-><init>(Lr1/f;Lt4/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lr1/e;->o:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Lu4/a;->h:Lu4/a;

    .line 36
    .line 37
    iget v6, v4, Lr1/e;->q:I

    .line 38
    .line 39
    const-string v7, "ROLLBACK TRANSACTION"

    .line 40
    .line 41
    const-string v8, "<this>"

    .line 42
    .line 43
    const/4 v10, 0x4

    .line 44
    const/4 v11, 0x3

    .line 45
    const/4 v12, 0x2

    .line 46
    const/4 v13, 0x1

    .line 47
    const/4 v14, 0x0

    .line 48
    if-eqz v6, :cond_5

    .line 49
    .line 50
    if-eq v6, v13, :cond_4

    .line 51
    .line 52
    if-eq v6, v12, :cond_3

    .line 53
    .line 54
    if-eq v6, v11, :cond_2

    .line 55
    .line 56
    if-ne v6, v10, :cond_1

    .line 57
    .line 58
    iget-object v0, v4, Lr1/e;->i:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v2, v0

    .line 61
    check-cast v2, Lkotlin/jvm/internal/o;

    .line 62
    .line 63
    iget-object v0, v4, Lr1/e;->h:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, v0

    .line 66
    check-cast v4, Lr1/m;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v3}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto/16 :goto_7

    .line 72
    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object v11, v2

    .line 75
    move-object v2, v0

    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    iget-boolean v0, v4, Lr1/e;->n:Z

    .line 87
    .line 88
    iget-object v2, v4, Lr1/e;->m:Lkotlin/jvm/internal/o;

    .line 89
    .line 90
    iget-object v6, v4, Lr1/e;->l:Lt4/h;

    .line 91
    .line 92
    iget-object v11, v4, Lr1/e;->k:Lkotlin/jvm/internal/o;

    .line 93
    .line 94
    iget-object v12, v4, Lr1/e;->j:Lr1/m;

    .line 95
    .line 96
    iget-object v15, v4, Lr1/e;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v15, Ld5/p;

    .line 99
    .line 100
    iget-object v9, v4, Lr1/e;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v9, Lr1/f;

    .line 103
    .line 104
    :try_start_1
    invoke-static {v3}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    move-object v13, v9

    .line 108
    move-object v9, v12

    .line 109
    move-object v12, v6

    .line 110
    move-object v6, v2

    .line 111
    move-object v2, v15

    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object v2, v0

    .line 116
    move-object v4, v12

    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :cond_3
    invoke-static {v3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_4
    invoke-static {v3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object v3

    .line 127
    :cond_5
    invoke-static {v3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v3, v1, Lr1/f;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-nez v3, :cond_17

    .line 137
    .line 138
    iget-object v3, v1, Lr1/f;->j:Ljava/lang/ThreadLocal;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Lr1/u;

    .line 145
    .line 146
    sget-object v9, Lr1/a;->i:Lk6/f;

    .line 147
    .line 148
    if-nez v6, :cond_7

    .line 149
    .line 150
    invoke-interface {v4}, Lt4/c;->getContext()Lt4/h;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-interface {v6, v9}, Lt4/h;->get(Lt4/g;)Lt4/f;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, Lr1/a;

    .line 159
    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    iget-object v6, v6, Lr1/a;->h:Lr1/u;

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    move-object v6, v14

    .line 166
    :cond_7
    :goto_1
    if-eqz v6, :cond_d

    .line 167
    .line 168
    if-nez v0, :cond_9

    .line 169
    .line 170
    iget-boolean v0, v6, Lr1/u;->b:Z

    .line 171
    .line 172
    if-nez v0, :cond_8

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    .line 176
    .line 177
    invoke-static {v13, v0}, La/a;->S(ILjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v14

    .line 181
    :cond_9
    :goto_2
    invoke-interface {v4}, Lt4/c;->getContext()Lt4/h;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0, v9}, Lt4/h;->get(Lt4/g;)Lt4/f;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-nez v0, :cond_b

    .line 190
    .line 191
    new-instance v0, Lr1/a;

    .line 192
    .line 193
    invoke-direct {v0, v6}, Lr1/a;-><init>(Lr1/u;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v3, v8}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    new-instance v7, Ls5/v;

    .line 200
    .line 201
    invoke-direct {v7, v6, v3}, Ls5/v;-><init>(Lr1/u;Ljava/lang/ThreadLocal;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v0, v7}, Le6/l;->B(Lt4/f;Lt4/h;)Lt4/h;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v3, Landroidx/room/n1;

    .line 209
    .line 210
    const/4 v7, 0x2

    .line 211
    invoke-direct {v3, v2, v6, v14, v7}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 212
    .line 213
    .line 214
    iput v13, v4, Lr1/e;->q:I

    .line 215
    .line 216
    invoke-static {v0, v3, v4}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-ne v0, v5, :cond_a

    .line 221
    .line 222
    goto/16 :goto_6

    .line 223
    .line 224
    :cond_a
    return-object v0

    .line 225
    :cond_b
    iput v12, v4, Lr1/e;->q:I

    .line 226
    .line 227
    invoke-interface {v2, v6, v4}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-ne v0, v5, :cond_c

    .line 232
    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :cond_c
    return-object v0

    .line 236
    :cond_d
    if-eqz v0, :cond_e

    .line 237
    .line 238
    iget-object v3, v1, Lr1/f;->h:Lr1/m;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_e
    iget-object v3, v1, Lr1/f;->i:Lr1/m;

    .line 242
    .line 243
    :goto_3
    new-instance v6, Lkotlin/jvm/internal/o;

    .line 244
    .line 245
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 246
    .line 247
    .line 248
    :try_start_2
    invoke-interface {v4}, Lt4/c;->getContext()Lt4/h;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    iget-wide v13, v1, Lr1/f;->l:J

    .line 253
    .line 254
    new-instance v12, Lr1/d;

    .line 255
    .line 256
    invoke-direct {v12, v1, v0}, Lr1/d;-><init>(Lr1/f;Z)V

    .line 257
    .line 258
    .line 259
    iput-object v1, v4, Lr1/e;->h:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v2, v4, Lr1/e;->i:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v3, v4, Lr1/e;->j:Lr1/m;

    .line 264
    .line 265
    iput-object v6, v4, Lr1/e;->k:Lkotlin/jvm/internal/o;

    .line 266
    .line 267
    iput-object v9, v4, Lr1/e;->l:Lt4/h;

    .line 268
    .line 269
    iput-object v6, v4, Lr1/e;->m:Lkotlin/jvm/internal/o;

    .line 270
    .line 271
    iput-boolean v0, v4, Lr1/e;->n:Z

    .line 272
    .line 273
    iput v11, v4, Lr1/e;->q:I

    .line 274
    .line 275
    invoke-virtual {v3, v13, v14, v12, v4}, Lr1/m;->b(JLr1/d;Lv4/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 279
    if-ne v11, v5, :cond_f

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_f
    move-object v13, v1

    .line 283
    move-object v12, v9

    .line 284
    move-object v9, v3

    .line 285
    move-object v3, v11

    .line 286
    move-object v11, v6

    .line 287
    :goto_4
    :try_start_3
    check-cast v3, Lr1/g;

    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const-string v14, "context"

    .line 293
    .line 294
    invoke-static {v12, v14}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    iput-object v12, v3, Lr1/g;->j:Lt4/h;

    .line 298
    .line 299
    new-instance v12, Ljava/lang/Throwable;

    .line 300
    .line 301
    invoke-direct {v12}, Ljava/lang/Throwable;-><init>()V

    .line 302
    .line 303
    .line 304
    iput-object v12, v3, Lr1/g;->k:Ljava/lang/Throwable;

    .line 305
    .line 306
    iget-object v12, v13, Lr1/f;->h:Lr1/m;

    .line 307
    .line 308
    iget-object v14, v13, Lr1/f;->i:Lr1/m;

    .line 309
    .line 310
    if-eq v12, v14, :cond_10

    .line 311
    .line 312
    if-eqz v0, :cond_10

    .line 313
    .line 314
    const/4 v0, 0x1

    .line 315
    goto :goto_5

    .line 316
    :cond_10
    const/4 v0, 0x0

    .line 317
    :goto_5
    new-instance v12, Lr1/u;

    .line 318
    .line 319
    invoke-direct {v12, v3, v0}, Lr1/u;-><init>(Lr1/g;Z)V

    .line 320
    .line 321
    .line 322
    iput-object v12, v6, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v0, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 325
    .line 326
    if-eqz v0, :cond_14

    .line 327
    .line 328
    check-cast v0, Lr1/u;

    .line 329
    .line 330
    new-instance v3, Lr1/a;

    .line 331
    .line 332
    invoke-direct {v3, v0}, Lr1/a;-><init>(Lr1/u;)V

    .line 333
    .line 334
    .line 335
    iget-object v6, v13, Lr1/f;->j:Ljava/lang/ThreadLocal;

    .line 336
    .line 337
    invoke-static {v6, v8}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    new-instance v8, Ls5/v;

    .line 341
    .line 342
    invoke-direct {v8, v0, v6}, Ls5/v;-><init>(Lr1/u;Ljava/lang/ThreadLocal;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v3, v8}, Le6/l;->B(Lt4/f;Lt4/h;)Lt4/h;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v3, Landroidx/room/n1;

    .line 350
    .line 351
    const/4 v6, 0x3

    .line 352
    const/4 v15, 0x0

    .line 353
    invoke-direct {v3, v2, v11, v15, v6}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 354
    .line 355
    .line 356
    iput-object v9, v4, Lr1/e;->h:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v11, v4, Lr1/e;->i:Ljava/lang/Object;

    .line 359
    .line 360
    iput-object v15, v4, Lr1/e;->j:Lr1/m;

    .line 361
    .line 362
    iput-object v15, v4, Lr1/e;->k:Lkotlin/jvm/internal/o;

    .line 363
    .line 364
    iput-object v15, v4, Lr1/e;->l:Lt4/h;

    .line 365
    .line 366
    iput-object v15, v4, Lr1/e;->m:Lkotlin/jvm/internal/o;

    .line 367
    .line 368
    iput v10, v4, Lr1/e;->q:I

    .line 369
    .line 370
    invoke-static {v0, v3, v4}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 374
    if-ne v3, v5, :cond_11

    .line 375
    .line 376
    :goto_6
    return-object v5

    .line 377
    :cond_11
    move-object v4, v9

    .line 378
    move-object v2, v11

    .line 379
    :goto_7
    :try_start_4
    iget-object v0, v2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, Lr1/u;

    .line 382
    .line 383
    if-eqz v0, :cond_13

    .line 384
    .line 385
    iget-object v2, v0, Lr1/u;->a:Lr1/g;

    .line 386
    .line 387
    iget-object v0, v0, Lr1/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 388
    .line 389
    const/4 v5, 0x0

    .line 390
    const/4 v12, 0x1

    .line 391
    invoke-virtual {v0, v5, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 392
    .line 393
    .line 394
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 395
    if-eqz v0, :cond_12

    .line 396
    .line 397
    :try_start_5
    invoke-static {v7, v2}, La/a;->x(Ljava/lang/String;Ly1/a;)V
    :try_end_5
    .catch Landroid/database/SQLException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 398
    .line 399
    .line 400
    :catch_0
    :cond_12
    const/4 v15, 0x0

    .line 401
    :try_start_6
    iput-object v15, v2, Lr1/g;->j:Lt4/h;

    .line 402
    .line 403
    iput-object v15, v2, Lr1/g;->k:Ljava/lang/Throwable;

    .line 404
    .line 405
    invoke-virtual {v4, v2}, Lr1/m;->e(Lr1/g;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 406
    .line 407
    .line 408
    :catchall_2
    :cond_13
    return-object v3

    .line 409
    :catchall_3
    move-exception v0

    .line 410
    move-object v2, v0

    .line 411
    move-object v4, v9

    .line 412
    goto :goto_8

    .line 413
    :cond_14
    :try_start_7
    const-string v0, "Required value was null."

    .line 414
    .line 415
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 416
    .line 417
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 421
    :catchall_4
    move-exception v0

    .line 422
    move-object v2, v0

    .line 423
    move-object v4, v3

    .line 424
    move-object v11, v6

    .line 425
    :goto_8
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 426
    :catchall_5
    move-exception v0

    .line 427
    move-object v3, v0

    .line 428
    :try_start_9
    iget-object v0, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lr1/u;

    .line 431
    .line 432
    if-eqz v0, :cond_16

    .line 433
    .line 434
    iget-object v5, v0, Lr1/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 435
    .line 436
    const/4 v6, 0x0

    .line 437
    const/4 v12, 0x1

    .line 438
    invoke-virtual {v5, v6, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 439
    .line 440
    .line 441
    move-result v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 442
    if-eqz v5, :cond_15

    .line 443
    .line 444
    :try_start_a
    iget-object v5, v0, Lr1/u;->a:Lr1/g;

    .line 445
    .line 446
    invoke-static {v7, v5}, La/a;->x(Ljava/lang/String;Ly1/a;)V
    :try_end_a
    .catch Landroid/database/SQLException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 447
    .line 448
    .line 449
    :catch_1
    :cond_15
    :try_start_b
    iget-object v0, v0, Lr1/u;->a:Lr1/g;

    .line 450
    .line 451
    const/4 v15, 0x0

    .line 452
    iput-object v15, v0, Lr1/g;->j:Lt4/h;

    .line 453
    .line 454
    iput-object v15, v0, Lr1/g;->k:Ljava/lang/Throwable;

    .line 455
    .line 456
    invoke-virtual {v4, v0}, Lr1/m;->e(Lr1/g;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 457
    .line 458
    .line 459
    goto :goto_9

    .line 460
    :catchall_6
    move-exception v0

    .line 461
    invoke-static {v2, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 462
    .line 463
    .line 464
    :cond_16
    :goto_9
    throw v3

    .line 465
    :cond_17
    const/16 v0, 0x15

    .line 466
    .line 467
    const-string v2, "Connection pool is closed"

    .line 468
    .line 469
    invoke-static {v0, v2}, La/a;->S(ILjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    const/4 v15, 0x0

    .line 473
    throw v15
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lr1/f;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lr1/f;->h:Lr1/m;

    .line 12
    .line 13
    invoke-virtual {v0}, Lr1/m;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lr1/f;->i:Lr1/m;

    .line 17
    .line 18
    invoke-virtual {v0}, Lr1/m;->c()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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
