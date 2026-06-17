.class public final synthetic Lp3/g0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/android/billingclient/api/ProxyBillingActivityV2;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/ProxyBillingActivityV2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp3/g0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lp3/g0;->b:Lcom/android/billingclient/api/ProxyBillingActivityV2;

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
.method public final a(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lp3/g0;->a:I

    .line 2
    .line 3
    check-cast p1, Ld/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lp3/g0;->b:Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, Ld/a;->i:Landroid/content/Intent;

    .line 14
    .line 15
    iget p1, p1, Ld/a;->h:I

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    const/4 v3, -0x1

    .line 26
    const-string v4, "ProxyBillingActivityV2"

    .line 27
    .line 28
    if-eq p1, v3, :cond_2

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    new-instance v2, Landroid/os/Bundle;

    .line 33
    .line 34
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v5, "External offer flow finished with resultCode: "

    .line 40
    .line 41
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v3, 0x86

    .line 55
    .line 56
    const-string v5, "INTERNAL_LOG_ERROR_REASON"

    .line 57
    .line 58
    invoke-virtual {v2, v5, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v5, "External offer flow finished with error resultCode: "

    .line 64
    .line 65
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v3, "INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS"

    .line 76
    .line 77
    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/play_billing/zzc;->e(Landroid/content/Intent;Ljava/lang/String;)Lp3/e;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget p1, p1, Lp3/e;->a:I

    .line 85
    .line 86
    iget-object v1, v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->m:Landroid/os/ResultReceiver;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1, p1, v2}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const-string v1, "External offer flow result receiver is null"

    .line 95
    .line 96
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "External offer flow finished with billing responseCode: "

    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {v4, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_0
    iget-object v0, p0, Lp3/g0;->b:Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v1, p1, Ld/a;->i:Landroid/content/Intent;

    .line 128
    .line 129
    const-string v2, "ProxyBillingActivityV2"

    .line 130
    .line 131
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->e(Landroid/content/Intent;Ljava/lang/String;)Lp3/e;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget v3, v3, Lp3/e;->a:I

    .line 136
    .line 137
    iget-object v4, v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->l:Landroid/os/ResultReceiver;

    .line 138
    .line 139
    if-eqz v4, :cond_6

    .line 140
    .line 141
    if-nez v1, :cond_5

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_2
    invoke-virtual {v4, v3, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    iget p1, p1, Ld/a;->h:I

    .line 153
    .line 154
    const/4 v1, -0x1

    .line 155
    if-ne p1, v1, :cond_7

    .line 156
    .line 157
    if-eqz v3, :cond_8

    .line 158
    .line 159
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v4, "External offer dialog finished with resultCode: "

    .line 162
    .line 163
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p1, " and billing\'s responseCode: "

    .line 170
    .line 171
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_1
    iget-object v0, p0, Lp3/g0;->b:Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v1, p1, Ld/a;->i:Landroid/content/Intent;

    .line 194
    .line 195
    const-string v2, "ProxyBillingActivityV2"

    .line 196
    .line 197
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzc;->e(Landroid/content/Intent;Ljava/lang/String;)Lp3/e;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    iget v3, v3, Lp3/e;->a:I

    .line 202
    .line 203
    iget-object v4, v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->k:Landroid/os/ResultReceiver;

    .line 204
    .line 205
    if-eqz v4, :cond_a

    .line 206
    .line 207
    if-nez v1, :cond_9

    .line 208
    .line 209
    const/4 v1, 0x0

    .line 210
    goto :goto_3

    .line 211
    :cond_9
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :goto_3
    invoke-virtual {v4, v3, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    iget p1, p1, Ld/a;->h:I

    .line 219
    .line 220
    const/4 v1, -0x1

    .line 221
    if-ne p1, v1, :cond_b

    .line 222
    .line 223
    if-eqz v3, :cond_c

    .line 224
    .line 225
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v4, "Alternative billing only dialog finished with resultCode "

    .line 228
    .line 229
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string p1, " and billing\'s responseCode: "

    .line 236
    .line 237
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_c
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
