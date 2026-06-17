.class public final synthetic Lcom/google/android/material/color/utilities/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/color/utilities/b;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/color/utilities/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ld5/l;

    .line 9
    .line 10
    sget-object v1, Lcom/google/android/apps/muzei/api/provider/MuzeiArtProvider;->Companion:Lcom/google/android/apps/muzei/api/provider/MuzeiArtProvider$Companion;

    .line 11
    .line 12
    const-string v1, "$tmp0"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/util/concurrent/locks/ReadWriteLock;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 27
    .line 28
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 29
    .line 30
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->b()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->a()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 45
    .line 46
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->b()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 56
    .line 57
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 58
    .line 59
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->b()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->a()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_3
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 74
    .line 75
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->g()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :pswitch_4
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 85
    .line 86
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->i()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 96
    .line 97
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->h()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :pswitch_6
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 107
    .line 108
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 109
    .line 110
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->g()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->f()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_7
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 125
    .line 126
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->f()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :pswitch_8
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 136
    .line 137
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 138
    .line 139
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->i()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->h()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 145
    .line 146
    .line 147
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_9
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 154
    .line 155
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->e()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :pswitch_a
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 165
    .line 166
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->a()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    :pswitch_b
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 176
    .line 177
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->d()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    return-object p1

    .line 184
    :pswitch_c
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 187
    .line 188
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 189
    .line 190
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->e()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->d()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 196
    .line 197
    .line 198
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    return-object p1

    .line 202
    :pswitch_d
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 205
    .line 206
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 207
    .line 208
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->g()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->f()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 214
    .line 215
    .line 216
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_e
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 223
    .line 224
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 225
    .line 226
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->i()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->h()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 232
    .line 233
    .line 234
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 235
    .line 236
    .line 237
    return-object p1

    .line 238
    :pswitch_f
    iget-object v0, p0, Lcom/google/android/material/color/utilities/b;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 241
    .line 242
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 243
    .line 244
    new-instance p1, Lcom/google/android/material/color/utilities/ToneDeltaPair;

    .line 245
    .line 246
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->e()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->d()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 250
    .line 251
    .line 252
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    return-object p1

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
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
