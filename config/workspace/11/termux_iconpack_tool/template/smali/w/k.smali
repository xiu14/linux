.class public final Lw/k;
.super Lw/l;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public k:Lw/e;

.field public l:Lw/a;


# virtual methods
.method public final a(Lw/d;)V
    .locals 10

    .line 1
    iget p1, p0, Lw/l;->j:I

    .line 2
    .line 3
    invoke-static {p1}, Lu/h;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x3

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p1, v0, :cond_e

    .line 10
    .line 11
    iget-object p1, p0, Lw/l;->e:Lw/f;

    .line 12
    .line 13
    iget-boolean v2, p1, Lw/e;->c:Z

    .line 14
    .line 15
    const/high16 v3, 0x3f000000    # 0.5f

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    iget-boolean v2, p1, Lw/e;->j:Z

    .line 21
    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget v2, p0, Lw/l;->d:I

    .line 25
    .line 26
    if-ne v2, v0, :cond_5

    .line 27
    .line 28
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 29
    .line 30
    iget v5, v2, Lv/d;->k:I

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    if-eq v5, v6, :cond_4

    .line 34
    .line 35
    if-eq v5, v0, :cond_0

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    iget-object v5, v2, Lv/d;->d:Lw/i;

    .line 39
    .line 40
    iget-object v5, v5, Lw/l;->e:Lw/f;

    .line 41
    .line 42
    iget-boolean v6, v5, Lw/e;->j:Z

    .line 43
    .line 44
    if-eqz v6, :cond_5

    .line 45
    .line 46
    iget v6, v2, Lv/d;->M:I

    .line 47
    .line 48
    const/4 v7, -0x1

    .line 49
    if-eq v6, v7, :cond_3

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    if-eq v6, v1, :cond_1

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    iget v5, v5, Lw/e;->g:I

    .line 58
    .line 59
    int-to-float v5, v5

    .line 60
    iget v2, v2, Lv/d;->L:F

    .line 61
    .line 62
    :goto_0
    div-float/2addr v5, v2

    .line 63
    :goto_1
    add-float/2addr v5, v3

    .line 64
    float-to-int v2, v5

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget v5, v5, Lw/e;->g:I

    .line 67
    .line 68
    int-to-float v5, v5

    .line 69
    iget v2, v2, Lv/d;->L:F

    .line 70
    .line 71
    mul-float v5, v5, v2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iget v5, v5, Lw/e;->g:I

    .line 75
    .line 76
    int-to-float v5, v5

    .line 77
    iget v2, v2, Lv/d;->L:F

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_2
    invoke-virtual {p1, v2}, Lw/f;->d(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    iget-object v5, v2, Lv/d;->I:Lv/d;

    .line 85
    .line 86
    if-eqz v5, :cond_5

    .line 87
    .line 88
    iget-object v5, v5, Lv/d;->e:Lw/k;

    .line 89
    .line 90
    iget-object v5, v5, Lw/l;->e:Lw/f;

    .line 91
    .line 92
    iget-boolean v6, v5, Lw/e;->j:Z

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    iget v2, v2, Lv/d;->r:F

    .line 97
    .line 98
    iget v5, v5, Lw/e;->g:I

    .line 99
    .line 100
    int-to-float v5, v5

    .line 101
    mul-float v5, v5, v2

    .line 102
    .line 103
    add-float/2addr v5, v3

    .line 104
    float-to-int v2, v5

    .line 105
    invoke-virtual {p1, v2}, Lw/f;->d(I)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_3
    iget-object v2, p0, Lw/l;->h:Lw/e;

    .line 109
    .line 110
    iget-boolean v5, v2, Lw/e;->c:Z

    .line 111
    .line 112
    iget-object v6, v2, Lw/e;->l:Ljava/util/ArrayList;

    .line 113
    .line 114
    if-eqz v5, :cond_d

    .line 115
    .line 116
    iget-object v5, p0, Lw/l;->i:Lw/e;

    .line 117
    .line 118
    iget-boolean v7, v5, Lw/e;->c:Z

    .line 119
    .line 120
    iget-object v8, v5, Lw/e;->l:Ljava/util/ArrayList;

    .line 121
    .line 122
    if-nez v7, :cond_6

    .line 123
    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :cond_6
    iget-boolean v7, v2, Lw/e;->j:Z

    .line 127
    .line 128
    if-eqz v7, :cond_7

    .line 129
    .line 130
    iget-boolean v7, v5, Lw/e;->j:Z

    .line 131
    .line 132
    if-eqz v7, :cond_7

    .line 133
    .line 134
    iget-boolean v7, p1, Lw/e;->j:Z

    .line 135
    .line 136
    if-eqz v7, :cond_7

    .line 137
    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_7
    iget-boolean v7, p1, Lw/e;->j:Z

    .line 141
    .line 142
    if-nez v7, :cond_8

    .line 143
    .line 144
    iget v7, p0, Lw/l;->d:I

    .line 145
    .line 146
    if-ne v7, v0, :cond_8

    .line 147
    .line 148
    iget-object v7, p0, Lw/l;->b:Lv/d;

    .line 149
    .line 150
    iget v9, v7, Lv/d;->j:I

    .line 151
    .line 152
    if-nez v9, :cond_8

    .line 153
    .line 154
    invoke-virtual {v7}, Lv/d;->r()Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-nez v7, :cond_8

    .line 159
    .line 160
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lw/e;

    .line 165
    .line 166
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Lw/e;

    .line 171
    .line 172
    iget v0, v0, Lw/e;->g:I

    .line 173
    .line 174
    iget v3, v2, Lw/e;->f:I

    .line 175
    .line 176
    add-int/2addr v0, v3

    .line 177
    iget v1, v1, Lw/e;->g:I

    .line 178
    .line 179
    iget v3, v5, Lw/e;->f:I

    .line 180
    .line 181
    add-int/2addr v1, v3

    .line 182
    sub-int v3, v1, v0

    .line 183
    .line 184
    invoke-virtual {v2, v0}, Lw/e;->d(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v1}, Lw/e;->d(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v3}, Lw/f;->d(I)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_8
    iget-boolean v7, p1, Lw/e;->j:Z

    .line 195
    .line 196
    if-nez v7, :cond_a

    .line 197
    .line 198
    iget v7, p0, Lw/l;->d:I

    .line 199
    .line 200
    if-ne v7, v0, :cond_a

    .line 201
    .line 202
    iget v0, p0, Lw/l;->a:I

    .line 203
    .line 204
    if-ne v0, v1, :cond_a

    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-lez v0, :cond_a

    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-lez v0, :cond_a

    .line 217
    .line 218
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Lw/e;

    .line 223
    .line 224
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Lw/e;

    .line 229
    .line 230
    iget v0, v0, Lw/e;->g:I

    .line 231
    .line 232
    iget v7, v2, Lw/e;->f:I

    .line 233
    .line 234
    add-int/2addr v0, v7

    .line 235
    iget v1, v1, Lw/e;->g:I

    .line 236
    .line 237
    iget v7, v5, Lw/e;->f:I

    .line 238
    .line 239
    add-int/2addr v1, v7

    .line 240
    sub-int/2addr v1, v0

    .line 241
    iget v0, p1, Lw/f;->m:I

    .line 242
    .line 243
    if-ge v1, v0, :cond_9

    .line 244
    .line 245
    invoke-virtual {p1, v1}, Lw/f;->d(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_9
    invoke-virtual {p1, v0}, Lw/f;->d(I)V

    .line 250
    .line 251
    .line 252
    :cond_a
    :goto_4
    iget-boolean v0, p1, Lw/e;->j:Z

    .line 253
    .line 254
    if-nez v0, :cond_b

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-lez v0, :cond_d

    .line 262
    .line 263
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-lez v0, :cond_d

    .line 268
    .line 269
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Lw/e;

    .line 274
    .line 275
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Lw/e;

    .line 280
    .line 281
    iget v4, v0, Lw/e;->g:I

    .line 282
    .line 283
    iget v6, v2, Lw/e;->f:I

    .line 284
    .line 285
    add-int/2addr v6, v4

    .line 286
    iget v7, v1, Lw/e;->g:I

    .line 287
    .line 288
    iget v8, v5, Lw/e;->f:I

    .line 289
    .line 290
    add-int/2addr v8, v7

    .line 291
    iget-object v9, p0, Lw/l;->b:Lv/d;

    .line 292
    .line 293
    iget v9, v9, Lv/d;->T:F

    .line 294
    .line 295
    if-ne v0, v1, :cond_c

    .line 296
    .line 297
    const/high16 v9, 0x3f000000    # 0.5f

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_c
    move v4, v6

    .line 301
    move v7, v8

    .line 302
    :goto_5
    sub-int/2addr v7, v4

    .line 303
    iget v0, p1, Lw/e;->g:I

    .line 304
    .line 305
    sub-int/2addr v7, v0

    .line 306
    int-to-float v0, v4

    .line 307
    add-float/2addr v0, v3

    .line 308
    int-to-float v1, v7

    .line 309
    mul-float v1, v1, v9

    .line 310
    .line 311
    add-float/2addr v1, v0

    .line 312
    float-to-int v0, v1

    .line 313
    invoke-virtual {v2, v0}, Lw/e;->d(I)V

    .line 314
    .line 315
    .line 316
    iget v0, v2, Lw/e;->g:I

    .line 317
    .line 318
    iget p1, p1, Lw/e;->g:I

    .line 319
    .line 320
    add-int/2addr v0, p1

    .line 321
    invoke-virtual {v5, v0}, Lw/e;->d(I)V

    .line 322
    .line 323
    .line 324
    :cond_d
    :goto_6
    return-void

    .line 325
    :cond_e
    iget-object p1, p0, Lw/l;->b:Lv/d;

    .line 326
    .line 327
    iget-object v0, p1, Lv/d;->y:Lv/c;

    .line 328
    .line 329
    iget-object p1, p1, Lv/d;->A:Lv/c;

    .line 330
    .line 331
    invoke-virtual {p0, v0, p1, v1}, Lw/l;->l(Lv/c;Lv/c;I)V

    .line 332
    .line 333
    .line 334
    return-void
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
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
.end method

.method public final d()V
    .locals 15

    .line 1
    iget-object v0, p0, Lw/k;->k:Lw/e;

    .line 2
    .line 3
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 4
    .line 5
    iget-boolean v2, v1, Lv/d;->a:Z

    .line 6
    .line 7
    iget-object v3, p0, Lw/l;->e:Lw/f;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lv/d;->i()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v3, v1}, Lw/f;->d(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-boolean v1, v3, Lw/e;->j:Z

    .line 19
    .line 20
    iget-object v2, v3, Lw/e;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v4, v3, Lw/e;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    const/4 v5, 0x4

    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x3

    .line 27
    iget-object v8, p0, Lw/l;->i:Lw/e;

    .line 28
    .line 29
    iget-object v9, p0, Lw/l;->h:Lw/e;

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 34
    .line 35
    iget-object v10, v1, Lv/d;->c0:[I

    .line 36
    .line 37
    aget v10, v10, v6

    .line 38
    .line 39
    iput v10, p0, Lw/l;->d:I

    .line 40
    .line 41
    iget-boolean v1, v1, Lv/d;->w:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance v1, Lw/a;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lw/f;-><init>(Lw/l;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lw/k;->l:Lw/a;

    .line 51
    .line 52
    :cond_1
    iget v1, p0, Lw/l;->d:I

    .line 53
    .line 54
    if-eq v1, v7, :cond_4

    .line 55
    .line 56
    if-ne v1, v5, :cond_2

    .line 57
    .line 58
    iget-object v10, p0, Lw/l;->b:Lv/d;

    .line 59
    .line 60
    iget-object v10, v10, Lv/d;->I:Lv/d;

    .line 61
    .line 62
    if-eqz v10, :cond_2

    .line 63
    .line 64
    iget-object v11, v10, Lv/d;->e:Lw/k;

    .line 65
    .line 66
    iget-object v12, v10, Lv/d;->c0:[I

    .line 67
    .line 68
    aget v12, v12, v6

    .line 69
    .line 70
    if-ne v12, v6, :cond_2

    .line 71
    .line 72
    invoke-virtual {v10}, Lv/d;->i()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 77
    .line 78
    iget-object v1, v1, Lv/d;->y:Lv/c;

    .line 79
    .line 80
    invoke-virtual {v1}, Lv/c;->c()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    sub-int/2addr v0, v1

    .line 85
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 86
    .line 87
    iget-object v1, v1, Lv/d;->A:Lv/c;

    .line 88
    .line 89
    invoke-virtual {v1}, Lv/c;->c()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sub-int/2addr v0, v1

    .line 94
    iget-object v1, v11, Lw/l;->h:Lw/e;

    .line 95
    .line 96
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 97
    .line 98
    iget-object v2, v2, Lv/d;->y:Lv/c;

    .line 99
    .line 100
    invoke-virtual {v2}, Lv/c;->c()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-static {v9, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v11, Lw/l;->i:Lw/e;

    .line 108
    .line 109
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 110
    .line 111
    iget-object v2, v2, Lv/d;->A:Lv/c;

    .line 112
    .line 113
    invoke-virtual {v2}, Lv/c;->c()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    neg-int v2, v2

    .line 118
    invoke-static {v8, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v0}, Lw/f;->d(I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_2
    if-ne v1, v6, :cond_4

    .line 126
    .line 127
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 128
    .line 129
    invoke-virtual {v1}, Lv/d;->i()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v3, v1}, Lw/f;->d(I)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    iget v1, p0, Lw/l;->d:I

    .line 138
    .line 139
    if-ne v1, v5, :cond_4

    .line 140
    .line 141
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 142
    .line 143
    iget-object v10, v1, Lv/d;->I:Lv/d;

    .line 144
    .line 145
    if-eqz v10, :cond_4

    .line 146
    .line 147
    iget-object v11, v10, Lv/d;->e:Lw/k;

    .line 148
    .line 149
    iget-object v10, v10, Lv/d;->c0:[I

    .line 150
    .line 151
    aget v10, v10, v6

    .line 152
    .line 153
    if-ne v10, v6, :cond_4

    .line 154
    .line 155
    iget-object v0, v11, Lw/l;->h:Lw/e;

    .line 156
    .line 157
    iget-object v1, v1, Lv/d;->y:Lv/c;

    .line 158
    .line 159
    invoke-virtual {v1}, Lv/c;->c()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v9, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 164
    .line 165
    .line 166
    iget-object v0, v11, Lw/l;->i:Lw/e;

    .line 167
    .line 168
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 169
    .line 170
    iget-object v1, v1, Lv/d;->A:Lv/c;

    .line 171
    .line 172
    invoke-virtual {v1}, Lv/c;->c()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    neg-int v1, v1

    .line 177
    invoke-static {v8, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    :goto_0
    iget-boolean v1, v3, Lw/e;->j:Z

    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x2

    .line 185
    if-eqz v1, :cond_d

    .line 186
    .line 187
    iget-object v12, p0, Lw/l;->b:Lv/d;

    .line 188
    .line 189
    iget-boolean v13, v12, Lv/d;->a:Z

    .line 190
    .line 191
    if-eqz v13, :cond_d

    .line 192
    .line 193
    iget-object v1, v12, Lv/d;->F:[Lv/c;

    .line 194
    .line 195
    aget-object v2, v1, v11

    .line 196
    .line 197
    iget-object v4, v2, Lv/c;->d:Lv/c;

    .line 198
    .line 199
    if-eqz v4, :cond_8

    .line 200
    .line 201
    aget-object v13, v1, v7

    .line 202
    .line 203
    iget-object v13, v13, Lv/c;->d:Lv/c;

    .line 204
    .line 205
    if-eqz v13, :cond_8

    .line 206
    .line 207
    invoke-virtual {v12}, Lv/d;->r()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_5

    .line 212
    .line 213
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 214
    .line 215
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 216
    .line 217
    aget-object v1, v1, v11

    .line 218
    .line 219
    invoke-virtual {v1}, Lv/c;->c()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    iput v1, v9, Lw/e;->f:I

    .line 224
    .line 225
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 226
    .line 227
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 228
    .line 229
    aget-object v1, v1, v7

    .line 230
    .line 231
    invoke-virtual {v1}, Lv/c;->c()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    neg-int v1, v1

    .line 236
    iput v1, v8, Lw/e;->f:I

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 240
    .line 241
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 242
    .line 243
    aget-object v1, v1, v11

    .line 244
    .line 245
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 252
    .line 253
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 254
    .line 255
    aget-object v2, v2, v11

    .line 256
    .line 257
    invoke-virtual {v2}, Lv/c;->c()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-static {v9, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 262
    .line 263
    .line 264
    :cond_6
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 265
    .line 266
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 267
    .line 268
    aget-object v1, v1, v7

    .line 269
    .line 270
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_7

    .line 275
    .line 276
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 277
    .line 278
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 279
    .line 280
    aget-object v2, v2, v7

    .line 281
    .line 282
    invoke-virtual {v2}, Lv/c;->c()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    neg-int v2, v2

    .line 287
    invoke-static {v8, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 288
    .line 289
    .line 290
    :cond_7
    iput-boolean v6, v9, Lw/e;->b:Z

    .line 291
    .line 292
    iput-boolean v6, v8, Lw/e;->b:Z

    .line 293
    .line 294
    :goto_1
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 295
    .line 296
    iget-boolean v2, v1, Lv/d;->w:Z

    .line 297
    .line 298
    if-eqz v2, :cond_1c

    .line 299
    .line 300
    iget v1, v1, Lv/d;->P:I

    .line 301
    .line 302
    invoke-static {v0, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_8
    if-eqz v4, :cond_9

    .line 307
    .line 308
    invoke-static {v2}, Lw/l;->h(Lv/c;)Lw/e;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-eqz v1, :cond_1c

    .line 313
    .line 314
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 315
    .line 316
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 317
    .line 318
    aget-object v2, v2, v11

    .line 319
    .line 320
    invoke-virtual {v2}, Lv/c;->c()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    invoke-static {v9, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 325
    .line 326
    .line 327
    iget v1, v3, Lw/e;->g:I

    .line 328
    .line 329
    invoke-static {v8, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 330
    .line 331
    .line 332
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 333
    .line 334
    iget-boolean v2, v1, Lv/d;->w:Z

    .line 335
    .line 336
    if-eqz v2, :cond_1c

    .line 337
    .line 338
    iget v1, v1, Lv/d;->P:I

    .line 339
    .line 340
    invoke-static {v0, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :cond_9
    aget-object v2, v1, v7

    .line 345
    .line 346
    iget-object v4, v2, Lv/c;->d:Lv/c;

    .line 347
    .line 348
    if-eqz v4, :cond_b

    .line 349
    .line 350
    invoke-static {v2}, Lw/l;->h(Lv/c;)Lw/e;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    if-eqz v1, :cond_a

    .line 355
    .line 356
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 357
    .line 358
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 359
    .line 360
    aget-object v2, v2, v7

    .line 361
    .line 362
    invoke-virtual {v2}, Lv/c;->c()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    neg-int v2, v2

    .line 367
    invoke-static {v8, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 368
    .line 369
    .line 370
    iget v1, v3, Lw/e;->g:I

    .line 371
    .line 372
    neg-int v1, v1

    .line 373
    invoke-static {v9, v8, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 374
    .line 375
    .line 376
    :cond_a
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 377
    .line 378
    iget-boolean v2, v1, Lv/d;->w:Z

    .line 379
    .line 380
    if-eqz v2, :cond_1c

    .line 381
    .line 382
    iget v1, v1, Lv/d;->P:I

    .line 383
    .line 384
    invoke-static {v0, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_b
    aget-object v1, v1, v5

    .line 389
    .line 390
    iget-object v2, v1, Lv/c;->d:Lv/c;

    .line 391
    .line 392
    if-eqz v2, :cond_c

    .line 393
    .line 394
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    if-eqz v1, :cond_1c

    .line 399
    .line 400
    invoke-static {v0, v1, v10}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 401
    .line 402
    .line 403
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 404
    .line 405
    iget v1, v1, Lv/d;->P:I

    .line 406
    .line 407
    neg-int v1, v1

    .line 408
    invoke-static {v9, v0, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 409
    .line 410
    .line 411
    iget v0, v3, Lw/e;->g:I

    .line 412
    .line 413
    invoke-static {v8, v9, v0}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :cond_c
    instance-of v1, v12, Lv/i;

    .line 418
    .line 419
    if-nez v1, :cond_1c

    .line 420
    .line 421
    iget-object v1, v12, Lv/d;->I:Lv/d;

    .line 422
    .line 423
    if-eqz v1, :cond_1c

    .line 424
    .line 425
    const/4 v1, 0x7

    .line 426
    invoke-virtual {v12, v1}, Lv/d;->g(I)Lv/c;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    iget-object v1, v1, Lv/c;->d:Lv/c;

    .line 431
    .line 432
    if-nez v1, :cond_1c

    .line 433
    .line 434
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 435
    .line 436
    iget-object v2, v1, Lv/d;->I:Lv/d;

    .line 437
    .line 438
    iget-object v2, v2, Lv/d;->e:Lw/k;

    .line 439
    .line 440
    iget-object v2, v2, Lw/l;->h:Lw/e;

    .line 441
    .line 442
    invoke-virtual {v1}, Lv/d;->n()I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    invoke-static {v9, v2, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 447
    .line 448
    .line 449
    iget v1, v3, Lw/e;->g:I

    .line 450
    .line 451
    invoke-static {v8, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 452
    .line 453
    .line 454
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 455
    .line 456
    iget-boolean v2, v1, Lv/d;->w:Z

    .line 457
    .line 458
    if-eqz v2, :cond_1c

    .line 459
    .line 460
    iget v1, v1, Lv/d;->P:I

    .line 461
    .line 462
    invoke-static {v0, v9, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_d
    if-nez v1, :cond_12

    .line 467
    .line 468
    iget v1, p0, Lw/l;->d:I

    .line 469
    .line 470
    if-ne v1, v7, :cond_12

    .line 471
    .line 472
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 473
    .line 474
    iget v12, v1, Lv/d;->k:I

    .line 475
    .line 476
    if-eq v12, v11, :cond_10

    .line 477
    .line 478
    if-eq v12, v7, :cond_e

    .line 479
    .line 480
    goto :goto_2

    .line 481
    :cond_e
    invoke-virtual {v1}, Lv/d;->r()Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-nez v1, :cond_13

    .line 486
    .line 487
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 488
    .line 489
    iget v12, v1, Lv/d;->j:I

    .line 490
    .line 491
    if-ne v12, v7, :cond_f

    .line 492
    .line 493
    goto :goto_2

    .line 494
    :cond_f
    iget-object v1, v1, Lv/d;->d:Lw/i;

    .line 495
    .line 496
    iget-object v1, v1, Lw/l;->e:Lw/f;

    .line 497
    .line 498
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    iget-object v1, v1, Lw/e;->k:Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    iput-boolean v6, v3, Lw/e;->b:Z

    .line 507
    .line 508
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_2

    .line 515
    :cond_10
    iget-object v1, v1, Lv/d;->I:Lv/d;

    .line 516
    .line 517
    if-nez v1, :cond_11

    .line 518
    .line 519
    goto :goto_2

    .line 520
    :cond_11
    iget-object v1, v1, Lv/d;->e:Lw/k;

    .line 521
    .line 522
    iget-object v1, v1, Lw/l;->e:Lw/f;

    .line 523
    .line 524
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    iget-object v1, v1, Lw/e;->k:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    iput-boolean v6, v3, Lw/e;->b:Z

    .line 533
    .line 534
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    goto :goto_2

    .line 541
    :cond_12
    invoke-virtual {v3, p0}, Lw/e;->b(Lw/l;)V

    .line 542
    .line 543
    .line 544
    :cond_13
    :goto_2
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 545
    .line 546
    iget-object v2, v1, Lv/d;->F:[Lv/c;

    .line 547
    .line 548
    aget-object v12, v2, v11

    .line 549
    .line 550
    iget-object v13, v12, Lv/c;->d:Lv/c;

    .line 551
    .line 552
    if-eqz v13, :cond_15

    .line 553
    .line 554
    aget-object v14, v2, v7

    .line 555
    .line 556
    iget-object v14, v14, Lv/c;->d:Lv/c;

    .line 557
    .line 558
    if-eqz v14, :cond_15

    .line 559
    .line 560
    invoke-virtual {v1}, Lv/d;->r()Z

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    if-eqz v1, :cond_14

    .line 565
    .line 566
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 567
    .line 568
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 569
    .line 570
    aget-object v1, v1, v11

    .line 571
    .line 572
    invoke-virtual {v1}, Lv/c;->c()I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    iput v1, v9, Lw/e;->f:I

    .line 577
    .line 578
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 579
    .line 580
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 581
    .line 582
    aget-object v1, v1, v7

    .line 583
    .line 584
    invoke-virtual {v1}, Lv/c;->c()I

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    neg-int v1, v1

    .line 589
    iput v1, v8, Lw/e;->f:I

    .line 590
    .line 591
    goto :goto_3

    .line 592
    :cond_14
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 593
    .line 594
    iget-object v1, v1, Lv/d;->F:[Lv/c;

    .line 595
    .line 596
    aget-object v1, v1, v11

    .line 597
    .line 598
    invoke-static {v1}, Lw/l;->h(Lv/c;)Lw/e;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 603
    .line 604
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 605
    .line 606
    aget-object v2, v2, v7

    .line 607
    .line 608
    invoke-static {v2}, Lw/l;->h(Lv/c;)Lw/e;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-virtual {v1, p0}, Lw/e;->b(Lw/l;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2, p0}, Lw/e;->b(Lw/l;)V

    .line 616
    .line 617
    .line 618
    iput v5, p0, Lw/l;->j:I

    .line 619
    .line 620
    :goto_3
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 621
    .line 622
    iget-boolean v1, v1, Lv/d;->w:Z

    .line 623
    .line 624
    if-eqz v1, :cond_1b

    .line 625
    .line 626
    iget-object v1, p0, Lw/k;->l:Lw/a;

    .line 627
    .line 628
    invoke-virtual {p0, v0, v9, v6, v1}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_4

    .line 632
    .line 633
    :cond_15
    const/4 v14, 0x0

    .line 634
    if-eqz v13, :cond_17

    .line 635
    .line 636
    invoke-static {v12}, Lw/l;->h(Lv/c;)Lw/e;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    if-eqz v1, :cond_1b

    .line 641
    .line 642
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 643
    .line 644
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 645
    .line 646
    aget-object v2, v2, v11

    .line 647
    .line 648
    invoke-virtual {v2}, Lv/c;->c()I

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    invoke-static {v9, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {p0, v8, v9, v6, v3}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 656
    .line 657
    .line 658
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 659
    .line 660
    iget-boolean v1, v1, Lv/d;->w:Z

    .line 661
    .line 662
    if-eqz v1, :cond_16

    .line 663
    .line 664
    iget-object v1, p0, Lw/k;->l:Lw/a;

    .line 665
    .line 666
    invoke-virtual {p0, v0, v9, v6, v1}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 667
    .line 668
    .line 669
    :cond_16
    iget v0, p0, Lw/l;->d:I

    .line 670
    .line 671
    if-ne v0, v7, :cond_1b

    .line 672
    .line 673
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 674
    .line 675
    iget v1, v0, Lv/d;->L:F

    .line 676
    .line 677
    cmpl-float v1, v1, v14

    .line 678
    .line 679
    if-lez v1, :cond_1b

    .line 680
    .line 681
    iget-object v0, v0, Lv/d;->d:Lw/i;

    .line 682
    .line 683
    iget v1, v0, Lw/l;->d:I

    .line 684
    .line 685
    if-ne v1, v7, :cond_1b

    .line 686
    .line 687
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 688
    .line 689
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 690
    .line 691
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 695
    .line 696
    iget-object v0, v0, Lv/d;->d:Lw/i;

    .line 697
    .line 698
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 699
    .line 700
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    iput-object p0, v3, Lw/e;->a:Lw/l;

    .line 704
    .line 705
    goto/16 :goto_4

    .line 706
    .line 707
    :cond_17
    aget-object v11, v2, v7

    .line 708
    .line 709
    iget-object v12, v11, Lv/c;->d:Lv/c;

    .line 710
    .line 711
    const/4 v13, -0x1

    .line 712
    if-eqz v12, :cond_18

    .line 713
    .line 714
    invoke-static {v11}, Lw/l;->h(Lv/c;)Lw/e;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    if-eqz v1, :cond_1b

    .line 719
    .line 720
    iget-object v2, p0, Lw/l;->b:Lv/d;

    .line 721
    .line 722
    iget-object v2, v2, Lv/d;->F:[Lv/c;

    .line 723
    .line 724
    aget-object v2, v2, v7

    .line 725
    .line 726
    invoke-virtual {v2}, Lv/c;->c()I

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    neg-int v2, v2

    .line 731
    invoke-static {v8, v1, v2}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {p0, v9, v8, v13, v3}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 735
    .line 736
    .line 737
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 738
    .line 739
    iget-boolean v1, v1, Lv/d;->w:Z

    .line 740
    .line 741
    if-eqz v1, :cond_1b

    .line 742
    .line 743
    iget-object v1, p0, Lw/k;->l:Lw/a;

    .line 744
    .line 745
    invoke-virtual {p0, v0, v9, v6, v1}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 746
    .line 747
    .line 748
    goto :goto_4

    .line 749
    :cond_18
    aget-object v2, v2, v5

    .line 750
    .line 751
    iget-object v5, v2, Lv/c;->d:Lv/c;

    .line 752
    .line 753
    if-eqz v5, :cond_19

    .line 754
    .line 755
    invoke-static {v2}, Lw/l;->h(Lv/c;)Lw/e;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    if-eqz v1, :cond_1b

    .line 760
    .line 761
    invoke-static {v0, v1, v10}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 762
    .line 763
    .line 764
    iget-object v1, p0, Lw/k;->l:Lw/a;

    .line 765
    .line 766
    invoke-virtual {p0, v9, v0, v13, v1}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p0, v8, v9, v6, v3}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 770
    .line 771
    .line 772
    goto :goto_4

    .line 773
    :cond_19
    instance-of v2, v1, Lv/i;

    .line 774
    .line 775
    if-nez v2, :cond_1b

    .line 776
    .line 777
    iget-object v2, v1, Lv/d;->I:Lv/d;

    .line 778
    .line 779
    if-eqz v2, :cond_1b

    .line 780
    .line 781
    iget-object v2, v2, Lv/d;->e:Lw/k;

    .line 782
    .line 783
    iget-object v2, v2, Lw/l;->h:Lw/e;

    .line 784
    .line 785
    invoke-virtual {v1}, Lv/d;->n()I

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    invoke-static {v9, v2, v1}, Lw/l;->b(Lw/e;Lw/e;I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {p0, v8, v9, v6, v3}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 793
    .line 794
    .line 795
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 796
    .line 797
    iget-boolean v1, v1, Lv/d;->w:Z

    .line 798
    .line 799
    if-eqz v1, :cond_1a

    .line 800
    .line 801
    iget-object v1, p0, Lw/k;->l:Lw/a;

    .line 802
    .line 803
    invoke-virtual {p0, v0, v9, v6, v1}, Lw/l;->c(Lw/e;Lw/e;ILw/f;)V

    .line 804
    .line 805
    .line 806
    :cond_1a
    iget v0, p0, Lw/l;->d:I

    .line 807
    .line 808
    if-ne v0, v7, :cond_1b

    .line 809
    .line 810
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 811
    .line 812
    iget v1, v0, Lv/d;->L:F

    .line 813
    .line 814
    cmpl-float v1, v1, v14

    .line 815
    .line 816
    if-lez v1, :cond_1b

    .line 817
    .line 818
    iget-object v0, v0, Lv/d;->d:Lw/i;

    .line 819
    .line 820
    iget v1, v0, Lw/l;->d:I

    .line 821
    .line 822
    if-ne v1, v7, :cond_1b

    .line 823
    .line 824
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 825
    .line 826
    iget-object v0, v0, Lw/e;->k:Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 832
    .line 833
    iget-object v0, v0, Lv/d;->d:Lw/i;

    .line 834
    .line 835
    iget-object v0, v0, Lw/l;->e:Lw/f;

    .line 836
    .line 837
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    iput-object p0, v3, Lw/e;->a:Lw/l;

    .line 841
    .line 842
    :cond_1b
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 843
    .line 844
    .line 845
    move-result v0

    .line 846
    if-nez v0, :cond_1c

    .line 847
    .line 848
    iput-boolean v6, v3, Lw/e;->c:Z

    .line 849
    .line 850
    :cond_1c
    return-void
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

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/l;->h:Lw/e;

    .line 2
    .line 3
    iget-boolean v1, v0, Lw/e;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 8
    .line 9
    iget v0, v0, Lw/e;->g:I

    .line 10
    .line 11
    iput v0, v1, Lv/d;->O:I

    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/l;->c:Lw/j;

    .line 3
    .line 4
    iget-object v0, p0, Lw/l;->h:Lw/e;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/e;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lw/l;->i:Lw/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw/e;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lw/k;->k:Lw/e;

    .line 15
    .line 16
    invoke-virtual {v0}, Lw/e;->c()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lw/l;->e:Lw/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Lw/e;->c()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lw/l;->g:Z

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final k()Z
    .locals 2

    .line 1
    iget v0, p0, Lw/l;->d:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lw/l;->b:Lv/d;

    .line 7
    .line 8
    iget v0, v0, Lv/d;->k:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
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

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/l;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Lw/l;->h:Lw/e;

    .line 5
    .line 6
    invoke-virtual {v1}, Lw/e;->c()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lw/l;->i:Lw/e;

    .line 12
    .line 13
    invoke-virtual {v1}, Lw/e;->c()V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 17
    .line 18
    iget-object v1, p0, Lw/k;->k:Lw/e;

    .line 19
    .line 20
    invoke-virtual {v1}, Lw/e;->c()V

    .line 21
    .line 22
    .line 23
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 24
    .line 25
    iget-object v1, p0, Lw/l;->e:Lw/f;

    .line 26
    .line 27
    iput-boolean v0, v1, Lw/e;->j:Z

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VerticalRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw/l;->b:Lv/d;

    .line 9
    .line 10
    iget-object v1, v1, Lv/d;->W:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
