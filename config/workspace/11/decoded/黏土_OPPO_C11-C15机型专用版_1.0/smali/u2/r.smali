.class public final Lu2/r;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/room/w0;

.field public final synthetic c:Lu2/s;


# direct methods
.method public synthetic constructor <init>(Lu2/s;Landroidx/room/w0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu2/r;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu2/r;->c:Lu2/s;

    .line 4
    .line 5
    iput-object p2, p0, Lu2/r;->b:Landroidx/room/w0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final call()Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lu2/r;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lu2/r;->c:Lu2/s;

    .line 9
    .line 10
    iget-object v0, v0, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 11
    .line 12
    iget-object v2, v1, Lu2/r;->b:Landroidx/room/w0;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v0, v2, v3}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :pswitch_0
    iget-object v0, v1, Lu2/r;->c:Lu2/s;

    .line 50
    .line 51
    iget-object v2, v0, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroidx/room/r0;->beginTransaction()V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iget-object v3, v1, Lu2/r;->b:Landroidx/room/w0;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-static {v2, v3, v4}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 60
    .line 61
    .line 62
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 63
    :try_start_2
    new-instance v5, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v6, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    const/4 v8, 0x0

    .line 78
    if-eqz v7, :cond_4

    .line 79
    .line 80
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-nez v9, :cond_3

    .line 89
    .line 90
    new-instance v9, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    goto/16 :goto_9

    .line 101
    .line 102
    :cond_3
    :goto_3
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_2

    .line 111
    .line 112
    new-instance v8, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    const/4 v7, -0x1

    .line 122
    invoke-interface {v3, v7}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v5}, Lu2/s;->b(Ljava/util/HashMap;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v6}, Lu2/s;->a(Ljava/util/HashMap;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    :goto_4
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_9

    .line 145
    .line 146
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    invoke-static {v7}, Le6/d;->x(I)I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    const/4 v7, 0x2

    .line 159
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-static {v7}, Ll2/h;->a([B)Ll2/h;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const/4 v7, 0x3

    .line 168
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 169
    .line 170
    .line 171
    move-result v20

    .line 172
    const/4 v7, 0x4

    .line 173
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 174
    .line 175
    .line 176
    move-result v27

    .line 177
    const/16 v7, 0xe

    .line 178
    .line 179
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 180
    .line 181
    .line 182
    move-result-wide v13

    .line 183
    const/16 v7, 0xf

    .line 184
    .line 185
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v15

    .line 189
    const/16 v7, 0x10

    .line 190
    .line 191
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 192
    .line 193
    .line 194
    move-result-wide v17

    .line 195
    const/16 v7, 0x11

    .line 196
    .line 197
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    invoke-static {v7}, Le6/d;->u(I)I

    .line 202
    .line 203
    .line 204
    move-result v21

    .line 205
    const/16 v7, 0x12

    .line 206
    .line 207
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v22

    .line 211
    const/16 v7, 0x13

    .line 212
    .line 213
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 214
    .line 215
    .line 216
    move-result-wide v24

    .line 217
    const/16 v7, 0x14

    .line 218
    .line 219
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 220
    .line 221
    .line 222
    move-result v26

    .line 223
    const/16 v7, 0x15

    .line 224
    .line 225
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 226
    .line 227
    .line 228
    move-result-wide v28

    .line 229
    const/16 v7, 0x16

    .line 230
    .line 231
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 232
    .line 233
    .line 234
    move-result v30

    .line 235
    const/4 v7, 0x5

    .line 236
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    invoke-static {v7}, Le6/d;->v(I)I

    .line 241
    .line 242
    .line 243
    move-result v33

    .line 244
    const/4 v7, 0x6

    .line 245
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-static {v7}, Le6/d;->W([B)Lv2/g;

    .line 250
    .line 251
    .line 252
    move-result-object v32

    .line 253
    const/4 v7, 0x7

    .line 254
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_5

    .line 259
    .line 260
    const/16 v34, 0x1

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_5
    const/16 v34, 0x0

    .line 264
    .line 265
    :goto_5
    const/16 v7, 0x8

    .line 266
    .line 267
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-eqz v7, :cond_6

    .line 272
    .line 273
    const/16 v35, 0x1

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_6
    const/16 v35, 0x0

    .line 277
    .line 278
    :goto_6
    const/16 v7, 0x9

    .line 279
    .line 280
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-eqz v7, :cond_7

    .line 285
    .line 286
    const/16 v36, 0x1

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_7
    const/16 v36, 0x0

    .line 290
    .line 291
    :goto_7
    const/16 v7, 0xa

    .line 292
    .line 293
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-eqz v7, :cond_8

    .line 298
    .line 299
    const/16 v37, 0x1

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_8
    const/16 v37, 0x0

    .line 303
    .line 304
    :goto_8
    const/16 v7, 0xb

    .line 305
    .line 306
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 307
    .line 308
    .line 309
    move-result-wide v38

    .line 310
    const/16 v7, 0xc

    .line 311
    .line 312
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v40

    .line 316
    const/16 v7, 0xd

    .line 317
    .line 318
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-static {v7}, Le6/d;->d([B)Ljava/util/LinkedHashSet;

    .line 323
    .line 324
    .line 325
    move-result-object v42

    .line 326
    new-instance v31, Ll2/d;

    .line 327
    .line 328
    invoke-direct/range {v31 .. v42}, Ll2/d;-><init>(Lv2/g;IZZZZJJLjava/util/Set;)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    check-cast v7, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    move-object/from16 v32, v9

    .line 350
    .line 351
    check-cast v32, Ljava/util/ArrayList;

    .line 352
    .line 353
    new-instance v9, Lu2/o;

    .line 354
    .line 355
    move-object/from16 v19, v31

    .line 356
    .line 357
    move-object/from16 v31, v7

    .line 358
    .line 359
    invoke-direct/range {v9 .. v32}, Lu2/o;-><init>(Ljava/lang/String;ILl2/h;JJJLl2/d;IIJJIIJILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto/16 :goto_4

    .line 366
    .line 367
    :cond_9
    invoke-virtual {v2}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 368
    .line 369
    .line 370
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    .line 374
    .line 375
    .line 376
    return-object v0

    .line 377
    :catchall_2
    move-exception v0

    .line 378
    goto :goto_a

    .line 379
    :goto_9
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 380
    .line 381
    .line 382
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 383
    :goto_a
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    .line 384
    .line 385
    .line 386
    throw v0

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
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
.end method

.method public final finalize()V
    .locals 1

    .line 1
    iget v0, p0, Lu2/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu2/r;->b:Landroidx/room/w0;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/w0;->b()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lu2/r;->b:Landroidx/room/w0;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/room/w0;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
