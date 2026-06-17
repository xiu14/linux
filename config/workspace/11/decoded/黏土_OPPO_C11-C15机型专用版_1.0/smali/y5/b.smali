.class public final Ly5/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lw5/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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
.end method


# virtual methods
.method public final a(Lb6/g;)Lw5/z;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lb6/g;->e:Landroidx/appcompat/widget/a0;

    .line 7
    .line 8
    const-string v2, "request"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lu2/u;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v1, v3}, Lu2/u;-><init>(Landroidx/appcompat/widget/a0;Lw5/z;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/appcompat/widget/a0;->b()Lw5/c;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-boolean v4, v4, Lw5/c;->j:Z

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    new-instance v2, Lu2/u;

    .line 28
    .line 29
    invoke-direct {v2, v3, v3}, Lu2/u;-><init>(Landroidx/appcompat/widget/a0;Lw5/z;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v4, v2, Lu2/u;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Landroidx/appcompat/widget/a0;

    .line 35
    .line 36
    iget-object v2, v2, Lu2/u;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lw5/z;

    .line 39
    .line 40
    const/16 v5, 0x14

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sget-object v7, Lx5/b;->c:Lb6/h;

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v13

    .line 58
    new-instance v2, Lw5/n;

    .line 59
    .line 60
    new-array v3, v6, [Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, [Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Lw5/n;-><init>([Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lw5/z;

    .line 72
    .line 73
    move-object v6, v2

    .line 74
    sget-object v2, Lw5/v;->j:Lw5/v;

    .line 75
    .line 76
    const-string v3, "Unsatisfiable Request (only-if-cached)"

    .line 77
    .line 78
    const/16 v4, 0x1f8

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const-wide/16 v11, -0x1

    .line 85
    .line 86
    const/4 v15, 0x0

    .line 87
    invoke-direct/range {v0 .. v15}, Lw5/z;-><init>(Landroidx/appcompat/widget/a0;Lw5/v;Ljava/lang/String;ILw5/m;Lw5/n;Lw5/b0;Lw5/z;Lw5/z;Lw5/z;JJLa6/e;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_1
    const-string v1, "cacheResponse"

    .line 92
    .line 93
    if-nez v4, :cond_2

    .line 94
    .line 95
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lw5/z;->c()Lw5/y;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v2}, Ly5/a;->a(Lw5/z;)Lw5/z;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v1, v2}, Lw5/y;->b(Ljava/lang/String;Lw5/z;)V

    .line 107
    .line 108
    .line 109
    iput-object v2, v0, Lw5/y;->i:Lw5/z;

    .line 110
    .line 111
    invoke-virtual {v0}, Lw5/y;->a()Lw5/z;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :cond_2
    invoke-virtual {v0, v4}, Lb6/g;->b(Landroidx/appcompat/widget/a0;)Lw5/z;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v4, "networkResponse"

    .line 121
    .line 122
    if-eqz v2, :cond_d

    .line 123
    .line 124
    iget v7, v0, Lw5/z;->k:I

    .line 125
    .line 126
    const/16 v8, 0x130

    .line 127
    .line 128
    if-ne v7, v8, :cond_c

    .line 129
    .line 130
    invoke-virtual {v2}, Lw5/z;->c()Lw5/y;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    iget-object v8, v2, Lw5/z;->m:Lw5/n;

    .line 135
    .line 136
    iget-object v9, v0, Lw5/z;->m:Lw5/n;

    .line 137
    .line 138
    new-instance v10, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8}, Lw5/n;->size()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    const/4 v11, 0x0

    .line 148
    :goto_0
    const-string v12, "value"

    .line 149
    .line 150
    const-string v13, "name"

    .line 151
    .line 152
    const-string v14, "Content-Type"

    .line 153
    .line 154
    const-string v15, "Content-Encoding"

    .line 155
    .line 156
    move-object/from16 v16, v3

    .line 157
    .line 158
    const-string v3, "Content-Length"

    .line 159
    .line 160
    if-ge v11, v5, :cond_8

    .line 161
    .line 162
    invoke-virtual {v8, v11}, Lw5/n;->g(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    move/from16 p1, v5

    .line 167
    .line 168
    invoke-virtual {v8, v11}, Lw5/n;->i(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    move-object/from16 v17, v8

    .line 173
    .line 174
    const-string v8, "Warning"

    .line 175
    .line 176
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eqz v8, :cond_3

    .line 181
    .line 182
    const-string v8, "1"

    .line 183
    .line 184
    move/from16 v18, v11

    .line 185
    .line 186
    const/4 v11, 0x0

    .line 187
    invoke-static {v5, v8, v11}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-eqz v8, :cond_4

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_3
    move/from16 v18, v11

    .line 195
    .line 196
    :cond_4
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-nez v3, :cond_6

    .line 201
    .line 202
    invoke-virtual {v15, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_6

    .line 207
    .line 208
    invoke-virtual {v14, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_5

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    invoke-static {v6}, Ly5/a;->b(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_6

    .line 220
    .line 221
    invoke-virtual {v9, v6}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    if-nez v3, :cond_7

    .line 226
    .line 227
    :cond_6
    :goto_1
    invoke-static {v6, v13}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v5, v12}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    invoke-static {v5}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :cond_7
    :goto_2
    add-int/lit8 v11, v18, 0x1

    .line 248
    .line 249
    move/from16 v5, p1

    .line 250
    .line 251
    move-object/from16 v3, v16

    .line 252
    .line 253
    move-object/from16 v8, v17

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    goto :goto_0

    .line 257
    :cond_8
    invoke-virtual {v9}, Lw5/n;->size()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    const/4 v11, 0x0

    .line 262
    :goto_3
    if-ge v11, v5, :cond_b

    .line 263
    .line 264
    invoke-virtual {v9, v11}, Lw5/n;->g(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    if-nez v8, :cond_a

    .line 273
    .line 274
    invoke-virtual {v15, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    if-nez v8, :cond_a

    .line 279
    .line 280
    invoke-virtual {v14, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    if-eqz v8, :cond_9

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_9
    invoke-static {v6}, Ly5/a;->b(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    if-eqz v8, :cond_a

    .line 292
    .line 293
    invoke-virtual {v9, v11}, Lw5/n;->i(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-static {v6, v13}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v8, v12}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    invoke-static {v8}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_a
    :goto_4
    add-int/lit8 v11, v11, 0x1

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_b
    new-instance v3, Lw5/n;

    .line 321
    .line 322
    const/4 v11, 0x0

    .line 323
    new-array v5, v11, [Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    check-cast v5, [Ljava/lang/String;

    .line 330
    .line 331
    invoke-direct {v3, v5}, Lw5/n;-><init>([Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Lw5/n;->h()Lp3/j;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    iput-object v3, v7, Lw5/y;->f:Lp3/j;

    .line 339
    .line 340
    iget-wide v5, v0, Lw5/z;->r:J

    .line 341
    .line 342
    iput-wide v5, v7, Lw5/y;->k:J

    .line 343
    .line 344
    iget-wide v5, v0, Lw5/z;->s:J

    .line 345
    .line 346
    iput-wide v5, v7, Lw5/y;->l:J

    .line 347
    .line 348
    invoke-static {v2}, Ly5/a;->a(Lw5/z;)Lw5/z;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v1, v2}, Lw5/y;->b(Ljava/lang/String;Lw5/z;)V

    .line 353
    .line 354
    .line 355
    iput-object v2, v7, Lw5/y;->i:Lw5/z;

    .line 356
    .line 357
    invoke-static {v0}, Ly5/a;->a(Lw5/z;)Lw5/z;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-static {v4, v1}, Lw5/y;->b(Ljava/lang/String;Lw5/z;)V

    .line 362
    .line 363
    .line 364
    iput-object v1, v7, Lw5/y;->h:Lw5/z;

    .line 365
    .line 366
    invoke-virtual {v7}, Lw5/y;->a()Lw5/z;

    .line 367
    .line 368
    .line 369
    iget-object v0, v0, Lw5/z;->n:Lw5/b0;

    .line 370
    .line 371
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, Lw5/b0;->close()V

    .line 375
    .line 376
    .line 377
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    throw v16

    .line 381
    :cond_c
    iget-object v3, v2, Lw5/z;->n:Lw5/b0;

    .line 382
    .line 383
    if-eqz v3, :cond_d

    .line 384
    .line 385
    invoke-static {v3}, Lx5/b;->c(Ljava/io/Closeable;)V

    .line 386
    .line 387
    .line 388
    :cond_d
    invoke-virtual {v0}, Lw5/z;->c()Lw5/y;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v2}, Ly5/a;->a(Lw5/z;)Lw5/z;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-static {v1, v2}, Lw5/y;->b(Ljava/lang/String;Lw5/z;)V

    .line 397
    .line 398
    .line 399
    iput-object v2, v3, Lw5/y;->i:Lw5/z;

    .line 400
    .line 401
    invoke-static {v0}, Ly5/a;->a(Lw5/z;)Lw5/z;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v4, v0}, Lw5/y;->b(Ljava/lang/String;Lw5/z;)V

    .line 406
    .line 407
    .line 408
    iput-object v0, v3, Lw5/y;->h:Lw5/z;

    .line 409
    .line 410
    invoke-virtual {v3}, Lw5/y;->a()Lw5/z;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    return-object v0
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
