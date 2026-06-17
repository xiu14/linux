.class public final La6/m;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La6/m;->h:I

    .line 2
    .line 3
    iput-object p2, p0, La6/m;->i:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La6/m;->h:I

    .line 4
    .line 5
    sget-object v2, Lp4/k;->a:Lp4/k;

    .line 6
    .line 7
    iget-object v3, v1, La6/m;->i:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/util/List;

    .line 13
    .line 14
    return-object v3

    .line 15
    :pswitch_0
    check-cast v3, Landroidx/work/impl/WorkDatabase;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v3, v0, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 24
    .line 25
    .line 26
    iget-object v4, v0, Lu2/s;->m:Lu2/h;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/room/a1;->a()Lz1/i;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    :try_start_0
    invoke-virtual {v3}, Landroidx/room/r0;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-interface {v5}, Lz1/i;->y()I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    :try_start_2
    invoke-virtual {v3}, Landroidx/room/r0;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v5}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception v0

    .line 51
    :try_start_3
    invoke-virtual {v3}, Landroidx/room/r0;->endTransaction()V

    .line 52
    .line 53
    .line 54
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    :goto_0
    invoke-virtual {v4, v5}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :pswitch_1
    check-cast v3, Lm2/r;

    .line 60
    .line 61
    iget-object v0, v3, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 62
    .line 63
    const-string v4, "workManagerImpl.workDatabase"

    .line 64
    .line 65
    invoke-static {v0, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Landroidx/appcompat/app/z;

    .line 69
    .line 70
    const/16 v5, 0xe

    .line 71
    .line 72
    invoke-direct {v4, v5, v0, v3}, Landroidx/appcompat/app/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Landroidx/room/r0;->runInTransaction(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :pswitch_2
    check-cast v3, [Lq5/g;

    .line 80
    .line 81
    array-length v0, v3

    .line 82
    new-array v0, v0, [Lq2/c;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_3
    check-cast v3, Lk6/g;

    .line 86
    .line 87
    iget-object v0, v3, Lk6/g;->b:Ljava/lang/ClassLoader;

    .line 88
    .line 89
    iget-object v2, v3, Lk6/g;->c:Lj6/o;

    .line 90
    .line 91
    const-string v3, ""

    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "getResources(...)"

    .line 98
    .line 99
    invoke-static {v3, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v5, "list(...)"

    .line 107
    .line 108
    invoke-static {v3, v5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v6, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    const/4 v8, 0x0

    .line 121
    const/4 v9, 0x0

    .line 122
    :cond_0
    :goto_1
    if-ge v9, v7, :cond_2

    .line 123
    .line 124
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    add-int/lit8 v9, v9, 0x1

    .line 129
    .line 130
    check-cast v11, Ljava/net/URL;

    .line 131
    .line 132
    invoke-static {v11}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    const-string v13, "file"

    .line 140
    .line 141
    invoke-static {v12, v13}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    if-nez v12, :cond_1

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    goto :goto_2

    .line 149
    :cond_1
    sget-object v10, Lj6/z;->i:Ljava/lang/String;

    .line 150
    .line 151
    new-instance v10, Ljava/io/File;

    .line 152
    .line 153
    invoke-virtual {v11}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v10}, La1/d;->p(Ljava/io/File;)Lj6/z;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    new-instance v11, Lp4/f;

    .line 165
    .line 166
    invoke-direct {v11, v2, v10}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object v10, v11

    .line 170
    :goto_2
    if-eqz v10, :cond_0

    .line 171
    .line 172
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    const-string v3, "META-INF/MANIFEST.MF"

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v3, v5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v4, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const/4 v0, 0x0

    .line 202
    :goto_3
    if-ge v0, v5, :cond_16

    .line 203
    .line 204
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    add-int/lit8 v9, v0, 0x1

    .line 209
    .line 210
    check-cast v7, Ljava/net/URL;

    .line 211
    .line 212
    invoke-static {v7}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v7, "toString(...)"

    .line 220
    .line 221
    invoke-static {v0, v7}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const-string v7, "jar:file:"

    .line 225
    .line 226
    invoke-static {v0, v7, v8}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-nez v7, :cond_3

    .line 231
    .line 232
    :goto_4
    move/from16 v18, v9

    .line 233
    .line 234
    const/4 v7, 0x0

    .line 235
    goto/16 :goto_16

    .line 236
    .line 237
    :cond_3
    const-string v7, "!"

    .line 238
    .line 239
    const/4 v11, 0x6

    .line 240
    invoke-static {v0, v7, v11}, Ll5/e;->v0(Ljava/lang/CharSequence;Ljava/lang/String;I)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    const/4 v11, -0x1

    .line 245
    if-ne v7, v11, :cond_4

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_4
    sget-object v11, Lj6/z;->i:Ljava/lang/String;

    .line 249
    .line 250
    new-instance v11, Ljava/io/File;

    .line 251
    .line 252
    const/4 v12, 0x4

    .line 253
    invoke-virtual {v0, v12, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const-string v7, "substring(...)"

    .line 258
    .line 259
    invoke-static {v0, v7}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v11}, La1/d;->p(Ljava/io/File;)Lj6/z;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    const-string v0, "not a zip: size="

    .line 274
    .line 275
    invoke-virtual {v2, v7}, Lj6/o;->j(Lj6/z;)Lj6/u;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    :try_start_4
    invoke-virtual {v11}, Lj6/u;->size()J

    .line 280
    .line 281
    .line 282
    move-result-wide v12

    .line 283
    const/16 v14, 0x16

    .line 284
    .line 285
    int-to-long v14, v14

    .line 286
    sub-long/2addr v12, v14

    .line 287
    const-wide/16 v14, 0x0

    .line 288
    .line 289
    cmp-long v16, v12, v14

    .line 290
    .line 291
    if-ltz v16, :cond_14

    .line 292
    .line 293
    const-wide/32 v16, 0x10000

    .line 294
    .line 295
    .line 296
    move/from16 v18, v9

    .line 297
    .line 298
    sub-long v8, v12, v16

    .line 299
    .line 300
    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 301
    .line 302
    .line 303
    move-result-wide v8

    .line 304
    :goto_5
    invoke-virtual {v11, v12, v13}, Lj6/u;->a(J)Lj6/m;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 309
    .line 310
    .line 311
    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 312
    :try_start_5
    invoke-virtual {v10}, Lj6/c0;->c()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    move-wide/from16 v19, v14

    .line 317
    .line 318
    const v14, 0x6054b50

    .line 319
    .line 320
    .line 321
    if-ne v0, v14, :cond_12

    .line 322
    .line 323
    invoke-virtual {v10}, Lj6/c0;->m()S

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    const v8, 0xffff

    .line 328
    .line 329
    .line 330
    and-int/2addr v0, v8

    .line 331
    invoke-virtual {v10}, Lj6/c0;->m()S

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    and-int/2addr v9, v8

    .line 336
    invoke-virtual {v10}, Lj6/c0;->m()S

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    and-int/2addr v14, v8

    .line 341
    int-to-long v14, v14

    .line 342
    invoke-virtual {v10}, Lj6/c0;->m()S

    .line 343
    .line 344
    .line 345
    move-result v17
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_e

    .line 346
    const v21, 0xffff

    .line 347
    .line 348
    .line 349
    and-int v8, v17, v21

    .line 350
    .line 351
    move/from16 v17, v0

    .line 352
    .line 353
    int-to-long v0, v8

    .line 354
    const-string v8, "unsupported zip: spanned"

    .line 355
    .line 356
    cmp-long v22, v14, v0

    .line 357
    .line 358
    if-nez v22, :cond_11

    .line 359
    .line 360
    if-nez v17, :cond_11

    .line 361
    .line 362
    if-nez v9, :cond_11

    .line 363
    .line 364
    const-wide/16 v0, 0x4

    .line 365
    .line 366
    :try_start_6
    invoke-virtual {v10, v0, v1}, Lj6/c0;->skip(J)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v10}, Lj6/c0;->c()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    int-to-long v0, v0

    .line 374
    const-wide v22, 0xffffffffL

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    and-long v24, v0, v22

    .line 380
    .line 381
    invoke-virtual {v10}, Lj6/c0;->m()S

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    and-int v31, v0, v21

    .line 386
    .line 387
    new-instance v21, Lk6/d;

    .line 388
    .line 389
    move-wide/from16 v22, v14

    .line 390
    .line 391
    move/from16 v26, v31

    .line 392
    .line 393
    invoke-direct/range {v21 .. v26}, Lk6/d;-><init>(JJI)V

    .line 394
    .line 395
    .line 396
    move/from16 v0, v26

    .line 397
    .line 398
    int-to-long v14, v0

    .line 399
    invoke-virtual {v10, v14, v15}, Lj6/c0;->u(J)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_e

    .line 400
    .line 401
    .line 402
    :try_start_7
    invoke-virtual {v10}, Lj6/c0;->close()V

    .line 403
    .line 404
    .line 405
    const/16 v1, 0x14

    .line 406
    .line 407
    int-to-long v9, v1

    .line 408
    sub-long/2addr v12, v9

    .line 409
    cmp-long v1, v12, v19

    .line 410
    .line 411
    if-lez v1, :cond_a

    .line 412
    .line 413
    invoke-virtual {v11, v12, v13}, Lj6/u;->a(J)Lj6/m;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-static {v1}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 418
    .line 419
    .line 420
    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 421
    :try_start_8
    invoke-virtual {v1}, Lj6/c0;->c()I

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    const v10, 0x7064b50

    .line 426
    .line 427
    .line 428
    if-ne v9, v10, :cond_9

    .line 429
    .line 430
    invoke-virtual {v1}, Lj6/c0;->c()I

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    invoke-virtual {v1}, Lj6/c0;->e()J

    .line 435
    .line 436
    .line 437
    move-result-wide v12

    .line 438
    invoke-virtual {v1}, Lj6/c0;->c()I

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    const/4 v14, 0x1

    .line 443
    if-ne v10, v14, :cond_8

    .line 444
    .line 445
    if-nez v9, :cond_8

    .line 446
    .line 447
    invoke-virtual {v11, v12, v13}, Lj6/u;->a(J)Lj6/m;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-static {v9}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 452
    .line 453
    .line 454
    move-result-object v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 455
    :try_start_9
    invoke-virtual {v9}, Lj6/c0;->c()I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    const v12, 0x6064b50

    .line 460
    .line 461
    .line 462
    if-ne v10, v12, :cond_6

    .line 463
    .line 464
    const-wide/16 v12, 0xc

    .line 465
    .line 466
    invoke-virtual {v9, v12, v13}, Lj6/c0;->skip(J)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v9}, Lj6/c0;->c()I

    .line 470
    .line 471
    .line 472
    move-result v10

    .line 473
    invoke-virtual {v9}, Lj6/c0;->c()I

    .line 474
    .line 475
    .line 476
    move-result v12

    .line 477
    invoke-virtual {v9}, Lj6/c0;->e()J

    .line 478
    .line 479
    .line 480
    move-result-wide v27

    .line 481
    invoke-virtual {v9}, Lj6/c0;->e()J

    .line 482
    .line 483
    .line 484
    move-result-wide v13

    .line 485
    cmp-long v15, v27, v13

    .line 486
    .line 487
    if-nez v15, :cond_5

    .line 488
    .line 489
    if-nez v10, :cond_5

    .line 490
    .line 491
    if-nez v12, :cond_5

    .line 492
    .line 493
    const-wide/16 v12, 0x8

    .line 494
    .line 495
    invoke-virtual {v9, v12, v13}, Lj6/c0;->skip(J)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v9}, Lj6/c0;->e()J

    .line 499
    .line 500
    .line 501
    move-result-wide v29

    .line 502
    new-instance v26, Lk6/d;

    .line 503
    .line 504
    move/from16 v31, v0

    .line 505
    .line 506
    invoke-direct/range {v26 .. v31}, Lk6/d;-><init>(JJI)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 507
    .line 508
    .line 509
    :try_start_a
    invoke-virtual {v9}, Lj6/c0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 510
    .line 511
    .line 512
    const/4 v0, 0x0

    .line 513
    goto :goto_6

    .line 514
    :catchall_2
    move-exception v0

    .line 515
    :goto_6
    move-object/from16 v21, v26

    .line 516
    .line 517
    goto :goto_a

    .line 518
    :cond_5
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 519
    .line 520
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    throw v0

    .line 524
    :goto_7
    move-object v8, v0

    .line 525
    goto :goto_8

    .line 526
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 527
    .line 528
    new-instance v8, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    const-string v13, "bad zip: expected "

    .line 534
    .line 535
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-static {v12}, Lk6/b;->c(I)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v12

    .line 542
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    const-string v12, " but was "

    .line 546
    .line 547
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-static {v10}, Lk6/b;->c(I)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 565
    :catchall_3
    move-exception v0

    .line 566
    goto :goto_7

    .line 567
    :goto_8
    :try_start_c
    invoke-virtual {v9}, Lj6/c0;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 568
    .line 569
    .line 570
    goto :goto_9

    .line 571
    :catchall_4
    move-exception v0

    .line 572
    :try_start_d
    invoke-static {v8, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 573
    .line 574
    .line 575
    :goto_9
    move-object v0, v8

    .line 576
    :goto_a
    if-nez v0, :cond_7

    .line 577
    .line 578
    goto :goto_b

    .line 579
    :cond_7
    throw v0

    .line 580
    :catchall_5
    move-exception v0

    .line 581
    move-object v8, v0

    .line 582
    goto :goto_c

    .line 583
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 584
    .line 585
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 589
    :cond_9
    :goto_b
    :try_start_e
    invoke-virtual {v1}, Lj6/c0;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 590
    .line 591
    .line 592
    const/4 v0, 0x0

    .line 593
    goto :goto_e

    .line 594
    :catchall_6
    move-exception v0

    .line 595
    goto :goto_e

    .line 596
    :goto_c
    :try_start_f
    invoke-virtual {v1}, Lj6/c0;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 597
    .line 598
    .line 599
    goto :goto_d

    .line 600
    :catchall_7
    move-exception v0

    .line 601
    :try_start_10
    invoke-static {v8, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 602
    .line 603
    .line 604
    :goto_d
    move-object v0, v8

    .line 605
    :goto_e
    if-nez v0, :cond_b

    .line 606
    .line 607
    :cond_a
    move-object/from16 v0, v21

    .line 608
    .line 609
    goto :goto_f

    .line 610
    :cond_b
    throw v0

    .line 611
    :catchall_8
    move-exception v0

    .line 612
    move-object v1, v0

    .line 613
    goto/16 :goto_18

    .line 614
    .line 615
    :goto_f
    new-instance v1, Ljava/util/ArrayList;

    .line 616
    .line 617
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 618
    .line 619
    .line 620
    iget-wide v8, v0, Lk6/d;->b:J

    .line 621
    .line 622
    invoke-virtual {v11, v8, v9}, Lj6/u;->a(J)Lj6/m;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    invoke-static {v8}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 627
    .line 628
    .line 629
    move-result-object v8
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 630
    :try_start_11
    iget-wide v9, v0, Lk6/d;->a:J

    .line 631
    .line 632
    move-wide/from16 v14, v19

    .line 633
    .line 634
    :goto_10
    cmp-long v12, v14, v9

    .line 635
    .line 636
    if-gez v12, :cond_e

    .line 637
    .line 638
    invoke-static {v8}, Lk6/b;->d(Lj6/c0;)Lk6/h;

    .line 639
    .line 640
    .line 641
    move-result-object v12
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 642
    move-object v13, v8

    .line 643
    move-wide/from16 v21, v9

    .line 644
    .line 645
    :try_start_12
    iget-wide v8, v12, Lk6/h;->h:J

    .line 646
    .line 647
    move-wide/from16 v19, v8

    .line 648
    .line 649
    iget-wide v8, v0, Lk6/d;->b:J

    .line 650
    .line 651
    cmp-long v10, v19, v8

    .line 652
    .line 653
    if-gez v10, :cond_d

    .line 654
    .line 655
    sget-object v8, Lk6/g;->e:Lj6/z;

    .line 656
    .line 657
    iget-object v8, v12, Lk6/h;->a:Lj6/z;

    .line 658
    .line 659
    invoke-static {v8}, Lk6/f;->a(Lj6/z;)Z

    .line 660
    .line 661
    .line 662
    move-result v8

    .line 663
    if-eqz v8, :cond_c

    .line 664
    .line 665
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    goto :goto_12

    .line 669
    :catchall_9
    move-exception v0

    .line 670
    :goto_11
    move-object v8, v0

    .line 671
    goto :goto_13

    .line 672
    :cond_c
    :goto_12
    const-wide/16 v8, 0x1

    .line 673
    .line 674
    add-long/2addr v14, v8

    .line 675
    move-object v8, v13

    .line 676
    move-wide/from16 v9, v21

    .line 677
    .line 678
    goto :goto_10

    .line 679
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 680
    .line 681
    const-string v8, "bad zip: local file header offset >= central directory offset"

    .line 682
    .line 683
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 687
    :catchall_a
    move-exception v0

    .line 688
    move-object v13, v8

    .line 689
    goto :goto_11

    .line 690
    :cond_e
    move-object v13, v8

    .line 691
    :try_start_13
    invoke-virtual {v13}, Lj6/c0;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 692
    .line 693
    .line 694
    const/4 v0, 0x0

    .line 695
    goto :goto_15

    .line 696
    :catchall_b
    move-exception v0

    .line 697
    goto :goto_15

    .line 698
    :goto_13
    :try_start_14
    invoke-virtual {v13}, Lj6/c0;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 699
    .line 700
    .line 701
    goto :goto_14

    .line 702
    :catchall_c
    move-exception v0

    .line 703
    :try_start_15
    invoke-static {v8, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    :goto_14
    move-object v0, v8

    .line 707
    :goto_15
    if-nez v0, :cond_10

    .line 708
    .line 709
    invoke-static {v1}, Lk6/b;->b(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    new-instance v1, Lj6/l0;

    .line 714
    .line 715
    invoke-direct {v1, v7, v2, v0}, Lj6/l0;-><init>(Lj6/z;Lj6/o;Ljava/util/LinkedHashMap;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    .line 716
    .line 717
    .line 718
    :try_start_16
    invoke-virtual {v11}, Lj6/u;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 719
    .line 720
    .line 721
    :catchall_d
    sget-object v0, Lk6/g;->e:Lj6/z;

    .line 722
    .line 723
    new-instance v7, Lp4/f;

    .line 724
    .line 725
    invoke-direct {v7, v1, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    :goto_16
    if-eqz v7, :cond_f

    .line 729
    .line 730
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    :cond_f
    move-object/from16 v1, p0

    .line 734
    .line 735
    move/from16 v0, v18

    .line 736
    .line 737
    const/4 v8, 0x0

    .line 738
    goto/16 :goto_3

    .line 739
    .line 740
    :cond_10
    :try_start_17
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 741
    :catchall_e
    move-exception v0

    .line 742
    goto :goto_17

    .line 743
    :cond_11
    :try_start_18
    new-instance v0, Ljava/io/IOException;

    .line 744
    .line 745
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    .line 749
    :cond_12
    :try_start_19
    invoke-virtual {v10}, Lj6/c0;->close()V

    .line 750
    .line 751
    .line 752
    const-wide/16 v0, -0x1

    .line 753
    .line 754
    add-long/2addr v12, v0

    .line 755
    cmp-long v0, v12, v8

    .line 756
    .line 757
    if-ltz v0, :cond_13

    .line 758
    .line 759
    move-object/from16 v1, p0

    .line 760
    .line 761
    move-wide/from16 v14, v19

    .line 762
    .line 763
    goto/16 :goto_5

    .line 764
    .line 765
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 766
    .line 767
    const-string v1, "not a zip: end of central directory signature not found"

    .line 768
    .line 769
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    throw v0

    .line 773
    :goto_17
    invoke-virtual {v10}, Lj6/c0;->close()V

    .line 774
    .line 775
    .line 776
    throw v0

    .line 777
    :cond_14
    new-instance v1, Ljava/io/IOException;

    .line 778
    .line 779
    new-instance v2, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v11}, Lj6/u;->size()J

    .line 785
    .line 786
    .line 787
    move-result-wide v3

    .line 788
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    .line 799
    :goto_18
    if-eqz v11, :cond_15

    .line 800
    .line 801
    :try_start_1a
    invoke-virtual {v11}, Lj6/u;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    .line 802
    .line 803
    .line 804
    goto :goto_19

    .line 805
    :catchall_f
    move-exception v0

    .line 806
    invoke-static {v1, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 807
    .line 808
    .line 809
    :cond_15
    :goto_19
    throw v1

    .line 810
    :cond_16
    invoke-static {v6, v4}, Lq4/i;->z0(Ljava/util/List;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    return-object v0

    .line 815
    :pswitch_4
    check-cast v3, La6/n;

    .line 816
    .line 817
    iget-object v0, v3, La6/n;->e:Lw5/m;

    .line 818
    .line 819
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0}, Lw5/m;->a()Ljava/util/List;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    new-instance v1, Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-static {v0}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 833
    .line 834
    .line 835
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    if-eqz v2, :cond_17

    .line 844
    .line 845
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    check-cast v2, Ljava/security/cert/Certificate;

    .line 850
    .line 851
    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 852
    .line 853
    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 857
    .line 858
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    goto :goto_1a

    .line 862
    :cond_17
    return-object v1

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
