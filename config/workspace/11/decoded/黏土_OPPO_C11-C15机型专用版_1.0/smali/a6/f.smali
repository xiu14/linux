.class public final La6/f;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:La6/p;

.field public final b:Lw5/a;

.field public final c:La6/j;

.field public d:Lp3/z;

.field public e:La6/r;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lw5/c0;


# direct methods
.method public constructor <init>(La6/p;Lw5/a;La6/j;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La6/f;->a:La6/p;

    .line 10
    .line 11
    iput-object p2, p0, La6/f;->b:Lw5/a;

    .line 12
    .line 13
    iput-object p3, p0, La6/f;->c:La6/j;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
.end method


# virtual methods
.method public final a(IIIZZ)La6/n;
    .locals 11

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, La6/f;->c:La6/j;

    .line 2
    .line 3
    iget-boolean v0, v0, La6/j;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_13

    .line 6
    .line 7
    iget-object v0, p0, La6/f;->c:La6/j;

    .line 8
    .line 9
    iget-object v1, v0, La6/j;->o:La6/n;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-boolean v3, v1, La6/n;->j:Z

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget-object v3, v1, La6/n;->b:Lw5/c0;

    .line 21
    .line 22
    iget-object v3, v3, Lw5/c0;->a:Lw5/a;

    .line 23
    .line 24
    iget-object v3, v3, Lw5/a;->h:Lw5/p;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, La6/f;->b(Lw5/p;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v3, v2

    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_4

    .line 38
    :cond_2
    :goto_1
    iget-object v3, p0, La6/f;->c:La6/j;

    .line 39
    .line 40
    invoke-virtual {v3}, La6/j;->k()Ljava/net/Socket;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_2
    monitor-exit v1

    .line 45
    iget-object v4, p0, La6/f;->c:La6/j;

    .line 46
    .line 47
    iget-object v4, v4, La6/j;->o:La6/n;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    :goto_3
    move/from16 v2, p5

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_3
    const-string p1, "Check failed."

    .line 58
    .line 59
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :cond_4
    if-eqz v3, :cond_5

    .line 66
    .line 67
    invoke-static {v3}, Lx5/b;->d(Ljava/net/Socket;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :goto_4
    monitor-exit v1

    .line 72
    throw p1

    .line 73
    :cond_5
    :goto_5
    const/4 v1, 0x0

    .line 74
    iput v1, p0, La6/f;->f:I

    .line 75
    .line 76
    iput v1, p0, La6/f;->g:I

    .line 77
    .line 78
    iput v1, p0, La6/f;->h:I

    .line 79
    .line 80
    iget-object v3, p0, La6/f;->a:La6/p;

    .line 81
    .line 82
    iget-object v4, p0, La6/f;->b:Lw5/a;

    .line 83
    .line 84
    iget-object v5, p0, La6/f;->c:La6/j;

    .line 85
    .line 86
    invoke-virtual {v3, v4, v5, v2, v1}, La6/p;->a(Lw5/a;La6/j;Ljava/util/List;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 93
    .line 94
    iget-object v1, v1, La6/j;->o:La6/n;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    iget-object v3, p0, La6/f;->i:Lw5/c0;

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    iput-object v2, p0, La6/f;->i:Lw5/c0;

    .line 105
    .line 106
    :goto_6
    move-object v4, v2

    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :cond_7
    iget-object v3, p0, La6/f;->d:Lp3/z;

    .line 110
    .line 111
    if-eqz v3, :cond_9

    .line 112
    .line 113
    invoke-virtual {v3}, Lp3/z;->e()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_9

    .line 118
    .line 119
    iget-object v1, p0, La6/f;->d:Lp3/z;

    .line 120
    .line 121
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lp3/z;->e()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    iget-object v3, v1, Lp3/z;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    iget v4, v1, Lp3/z;->h:I

    .line 135
    .line 136
    add-int/lit8 v5, v4, 0x1

    .line 137
    .line 138
    iput v5, v1, Lp3/z;->h:I

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v3, v1

    .line 145
    check-cast v3, Lw5/c0;

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_9
    iget-object v3, p0, La6/f;->e:La6/r;

    .line 155
    .line 156
    if-nez v3, :cond_a

    .line 157
    .line 158
    new-instance v3, La6/r;

    .line 159
    .line 160
    iget-object v4, p0, La6/f;->b:Lw5/a;

    .line 161
    .line 162
    iget-object v5, p0, La6/f;->c:La6/j;

    .line 163
    .line 164
    iget-object v6, v5, La6/j;->h:Lw5/u;

    .line 165
    .line 166
    iget-object v6, v6, Lw5/u;->F:La1/q;

    .line 167
    .line 168
    invoke-direct {v3, v4, v6, v5}, La6/r;-><init>(Lw5/a;La1/q;La6/j;)V

    .line 169
    .line 170
    .line 171
    iput-object v3, p0, La6/f;->e:La6/r;

    .line 172
    .line 173
    :cond_a
    invoke-virtual {v3}, La6/r;->b()Lp3/z;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    iput-object v3, p0, La6/f;->d:Lp3/z;

    .line 178
    .line 179
    iget-object v4, v3, Lp3/z;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Ljava/util/ArrayList;

    .line 182
    .line 183
    iget-object v5, p0, La6/f;->c:La6/j;

    .line 184
    .line 185
    iget-boolean v5, v5, La6/j;->t:Z

    .line 186
    .line 187
    if-nez v5, :cond_12

    .line 188
    .line 189
    iget-object v5, p0, La6/f;->a:La6/p;

    .line 190
    .line 191
    iget-object v6, p0, La6/f;->b:Lw5/a;

    .line 192
    .line 193
    iget-object v7, p0, La6/f;->c:La6/j;

    .line 194
    .line 195
    invoke-virtual {v5, v6, v7, v4, v1}, La6/p;->a(Lw5/a;La6/j;Ljava/util/List;Z)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 202
    .line 203
    iget-object v1, v1, La6/j;->o:La6/n;

    .line 204
    .line 205
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_3

    .line 209
    .line 210
    :cond_b
    invoke-virtual {v3}, Lp3/z;->e()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_11

    .line 215
    .line 216
    iget-object v1, v3, Lp3/z;->i:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, Ljava/util/ArrayList;

    .line 219
    .line 220
    iget v5, v3, Lp3/z;->h:I

    .line 221
    .line 222
    add-int/lit8 v6, v5, 0x1

    .line 223
    .line 224
    iput v6, v3, Lp3/z;->h:I

    .line 225
    .line 226
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    move-object v3, v1

    .line 231
    check-cast v3, Lw5/c0;

    .line 232
    .line 233
    :goto_7
    new-instance v5, La6/n;

    .line 234
    .line 235
    iget-object v1, p0, La6/f;->a:La6/p;

    .line 236
    .line 237
    invoke-direct {v5, v1, v3}, La6/n;-><init>(La6/p;Lw5/c0;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 241
    .line 242
    iput-object v5, v1, La6/j;->v:La6/n;

    .line 243
    .line 244
    :try_start_1
    iget-object v10, p0, La6/f;->c:La6/j;

    .line 245
    .line 246
    move v6, p1

    .line 247
    move v7, p2

    .line 248
    move v8, p3

    .line 249
    move v9, p4

    .line 250
    invoke-virtual/range {v5 .. v10}, La6/n;->c(IIIZLa6/j;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 251
    .line 252
    .line 253
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 254
    .line 255
    iput-object v2, v1, La6/j;->v:La6/n;

    .line 256
    .line 257
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 258
    .line 259
    iget-object v1, v1, La6/j;->h:Lw5/u;

    .line 260
    .line 261
    iget-object v1, v1, Lw5/u;->F:La1/q;

    .line 262
    .line 263
    invoke-virtual {v1, v3}, La1/q;->x(Lw5/c0;)V

    .line 264
    .line 265
    .line 266
    iget-object v1, p0, La6/f;->a:La6/p;

    .line 267
    .line 268
    iget-object v2, p0, La6/f;->b:Lw5/a;

    .line 269
    .line 270
    iget-object v6, p0, La6/f;->c:La6/j;

    .line 271
    .line 272
    invoke-virtual {v1, v2, v6, v4, v0}, La6/p;->a(Lw5/a;La6/j;Ljava/util/List;Z)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_c

    .line 277
    .line 278
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 279
    .line 280
    iget-object v1, v1, La6/j;->o:La6/n;

    .line 281
    .line 282
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    iput-object v3, p0, La6/f;->i:Lw5/c0;

    .line 286
    .line 287
    iget-object v2, v5, La6/n;->d:Ljava/net/Socket;

    .line 288
    .line 289
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v2}, Lx5/b;->d(Ljava/net/Socket;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_3

    .line 296
    .line 297
    :cond_c
    monitor-enter v5

    .line 298
    :try_start_2
    iget-object v1, p0, La6/f;->a:La6/p;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object v2, Lx5/b;->a:[B

    .line 304
    .line 305
    iget-object v2, v1, La6/p;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 306
    .line 307
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    iget-object v2, v1, La6/p;->b:Lz5/b;

    .line 311
    .line 312
    iget-object v1, v1, La6/p;->c:La6/o;

    .line 313
    .line 314
    const-wide/16 v3, 0x0

    .line 315
    .line 316
    invoke-virtual {v2, v1, v3, v4}, Lz5/b;->c(Lz5/a;J)V

    .line 317
    .line 318
    .line 319
    iget-object v1, p0, La6/f;->c:La6/j;

    .line 320
    .line 321
    invoke-virtual {v1, v5}, La6/j;->c(La6/n;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 322
    .line 323
    .line 324
    monitor-exit v5

    .line 325
    move/from16 v2, p5

    .line 326
    .line 327
    move-object v1, v5

    .line 328
    :goto_8
    invoke-virtual {v1, v2}, La6/n;->j(Z)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_d

    .line 333
    .line 334
    return-object v1

    .line 335
    :cond_d
    invoke-virtual {v1}, La6/n;->l()V

    .line 336
    .line 337
    .line 338
    iget-object v1, p0, La6/f;->i:Lw5/c0;

    .line 339
    .line 340
    if-nez v1, :cond_0

    .line 341
    .line 342
    iget-object v1, p0, La6/f;->d:Lp3/z;

    .line 343
    .line 344
    if-eqz v1, :cond_e

    .line 345
    .line 346
    invoke-virtual {v1}, Lp3/z;->e()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    goto :goto_9

    .line 351
    :cond_e
    const/4 v1, 0x1

    .line 352
    :goto_9
    if-nez v1, :cond_0

    .line 353
    .line 354
    iget-object v1, p0, La6/f;->e:La6/r;

    .line 355
    .line 356
    if-eqz v1, :cond_f

    .line 357
    .line 358
    invoke-virtual {v1}, La6/r;->a()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    :cond_f
    if-eqz v0, :cond_10

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :cond_10
    new-instance p1, Ljava/io/IOException;

    .line 367
    .line 368
    const-string p2, "exhausted all routes"

    .line 369
    .line 370
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw p1

    .line 374
    :catchall_1
    move-exception v0

    .line 375
    move-object p1, v0

    .line 376
    monitor-exit v5

    .line 377
    throw p1

    .line 378
    :catchall_2
    move-exception v0

    .line 379
    move-object p1, v0

    .line 380
    iget-object p2, p0, La6/f;->c:La6/j;

    .line 381
    .line 382
    iput-object v2, p2, La6/j;->v:La6/n;

    .line 383
    .line 384
    throw p1

    .line 385
    :cond_11
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 386
    .line 387
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 388
    .line 389
    .line 390
    throw p1

    .line 391
    :cond_12
    new-instance p1, Ljava/io/IOException;

    .line 392
    .line 393
    const-string p2, "Canceled"

    .line 394
    .line 395
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw p1

    .line 399
    :cond_13
    new-instance p1, Ljava/io/IOException;

    .line 400
    .line 401
    const-string p2, "Canceled"

    .line 402
    .line 403
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw p1
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
.end method

.method public final b(Lw5/p;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La6/f;->b:Lw5/a;

    .line 7
    .line 8
    iget-object v0, v0, Lw5/a;->h:Lw5/p;

    .line 9
    .line 10
    iget v1, p1, Lw5/p;->e:I

    .line 11
    .line 12
    iget v2, v0, Lw5/p;->e:I

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lw5/p;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v0, Lw5/p;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, La6/f;->i:Lw5/c0;

    .line 8
    .line 9
    instance-of v0, p1, Ld6/c0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Ld6/c0;

    .line 15
    .line 16
    iget v0, v0, Ld6/c0;->h:I

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, La6/f;->f:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, La6/f;->f:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of p1, p1, Ld6/a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, La6/f;->g:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, La6/f;->g:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget p1, p0, La6/f;->h:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, La6/f;->h:I

    .line 45
    .line 46
    return-void
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
