.class public final Lb6/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lw5/q;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw5/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb6/a;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw5/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb6/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Lw5/z;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "\\d+"

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "compile(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "valueOf(header)"

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    const p0, 0x7fffffff

    .line 46
    .line 47
    .line 48
    return p0
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
.end method


# virtual methods
.method public final a(Lb6/g;)Lw5/z;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lb6/a;->a:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lb6/g;->e:Landroidx/appcompat/widget/a0;

    .line 11
    .line 12
    iget-object v3, v2, Lb6/g;->a:La6/j;

    .line 13
    .line 14
    sget-object v4, Lq4/r;->h:Lq4/r;

    .line 15
    .line 16
    move-object v8, v4

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    move-object v4, v0

    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    const-string v11, "request"

    .line 22
    .line 23
    invoke-static {v4, v11}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v11, v3, La6/j;->p:La6/e;

    .line 27
    .line 28
    if-nez v11, :cond_f

    .line 29
    .line 30
    monitor-enter v3

    .line 31
    :try_start_0
    iget-boolean v11, v3, La6/j;->r:Z

    .line 32
    .line 33
    if-nez v11, :cond_e

    .line 34
    .line 35
    iget-boolean v11, v3, La6/j;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    if-nez v11, :cond_d

    .line 38
    .line 39
    monitor-exit v3

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v0, La6/f;

    .line 43
    .line 44
    iget-object v11, v3, La6/j;->j:La6/p;

    .line 45
    .line 46
    iget-object v12, v4, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v12, Lw5/p;

    .line 49
    .line 50
    iget-object v13, v3, La6/j;->h:Lw5/u;

    .line 51
    .line 52
    iget-boolean v14, v12, Lw5/p;->j:Z

    .line 53
    .line 54
    if-eqz v14, :cond_1

    .line 55
    .line 56
    iget-object v14, v13, Lw5/u;->v:Ljavax/net/ssl/SSLSocketFactory;

    .line 57
    .line 58
    if-eqz v14, :cond_0

    .line 59
    .line 60
    iget-object v15, v13, Lw5/u;->z:Li6/c;

    .line 61
    .line 62
    iget-object v7, v13, Lw5/u;->A:Lw5/f;

    .line 63
    .line 64
    move-object/from16 v24, v7

    .line 65
    .line 66
    move-object/from16 v22, v14

    .line 67
    .line 68
    move-object/from16 v23, v15

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "CLEARTEXT-only client"

    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_1
    const/16 v22, 0x0

    .line 80
    .line 81
    const/16 v23, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    :goto_2
    new-instance v17, Lw5/a;

    .line 86
    .line 87
    iget-object v7, v12, Lw5/p;->d:Ljava/lang/String;

    .line 88
    .line 89
    iget v12, v12, Lw5/p;->e:I

    .line 90
    .line 91
    iget-object v14, v13, Lw5/u;->r:Lw5/b;

    .line 92
    .line 93
    iget-object v15, v13, Lw5/u;->u:Ljavax/net/SocketFactory;

    .line 94
    .line 95
    iget-object v5, v13, Lw5/u;->t:Lw5/b;

    .line 96
    .line 97
    iget-object v6, v13, Lw5/u;->y:Ljava/util/List;

    .line 98
    .line 99
    move-object/from16 v25, v5

    .line 100
    .line 101
    iget-object v5, v13, Lw5/u;->x:Ljava/util/List;

    .line 102
    .line 103
    iget-object v13, v13, Lw5/u;->s:Ljava/net/ProxySelector;

    .line 104
    .line 105
    move-object/from16 v27, v5

    .line 106
    .line 107
    move-object/from16 v26, v6

    .line 108
    .line 109
    move-object/from16 v18, v7

    .line 110
    .line 111
    move/from16 v19, v12

    .line 112
    .line 113
    move-object/from16 v28, v13

    .line 114
    .line 115
    move-object/from16 v20, v14

    .line 116
    .line 117
    move-object/from16 v21, v15

    .line 118
    .line 119
    invoke-direct/range {v17 .. v28}, Lw5/a;-><init>(Ljava/lang/String;ILw5/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lw5/f;Lw5/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v5, v17

    .line 123
    .line 124
    invoke-direct {v0, v11, v5, v3}, La6/f;-><init>(La6/p;Lw5/a;La6/j;)V

    .line 125
    .line 126
    .line 127
    iput-object v0, v3, La6/j;->n:La6/f;

    .line 128
    .line 129
    :cond_2
    :try_start_1
    iget-boolean v0, v3, La6/j;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    if-nez v0, :cond_c

    .line 132
    .line 133
    :try_start_2
    invoke-virtual {v2, v4}, Lb6/g;->b(Landroidx/appcompat/widget/a0;)Lw5/z;

    .line 134
    .line 135
    .line 136
    move-result-object v0
    :try_end_2
    .catch La6/q; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    if-eqz v9, :cond_4

    .line 138
    .line 139
    :try_start_3
    invoke-virtual {v0}, Lw5/z;->c()Lw5/y;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v9}, Lw5/z;->c()Lw5/y;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const/4 v5, 0x0

    .line 148
    iput-object v5, v4, Lw5/y;->g:Lw5/b0;

    .line 149
    .line 150
    invoke-virtual {v4}, Lw5/y;->a()Lw5/z;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    iget-object v6, v4, Lw5/z;->n:Lw5/b0;

    .line 155
    .line 156
    if-nez v6, :cond_3

    .line 157
    .line 158
    iput-object v4, v0, Lw5/y;->j:Lw5/z;

    .line 159
    .line 160
    invoke-virtual {v0}, Lw5/y;->a()Lw5/z;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_3
    move-object v9, v0

    .line 165
    goto :goto_4

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    const/4 v6, 0x1

    .line 168
    goto/16 :goto_8

    .line 169
    .line 170
    :cond_3
    const-string v0, "priorResponse.body != null"

    .line 171
    .line 172
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v2

    .line 178
    :cond_4
    const/4 v5, 0x0

    .line 179
    goto :goto_3

    .line 180
    :goto_4
    iget-object v0, v3, La6/j;->p:La6/e;

    .line 181
    .line 182
    invoke-virtual {v1, v9, v0}, Lb6/a;->b(Lw5/z;La6/e;)Landroidx/appcompat/widget/a0;

    .line 183
    .line 184
    .line 185
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    if-nez v4, :cond_5

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    invoke-virtual {v3, v6}, La6/j;->g(Z)V

    .line 190
    .line 191
    .line 192
    return-object v9

    .line 193
    :cond_5
    :try_start_4
    iget-object v0, v9, Lw5/z;->n:Lw5/b0;

    .line 194
    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    invoke-static {v0}, Lx5/b;->c(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    .line 199
    .line 200
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 201
    .line 202
    const/16 v0, 0x14

    .line 203
    .line 204
    if-gt v10, v0, :cond_7

    .line 205
    .line 206
    const/4 v6, 0x1

    .line 207
    invoke-virtual {v3, v6}, La6/j;->g(Z)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_7
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 213
    .line 214
    new-instance v2, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v4, "Too many follow-up requests: "

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :catch_0
    move-exception v0

    .line 236
    const/4 v5, 0x0

    .line 237
    instance-of v6, v0, Ld6/a;

    .line 238
    .line 239
    const/4 v7, 0x1

    .line 240
    xor-int/2addr v6, v7

    .line 241
    invoke-virtual {v1, v0, v3, v4, v6}, Lb6/a;->c(Ljava/io/IOException;La6/j;Landroidx/appcompat/widget/a0;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-eqz v6, :cond_8

    .line 246
    .line 247
    invoke-static {v8, v0}, Lq4/i;->A0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 251
    invoke-virtual {v3, v7}, La6/j;->g(Z)V

    .line 252
    .line 253
    .line 254
    :goto_5
    const/4 v0, 0x0

    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_8
    :try_start_6
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_9

    .line 266
    .line 267
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    check-cast v4, Ljava/lang/Exception;

    .line 272
    .line 273
    invoke-static {v0, v4}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_9
    throw v0

    .line 278
    :catch_1
    move-exception v0

    .line 279
    const/4 v5, 0x0

    .line 280
    iget-object v6, v0, La6/q;->i:Ljava/io/IOException;

    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    invoke-virtual {v1, v6, v3, v4, v7}, Lb6/a;->c(Ljava/io/IOException;La6/j;Landroidx/appcompat/widget/a0;Z)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_a

    .line 288
    .line 289
    iget-object v0, v0, La6/q;->h:Ljava/io/IOException;

    .line 290
    .line 291
    invoke-static {v8, v0}, Lq4/i;->A0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 292
    .line 293
    .line 294
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 295
    const/4 v6, 0x1

    .line 296
    invoke-virtual {v3, v6}, La6/j;->g(Z)V

    .line 297
    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_a
    :try_start_7
    iget-object v0, v0, La6/q;->h:Ljava/io/IOException;

    .line 301
    .line 302
    const-string v2, "<this>"

    .line 303
    .line 304
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_b

    .line 316
    .line 317
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    check-cast v4, Ljava/lang/Exception;

    .line 322
    .line 323
    invoke-static {v0, v4}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_b
    throw v0

    .line 328
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 329
    .line 330
    const-string v2, "Canceled"

    .line 331
    .line 332
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 336
    :goto_8
    invoke-virtual {v3, v6}, La6/j;->g(Z)V

    .line 337
    .line 338
    .line 339
    throw v0

    .line 340
    :cond_d
    :try_start_8
    const-string v0, "Check failed."

    .line 341
    .line 342
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 343
    .line 344
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v2

    .line 348
    :catchall_1
    move-exception v0

    .line 349
    goto :goto_9

    .line 350
    :cond_e
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 351
    .line 352
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 353
    .line 354
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 358
    :goto_9
    monitor-exit v3

    .line 359
    throw v0

    .line 360
    :cond_f
    const-string v0, "Check failed."

    .line 361
    .line 362
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v2

    .line 368
    :pswitch_0
    const-string v0, "Content-Encoding"

    .line 369
    .line 370
    const-string v3, "User-Agent"

    .line 371
    .line 372
    iget-object v4, v1, Lb6/a;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v4, Lw5/b;

    .line 375
    .line 376
    const-string v5, "gzip"

    .line 377
    .line 378
    const-string v6, "Accept-Encoding"

    .line 379
    .line 380
    const-string v7, "Connection"

    .line 381
    .line 382
    const-string v8, "Host"

    .line 383
    .line 384
    const-string v9, "Transfer-Encoding"

    .line 385
    .line 386
    const-string v10, "Content-Type"

    .line 387
    .line 388
    const-string v11, "Content-Length"

    .line 389
    .line 390
    iget-object v12, v2, Lb6/g;->e:Landroidx/appcompat/widget/a0;

    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/appcompat/widget/a0;->f()Landroidx/lifecycle/a1;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    iget-object v14, v12, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v14, Lw5/n;

    .line 399
    .line 400
    iget-object v15, v12, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v15, Lw5/p;

    .line 403
    .line 404
    iget-object v1, v12, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v1, Lw5/x;

    .line 407
    .line 408
    const-wide/16 v18, -0x1

    .line 409
    .line 410
    if-eqz v1, :cond_12

    .line 411
    .line 412
    move-object/from16 v16, v1

    .line 413
    .line 414
    invoke-virtual/range {v16 .. v16}, Lw5/x;->b()Lw5/r;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    if-eqz v1, :cond_10

    .line 419
    .line 420
    iget-object v1, v1, Lw5/r;->a:Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v13, v10, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    :cond_10
    invoke-virtual/range {v16 .. v16}, Lw5/x;->a()J

    .line 426
    .line 427
    .line 428
    move-result-wide v16

    .line 429
    cmp-long v1, v16, v18

    .line 430
    .line 431
    if-eqz v1, :cond_11

    .line 432
    .line 433
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v13, v11, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    iget-object v1, v13, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v1, Lp3/j;

    .line 443
    .line 444
    invoke-virtual {v1, v9}, Lp3/j;->f(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_11
    const-string v1, "chunked"

    .line 449
    .line 450
    invoke-virtual {v13, v9, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    iget-object v1, v13, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v1, Lp3/j;

    .line 456
    .line 457
    invoke-virtual {v1, v11}, Lp3/j;->f(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :cond_12
    :goto_a
    invoke-virtual {v14, v8}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    const/4 v9, 0x0

    .line 465
    if-nez v1, :cond_13

    .line 466
    .line 467
    invoke-static {v15, v9}, Lx5/b;->u(Lw5/p;Z)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v13, v8, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    :cond_13
    invoke-virtual {v14, v7}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-nez v1, :cond_14

    .line 479
    .line 480
    const-string v1, "Keep-Alive"

    .line 481
    .line 482
    invoke-virtual {v13, v7, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :cond_14
    invoke-virtual {v14, v6}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    if-nez v1, :cond_15

    .line 490
    .line 491
    const-string v1, "Range"

    .line 492
    .line 493
    invoke-virtual {v14, v1}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    if-nez v1, :cond_15

    .line 498
    .line 499
    invoke-virtual {v13, v6, v5}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    const/4 v9, 0x1

    .line 503
    :cond_15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    const-string v1, "url"

    .line 507
    .line 508
    invoke-static {v15, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v14, v3}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    if-nez v1, :cond_16

    .line 516
    .line 517
    const-string v1, "okhttp/4.12.0"

    .line 518
    .line 519
    invoke-virtual {v13, v3, v1}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :cond_16
    invoke-virtual {v13}, Landroidx/lifecycle/a1;->c()Landroidx/appcompat/widget/a0;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v2, v1}, Lb6/g;->b(Landroidx/appcompat/widget/a0;)Lw5/z;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iget-object v2, v1, Lw5/z;->m:Lw5/n;

    .line 531
    .line 532
    invoke-static {v4, v15, v2}, Lb6/f;->b(Lw5/b;Lw5/p;Lw5/n;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Lw5/z;->c()Lw5/y;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    iput-object v12, v3, Lw5/y;->a:Landroidx/appcompat/widget/a0;

    .line 540
    .line 541
    if-eqz v9, :cond_17

    .line 542
    .line 543
    invoke-static {v0, v1}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_17

    .line 552
    .line 553
    invoke-static {v1}, Lb6/f;->a(Lw5/z;)Z

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    if-eqz v4, :cond_17

    .line 558
    .line 559
    iget-object v4, v1, Lw5/z;->n:Lw5/b0;

    .line 560
    .line 561
    if-eqz v4, :cond_17

    .line 562
    .line 563
    new-instance v5, Lj6/s;

    .line 564
    .line 565
    invoke-virtual {v4}, Lw5/b0;->c()Lj6/k;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-direct {v5, v4}, Lj6/s;-><init>(Lj6/i0;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Lw5/n;->h()Lp3/j;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v2, v0}, Lp3/j;->f(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v11}, Lp3/j;->f(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Lp3/j;->e()Lw5/n;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Lw5/n;->h()Lp3/j;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    iput-object v0, v3, Lw5/y;->f:Lp3/j;

    .line 591
    .line 592
    invoke-static {v10, v1}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v17

    .line 596
    new-instance v16, Lb6/h;

    .line 597
    .line 598
    invoke-static {v5}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 599
    .line 600
    .line 601
    move-result-object v20

    .line 602
    const/16 v21, 0x0

    .line 603
    .line 604
    invoke-direct/range {v16 .. v21}, Lb6/h;-><init>(Ljava/lang/Object;JLj6/k;I)V

    .line 605
    .line 606
    .line 607
    move-object/from16 v0, v16

    .line 608
    .line 609
    iput-object v0, v3, Lw5/y;->g:Lw5/b0;

    .line 610
    .line 611
    :cond_17
    invoke-virtual {v3}, Lw5/y;->a()Lw5/z;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    return-object v0

    .line 616
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lw5/z;La6/e;)Landroidx/appcompat/widget/a0;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object v1, p2, La6/e;->e:La6/n;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v1, La6/n;->b:Lw5/c0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p1, Lw5/z;->k:I

    .line 13
    .line 14
    iget-object v3, p1, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 15
    .line 16
    iget-object v3, v3, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x134

    .line 23
    .line 24
    const/16 v7, 0x133

    .line 25
    .line 26
    if-eq v2, v7, :cond_c

    .line 27
    .line 28
    if-eq v2, v6, :cond_c

    .line 29
    .line 30
    const/16 v8, 0x191

    .line 31
    .line 32
    if-eq v2, v8, :cond_b

    .line 33
    .line 34
    const/16 v8, 0x1a5

    .line 35
    .line 36
    if-eq v2, v8, :cond_9

    .line 37
    .line 38
    const/16 p2, 0x1f7

    .line 39
    .line 40
    if-eq v2, p2, :cond_7

    .line 41
    .line 42
    const/16 p2, 0x197

    .line 43
    .line 44
    if-eq v2, p2, :cond_5

    .line 45
    .line 46
    const/16 p2, 0x198

    .line 47
    .line 48
    if-eq v2, p2, :cond_1

    .line 49
    .line 50
    packed-switch v2, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Lb6/a;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lw5/u;

    .line 58
    .line 59
    iget-boolean v1, v1, Lw5/u;->m:Z

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    iget-object v1, p1, Lw5/z;->q:Lw5/z;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget v1, v1, Lw5/z;->k:I

    .line 70
    .line 71
    if-ne v1, p2, :cond_3

    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_3
    invoke-static {p1, v4}, Lb6/a;->d(Lw5/z;I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-lez p2, :cond_4

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_4
    iget-object p1, p1, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 96
    .line 97
    if-ne p1, p2, :cond_6

    .line 98
    .line 99
    iget-object p1, p0, Lb6/a;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lw5/u;

    .line 102
    .line 103
    iget-object p1, p1, Lw5/u;->t:Lw5/b;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    .line 110
    .line 111
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 112
    .line 113
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_7
    iget-object v1, p1, Lw5/z;->q:Lw5/z;

    .line 118
    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    iget v1, v1, Lw5/z;->k:I

    .line 122
    .line 123
    if-ne v1, p2, :cond_8

    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_8
    const p2, 0x7fffffff

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2}, Lb6/a;->d(Lw5/z;I)I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_11

    .line 135
    .line 136
    iget-object p1, p1, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_9
    if-eqz p2, :cond_11

    .line 140
    .line 141
    iget-object v1, p2, La6/e;->b:La6/f;

    .line 142
    .line 143
    iget-object v1, v1, La6/f;->b:Lw5/a;

    .line 144
    .line 145
    iget-object v1, v1, Lw5/a;->h:Lw5/p;

    .line 146
    .line 147
    iget-object v1, v1, Lw5/p;->d:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v2, p2, La6/e;->e:La6/n;

    .line 150
    .line 151
    iget-object v2, v2, La6/n;->b:Lw5/c0;

    .line 152
    .line 153
    iget-object v2, v2, Lw5/c0;->a:Lw5/a;

    .line 154
    .line 155
    iget-object v2, v2, Lw5/a;->h:Lw5/p;

    .line 156
    .line 157
    iget-object v2, v2, Lw5/p;->d:Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_a

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_a
    iget-object p2, p2, La6/e;->e:La6/n;

    .line 167
    .line 168
    monitor-enter p2

    .line 169
    :try_start_0
    iput-boolean v5, p2, La6/n;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    .line 171
    monitor-exit p2

    .line 172
    iget-object p1, p1, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 173
    .line 174
    return-object p1

    .line 175
    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    throw p1

    .line 178
    :cond_b
    iget-object p1, p0, Lb6/a;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Lw5/u;

    .line 181
    .line 182
    iget-object p1, p1, Lw5/u;->n:Lw5/b;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_c
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 189
    .line 190
    iget-object v1, p0, Lb6/a;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Lw5/u;

    .line 193
    .line 194
    iget-boolean v2, v1, Lw5/u;->o:Z

    .line 195
    .line 196
    if-nez v2, :cond_d

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_d
    const-string v2, "Location"

    .line 200
    .line 201
    invoke-static {v2, p1}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v8, p1, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 206
    .line 207
    if-nez v2, :cond_e

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_e
    iget-object v9, v8, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v9, Lw5/p;

    .line 213
    .line 214
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v2}, Lw5/p;->f(Ljava/lang/String;)Lw5/o;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-eqz v2, :cond_f

    .line 222
    .line 223
    invoke-virtual {v2}, Lw5/o;->a()Lw5/p;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    goto :goto_1

    .line 228
    :cond_f
    move-object v2, v0

    .line 229
    :goto_1
    if-nez v2, :cond_10

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_10
    iget-object v9, v2, Lw5/p;->a:Ljava/lang/String;

    .line 233
    .line 234
    iget-object v10, v8, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v10, Lw5/p;

    .line 237
    .line 238
    iget-object v10, v10, Lw5/p;->a:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v9, v10}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-nez v9, :cond_12

    .line 245
    .line 246
    iget-boolean v1, v1, Lw5/u;->p:Z

    .line 247
    .line 248
    if-nez v1, :cond_12

    .line 249
    .line 250
    :cond_11
    :goto_2
    return-object v0

    .line 251
    :cond_12
    invoke-virtual {v8}, Landroidx/appcompat/widget/a0;->f()Landroidx/lifecycle/a1;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v3}, Le6/d;->L(Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_17

    .line 260
    .line 261
    iget p1, p1, Lw5/z;->k:I

    .line 262
    .line 263
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    if-nez v9, :cond_13

    .line 268
    .line 269
    if-eq p1, v6, :cond_13

    .line 270
    .line 271
    if-ne p1, v7, :cond_14

    .line 272
    .line 273
    :cond_13
    const/4 v4, 0x1

    .line 274
    :cond_14
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    if-nez p2, :cond_15

    .line 279
    .line 280
    if-eq p1, v6, :cond_15

    .line 281
    .line 282
    if-eq p1, v7, :cond_15

    .line 283
    .line 284
    const-string p1, "GET"

    .line 285
    .line 286
    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/a1;->i(Ljava/lang/String;Lw5/x;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_15
    if-eqz v4, :cond_16

    .line 291
    .line 292
    iget-object p1, v8, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v0, p1

    .line 295
    check-cast v0, Lw5/x;

    .line 296
    .line 297
    :cond_16
    invoke-virtual {v1, v3, v0}, Landroidx/lifecycle/a1;->i(Ljava/lang/String;Lw5/x;)V

    .line 298
    .line 299
    .line 300
    :goto_3
    if-nez v4, :cond_17

    .line 301
    .line 302
    const-string p1, "Transfer-Encoding"

    .line 303
    .line 304
    iget-object p2, v1, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p2, Lp3/j;

    .line 307
    .line 308
    invoke-virtual {p2, p1}, Lp3/j;->f(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string p1, "Content-Length"

    .line 312
    .line 313
    iget-object p2, v1, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p2, Lp3/j;

    .line 316
    .line 317
    invoke-virtual {p2, p1}, Lp3/j;->f(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const-string p1, "Content-Type"

    .line 321
    .line 322
    iget-object p2, v1, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast p2, Lp3/j;

    .line 325
    .line 326
    invoke-virtual {p2, p1}, Lp3/j;->f(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_17
    iget-object p1, v8, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p1, Lw5/p;

    .line 332
    .line 333
    invoke-static {p1, v2}, Lx5/b;->a(Lw5/p;Lw5/p;)Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    if-nez p1, :cond_18

    .line 338
    .line 339
    const-string p1, "Authorization"

    .line 340
    .line 341
    iget-object p2, v1, Landroidx/lifecycle/a1;->k:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p2, Lp3/j;

    .line 344
    .line 345
    invoke-virtual {p2, p1}, Lp3/j;->f(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :cond_18
    iput-object v2, v1, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 349
    .line 350
    invoke-virtual {v1}, Landroidx/lifecycle/a1;->c()Landroidx/appcompat/widget/a0;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    return-object p1

    .line 355
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public c(Ljava/io/IOException;La6/j;Landroidx/appcompat/widget/a0;Z)Z
    .locals 3

    .line 1
    iget-object p3, p0, Lb6/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lw5/u;

    .line 4
    .line 5
    iget-boolean p3, p3, Lw5/u;->m:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    if-eqz p4, :cond_1

    .line 13
    .line 14
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 20
    .line 21
    if-eqz p3, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 29
    .line 30
    if-eqz p1, :cond_10

    .line 31
    .line 32
    if-nez p4, :cond_10

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 36
    .line 37
    if-eqz p3, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 44
    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    return v0

    .line 54
    :cond_5
    :goto_0
    iget-object p1, p2, La6/j;->n:La6/f;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget p2, p1, La6/f;->f:I

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    if-nez p2, :cond_6

    .line 63
    .line 64
    iget p4, p1, La6/f;->g:I

    .line 65
    .line 66
    if-nez p4, :cond_6

    .line 67
    .line 68
    iget p4, p1, La6/f;->h:I

    .line 69
    .line 70
    if-nez p4, :cond_6

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    goto :goto_4

    .line 74
    :cond_6
    iget-object p4, p1, La6/f;->i:Lw5/c0;

    .line 75
    .line 76
    if-eqz p4, :cond_7

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_7
    const/4 p4, 0x0

    .line 80
    if-gt p2, p3, :cond_c

    .line 81
    .line 82
    iget p2, p1, La6/f;->g:I

    .line 83
    .line 84
    if-gt p2, p3, :cond_c

    .line 85
    .line 86
    iget p2, p1, La6/f;->h:I

    .line 87
    .line 88
    if-lez p2, :cond_8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    iget-object p2, p1, La6/f;->c:La6/j;

    .line 92
    .line 93
    iget-object p2, p2, La6/j;->o:La6/n;

    .line 94
    .line 95
    if-nez p2, :cond_9

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_9
    monitor-enter p2

    .line 99
    :try_start_0
    iget v1, p2, La6/n;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    monitor-exit p2

    .line 104
    goto :goto_1

    .line 105
    :cond_a
    :try_start_1
    iget-object v1, p2, La6/n;->b:Lw5/c0;

    .line 106
    .line 107
    iget-object v1, v1, Lw5/c0;->a:Lw5/a;

    .line 108
    .line 109
    iget-object v1, v1, Lw5/a;->h:Lw5/p;

    .line 110
    .line 111
    iget-object v2, p1, La6/f;->b:Lw5/a;

    .line 112
    .line 113
    iget-object v2, v2, Lw5/a;->h:Lw5/p;

    .line 114
    .line 115
    invoke-static {v1, v2}, Lx5/b;->a(Lw5/p;Lw5/p;)Z

    .line 116
    .line 117
    .line 118
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    if-nez v1, :cond_b

    .line 120
    .line 121
    monitor-exit p2

    .line 122
    goto :goto_1

    .line 123
    :cond_b
    :try_start_2
    iget-object p4, p2, La6/n;->b:Lw5/c0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    monitor-exit p2

    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    monitor-exit p2

    .line 129
    throw p1

    .line 130
    :cond_c
    :goto_1
    if-eqz p4, :cond_d

    .line 131
    .line 132
    iput-object p4, p1, La6/f;->i:Lw5/c0;

    .line 133
    .line 134
    :goto_2
    const/4 p1, 0x1

    .line 135
    goto :goto_4

    .line 136
    :cond_d
    iget-object p2, p1, La6/f;->d:Lp3/z;

    .line 137
    .line 138
    if-eqz p2, :cond_e

    .line 139
    .line 140
    invoke-virtual {p2}, Lp3/z;->e()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-ne p2, p3, :cond_e

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_e
    iget-object p1, p1, La6/f;->e:La6/r;

    .line 148
    .line 149
    if-nez p1, :cond_f

    .line 150
    .line 151
    :goto_3
    goto :goto_2

    .line 152
    :cond_f
    invoke-virtual {p1}, La6/r;->a()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    :goto_4
    if-nez p1, :cond_11

    .line 157
    .line 158
    :cond_10
    :goto_5
    return v0

    .line 159
    :cond_11
    return p3
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method
