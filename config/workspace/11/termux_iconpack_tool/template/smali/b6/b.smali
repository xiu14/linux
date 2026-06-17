.class public final Lb6/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lw5/q;


# virtual methods
.method public final a(Lb6/g;)Lw5/z;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "Connection"

    .line 4
    .line 5
    const-string v2, "close"

    .line 6
    .line 7
    const-string v3, "HTTP "

    .line 8
    .line 9
    iget-object v4, v0, Lb6/g;->d:La6/e;

    .line 10
    .line 11
    invoke-static {v4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, La6/e;->a:La6/j;

    .line 15
    .line 16
    iget-object v6, v4, La6/e;->c:Lb6/e;

    .line 17
    .line 18
    iget-object v7, v4, La6/e;->e:La6/n;

    .line 19
    .line 20
    iget-object v8, v0, Lb6/g;->e:Landroidx/appcompat/widget/a0;

    .line 21
    .line 22
    iget-object v0, v8, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lw5/x;

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v9

    .line 30
    const/4 v12, 0x0

    .line 31
    :try_start_0
    invoke-interface {v6, v8}, Lb6/e;->e(Landroidx/appcompat/widget/a0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 32
    .line 33
    .line 34
    :try_start_1
    iget-object v13, v8, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v13, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v13}, Le6/d;->L(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    const/4 v14, 0x1

    .line 43
    if-eqz v13, :cond_3

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const-string v13, "100-continue"

    .line 48
    .line 49
    const-string v15, "Expect"

    .line 50
    .line 51
    iget-object v11, v8, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v11, Lw5/n;

    .line 54
    .line 55
    invoke-virtual {v11, v15}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual {v13, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v11
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    :try_start_2
    invoke-interface {v6}, Lb6/e;->d()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 66
    .line 67
    .line 68
    :try_start_3
    invoke-virtual {v4, v14}, La6/e;->b(Z)Lw5/y;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object v11, v12

    .line 75
    goto :goto_3

    .line 76
    :catch_1
    move-exception v0

    .line 77
    invoke-virtual {v4, v0}, La6/e;->c(Ljava/io/IOException;)V

    .line 78
    .line 79
    .line 80
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 81
    :cond_0
    move-object v11, v12

    .line 82
    :goto_0
    if-nez v11, :cond_1

    .line 83
    .line 84
    :try_start_4
    iget-object v5, v8, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Lw5/x;

    .line 87
    .line 88
    invoke-static {v5}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Lw5/x;->a()J

    .line 92
    .line 93
    .line 94
    move-result-wide v13

    .line 95
    invoke-interface {v6, v8, v13, v14}, Lb6/e;->b(Landroidx/appcompat/widget/a0;J)Lj6/g0;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    new-instance v15, La6/c;

    .line 100
    .line 101
    invoke-direct {v15, v4, v5, v13, v14}, La6/c;-><init>(La6/e;Lj6/g0;J)V

    .line 102
    .line 103
    .line 104
    invoke-static {v15}, Le6/l;->c(Lj6/g0;)Lj6/b0;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v0, v5}, Lw5/x;->c(Lj6/j;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Lj6/b0;->close()V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catch_2
    move-exception v0

    .line 116
    goto :goto_3

    .line 117
    :cond_1
    const/4 v13, 0x0

    .line 118
    invoke-virtual {v5, v4, v14, v13, v12}, La6/j;->i(La6/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 119
    .line 120
    .line 121
    iget-object v0, v7, La6/n;->g:Ld6/o;

    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    const/4 v14, 0x0

    .line 127
    :goto_1
    if-nez v14, :cond_4

    .line 128
    .line 129
    invoke-interface {v6}, Lb6/e;->h()La6/n;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, La6/n;->l()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    const/4 v13, 0x0

    .line 138
    :try_start_5
    invoke-virtual {v5, v4, v14, v13, v12}, La6/j;->i(La6/e;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 139
    .line 140
    .line 141
    move-object v11, v12

    .line 142
    :cond_4
    :goto_2
    :try_start_6
    invoke-interface {v6}, Lb6/e;->c()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 143
    .line 144
    .line 145
    move-object v5, v12

    .line 146
    goto :goto_4

    .line 147
    :catch_3
    move-exception v0

    .line 148
    :try_start_7
    invoke-virtual {v4, v0}, La6/e;->c(Ljava/io/IOException;)V

    .line 149
    .line 150
    .line 151
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 152
    :catch_4
    move-exception v0

    .line 153
    :try_start_8
    invoke-virtual {v4, v0}, La6/e;->c(Ljava/io/IOException;)V

    .line 154
    .line 155
    .line 156
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 157
    :goto_3
    instance-of v5, v0, Ld6/a;

    .line 158
    .line 159
    if-nez v5, :cond_10

    .line 160
    .line 161
    iget-boolean v5, v4, La6/e;->d:Z

    .line 162
    .line 163
    if-eqz v5, :cond_f

    .line 164
    .line 165
    move-object v5, v0

    .line 166
    :goto_4
    if-nez v11, :cond_5

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    :try_start_9
    invoke-virtual {v4, v13}, La6/e;->b(Z)Lw5/y;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    invoke-static {v11}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :catch_5
    move-exception v0

    .line 178
    goto/16 :goto_9

    .line 179
    .line 180
    :cond_5
    :goto_5
    iput-object v8, v11, Lw5/y;->a:Landroidx/appcompat/widget/a0;

    .line 181
    .line 182
    iget-object v0, v7, La6/n;->e:Lw5/m;

    .line 183
    .line 184
    iput-object v0, v11, Lw5/y;->e:Lw5/m;

    .line 185
    .line 186
    iput-wide v9, v11, Lw5/y;->k:J

    .line 187
    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v13

    .line 192
    iput-wide v13, v11, Lw5/y;->l:J

    .line 193
    .line 194
    invoke-virtual {v11}, Lw5/y;->a()Lw5/z;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget v11, v0, Lw5/z;->k:I

    .line 199
    .line 200
    const/16 v13, 0x64

    .line 201
    .line 202
    if-ne v11, v13, :cond_6

    .line 203
    .line 204
    :goto_6
    const/4 v13, 0x0

    .line 205
    goto :goto_7

    .line 206
    :cond_6
    const/16 v13, 0x66

    .line 207
    .line 208
    if-gt v13, v11, :cond_7

    .line 209
    .line 210
    const/16 v13, 0xc8

    .line 211
    .line 212
    if-ge v11, v13, :cond_7

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :goto_7
    invoke-virtual {v4, v13}, La6/e;->b(Z)Lw5/y;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    iput-object v8, v0, Lw5/y;->a:Landroidx/appcompat/widget/a0;

    .line 223
    .line 224
    iget-object v7, v7, La6/n;->e:Lw5/m;

    .line 225
    .line 226
    iput-object v7, v0, Lw5/y;->e:Lw5/m;

    .line 227
    .line 228
    iput-wide v9, v0, Lw5/y;->k:J

    .line 229
    .line 230
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 231
    .line 232
    .line 233
    move-result-wide v7

    .line 234
    iput-wide v7, v0, Lw5/y;->l:J

    .line 235
    .line 236
    invoke-virtual {v0}, Lw5/y;->a()Lw5/z;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget v11, v0, Lw5/z;->k:I

    .line 241
    .line 242
    :cond_7
    invoke-virtual {v0}, Lw5/z;->c()Lw5/y;

    .line 243
    .line 244
    .line 245
    move-result-object v7
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 246
    :try_start_a
    const-string v8, "Content-Type"

    .line 247
    .line 248
    invoke-static {v8, v0}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    invoke-interface {v6, v0}, Lb6/e;->a(Lw5/z;)J

    .line 253
    .line 254
    .line 255
    move-result-wide v8

    .line 256
    invoke-interface {v6, v0}, Lb6/e;->g(Lw5/z;)Lj6/i0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v10, La6/d;

    .line 261
    .line 262
    invoke-direct {v10, v4, v0, v8, v9}, La6/d;-><init>(La6/e;Lj6/i0;J)V

    .line 263
    .line 264
    .line 265
    new-instance v13, Lb6/h;

    .line 266
    .line 267
    invoke-static {v10}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 268
    .line 269
    .line 270
    move-result-object v17

    .line 271
    const/16 v18, 0x0

    .line 272
    .line 273
    move-wide v15, v8

    .line 274
    invoke-direct/range {v13 .. v18}, Lb6/h;-><init>(Ljava/lang/Object;JLj6/k;I)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6

    .line 275
    .line 276
    .line 277
    :try_start_b
    iput-object v13, v7, Lw5/y;->g:Lw5/b0;

    .line 278
    .line 279
    invoke-virtual {v7}, Lw5/y;->a()Lw5/z;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iget-object v4, v0, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 284
    .line 285
    iget-object v4, v4, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v4, Lw5/n;

    .line 288
    .line 289
    invoke-virtual {v4, v1}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-nez v4, :cond_8

    .line 298
    .line 299
    invoke-static {v1, v0}, Lw5/z;->a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_9

    .line 308
    .line 309
    :cond_8
    invoke-interface {v6}, Lb6/e;->h()La6/n;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v1}, La6/n;->l()V

    .line 314
    .line 315
    .line 316
    :cond_9
    const/16 v1, 0xcc

    .line 317
    .line 318
    if-eq v11, v1, :cond_a

    .line 319
    .line 320
    const/16 v1, 0xcd

    .line 321
    .line 322
    if-ne v11, v1, :cond_d

    .line 323
    .line 324
    :cond_a
    iget-object v1, v0, Lw5/z;->n:Lw5/b0;

    .line 325
    .line 326
    if-eqz v1, :cond_b

    .line 327
    .line 328
    invoke-virtual {v1}, Lw5/b0;->a()J

    .line 329
    .line 330
    .line 331
    move-result-wide v1

    .line 332
    goto :goto_8

    .line 333
    :cond_b
    const-wide/16 v1, -0x1

    .line 334
    .line 335
    :goto_8
    const-wide/16 v6, 0x0

    .line 336
    .line 337
    cmp-long v4, v1, v6

    .line 338
    .line 339
    if-lez v4, :cond_d

    .line 340
    .line 341
    new-instance v1, Ljava/net/ProtocolException;

    .line 342
    .line 343
    new-instance v2, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string v3, " had non-zero Content-Length: "

    .line 352
    .line 353
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    iget-object v0, v0, Lw5/z;->n:Lw5/b0;

    .line 357
    .line 358
    if-eqz v0, :cond_c

    .line 359
    .line 360
    invoke-virtual {v0}, Lw5/b0;->a()J

    .line 361
    .line 362
    .line 363
    move-result-wide v3

    .line 364
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    :cond_c
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw v1

    .line 379
    :cond_d
    return-object v0

    .line 380
    :catch_6
    move-exception v0

    .line 381
    invoke-virtual {v4, v0}, La6/e;->c(Ljava/io/IOException;)V

    .line 382
    .line 383
    .line 384
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 385
    :goto_9
    if-eqz v5, :cond_e

    .line 386
    .line 387
    invoke-static {v5, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    throw v5

    .line 391
    :cond_e
    throw v0

    .line 392
    :cond_f
    throw v0

    .line 393
    :cond_10
    throw v0
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
